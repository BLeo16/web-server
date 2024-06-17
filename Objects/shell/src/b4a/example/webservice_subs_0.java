package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class webservice_subs_0 {


public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (webservice) ","webservice",6,webservice.processBA,webservice.mostCurrent,31);
if (RapidSub.canDelegate("application_error")) { return b4a.example.webservice.remoteMe.runUserSub(false, "webservice","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 31;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="Return True";
Debug.ShouldStop(-2147483648);
if (true) return webservice.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private webSocket As HttpServer";
webservice._websocket = RemoteObject.createNew ("anywheresoftware.b4a.objects.HttpServer");
 //BA.debugLineNum = 8;BA.debugLine="Private validUsers As Map";
webservice._validusers = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 9;BA.debugLine="Private empleadosManager As Empleados";
webservice._empleadosmanager = RemoteObject.createNew ("b4a.example.empleados");
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (webservice) ","webservice",6,webservice.processBA,webservice.mostCurrent,12);
if (RapidSub.canDelegate("service_create")) { return b4a.example.webservice.remoteMe.runUserSub(false, "webservice","service_create");}
 BA.debugLineNum = 12;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(2048);
 BA.debugLineNum = 13;BA.debugLine="webSocket.Initialize(\"webSocket\")";
Debug.ShouldStop(4096);
webservice._websocket.runVoidMethod ("Initialize",webservice.processBA,(Object)(RemoteObject.createImmutable("webSocket")));
 BA.debugLineNum = 14;BA.debugLine="validUsers.Initialize";
Debug.ShouldStop(8192);
webservice._validusers.runVoidMethod ("Initialize");
 BA.debugLineNum = 15;BA.debugLine="empleadosManager.Initialize(\"empresa\")";
Debug.ShouldStop(16384);
webservice._empleadosmanager.runClassMethod (b4a.example.empleados.class, "_initialize" /*RemoteObject*/ ,webservice.processBA,(Object)(RemoteObject.createImmutable("empresa")));
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_destroy() throws Exception{
try {
		Debug.PushSubsStack("Service_Destroy (webservice) ","webservice",6,webservice.processBA,webservice.mostCurrent,27);
if (RapidSub.canDelegate("service_destroy")) { return b4a.example.webservice.remoteMe.runUserSub(false, "webservice","service_destroy");}
 BA.debugLineNum = 27;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="webSocket.Stop";
Debug.ShouldStop(134217728);
webservice._websocket.runVoidMethod ("Stop");
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_start(RemoteObject _startingintent) throws Exception{
try {
		Debug.PushSubsStack("Service_Start (webservice) ","webservice",6,webservice.processBA,webservice.mostCurrent,18);
if (RapidSub.canDelegate("service_start")) { return b4a.example.webservice.remoteMe.runUserSub(false, "webservice","service_start", _startingintent);}
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 18;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="Service.StopAutomaticForeground";
Debug.ShouldStop(262144);
webservice.mostCurrent._service.runVoidMethod ("StopAutomaticForeground");
 BA.debugLineNum = 20;BA.debugLine="webSocket.Start(8080)";
Debug.ShouldStop(524288);
webservice._websocket.runVoidMethod ("Start",(Object)(BA.numberCast(int.class, 8080)));
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_taskremoved() throws Exception{
try {
		Debug.PushSubsStack("Service_TaskRemoved (webservice) ","webservice",6,webservice.processBA,webservice.mostCurrent,23);
if (RapidSub.canDelegate("service_taskremoved")) { return b4a.example.webservice.remoteMe.runUserSub(false, "webservice","service_taskremoved");}
 BA.debugLineNum = 23;BA.debugLine="Sub Service_TaskRemoved";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="webSocket.Stop";
Debug.ShouldStop(8388608);
webservice._websocket.runVoidMethod ("Stop");
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _validateuser(RemoteObject _request) throws Exception{
try {
		Debug.PushSubsStack("ValidateUser (webservice) ","webservice",6,webservice.processBA,webservice.mostCurrent,133);
if (RapidSub.canDelegate("validateuser")) { return b4a.example.webservice.remoteMe.runUserSub(false, "webservice","validateuser", _request);}
RemoteObject _user = RemoteObject.createImmutable("");
RemoteObject _pwd = RemoteObject.createImmutable("");
Debug.locals.put("Request", _request);
 BA.debugLineNum = 133;BA.debugLine="Private Sub ValidateUser(Request As ServletRequest";
Debug.ShouldStop(16);
 BA.debugLineNum = 134;BA.debugLine="Dim user As String = Request.GetParameter(\"user\")";
Debug.ShouldStop(32);
_user = _request.runMethod(true,"GetParameter",(Object)(RemoteObject.createImmutable("user")));Debug.locals.put("user", _user);Debug.locals.put("user", _user);
 BA.debugLineNum = 135;BA.debugLine="Dim pwd As String = Request.GetParameter(\"passwor";
Debug.ShouldStop(64);
_pwd = _request.runMethod(true,"GetParameter",(Object)(RemoteObject.createImmutable("password")));Debug.locals.put("pwd", _pwd);Debug.locals.put("pwd", _pwd);
 BA.debugLineNum = 137;BA.debugLine="If user = Null Or pwd = Null Then Return False";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("n",_user) || RemoteObject.solveBoolean("n",_pwd)) { 
if (true) return webservice.mostCurrent.__c.getField(true,"False");};
 BA.debugLineNum = 139;BA.debugLine="Return validUsers.ContainsKey(user) And validUser";
Debug.ShouldStop(1024);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean(".",webservice._validusers.runMethod(true,"ContainsKey",(Object)((_user)))) && RemoteObject.solveBoolean("=",webservice._validusers.runMethod(false,"Get",(Object)((_user))),(_pwd)));
 BA.debugLineNum = 140;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _websocket_handlerequest(RemoteObject _request,RemoteObject _response) throws Exception{
try {
		Debug.PushSubsStack("webSocket_HandleRequest (webservice) ","webservice",6,webservice.processBA,webservice.mostCurrent,35);
if (RapidSub.canDelegate("websocket_handlerequest")) { return b4a.example.webservice.remoteMe.runUserSub(false, "webservice","websocket_handlerequest", _request, _response);}
RemoteObject _html = RemoteObject.createImmutable("");
RemoteObject _user = RemoteObject.createImmutable("");
RemoteObject _pwd = RemoteObject.createImmutable("");
RemoteObject _ip = RemoteObject.createImmutable("");
RemoteObject _cedula = RemoteObject.createImmutable("");
RemoteObject _nombres = RemoteObject.createImmutable("");
RemoteObject _salario = RemoteObject.createImmutable("");
RemoteObject _cargo = RemoteObject.createImmutable("");
RemoteObject _empleadoslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _jsonarray = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _emp = RemoteObject.declareNull("b4a.example.empleado");
RemoteObject _jsonitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _jsongenerator = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _json = RemoteObject.createImmutable("");
Debug.locals.put("Request", _request);
Debug.locals.put("Response", _response);
 BA.debugLineNum = 35;BA.debugLine="Private Sub webSocket_HandleRequest (Request As Se";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="Dim html As String";
Debug.ShouldStop(8);
_html = RemoteObject.createImmutable("");Debug.locals.put("html", _html);
 BA.debugLineNum = 38;BA.debugLine="Select Request.RequestURI";
Debug.ShouldStop(32);
switch (BA.switchObjectToInt(_request.runMethod(true,"getRequestURI"),BA.ObjectToString("/home"),BA.ObjectToString("/login"),BA.ObjectToString("/DataInput"),BA.ObjectToString("/DataOutput"))) {
case 0: {
 BA.debugLineNum = 40;BA.debugLine="html = \"<html><body><h1>PAGINA DE INICIO</h1></";
Debug.ShouldStop(128);
_html = BA.ObjectToString("<html><body><h1>PAGINA DE INICIO</h1></body></html>");Debug.locals.put("html", _html);
 BA.debugLineNum = 41;BA.debugLine="Response.Status = 200";
Debug.ShouldStop(256);
_response.runVoidMethod ("setStatus",BA.numberCast(int.class, 200));
 BA.debugLineNum = 42;BA.debugLine="Response.SendString(html)";
Debug.ShouldStop(512);
_response.runVoidMethod ("SendString",(Object)(_html));
 break; }
case 1: {
 BA.debugLineNum = 45;BA.debugLine="If Request.Method <> \"POST\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("!",_request.runMethod(true,"getMethod"),BA.ObjectToString("POST"))) { 
 BA.debugLineNum = 46;BA.debugLine="Response.Status = 405";
Debug.ShouldStop(8192);
_response.runVoidMethod ("setStatus",BA.numberCast(int.class, 405));
 BA.debugLineNum = 47;BA.debugLine="Response.SendString(\"Method Not Allowed\")";
Debug.ShouldStop(16384);
_response.runVoidMethod ("SendString",(Object)(RemoteObject.createImmutable("Method Not Allowed")));
 BA.debugLineNum = 48;BA.debugLine="Return";
Debug.ShouldStop(32768);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 51;BA.debugLine="Dim user As String = Request.GetParameter(\"user";
Debug.ShouldStop(262144);
_user = _request.runMethod(true,"GetParameter",(Object)(RemoteObject.createImmutable("user")));Debug.locals.put("user", _user);Debug.locals.put("user", _user);
 BA.debugLineNum = 52;BA.debugLine="Dim pwd As String = Request.GetParameter(\"passw";
Debug.ShouldStop(524288);
_pwd = _request.runMethod(true,"GetParameter",(Object)(RemoteObject.createImmutable("password")));Debug.locals.put("pwd", _pwd);Debug.locals.put("pwd", _pwd);
 BA.debugLineNum = 54;BA.debugLine="If user = Null Or pwd = Null Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("n",_user) || RemoteObject.solveBoolean("n",_pwd)) { 
 BA.debugLineNum = 55;BA.debugLine="Response.Status = 400";
Debug.ShouldStop(4194304);
_response.runVoidMethod ("setStatus",BA.numberCast(int.class, 400));
 BA.debugLineNum = 56;BA.debugLine="Response.SendString(\"Bad Request\")";
Debug.ShouldStop(8388608);
_response.runVoidMethod ("SendString",(Object)(RemoteObject.createImmutable("Bad Request")));
 BA.debugLineNum = 57;BA.debugLine="Return";
Debug.ShouldStop(16777216);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 60;BA.debugLine="validUsers.Put(user, pwd)";
Debug.ShouldStop(134217728);
webservice._validusers.runVoidMethod ("Put",(Object)((_user)),(Object)((_pwd)));
 BA.debugLineNum = 61;BA.debugLine="Dim ip As String = Request.RemoteAddress";
Debug.ShouldStop(268435456);
_ip = _request.runMethod(true,"getRemoteAddress");Debug.locals.put("ip", _ip);Debug.locals.put("ip", _ip);
 BA.debugLineNum = 62;BA.debugLine="Response.Status = 200";
Debug.ShouldStop(536870912);
_response.runVoidMethod ("setStatus",BA.numberCast(int.class, 200));
 BA.debugLineNum = 63;BA.debugLine="Response.SendString(\"User logged in from IP: \"";
Debug.ShouldStop(1073741824);
_response.runVoidMethod ("SendString",(Object)(RemoteObject.concat(RemoteObject.createImmutable("User logged in from IP: "),_ip)));
 break; }
case 2: {
 BA.debugLineNum = 66;BA.debugLine="If Request.Method = \"POST\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_request.runMethod(true,"getMethod"),BA.ObjectToString("POST"))) { 
 BA.debugLineNum = 67;BA.debugLine="If Not (ValidateUser(Request)) Then";
Debug.ShouldStop(4);
if (webservice.mostCurrent.__c.runMethod(true,"Not",(Object)(_validateuser(_request))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 68;BA.debugLine="Response.Status = 401";
Debug.ShouldStop(8);
_response.runVoidMethod ("setStatus",BA.numberCast(int.class, 401));
 BA.debugLineNum = 69;BA.debugLine="Response.SendString(\"Unauthorized\")";
Debug.ShouldStop(16);
_response.runVoidMethod ("SendString",(Object)(RemoteObject.createImmutable("Unauthorized")));
 BA.debugLineNum = 70;BA.debugLine="Return";
Debug.ShouldStop(32);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 73;BA.debugLine="Dim cedula As String = Request.GetParameter(\"c";
Debug.ShouldStop(256);
_cedula = _request.runMethod(true,"GetParameter",(Object)(RemoteObject.createImmutable("cedula")));Debug.locals.put("cedula", _cedula);Debug.locals.put("cedula", _cedula);
 BA.debugLineNum = 74;BA.debugLine="Dim nombres As String = Request.GetParameter(\"";
Debug.ShouldStop(512);
_nombres = _request.runMethod(true,"GetParameter",(Object)(RemoteObject.createImmutable("nombres")));Debug.locals.put("nombres", _nombres);Debug.locals.put("nombres", _nombres);
 BA.debugLineNum = 75;BA.debugLine="Dim salario As String = Request.GetParameter(\"";
Debug.ShouldStop(1024);
_salario = _request.runMethod(true,"GetParameter",(Object)(RemoteObject.createImmutable("salario")));Debug.locals.put("salario", _salario);Debug.locals.put("salario", _salario);
 BA.debugLineNum = 76;BA.debugLine="Dim cargo As String = Request.GetParameter(\"ca";
Debug.ShouldStop(2048);
_cargo = _request.runMethod(true,"GetParameter",(Object)(RemoteObject.createImmutable("cargo")));Debug.locals.put("cargo", _cargo);Debug.locals.put("cargo", _cargo);
 BA.debugLineNum = 78;BA.debugLine="If cedula = Null Or nombres = Null Or salario";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("n",_cedula) || RemoteObject.solveBoolean("n",_nombres) || RemoteObject.solveBoolean("n",_salario) || RemoteObject.solveBoolean("n",_cargo)) { 
 BA.debugLineNum = 79;BA.debugLine="Response.Status = 400";
Debug.ShouldStop(16384);
_response.runVoidMethod ("setStatus",BA.numberCast(int.class, 400));
 BA.debugLineNum = 80;BA.debugLine="Response.SendString(\"Bad Request\")";
Debug.ShouldStop(32768);
_response.runVoidMethod ("SendString",(Object)(RemoteObject.createImmutable("Bad Request")));
 BA.debugLineNum = 81;BA.debugLine="Return";
Debug.ShouldStop(65536);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 84;BA.debugLine="empleadosManager.Create(cedula, nombres, salar";
Debug.ShouldStop(524288);
webservice._empleadosmanager.runClassMethod (b4a.example.empleados.class, "_create" /*RemoteObject*/ ,(Object)(_cedula),(Object)(_nombres),(Object)(BA.numberCast(double.class, _salario)),(Object)(_cargo));
 BA.debugLineNum = 85;BA.debugLine="Response.Status = 200";
Debug.ShouldStop(1048576);
_response.runVoidMethod ("setStatus",BA.numberCast(int.class, 200));
 BA.debugLineNum = 86;BA.debugLine="Response.SendString(\"Empleado guardado exitosa";
Debug.ShouldStop(2097152);
_response.runVoidMethod ("SendString",(Object)(RemoteObject.createImmutable("Empleado guardado exitosamente")));
 }else {
 BA.debugLineNum = 88;BA.debugLine="Response.Status = 405";
Debug.ShouldStop(8388608);
_response.runVoidMethod ("setStatus",BA.numberCast(int.class, 405));
 BA.debugLineNum = 89;BA.debugLine="Response.SendString(\"Method Not Allowed\")";
Debug.ShouldStop(16777216);
_response.runVoidMethod ("SendString",(Object)(RemoteObject.createImmutable("Method Not Allowed")));
 };
 break; }
case 3: {
 BA.debugLineNum = 93;BA.debugLine="If Not (ValidateUser(Request)) Then";
Debug.ShouldStop(268435456);
if (webservice.mostCurrent.__c.runMethod(true,"Not",(Object)(_validateuser(_request))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 94;BA.debugLine="Response.Status = 401";
Debug.ShouldStop(536870912);
_response.runVoidMethod ("setStatus",BA.numberCast(int.class, 401));
 BA.debugLineNum = 95;BA.debugLine="Response.SendString(\"Unauthorized\")";
Debug.ShouldStop(1073741824);
_response.runVoidMethod ("SendString",(Object)(RemoteObject.createImmutable("Unauthorized")));
 BA.debugLineNum = 96;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 100;BA.debugLine="Dim empleadosList As List = empleadosManager.Re";
Debug.ShouldStop(8);
_empleadoslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_empleadoslist = webservice._empleadosmanager.runClassMethod (b4a.example.empleados.class, "_read_all" /*RemoteObject*/ );Debug.locals.put("empleadosList", _empleadoslist);Debug.locals.put("empleadosList", _empleadoslist);
 BA.debugLineNum = 103;BA.debugLine="Dim jsonArray As List";
Debug.ShouldStop(64);
_jsonarray = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("jsonArray", _jsonarray);
 BA.debugLineNum = 104;BA.debugLine="jsonArray.Initialize";
Debug.ShouldStop(128);
_jsonarray.runVoidMethod ("Initialize");
 BA.debugLineNum = 106;BA.debugLine="For Each emp As Empleado In empleadosList";
Debug.ShouldStop(512);
{
final RemoteObject group56 = _empleadoslist;
final int groupLen56 = group56.runMethod(true,"getSize").<Integer>get()
;int index56 = 0;
;
for (; index56 < groupLen56;index56++){
_emp = (group56.runMethod(false,"Get",index56));Debug.locals.put("emp", _emp);
Debug.locals.put("emp", _emp);
 BA.debugLineNum = 107;BA.debugLine="Dim jsonItem As Map";
Debug.ShouldStop(1024);
_jsonitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("jsonItem", _jsonitem);
 BA.debugLineNum = 108;BA.debugLine="jsonItem.Initialize";
Debug.ShouldStop(2048);
_jsonitem.runVoidMethod ("Initialize");
 BA.debugLineNum = 109;BA.debugLine="jsonItem.Put(\"cedula\", emp.Cedula)";
Debug.ShouldStop(4096);
_jsonitem.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("cedula"))),(Object)((_emp.getField(true,"_cedula" /*RemoteObject*/ ))));
 BA.debugLineNum = 110;BA.debugLine="jsonItem.Put(\"nombres\", emp.Nombres)";
Debug.ShouldStop(8192);
_jsonitem.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("nombres"))),(Object)((_emp.getField(true,"_nombres" /*RemoteObject*/ ))));
 BA.debugLineNum = 111;BA.debugLine="jsonItem.Put(\"salario\", emp.Salario)";
Debug.ShouldStop(16384);
_jsonitem.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("salario"))),(Object)((_emp.getField(true,"_salario" /*RemoteObject*/ ))));
 BA.debugLineNum = 112;BA.debugLine="jsonItem.Put(\"cargo\", emp.Cargo)";
Debug.ShouldStop(32768);
_jsonitem.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("cargo"))),(Object)((_emp.getField(true,"_cargo" /*RemoteObject*/ ))));
 BA.debugLineNum = 113;BA.debugLine="jsonArray.Add(jsonItem)";
Debug.ShouldStop(65536);
_jsonarray.runVoidMethod ("Add",(Object)((_jsonitem.getObject())));
 }
}Debug.locals.put("emp", _emp);
;
 BA.debugLineNum = 117;BA.debugLine="Dim jsonGenerator As JSONGenerator";
Debug.ShouldStop(1048576);
_jsongenerator = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("jsonGenerator", _jsongenerator);
 BA.debugLineNum = 118;BA.debugLine="jsonGenerator.Initialize2(jsonArray)";
Debug.ShouldStop(2097152);
_jsongenerator.runVoidMethod ("Initialize2",(Object)(_jsonarray));
 BA.debugLineNum = 119;BA.debugLine="Dim json As String = jsonGenerator.ToPrettyStri";
Debug.ShouldStop(4194304);
_json = _jsongenerator.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("json", _json);Debug.locals.put("json", _json);
 BA.debugLineNum = 122;BA.debugLine="Response.SetContentType(\"application/json\")";
Debug.ShouldStop(33554432);
_response.runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 123;BA.debugLine="Response.Status = 200";
Debug.ShouldStop(67108864);
_response.runVoidMethod ("setStatus",BA.numberCast(int.class, 200));
 BA.debugLineNum = 124;BA.debugLine="Response.SendString(json)";
Debug.ShouldStop(134217728);
_response.runVoidMethod ("SendString",(Object)(_json));
 break; }
default: {
 BA.debugLineNum = 128;BA.debugLine="Response.Status = 404";
Debug.ShouldStop(-2147483648);
_response.runVoidMethod ("setStatus",BA.numberCast(int.class, 404));
 BA.debugLineNum = 129;BA.debugLine="Response.SendString(\"Not Found\")";
Debug.ShouldStop(1);
_response.runVoidMethod ("SendString",(Object)(RemoteObject.createImmutable("Not Found")));
 break; }
}
;
 BA.debugLineNum = 131;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}