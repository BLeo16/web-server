B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Service
Version=9.9
@EndOfDesignText@
#Region  Service Attributes 
    #StartAtBoot: False
    #ExcludeFromLibrary: True
#End Region

Sub Process_Globals
	Private webSocket As HttpServer
	Private validUsers As Map
	Private empleadosManager As Empleados
End Sub

Sub Service_Create
	webSocket.Initialize("webSocket")
	validUsers.Initialize
	empleadosManager.Initialize("empresa")
End Sub

Sub Service_Start (StartingIntent As Intent)
	Service.StopAutomaticForeground
	webSocket.Start(8080)
End Sub

Sub Service_TaskRemoved
	webSocket.Stop
End Sub

Sub Service_Destroy
	webSocket.Stop
End Sub

Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
	Return True
End Sub

Private Sub webSocket_HandleRequest (Request As ServletRequest, Response As ServletResponse)
	Dim html As String
    
	Select Request.RequestURI
		Case "/home"
			html = "<html><body><h1>PAGINA DE INICIO</h1></body></html>"
			Response.Status = 200
			Response.SendString(html)
            
		Case "/login"
			If Request.Method <> "POST" Then
				Response.Status = 405
				Response.SendString("Method Not Allowed")
				Return
			End If
            
			Dim user As String = Request.GetParameter("user")
			Dim pwd As String = Request.GetParameter("password")
            
			If user = Null Or pwd = Null Then
				Response.Status = 400
				Response.SendString("Bad Request")
				Return
			End If
            
			validUsers.Put(user, pwd)
			Dim ip As String = Request.RemoteAddress
			Response.Status = 200
			Response.SendString("User logged in from IP: " & ip)
            
		Case "/DataInput"
			If Request.Method = "POST" Then
				If Not (ValidateUser(Request)) Then
					Response.Status = 401
					Response.SendString("Unauthorized")
					Return
				End If
                
				Dim cedula As String = Request.GetParameter("cedula")
				Dim nombres As String = Request.GetParameter("nombres")
				Dim salario As String = Request.GetParameter("salario")
				Dim cargo As String = Request.GetParameter("cargo")
                
				If cedula = Null Or nombres = Null Or salario = Null Or cargo = Null Then
					Response.Status = 400
					Response.SendString("Bad Request")
					Return
				End If
                
				empleadosManager.Create(cedula, nombres, salario, cargo)
				Response.Status = 200
				Response.SendString("Empleado guardado exitosamente")
			Else
				Response.Status = 405
				Response.SendString("Method Not Allowed")
			End If
            
		Case "/DataOutput"
			If Not (ValidateUser(Request)) Then
				Response.Status = 401
				Response.SendString("Unauthorized")
				Return
			End If
    
			' Obtener lista de empleados desde la base de datos (empleadosManager.Read_All debería manejar esto)
			Dim empleadosList As List = empleadosManager.Read_All()
    
			' Preparar JSON de salida
			Dim jsonArray As List
			jsonArray.Initialize
    
			For Each emp As Empleado In empleadosList
				Dim jsonItem As Map
				jsonItem.Initialize
				jsonItem.Put("cedula", emp.Cedula)
				jsonItem.Put("nombres", emp.Nombres)
				jsonItem.Put("salario", emp.Salario)
				jsonItem.Put("cargo", emp.Cargo)
				jsonArray.Add(jsonItem)
			Next
    
			' Convertir lista de Map a JSON usando JSONGenerator
			Dim jsonGenerator As JSONGenerator
			jsonGenerator.Initialize2(jsonArray)
			Dim json As String = jsonGenerator.ToPrettyString(2)
    
			' Configurar respuesta como JSON
			Response.SetContentType("application/json")
			Response.Status = 200
			Response.SendString(json)

            
		Case Else
			Response.Status = 404
			Response.SendString("Not Found")
	End Select
End Sub

Private Sub ValidateUser(Request As ServletRequest) As Boolean
	Dim user As String = Request.GetParameter("user")
	Dim pwd As String = Request.GetParameter("password")
    
	If user = Null Or pwd = Null Then Return False
    
	Return validUsers.ContainsKey(user) And validUsers.Get(user) = pwd
End Sub
