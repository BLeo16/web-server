
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class empleados {
    public static RemoteObject myClass;
	public empleados() {
	}
    public static PCBA staticBA = new PCBA(null, empleados.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _sql = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static b4a.example.main _main = null;
public static b4a.example.loginactivity _loginactivity = null;
public static b4a.example.inputactivity _inputactivity = null;
public static b4a.example.ouputactivity _ouputactivity = null;
public static b4a.example.webservice _webservice = null;
public static b4a.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"sql",_ref.getField(false, "_sql")};
}
}