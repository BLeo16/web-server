package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class empleado extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.empleado");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.empleado.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public String _cedula = "";
public String _nombres = "";
public double _salario = 0;
public String _cargo = "";
public b4a.example.main _main = null;
public b4a.example.loginactivity _loginactivity = null;
public b4a.example.inputactivity _inputactivity = null;
public b4a.example.ouputactivity _ouputactivity = null;
public b4a.example.webservice _webservice = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _class_globals(b4a.example.empleado __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="empleado";
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Public cedula As String";
_cedula = "";
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="Public nombres As String";
_nombres = "";
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="Public salario As Double";
_salario = 0;
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="Public cargo As String";
_cargo = "";
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.empleado __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="empleado";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="End Sub";
return "";
}
}