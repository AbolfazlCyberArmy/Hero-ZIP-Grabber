
package ir.abalfazl.hero.zip.grabber;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject ba;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
		mostCurrent = new main();
		remoteMe = RemoteObject.declareNull("ir.abalfazl.hero.zip.grabber.main");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "ir.abalfazl.hero.zip.grabber.main");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, main.class);
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
    public static RemoteObject getObject() {
		return myClass;
	 }
	public PCBA create(Object[] args) throws ClassNotFoundException{
		ba = (RemoteObject) args[1];
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _extentions = null;
public static RemoteObject _listnames = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _listsites = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _resultlvitems = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _taskids = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _taskidnum = RemoteObject.createImmutable(0);
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _mainform = RemoteObject.declareNull("anywheresoftware.b4j.objects.Form");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _menubar1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.MenuItemWrapper.MenuBarWrapper");
public static RemoteObject _swet = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _startsearchbtn = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _primarywordslv = RemoteObject.declareNull("anywheresoftware.b4j.objects.ListViewWrapper");
public static RemoteObject _swlv = RemoteObject.declareNull("anywheresoftware.b4j.objects.ListViewWrapper");
public static RemoteObject _resultslv = RemoteObject.declareNull("anywheresoftware.b4j.objects.ListViewWrapper");
public static RemoteObject _urlet = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _base = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _dialog = RemoteObject.declareNull("ir.abalfazl.hero.zip.grabber.b4xdialog");
public static RemoteObject _toast = RemoteObject.declareNull("ir.abalfazl.hero.zip.grabber.bctoast");
public static RemoteObject _selectmultisitebtn = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _scanedstatusac = RemoteObject.declareNull("ir.abalfazl.hero.zip.grabber.animatedcounter");
public static RemoteObject _loadingiv = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper");
public static RemoteObject _inputtemplate = RemoteObject.declareNull("ir.abalfazl.hero.zip.grabber.b4xinputtemplate");
public static RemoteObject _progressbar1 = RemoteObject.declareNull("ir.abalfazl.hero.zip.grabber.anotherprogressbar");
public static RemoteObject _timestatudlbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static ir.abalfazl.hero.zip.grabber.aboutact _aboutact = null;
public static ir.abalfazl.hero.zip.grabber.b4xcollections _b4xcollections = null;
public static ir.abalfazl.hero.zip.grabber.httputils2service _httputils2service = null;
public static ir.abalfazl.hero.zip.grabber.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"AboutAct",Debug.moduleToString(ir.abalfazl.hero.zip.grabber.aboutact.class),"B4XCollections",Debug.moduleToString(ir.abalfazl.hero.zip.grabber.b4xcollections.class),"Base",main._base,"CSSUtils",main._cssutils,"DateUtils",main._dateutils,"Dialog",main._dialog,"extentions",main._extentions,"fx",main._fx,"HttpUtils2Service",Debug.moduleToString(ir.abalfazl.hero.zip.grabber.httputils2service.class),"InputTemplate",main._inputtemplate,"ListNames",main._listnames,"ListSites",main._listsites,"LoadingIV",main._loadingiv,"MainForm",main._mainform,"MenuBar1",main._menubar1,"PrimaryWordsLV",main._primarywordslv,"ProgressBar1",main._progressbar1,"ResultLVItems",main._resultlvitems,"ResultsLV",main._resultslv,"ScanedStatusAC",main._scanedstatusac,"SelectMultiSiteBtn",main._selectmultisitebtn,"StartSearchBtn",main._startsearchbtn,"SWET",main._swet,"SWLV",main._swlv,"TaskIDNum",main._taskidnum,"TaskIds",main._taskids,"TimeStatudlbl",main._timestatudlbl,"Toast",main._toast,"UrlEt",main._urlet,"xui",main._xui,"XUIViewsUtils",Debug.moduleToString(ir.abalfazl.hero.zip.grabber.xuiviewsutils.class)};
}
}