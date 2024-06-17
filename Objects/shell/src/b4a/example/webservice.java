
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class webservice implements IRemote{
	public static webservice mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public webservice() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("webservice"), "b4a.example.webservice");
	}
     public static RemoteObject getObject() {
		return myClass;
	 }
	public RemoteObject _service;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
        _service = (RemoteObject) args[2];
        remoteMe = RemoteObject.declareNull("b4a.example.webservice");
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[3];
		pcBA = new PCBA(this, webservice.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _websocket = RemoteObject.declareNull("anywheresoftware.b4a.objects.HttpServer");
public static RemoteObject _validusers = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _empleadosmanager = RemoteObject.declareNull("b4a.example.empleados");
public static b4a.example.main _main = null;
public static b4a.example.loginactivity _loginactivity = null;
public static b4a.example.inputactivity _inputactivity = null;
public static b4a.example.ouputactivity _ouputactivity = null;
public static b4a.example.httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"empleadosManager",webservice._empleadosmanager,"HttpUtils2Service",Debug.moduleToString(b4a.example.httputils2service.class),"inputActivity",Debug.moduleToString(b4a.example.inputactivity.class),"loginActivity",Debug.moduleToString(b4a.example.loginactivity.class),"Main",Debug.moduleToString(b4a.example.main.class),"ouputActivity",Debug.moduleToString(b4a.example.ouputactivity.class),"Service",webservice.mostCurrent._service,"validUsers",webservice._validusers,"webSocket",webservice._websocket};
}
}