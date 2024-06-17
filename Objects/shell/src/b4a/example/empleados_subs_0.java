package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class empleados_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private sql As SQL";
empleados._sql = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");__ref.setField("_sql",empleados._sql);
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _create(RemoteObject __ref,RemoteObject _cedula,RemoteObject _nombres,RemoteObject _salario,RemoteObject _cargo) throws Exception{
try {
		Debug.PushSubsStack("Create (empleados) ","empleados",2,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("create")) { return __ref.runUserSub(false, "empleados","create", __ref, _cedula, _nombres, _salario, _cargo);}
RemoteObject _p = RemoteObject.declareNull("b4a.example.empleado");
Debug.locals.put("cedula", _cedula);
Debug.locals.put("nombres", _nombres);
Debug.locals.put("salario", _salario);
Debug.locals.put("cargo", _cargo);
 BA.debugLineNum = 14;BA.debugLine="Public Sub Create( cedula As String, nombres As St";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="sql.ExecNonQuery2(\"INSERT INTO empleados(cedula,";
Debug.ShouldStop(16384);
__ref.getField(false,"_sql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("INSERT INTO empleados(cedula, nombres, salario, cargo) VALUES ( ?, ?, ?, ?)")),(Object)(empleados.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_cedula),(_nombres),(_salario),(_cargo)})))));
 BA.debugLineNum = 17;BA.debugLine="Dim p As Empleado";
Debug.ShouldStop(65536);
_p = RemoteObject.createNew ("b4a.example.empleado");Debug.locals.put("p", _p);
 BA.debugLineNum = 18;BA.debugLine="p.Initialize";
Debug.ShouldStop(131072);
_p.runClassMethod (b4a.example.empleado.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 20;BA.debugLine="p.cedula = cedula";
Debug.ShouldStop(524288);
_p.setField ("_cedula" /*RemoteObject*/ ,_cedula);
 BA.debugLineNum = 21;BA.debugLine="p.nombres = nombres";
Debug.ShouldStop(1048576);
_p.setField ("_nombres" /*RemoteObject*/ ,_nombres);
 BA.debugLineNum = 22;BA.debugLine="p.salario = salario";
Debug.ShouldStop(2097152);
_p.setField ("_salario" /*RemoteObject*/ ,_salario);
 BA.debugLineNum = 23;BA.debugLine="p.cargo = cargo";
Debug.ShouldStop(4194304);
_p.setField ("_cargo" /*RemoteObject*/ ,_cargo);
 BA.debugLineNum = 25;BA.debugLine="Return p";
Debug.ShouldStop(16777216);
if (true) return _p;
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _delete(RemoteObject __ref,RemoteObject _cedula) throws Exception{
try {
		Debug.PushSubsStack("Delete (empleados) ","empleados",2,__ref.getField(false, "ba"),__ref,73);
if (RapidSub.canDelegate("delete")) { return __ref.runUserSub(false, "empleados","delete", __ref, _cedula);}
Debug.locals.put("cedula", _cedula);
 BA.debugLineNum = 73;BA.debugLine="Public Sub Delete(cedula As String) As Boolean";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="sql.ExecNonQuery(\"DELETE FROM empleados WHERE ced";
Debug.ShouldStop(512);
__ref.getField(false,"_sql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM empleados WHERE cedula = "),_cedula)));
 BA.debugLineNum = 75;BA.debugLine="Return True";
Debug.ShouldStop(1024);
if (true) return empleados.__c.getField(true,"True");
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _nombrebdd) throws Exception{
try {
		Debug.PushSubsStack("Initialize (empleados) ","empleados",2,__ref.getField(false, "ba"),__ref,6);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "empleados","initialize", __ref, _ba, _nombrebdd);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("nombreBdd", _nombrebdd);
 BA.debugLineNum = 6;BA.debugLine="Public Sub Initialize( nombreBdd As String)";
Debug.ShouldStop(32);
 BA.debugLineNum = 7;BA.debugLine="sql.Initialize( File.DirInternal, nombreBdd, True";
Debug.ShouldStop(64);
__ref.getField(false,"_sql" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(empleados.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(_nombrebdd),(Object)(empleados.__c.getField(true,"True")));
 BA.debugLineNum = 9;BA.debugLine="sql.ExecNonQuery(\"CREATE TABLE IF NOT EXISTS empl";
Debug.ShouldStop(256);
__ref.getField(false,"_sql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS empleados( cedula TEXT(10) PRIMARY KEY, nombres TEXT(50), salario NUMBER(10,3), cargo TEXT(30) )")));
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
public static RemoteObject  _read_all(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Read_All (empleados) ","empleados",2,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("read_all")) { return __ref.runUserSub(false, "empleados","read_all", __ref);}
RemoteObject _resultado = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cursor = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _p = RemoteObject.declareNull("b4a.example.empleado");
 BA.debugLineNum = 28;BA.debugLine="Public Sub Read_All () As List";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="Dim resultado As List";
Debug.ShouldStop(268435456);
_resultado = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("resultado", _resultado);
 BA.debugLineNum = 30;BA.debugLine="resultado.Initialize";
Debug.ShouldStop(536870912);
_resultado.runVoidMethod ("Initialize");
 BA.debugLineNum = 32;BA.debugLine="Dim cursor As Cursor";
Debug.ShouldStop(-2147483648);
_cursor = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("cursor", _cursor);
 BA.debugLineNum = 33;BA.debugLine="cursor = sql.ExecQuery(\"SELECT cedula, nombres, s";
Debug.ShouldStop(1);
_cursor = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), __ref.getField(false,"_sql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT cedula, nombres, salario, cargo FROM empleados ORDER BY nombres"))));Debug.locals.put("cursor", _cursor);
 BA.debugLineNum = 34;BA.debugLine="For i=0 To cursor.RowCount-1";
Debug.ShouldStop(2);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_cursor.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 35;BA.debugLine="cursor.Position = i";
Debug.ShouldStop(4);
_cursor.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 37;BA.debugLine="Dim p As Empleado";
Debug.ShouldStop(16);
_p = RemoteObject.createNew ("b4a.example.empleado");Debug.locals.put("p", _p);
 BA.debugLineNum = 38;BA.debugLine="p.Initialize";
Debug.ShouldStop(32);
_p.runClassMethod (b4a.example.empleado.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 39;BA.debugLine="p.cedula = cursor.GetString(\"cedula\")";
Debug.ShouldStop(64);
_p.setField ("_cedula" /*RemoteObject*/ ,_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("cedula"))));
 BA.debugLineNum = 40;BA.debugLine="p.nombres = cursor.GetString(\"nombres\")";
Debug.ShouldStop(128);
_p.setField ("_nombres" /*RemoteObject*/ ,_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("nombres"))));
 BA.debugLineNum = 41;BA.debugLine="p.salario = cursor.GetDouble(\"salario\")";
Debug.ShouldStop(256);
_p.setField ("_salario" /*RemoteObject*/ ,_cursor.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("salario"))));
 BA.debugLineNum = 42;BA.debugLine="p.cargo = cursor.GetString(\"cargo\")";
Debug.ShouldStop(512);
_p.setField ("_cargo" /*RemoteObject*/ ,_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("cargo"))));
 BA.debugLineNum = 44;BA.debugLine="resultado.Add(p)";
Debug.ShouldStop(2048);
_resultado.runVoidMethod ("Add",(Object)((_p)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 47;BA.debugLine="Return resultado";
Debug.ShouldStop(16384);
if (true) return _resultado;
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _read_bycedula(RemoteObject __ref,RemoteObject _cedula) throws Exception{
try {
		Debug.PushSubsStack("Read_ByCedula (empleados) ","empleados",2,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("read_bycedula")) { return __ref.runUserSub(false, "empleados","read_bycedula", __ref, _cedula);}
RemoteObject _p = RemoteObject.declareNull("b4a.example.empleado");
RemoteObject _cursor = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
Debug.locals.put("cedula", _cedula);
 BA.debugLineNum = 50;BA.debugLine="Public Sub Read_ByCedula( cedula As String) As Emp";
Debug.ShouldStop(131072);
 BA.debugLineNum = 51;BA.debugLine="Dim p As Empleado";
Debug.ShouldStop(262144);
_p = RemoteObject.createNew ("b4a.example.empleado");Debug.locals.put("p", _p);
 BA.debugLineNum = 53;BA.debugLine="Dim cursor As Cursor";
Debug.ShouldStop(1048576);
_cursor = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("cursor", _cursor);
 BA.debugLineNum = 54;BA.debugLine="cursor = sql.ExecQuery(\"SELECT cedula, nombres, s";
Debug.ShouldStop(2097152);
_cursor = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), __ref.getField(false,"_sql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT cedula, nombres, salario, cargo FROM empleados WHERE cedula = "),_cedula))));Debug.locals.put("cursor", _cursor);
 BA.debugLineNum = 55;BA.debugLine="If cursor.RowCount > 0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(">",_cursor.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 56;BA.debugLine="cursor.Position = 0";
Debug.ShouldStop(8388608);
_cursor.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 58;BA.debugLine="p.Initialize";
Debug.ShouldStop(33554432);
_p.runClassMethod (b4a.example.empleado.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 59;BA.debugLine="p.cedula = cursor.GetString(\"cedula\")";
Debug.ShouldStop(67108864);
_p.setField ("_cedula" /*RemoteObject*/ ,_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("cedula"))));
 BA.debugLineNum = 60;BA.debugLine="p.nombres = cursor.GetString(\"nombres\")";
Debug.ShouldStop(134217728);
_p.setField ("_nombres" /*RemoteObject*/ ,_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("nombres"))));
 BA.debugLineNum = 61;BA.debugLine="p.salario = cursor.GetDouble(\"salario\")";
Debug.ShouldStop(268435456);
_p.setField ("_salario" /*RemoteObject*/ ,_cursor.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("salario"))));
 BA.debugLineNum = 62;BA.debugLine="p.cargo = cursor.GetString(\"cargo\")";
Debug.ShouldStop(536870912);
_p.setField ("_cargo" /*RemoteObject*/ ,_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("cargo"))));
 };
 BA.debugLineNum = 65;BA.debugLine="Return p";
Debug.ShouldStop(1);
if (true) return _p;
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _update(RemoteObject __ref,RemoteObject _cedula,RemoteObject _nombres,RemoteObject _salario,RemoteObject _cargo) throws Exception{
try {
		Debug.PushSubsStack("Update (empleados) ","empleados",2,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("update")) { return __ref.runUserSub(false, "empleados","update", __ref, _cedula, _nombres, _salario, _cargo);}
Debug.locals.put("cedula", _cedula);
Debug.locals.put("nombres", _nombres);
Debug.locals.put("salario", _salario);
Debug.locals.put("cargo", _cargo);
 BA.debugLineNum = 68;BA.debugLine="Public Sub Update(cedula As String, nombres As Str";
Debug.ShouldStop(8);
 BA.debugLineNum = 69;BA.debugLine="sql.ExecNonQuery2(\"UPDATE empleados SET nombres=";
Debug.ShouldStop(16);
__ref.getField(false,"_sql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("UPDATE empleados SET nombres= ?, salario= ?, cargo = ? WHERE cedula = ?")),(Object)(empleados.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_nombres),(_salario),(_cargo),(_cedula)})))));
 BA.debugLineNum = 70;BA.debugLine="Return True";
Debug.ShouldStop(32);
if (true) return empleados.__c.getField(true,"True");
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}