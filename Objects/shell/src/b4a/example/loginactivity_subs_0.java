package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class loginactivity_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (loginactivity) ","loginactivity",3,loginactivity.mostCurrent.activityBA,loginactivity.mostCurrent,20);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.loginactivity.remoteMe.runUserSub(false, "loginactivity","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 20;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 22;BA.debugLine="Activity.LoadLayout(\"loginLayout\")";
Debug.ShouldStop(2097152);
loginactivity.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("loginLayout")),loginactivity.mostCurrent.activityBA);
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("Activity_Pause (loginactivity) ","loginactivity",3,loginactivity.mostCurrent.activityBA,loginactivity.mostCurrent,30);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.loginactivity.remoteMe.runUserSub(false, "loginactivity","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 30;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("Activity_Resume (loginactivity) ","loginactivity",3,loginactivity.mostCurrent.activityBA,loginactivity.mostCurrent,26);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.loginactivity.remoteMe.runUserSub(false, "loginactivity","activity_resume");}
 BA.debugLineNum = 26;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnirhome_click() throws Exception{
try {
		Debug.PushSubsStack("btnIrHome_Click (loginactivity) ","loginactivity",3,loginactivity.mostCurrent.activityBA,loginactivity.mostCurrent,35);
if (RapidSub.canDelegate("btnirhome_click")) { return b4a.example.loginactivity.remoteMe.runUserSub(false, "loginactivity","btnirhome_click");}
 BA.debugLineNum = 35;BA.debugLine="Private Sub btnIrHome_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8);
loginactivity.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnlogin_click() throws Exception{
try {
		Debug.PushSubsStack("btnLogin_Click (loginactivity) ","loginactivity",3,loginactivity.mostCurrent.activityBA,loginactivity.mostCurrent,39);
if (RapidSub.canDelegate("btnlogin_click")) { return b4a.example.loginactivity.remoteMe.runUserSub(false, "loginactivity","btnlogin_click");}
RemoteObject _job = RemoteObject.declareNull("b4a.example.httpjob");
 BA.debugLineNum = 39;BA.debugLine="Private Sub btnLogin_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(128);
_job = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 41;BA.debugLine="job.Initialize(\"loginJob\", Me)";
Debug.ShouldStop(256);
_job.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,loginactivity.processBA,(Object)(BA.ObjectToString("loginJob")),(Object)(loginactivity.getObject()));
 BA.debugLineNum = 42;BA.debugLine="job.PostString(\"http://localhost:8080/login\", _";
Debug.ShouldStop(512);
_job.runClassMethod (b4a.example.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(BA.ObjectToString("http://localhost:8080/login")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("user="),loginactivity.mostCurrent._txtusuario.runMethod(true,"getText"),RemoteObject.createImmutable("&password="),loginactivity.mostCurrent._txtpassword.runMethod(true,"getText"))));
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
 //BA.debugLineNum = 16;BA.debugLine="Private txtUsuario As EditText";
loginactivity.mostCurrent._txtusuario = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private txtPassword As EditText";
loginactivity.mostCurrent._txtpassword = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (loginactivity) ","loginactivity",3,loginactivity.mostCurrent.activityBA,loginactivity.mostCurrent,46);
if (RapidSub.canDelegate("jobdone")) { return b4a.example.loginactivity.remoteMe.runUserSub(false, "loginactivity","jobdone", _job);}
RemoteObject _response = RemoteObject.createImmutable("");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 46;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(16384);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 48;BA.debugLine="If Job.JobName = \"loginJob\" Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("loginJob"))) { 
 BA.debugLineNum = 49;BA.debugLine="Dim response As String = Job.GetString";
Debug.ShouldStop(65536);
_response = _job.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("response", _response);Debug.locals.put("response", _response);
 BA.debugLineNum = 50;BA.debugLine="Msgbox(response, \"Login Status\")";
Debug.ShouldStop(131072);
loginactivity.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(_response)),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Login Status"))),loginactivity.mostCurrent.activityBA);
 };
 BA.debugLineNum = 52;BA.debugLine="StartActivity(inputActivity)";
Debug.ShouldStop(524288);
loginactivity.mostCurrent.__c.runVoidMethod ("StartActivity",loginactivity.processBA,(Object)((loginactivity.mostCurrent._inputactivity.getObject())));
 }else {
 BA.debugLineNum = 54;BA.debugLine="Msgbox(\"Error: \" & Job.ErrorMessage, \"Error\")";
Debug.ShouldStop(2097152);
loginactivity.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage" /*RemoteObject*/ )))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),loginactivity.mostCurrent.activityBA);
 };
 BA.debugLineNum = 56;BA.debugLine="Job.Release";
Debug.ShouldStop(8388608);
_job.runClassMethod (b4a.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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