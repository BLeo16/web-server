package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class inputactivity_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (inputactivity) ","inputactivity",4,inputactivity.mostCurrent.activityBA,inputactivity.mostCurrent,22);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.inputactivity.remoteMe.runUserSub(false, "inputactivity","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 22;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (inputactivity) ","inputactivity",4,inputactivity.mostCurrent.activityBA,inputactivity.mostCurrent,32);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.inputactivity.remoteMe.runUserSub(false, "inputactivity","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 32;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (inputactivity) ","inputactivity",4,inputactivity.mostCurrent.activityBA,inputactivity.mostCurrent,28);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.inputactivity.remoteMe.runUserSub(false, "inputactivity","activity_resume");}
 BA.debugLineNum = 28;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncrear_click() throws Exception{
try {
		Debug.PushSubsStack("btnCrear_Click (inputactivity) ","inputactivity",4,inputactivity.mostCurrent.activityBA,inputactivity.mostCurrent,45);
if (RapidSub.canDelegate("btncrear_click")) { return b4a.example.inputactivity.remoteMe.runUserSub(false, "inputactivity","btncrear_click");}
RemoteObject _job = RemoteObject.declareNull("b4a.example.httpjob");
 BA.debugLineNum = 45;BA.debugLine="Private Sub btnCrear_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 46;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(8192);
_job = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 47;BA.debugLine="job.Initialize(\"jobCreate\", Me)";
Debug.ShouldStop(16384);
_job.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,inputactivity.processBA,(Object)(BA.ObjectToString("jobCreate")),(Object)(inputactivity.getObject()));
 BA.debugLineNum = 48;BA.debugLine="job.PostString(\"http://localhost:8080/DataInput\",";
Debug.ShouldStop(32768);
_job.runClassMethod (b4a.example.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(BA.ObjectToString("http://localhost:8080/DataInput")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("cedula="),inputactivity.mostCurrent._txtcedula.runMethod(true,"getText"),RemoteObject.createImmutable("&nombres="),inputactivity.mostCurrent._txtnombres.runMethod(true,"getText"),RemoteObject.createImmutable("&salario="),inputactivity.mostCurrent._txtsalario.runMethod(true,"getText"),RemoteObject.createImmutable("&cargo="),inputactivity.mostCurrent._txtcargo.runMethod(true,"getText"),RemoteObject.createImmutable("&user=yourUsername&password=yourPassword"))));
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnirleerpage_click() throws Exception{
try {
		Debug.PushSubsStack("btnIrLeerPage_Click (inputactivity) ","inputactivity",4,inputactivity.mostCurrent.activityBA,inputactivity.mostCurrent,41);
if (RapidSub.canDelegate("btnirleerpage_click")) { return b4a.example.inputactivity.remoteMe.runUserSub(false, "inputactivity","btnirleerpage_click");}
 BA.debugLineNum = 41;BA.debugLine="Private Sub btnIrLeerPage_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="StartActivity(ouputActivity)";
Debug.ShouldStop(512);
inputactivity.mostCurrent.__c.runVoidMethod ("StartActivity",inputactivity.processBA,(Object)((inputactivity.mostCurrent._ouputactivity.getObject())));
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnlogout_click() throws Exception{
try {
		Debug.PushSubsStack("btnLogOut_Click (inputactivity) ","inputactivity",4,inputactivity.mostCurrent.activityBA,inputactivity.mostCurrent,37);
if (RapidSub.canDelegate("btnlogout_click")) { return b4a.example.inputactivity.remoteMe.runUserSub(false, "inputactivity","btnlogout_click");}
 BA.debugLineNum = 37;BA.debugLine="Private Sub btnLogOut_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private txtCedula As EditText";
inputactivity.mostCurrent._txtcedula = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private txtNombres As EditText";
inputactivity.mostCurrent._txtnombres = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private txtSalario As EditText";
inputactivity.mostCurrent._txtsalario = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private txtCargo As EditText";
inputactivity.mostCurrent._txtcargo = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (inputactivity) ","inputactivity",4,inputactivity.mostCurrent.activityBA,inputactivity.mostCurrent,55);
if (RapidSub.canDelegate("jobdone")) { return b4a.example.inputactivity.remoteMe.runUserSub(false, "inputactivity","jobdone", _job);}
Debug.locals.put("Job", _job);
 BA.debugLineNum = 55;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(8388608);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 57;BA.debugLine="Msgbox(\"Registro insertado !!\", \"ok\")";
Debug.ShouldStop(16777216);
inputactivity.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Registro insertado !!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("ok"))),inputactivity.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 59;BA.debugLine="Msgbox(\"Error al insertar el registro: \" & Job.E";
Debug.ShouldStop(67108864);
inputactivity.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error al insertar el registro: "),_job.getField(true,"_errormessage" /*RemoteObject*/ )))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),inputactivity.mostCurrent.activityBA);
 };
 BA.debugLineNum = 61;BA.debugLine="Job.Release";
Debug.ShouldStop(268435456);
_job.runClassMethod (b4a.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}