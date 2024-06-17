
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class empleado {
    public static RemoteObject myClass;
	public empleado() {
	}
    public static PCBA staticBA = new PCBA(null, empleado.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _cedula = RemoteObject.createImmutable("");
public static RemoteObject _nombres = RemoteObject.createImmutable("");
public static RemoteObject _salario = RemoteObject.createImmutable(0);
public static RemoteObject _cargo = RemoteObject.createImmutable("");
public static b4a.example.main _main = null;
public static b4a.example.loginactivity _loginactivity = null;
public static b4a.example.inputactivity _inputactivity = null;
public static b4a.example.ouputactivity _ouputactivity = null;
public static b4a.example.webservice _webservice = null;
public static b4a.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"cargo",_ref.getField(false, "_cargo"),"cedula",_ref.getField(false, "_cedula"),"nombres",_ref.getField(false, "_nombres"),"salario",_ref.getField(false, "_salario")};
}
}