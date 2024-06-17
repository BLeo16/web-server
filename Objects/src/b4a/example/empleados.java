package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class empleados extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.empleados");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.empleados.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.sql.SQL _sql = null;
public b4a.example.main _main = null;
public b4a.example.loginactivity _loginactivity = null;
public b4a.example.inputactivity _inputactivity = null;
public b4a.example.ouputactivity _ouputactivity = null;
public b4a.example.webservice _webservice = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _class_globals(b4a.example.empleados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="empleados";
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="Private sql As SQL";
_sql = new anywheresoftware.b4a.sql.SQL();
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="End Sub";
return "";
}
public b4a.example.empleado  _create(b4a.example.empleados __ref,String _cedula,String _nombres,double _salario,String _cargo) throws Exception{
__ref = this;
RDebugUtils.currentModule="empleados";
if (Debug.shouldDelegate(ba, "create", false))
	 {return ((b4a.example.empleado) Debug.delegate(ba, "create", new Object[] {_cedula,_nombres,_salario,_cargo}));}
b4a.example.empleado _p = null;
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Public Sub Create( cedula As String, nombres As St";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="sql.ExecNonQuery2(\"INSERT INTO empleados(cedula,";
__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("INSERT INTO empleados(cedula, nombres, salario, cargo) VALUES ( ?, ?, ?, ?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_cedula),(Object)(_nombres),(Object)(_salario),(Object)(_cargo)}));
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="Dim p As Empleado";
_p = new b4a.example.empleado();
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="p.Initialize";
_p._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="p.cedula = cedula";
_p._cedula /*String*/  = _cedula;
RDebugUtils.currentLine=1179655;
 //BA.debugLineNum = 1179655;BA.debugLine="p.nombres = nombres";
_p._nombres /*String*/  = _nombres;
RDebugUtils.currentLine=1179656;
 //BA.debugLineNum = 1179656;BA.debugLine="p.salario = salario";
_p._salario /*double*/  = _salario;
RDebugUtils.currentLine=1179657;
 //BA.debugLineNum = 1179657;BA.debugLine="p.cargo = cargo";
_p._cargo /*String*/  = _cargo;
RDebugUtils.currentLine=1179659;
 //BA.debugLineNum = 1179659;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=1179660;
 //BA.debugLineNum = 1179660;BA.debugLine="End Sub";
return null;
}
public boolean  _delete(b4a.example.empleados __ref,String _cedula) throws Exception{
__ref = this;
RDebugUtils.currentModule="empleados";
if (Debug.shouldDelegate(ba, "delete", false))
	 {return ((Boolean) Debug.delegate(ba, "delete", new Object[] {_cedula}));}
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Public Sub Delete(cedula As String) As Boolean";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="sql.ExecNonQuery(\"DELETE FROM empleados WHERE ced";
__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("DELETE FROM empleados WHERE cedula = "+_cedula);
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="End Sub";
return false;
}
public String  _initialize(b4a.example.empleados __ref,anywheresoftware.b4a.BA _ba,String _nombrebdd) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="empleados";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_nombrebdd}));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Public Sub Initialize( nombreBdd As String)";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="sql.Initialize( File.DirInternal, nombreBdd, True";
__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .Initialize(__c.File.getDirInternal(),_nombrebdd,__c.True);
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="sql.ExecNonQuery(\"CREATE TABLE IF NOT EXISTS empl";
__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("CREATE TABLE IF NOT EXISTS empleados( cedula TEXT(10) PRIMARY KEY, nombres TEXT(50), salario NUMBER(10,3), cargo TEXT(30) )");
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _read_all(b4a.example.empleados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="empleados";
if (Debug.shouldDelegate(ba, "read_all", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "read_all", null));}
anywheresoftware.b4a.objects.collections.List _resultado = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor = null;
int _i = 0;
b4a.example.empleado _p = null;
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Public Sub Read_All () As List";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="Dim resultado As List";
_resultado = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="resultado.Initialize";
_resultado.Initialize();
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="Dim cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="cursor = sql.ExecQuery(\"SELECT cedula, nombres, s";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT cedula, nombres, salario, cargo FROM empleados ORDER BY nombres")));
RDebugUtils.currentLine=1245190;
 //BA.debugLineNum = 1245190;BA.debugLine="For i=0 To cursor.RowCount-1";
{
final int step5 = 1;
final int limit5 = (int) (_cursor.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=1245191;
 //BA.debugLineNum = 1245191;BA.debugLine="cursor.Position = i";
_cursor.setPosition(_i);
RDebugUtils.currentLine=1245193;
 //BA.debugLineNum = 1245193;BA.debugLine="Dim p As Empleado";
_p = new b4a.example.empleado();
RDebugUtils.currentLine=1245194;
 //BA.debugLineNum = 1245194;BA.debugLine="p.Initialize";
_p._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1245195;
 //BA.debugLineNum = 1245195;BA.debugLine="p.cedula = cursor.GetString(\"cedula\")";
_p._cedula /*String*/  = _cursor.GetString("cedula");
RDebugUtils.currentLine=1245196;
 //BA.debugLineNum = 1245196;BA.debugLine="p.nombres = cursor.GetString(\"nombres\")";
_p._nombres /*String*/  = _cursor.GetString("nombres");
RDebugUtils.currentLine=1245197;
 //BA.debugLineNum = 1245197;BA.debugLine="p.salario = cursor.GetDouble(\"salario\")";
_p._salario /*double*/  = _cursor.GetDouble("salario");
RDebugUtils.currentLine=1245198;
 //BA.debugLineNum = 1245198;BA.debugLine="p.cargo = cursor.GetString(\"cargo\")";
_p._cargo /*String*/  = _cursor.GetString("cargo");
RDebugUtils.currentLine=1245200;
 //BA.debugLineNum = 1245200;BA.debugLine="resultado.Add(p)";
_resultado.Add((Object)(_p));
 }
};
RDebugUtils.currentLine=1245203;
 //BA.debugLineNum = 1245203;BA.debugLine="Return resultado";
if (true) return _resultado;
RDebugUtils.currentLine=1245204;
 //BA.debugLineNum = 1245204;BA.debugLine="End Sub";
return null;
}
public b4a.example.empleado  _read_bycedula(b4a.example.empleados __ref,String _cedula) throws Exception{
__ref = this;
RDebugUtils.currentModule="empleados";
if (Debug.shouldDelegate(ba, "read_bycedula", false))
	 {return ((b4a.example.empleado) Debug.delegate(ba, "read_bycedula", new Object[] {_cedula}));}
b4a.example.empleado _p = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor = null;
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Public Sub Read_ByCedula( cedula As String) As Emp";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="Dim p As Empleado";
_p = new b4a.example.empleado();
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="Dim cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="cursor = sql.ExecQuery(\"SELECT cedula, nombres, s";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT cedula, nombres, salario, cargo FROM empleados WHERE cedula = "+_cedula)));
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="If cursor.RowCount > 0 Then";
if (_cursor.getRowCount()>0) { 
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="cursor.Position = 0";
_cursor.setPosition((int) (0));
RDebugUtils.currentLine=1310728;
 //BA.debugLineNum = 1310728;BA.debugLine="p.Initialize";
_p._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1310729;
 //BA.debugLineNum = 1310729;BA.debugLine="p.cedula = cursor.GetString(\"cedula\")";
_p._cedula /*String*/  = _cursor.GetString("cedula");
RDebugUtils.currentLine=1310730;
 //BA.debugLineNum = 1310730;BA.debugLine="p.nombres = cursor.GetString(\"nombres\")";
_p._nombres /*String*/  = _cursor.GetString("nombres");
RDebugUtils.currentLine=1310731;
 //BA.debugLineNum = 1310731;BA.debugLine="p.salario = cursor.GetDouble(\"salario\")";
_p._salario /*double*/  = _cursor.GetDouble("salario");
RDebugUtils.currentLine=1310732;
 //BA.debugLineNum = 1310732;BA.debugLine="p.cargo = cursor.GetString(\"cargo\")";
_p._cargo /*String*/  = _cursor.GetString("cargo");
 };
RDebugUtils.currentLine=1310735;
 //BA.debugLineNum = 1310735;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=1310736;
 //BA.debugLineNum = 1310736;BA.debugLine="End Sub";
return null;
}
public boolean  _update(b4a.example.empleados __ref,String _cedula,String _nombres,double _salario,String _cargo) throws Exception{
__ref = this;
RDebugUtils.currentModule="empleados";
if (Debug.shouldDelegate(ba, "update", false))
	 {return ((Boolean) Debug.delegate(ba, "update", new Object[] {_cedula,_nombres,_salario,_cargo}));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Public Sub Update(cedula As String, nombres As Str";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="sql.ExecNonQuery2(\"UPDATE empleados SET nombres=";
__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("UPDATE empleados SET nombres= ?, salario= ?, cargo = ? WHERE cedula = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_nombres),(Object)(_salario),(Object)(_cargo),(Object)(_cedula)}));
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="End Sub";
return false;
}
}