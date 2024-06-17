package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class empleado_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public cedula As String";
empleado._cedula = RemoteObject.createImmutable("");__ref.setField("_cedula",empleado._cedula);
 //BA.debugLineNum = 3;BA.debugLine="Public nombres As String";
empleado._nombres = RemoteObject.createImmutable("");__ref.setField("_nombres",empleado._nombres);
 //BA.debugLineNum = 4;BA.debugLine="Public salario As Double";
empleado._salario = RemoteObject.createImmutable(0);__ref.setField("_salario",empleado._salario);
 //BA.debugLineNum = 5;BA.debugLine="Public cargo As String";
empleado._cargo = RemoteObject.createImmutable("");__ref.setField("_cargo",empleado._cargo);
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (empleado) ","empleado",1,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "empleado","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(256);
 BA.debugLineNum = 11;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}