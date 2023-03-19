package ir.abalfazl.hero.zip.grabber;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class aboutact_subs_0 {


public static RemoteObject  _irhbtn_click() throws Exception{
try {
		Debug.PushSubsStack("IRHBtn_Click (aboutact) ","aboutact",1,aboutact.ba,aboutact.mostCurrent,21);
if (RapidSub.canDelegate("irhbtn_click")) { return ir.abalfazl.hero.zip.grabber.aboutact.remoteMe.runUserSub(false, "aboutact","irhbtn_click");}
 BA.debugLineNum = 21;BA.debugLine="Private Sub IRHBtn_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="fx.ShowExternalDocument(\"http://iranhack.com\")";
Debug.ShouldStop(2097152);
aboutact._fx.runVoidMethod ("ShowExternalDocument",(Object)(RemoteObject.createImmutable("http://iranhack.com")));
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pentestbtn_click() throws Exception{
try {
		Debug.PushSubsStack("PenTestBtn_Click (aboutact) ","aboutact",1,aboutact.ba,aboutact.mostCurrent,17);
if (RapidSub.canDelegate("pentestbtn_click")) { return ir.abalfazl.hero.zip.grabber.aboutact.remoteMe.runUserSub(false, "aboutact","pentestbtn_click");}
 BA.debugLineNum = 17;BA.debugLine="Private Sub PenTestBtn_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="fx.ShowExternalDocument(\"http://irhpentest.ir\")";
Debug.ShouldStop(131072);
aboutact._fx.runVoidMethod ("ShowExternalDocument",(Object)(RemoteObject.createImmutable("http://irhpentest.ir")));
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
aboutact._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 4;BA.debugLine="Dim F1 As Form";
aboutact._f1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 5;BA.debugLine="Private IRHBtn As Button";
aboutact._irhbtn = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 6;BA.debugLine="Private PenTestBtn As Button";
aboutact._pentestbtn = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 7;BA.debugLine="Private text As Label";
aboutact._text = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _show() throws Exception{
try {
		Debug.PushSubsStack("Show (aboutact) ","aboutact",1,aboutact.ba,aboutact.mostCurrent,10);
if (RapidSub.canDelegate("show")) { return ir.abalfazl.hero.zip.grabber.aboutact.remoteMe.runUserSub(false, "aboutact","show");}
 BA.debugLineNum = 10;BA.debugLine="Sub Show";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="F1.Initialize(\"form\",640,480)";
Debug.ShouldStop(1024);
aboutact._f1.runVoidMethod ("Initialize",aboutact.ba,(Object)(BA.ObjectToString("form")),(Object)(BA.numberCast(double.class, 640)),(Object)(BA.numberCast(double.class, 480)));
 BA.debugLineNum = 12;BA.debugLine="F1.RootPane.LoadLayout(\"AboutLayout\")";
Debug.ShouldStop(2048);
aboutact._f1.runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",aboutact.ba,(Object)(RemoteObject.createImmutable("AboutLayout")));
 BA.debugLineNum = 13;BA.debugLine="F1.Show";
Debug.ShouldStop(4096);
aboutact._f1.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 14;BA.debugLine="F1.Resizable=False";
Debug.ShouldStop(8192);
aboutact._f1.runMethod(true,"setResizable",aboutact.__c.getField(true,"False"));
 BA.debugLineNum = 15;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}