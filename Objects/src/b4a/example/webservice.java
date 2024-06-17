package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class webservice extends android.app.Service{
	public static class webservice_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
            BA.LogInfo("** Receiver (webservice) OnReceive **");
			android.content.Intent in = new android.content.Intent(context, webservice.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, false, anywheresoftware.b4a.ShellBA.class);
		}

	}
    static webservice mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return webservice.class;
	}
	@Override
	public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new anywheresoftware.b4a.ShellBA(this, null, null, "b4a.example", "b4a.example.webservice");
            if (BA.isShellModeRuntimeCheck(processBA)) {
                processBA.raiseEvent2(null, true, "SHELL", false);
		    }
            try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            processBA.loadHtSubs(this.getClass());
            ServiceHelper.init();
        }
        _service = new ServiceHelper(this);
        processBA.service = this;
        
        if (BA.isShellModeRuntimeCheck(processBA)) {
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.webservice", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
		}
        if (!false && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, true) == false) {
				
		}
		else {
            processBA.setActivityPaused(false);
            BA.LogInfo("*** Service (webservice) Create ***");
            processBA.raiseEvent(null, "service_create");
        }
        processBA.runHook("oncreate", this, null);
        if (false) {
			if (ServiceHelper.StarterHelper.runWaitForLayouts() == false) {
                BA.LogInfo("stopping spontaneous created service");
                stopSelf();
            }
		}
    }
		@Override
	public void onStart(android.content.Intent intent, int startId) {
		onStartCommand(intent, 0, 0);
    }
    @Override
    public int onStartCommand(final android.content.Intent intent, int flags, int startId) {
    	if (ServiceHelper.StarterHelper.onStartCommand(processBA, new Runnable() {
            public void run() {
                handleStart(intent);
            }}))
			;
		else {
			ServiceHelper.StarterHelper.addWaitForLayout (new Runnable() {
				public void run() {
                    processBA.setActivityPaused(false);
                    BA.LogInfo("** Service (webservice) Create **");
                    processBA.raiseEvent(null, "service_create");
					handleStart(intent);
                    ServiceHelper.StarterHelper.removeWaitForLayout();
				}
			});
		}
        processBA.runHook("onstartcommand", this, new Object[] {intent, flags, startId});
		return android.app.Service.START_NOT_STICKY;
    }
    public void onTaskRemoved(android.content.Intent rootIntent) {
        super.onTaskRemoved(rootIntent);
        if (false)
            processBA.raiseEvent(null, "service_taskremoved");
            
    }
    private void handleStart(android.content.Intent intent) {
    	BA.LogInfo("** Service (webservice) Start **");
    	java.lang.reflect.Method startEvent = processBA.htSubs.get("service_start");
    	if (startEvent != null) {
    		if (startEvent.getParameterTypes().length > 0) {
    			anywheresoftware.b4a.objects.IntentWrapper iw = ServiceHelper.StarterHelper.handleStartIntent(intent, _service, processBA);
    			processBA.raiseEvent(null, "service_start", iw);
    		}
    		else {
    			processBA.raiseEvent(null, "service_start");
    		}
    	}
    }
	
	@Override
	public void onDestroy() {
        super.onDestroy();
        if (false) {
            BA.LogInfo("** Service (webservice) Destroy (ignored)**");
        }
        else {
            BA.LogInfo("** Service (webservice) Destroy **");
		    processBA.raiseEvent(null, "service_destroy");
            processBA.service = null;
		    mostCurrent = null;
		    processBA.setActivityPaused(true);
            processBA.runHook("ondestroy", this, null);
        }
	}

@Override
	public android.os.IBinder onBind(android.content.Intent intent) {
		return null;
	}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.HttpServer _websocket = null;
public static anywheresoftware.b4a.objects.collections.Map _validusers = null;
public static b4a.example.empleados _empleadosmanager = null;
public b4a.example.main _main = null;
public b4a.example.loginactivity _loginactivity = null;
public b4a.example.inputactivity _inputactivity = null;
public b4a.example.ouputactivity _ouputactivity = null;
public b4a.example.httputils2service _httputils2service = null;
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="webservice";
if (Debug.shouldDelegate(processBA, "application_error", false))
	 {return ((Boolean) Debug.delegate(processBA, "application_error", new Object[] {_error,_stacktrace}));}
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="End Sub";
return false;
}
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="webservice";
if (Debug.shouldDelegate(processBA, "service_create", false))
	 {return ((String) Debug.delegate(processBA, "service_create", null));}
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="webSocket.Initialize(\"webSocket\")";
_websocket.Initialize(processBA,"webSocket");
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="validUsers.Initialize";
_validusers.Initialize();
RDebugUtils.currentLine=5242883;
 //BA.debugLineNum = 5242883;BA.debugLine="empleadosManager.Initialize(\"empresa\")";
_empleadosmanager._initialize /*String*/ (null,processBA,"empresa");
RDebugUtils.currentLine=5242884;
 //BA.debugLineNum = 5242884;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
RDebugUtils.currentModule="webservice";
if (Debug.shouldDelegate(processBA, "service_destroy", false))
	 {return ((String) Debug.delegate(processBA, "service_destroy", null));}
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Sub Service_Destroy";
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="webSocket.Stop";
_websocket.Stop();
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="webservice";
if (Debug.shouldDelegate(processBA, "service_start", false))
	 {return ((String) Debug.delegate(processBA, "service_start", new Object[] {_startingintent}));}
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="Service.StopAutomaticForeground";
mostCurrent._service.StopAutomaticForeground();
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="webSocket.Start(8080)";
_websocket.Start((int) (8080));
RDebugUtils.currentLine=5308419;
 //BA.debugLineNum = 5308419;BA.debugLine="End Sub";
return "";
}
public static String  _service_taskremoved() throws Exception{
RDebugUtils.currentModule="webservice";
if (Debug.shouldDelegate(processBA, "service_taskremoved", false))
	 {return ((String) Debug.delegate(processBA, "service_taskremoved", null));}
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Sub Service_TaskRemoved";
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="webSocket.Stop";
_websocket.Stop();
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="End Sub";
return "";
}
public static boolean  _validateuser(anywheresoftware.b4a.objects.Servlet.ServletRequestWrapper _request) throws Exception{
RDebugUtils.currentModule="webservice";
if (Debug.shouldDelegate(processBA, "validateuser", false))
	 {return ((Boolean) Debug.delegate(processBA, "validateuser", new Object[] {_request}));}
String _user = "";
String _pwd = "";
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Private Sub ValidateUser(Request As ServletRequest";
RDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="Dim user As String = Request.GetParameter(\"user\")";
_user = _request.GetParameter("user");
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="Dim pwd As String = Request.GetParameter(\"passwor";
_pwd = _request.GetParameter("password");
RDebugUtils.currentLine=5636100;
 //BA.debugLineNum = 5636100;BA.debugLine="If user = Null Or pwd = Null Then Return False";
if (_user== null || _pwd== null) { 
if (true) return anywheresoftware.b4a.keywords.Common.False;};
RDebugUtils.currentLine=5636102;
 //BA.debugLineNum = 5636102;BA.debugLine="Return validUsers.ContainsKey(user) And validUser";
if (true) return _validusers.ContainsKey((Object)(_user)) && (_validusers.Get((Object)(_user))).equals((Object)(_pwd));
RDebugUtils.currentLine=5636103;
 //BA.debugLineNum = 5636103;BA.debugLine="End Sub";
return false;
}
public static String  _websocket_handlerequest(anywheresoftware.b4a.objects.Servlet.ServletRequestWrapper _request,anywheresoftware.b4a.objects.Servlet.ServletResponseWrapper _response) throws Exception{
RDebugUtils.currentModule="webservice";
if (Debug.shouldDelegate(processBA, "websocket_handlerequest", false))
	 {return ((String) Debug.delegate(processBA, "websocket_handlerequest", new Object[] {_request,_response}));}
String _html = "";
String _user = "";
String _pwd = "";
String _ip = "";
String _cedula = "";
String _nombres = "";
String _salario = "";
String _cargo = "";
anywheresoftware.b4a.objects.collections.List _empleadoslist = null;
anywheresoftware.b4a.objects.collections.List _jsonarray = null;
b4a.example.empleado _emp = null;
anywheresoftware.b4a.objects.collections.Map _jsonitem = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jsongenerator = null;
String _json = "";
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Private Sub webSocket_HandleRequest (Request As Se";
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="Dim html As String";
_html = "";
RDebugUtils.currentLine=5570563;
 //BA.debugLineNum = 5570563;BA.debugLine="Select Request.RequestURI";
switch (BA.switchObjectToInt(_request.getRequestURI(),"/home","/login","/DataInput","/DataOutput")) {
case 0: {
RDebugUtils.currentLine=5570565;
 //BA.debugLineNum = 5570565;BA.debugLine="html = \"<html><body><h1>PAGINA DE INICIO</h1></";
_html = "<html><body><h1>PAGINA DE INICIO</h1></body></html>";
RDebugUtils.currentLine=5570566;
 //BA.debugLineNum = 5570566;BA.debugLine="Response.Status = 200";
_response.setStatus((int) (200));
RDebugUtils.currentLine=5570567;
 //BA.debugLineNum = 5570567;BA.debugLine="Response.SendString(html)";
_response.SendString(_html);
 break; }
case 1: {
RDebugUtils.currentLine=5570570;
 //BA.debugLineNum = 5570570;BA.debugLine="If Request.Method <> \"POST\" Then";
if ((_request.getMethod()).equals("POST") == false) { 
RDebugUtils.currentLine=5570571;
 //BA.debugLineNum = 5570571;BA.debugLine="Response.Status = 405";
_response.setStatus((int) (405));
RDebugUtils.currentLine=5570572;
 //BA.debugLineNum = 5570572;BA.debugLine="Response.SendString(\"Method Not Allowed\")";
_response.SendString("Method Not Allowed");
RDebugUtils.currentLine=5570573;
 //BA.debugLineNum = 5570573;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=5570576;
 //BA.debugLineNum = 5570576;BA.debugLine="Dim user As String = Request.GetParameter(\"user";
_user = _request.GetParameter("user");
RDebugUtils.currentLine=5570577;
 //BA.debugLineNum = 5570577;BA.debugLine="Dim pwd As String = Request.GetParameter(\"passw";
_pwd = _request.GetParameter("password");
RDebugUtils.currentLine=5570579;
 //BA.debugLineNum = 5570579;BA.debugLine="If user = Null Or pwd = Null Then";
if (_user== null || _pwd== null) { 
RDebugUtils.currentLine=5570580;
 //BA.debugLineNum = 5570580;BA.debugLine="Response.Status = 400";
_response.setStatus((int) (400));
RDebugUtils.currentLine=5570581;
 //BA.debugLineNum = 5570581;BA.debugLine="Response.SendString(\"Bad Request\")";
_response.SendString("Bad Request");
RDebugUtils.currentLine=5570582;
 //BA.debugLineNum = 5570582;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=5570585;
 //BA.debugLineNum = 5570585;BA.debugLine="validUsers.Put(user, pwd)";
_validusers.Put((Object)(_user),(Object)(_pwd));
RDebugUtils.currentLine=5570586;
 //BA.debugLineNum = 5570586;BA.debugLine="Dim ip As String = Request.RemoteAddress";
_ip = _request.getRemoteAddress();
RDebugUtils.currentLine=5570587;
 //BA.debugLineNum = 5570587;BA.debugLine="Response.Status = 200";
_response.setStatus((int) (200));
RDebugUtils.currentLine=5570588;
 //BA.debugLineNum = 5570588;BA.debugLine="Response.SendString(\"User logged in from IP: \"";
_response.SendString("User logged in from IP: "+_ip);
 break; }
case 2: {
RDebugUtils.currentLine=5570591;
 //BA.debugLineNum = 5570591;BA.debugLine="If Request.Method = \"POST\" Then";
if ((_request.getMethod()).equals("POST")) { 
RDebugUtils.currentLine=5570592;
 //BA.debugLineNum = 5570592;BA.debugLine="If Not (ValidateUser(Request)) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_validateuser(_request))) { 
RDebugUtils.currentLine=5570593;
 //BA.debugLineNum = 5570593;BA.debugLine="Response.Status = 401";
_response.setStatus((int) (401));
RDebugUtils.currentLine=5570594;
 //BA.debugLineNum = 5570594;BA.debugLine="Response.SendString(\"Unauthorized\")";
_response.SendString("Unauthorized");
RDebugUtils.currentLine=5570595;
 //BA.debugLineNum = 5570595;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=5570598;
 //BA.debugLineNum = 5570598;BA.debugLine="Dim cedula As String = Request.GetParameter(\"c";
_cedula = _request.GetParameter("cedula");
RDebugUtils.currentLine=5570599;
 //BA.debugLineNum = 5570599;BA.debugLine="Dim nombres As String = Request.GetParameter(\"";
_nombres = _request.GetParameter("nombres");
RDebugUtils.currentLine=5570600;
 //BA.debugLineNum = 5570600;BA.debugLine="Dim salario As String = Request.GetParameter(\"";
_salario = _request.GetParameter("salario");
RDebugUtils.currentLine=5570601;
 //BA.debugLineNum = 5570601;BA.debugLine="Dim cargo As String = Request.GetParameter(\"ca";
_cargo = _request.GetParameter("cargo");
RDebugUtils.currentLine=5570603;
 //BA.debugLineNum = 5570603;BA.debugLine="If cedula = Null Or nombres = Null Or salario";
if (_cedula== null || _nombres== null || _salario== null || _cargo== null) { 
RDebugUtils.currentLine=5570604;
 //BA.debugLineNum = 5570604;BA.debugLine="Response.Status = 400";
_response.setStatus((int) (400));
RDebugUtils.currentLine=5570605;
 //BA.debugLineNum = 5570605;BA.debugLine="Response.SendString(\"Bad Request\")";
_response.SendString("Bad Request");
RDebugUtils.currentLine=5570606;
 //BA.debugLineNum = 5570606;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=5570609;
 //BA.debugLineNum = 5570609;BA.debugLine="empleadosManager.Create(cedula, nombres, salar";
_empleadosmanager._create /*b4a.example.empleado*/ (null,_cedula,_nombres,(double)(Double.parseDouble(_salario)),_cargo);
RDebugUtils.currentLine=5570610;
 //BA.debugLineNum = 5570610;BA.debugLine="Response.Status = 200";
_response.setStatus((int) (200));
RDebugUtils.currentLine=5570611;
 //BA.debugLineNum = 5570611;BA.debugLine="Response.SendString(\"Empleado guardado exitosa";
_response.SendString("Empleado guardado exitosamente");
 }else {
RDebugUtils.currentLine=5570613;
 //BA.debugLineNum = 5570613;BA.debugLine="Response.Status = 405";
_response.setStatus((int) (405));
RDebugUtils.currentLine=5570614;
 //BA.debugLineNum = 5570614;BA.debugLine="Response.SendString(\"Method Not Allowed\")";
_response.SendString("Method Not Allowed");
 };
 break; }
case 3: {
RDebugUtils.currentLine=5570618;
 //BA.debugLineNum = 5570618;BA.debugLine="If Not (ValidateUser(Request)) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_validateuser(_request))) { 
RDebugUtils.currentLine=5570619;
 //BA.debugLineNum = 5570619;BA.debugLine="Response.Status = 401";
_response.setStatus((int) (401));
RDebugUtils.currentLine=5570620;
 //BA.debugLineNum = 5570620;BA.debugLine="Response.SendString(\"Unauthorized\")";
_response.SendString("Unauthorized");
RDebugUtils.currentLine=5570621;
 //BA.debugLineNum = 5570621;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=5570625;
 //BA.debugLineNum = 5570625;BA.debugLine="Dim empleadosList As List = empleadosManager.Re";
_empleadoslist = new anywheresoftware.b4a.objects.collections.List();
_empleadoslist = _empleadosmanager._read_all /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=5570628;
 //BA.debugLineNum = 5570628;BA.debugLine="Dim jsonArray As List";
_jsonarray = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5570629;
 //BA.debugLineNum = 5570629;BA.debugLine="jsonArray.Initialize";
_jsonarray.Initialize();
RDebugUtils.currentLine=5570631;
 //BA.debugLineNum = 5570631;BA.debugLine="For Each emp As Empleado In empleadosList";
{
final anywheresoftware.b4a.BA.IterableList group56 = _empleadoslist;
final int groupLen56 = group56.getSize()
;int index56 = 0;
;
for (; index56 < groupLen56;index56++){
_emp = (b4a.example.empleado)(group56.Get(index56));
RDebugUtils.currentLine=5570632;
 //BA.debugLineNum = 5570632;BA.debugLine="Dim jsonItem As Map";
_jsonitem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5570633;
 //BA.debugLineNum = 5570633;BA.debugLine="jsonItem.Initialize";
_jsonitem.Initialize();
RDebugUtils.currentLine=5570634;
 //BA.debugLineNum = 5570634;BA.debugLine="jsonItem.Put(\"cedula\", emp.Cedula)";
_jsonitem.Put((Object)("cedula"),(Object)(_emp._cedula /*String*/ ));
RDebugUtils.currentLine=5570635;
 //BA.debugLineNum = 5570635;BA.debugLine="jsonItem.Put(\"nombres\", emp.Nombres)";
_jsonitem.Put((Object)("nombres"),(Object)(_emp._nombres /*String*/ ));
RDebugUtils.currentLine=5570636;
 //BA.debugLineNum = 5570636;BA.debugLine="jsonItem.Put(\"salario\", emp.Salario)";
_jsonitem.Put((Object)("salario"),(Object)(_emp._salario /*double*/ ));
RDebugUtils.currentLine=5570637;
 //BA.debugLineNum = 5570637;BA.debugLine="jsonItem.Put(\"cargo\", emp.Cargo)";
_jsonitem.Put((Object)("cargo"),(Object)(_emp._cargo /*String*/ ));
RDebugUtils.currentLine=5570638;
 //BA.debugLineNum = 5570638;BA.debugLine="jsonArray.Add(jsonItem)";
_jsonarray.Add((Object)(_jsonitem.getObject()));
 }
};
RDebugUtils.currentLine=5570642;
 //BA.debugLineNum = 5570642;BA.debugLine="Dim jsonGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=5570643;
 //BA.debugLineNum = 5570643;BA.debugLine="jsonGenerator.Initialize2(jsonArray)";
_jsongenerator.Initialize2(_jsonarray);
RDebugUtils.currentLine=5570644;
 //BA.debugLineNum = 5570644;BA.debugLine="Dim json As String = jsonGenerator.ToPrettyStri";
_json = _jsongenerator.ToPrettyString((int) (2));
RDebugUtils.currentLine=5570647;
 //BA.debugLineNum = 5570647;BA.debugLine="Response.SetContentType(\"application/json\")";
_response.SetContentType("application/json");
RDebugUtils.currentLine=5570648;
 //BA.debugLineNum = 5570648;BA.debugLine="Response.Status = 200";
_response.setStatus((int) (200));
RDebugUtils.currentLine=5570649;
 //BA.debugLineNum = 5570649;BA.debugLine="Response.SendString(json)";
_response.SendString(_json);
 break; }
default: {
RDebugUtils.currentLine=5570653;
 //BA.debugLineNum = 5570653;BA.debugLine="Response.Status = 404";
_response.setStatus((int) (404));
RDebugUtils.currentLine=5570654;
 //BA.debugLineNum = 5570654;BA.debugLine="Response.SendString(\"Not Found\")";
_response.SendString("Not Found");
 break; }
}
;
RDebugUtils.currentLine=5570656;
 //BA.debugLineNum = 5570656;BA.debugLine="End Sub";
return "";
}
}