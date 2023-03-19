package ir.abalfazl.hero.zip.grabber;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class aboutact extends Object{
public static aboutact mostCurrent = new aboutact();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("ir.abalfazl.hero.zip.grabber", "ir.abalfazl.hero.zip.grabber.aboutact", null);
		ba.loadHtSubs(aboutact.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "ir.abalfazl.hero.zip.grabber.aboutact", ba);
		}
	}
    public static Class<?> getObject() {
		return aboutact.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _f1 = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _irhbtn = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _pentestbtn = null;
public static anywheresoftware.b4j.objects.LabelWrapper _text = null;
public static b4j.example.dateutils _dateutils = null;
public static b4j.example.cssutils _cssutils = null;
public static ir.abalfazl.hero.zip.grabber.main _main = null;
public static ir.abalfazl.hero.zip.grabber.b4xcollections _b4xcollections = null;
public static ir.abalfazl.hero.zip.grabber.httputils2service _httputils2service = null;
public static ir.abalfazl.hero.zip.grabber.xuiviewsutils _xuiviewsutils = null;
public static String  _show() throws Exception{
RDebugUtils.currentModule="aboutact";
if (Debug.shouldDelegate(ba, "show", false))
	 {return ((String) Debug.delegate(ba, "show", null));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub Show";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="F1.Initialize(\"form\",640,480)";
_f1.Initialize(ba,"form",640,480);
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="F1.RootPane.LoadLayout(\"AboutLayout\")";
_f1.getRootPane().LoadLayout(ba,"AboutLayout");
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="F1.Show";
_f1.Show();
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="F1.Resizable=False";
_f1.setResizable(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="End Sub";
return "";
}
public static String  _irhbtn_click() throws Exception{
RDebugUtils.currentModule="aboutact";
if (Debug.shouldDelegate(ba, "irhbtn_click", false))
	 {return ((String) Debug.delegate(ba, "irhbtn_click", null));}
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Private Sub IRHBtn_Click";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="fx.ShowExternalDocument(\"http://iranhack.com\")";
_fx.ShowExternalDocument("http://iranhack.com");
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="End Sub";
return "";
}
public static String  _pentestbtn_click() throws Exception{
RDebugUtils.currentModule="aboutact";
if (Debug.shouldDelegate(ba, "pentestbtn_click", false))
	 {return ((String) Debug.delegate(ba, "pentestbtn_click", null));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Private Sub PenTestBtn_Click";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="fx.ShowExternalDocument(\"http://irhpentest.ir\")";
_fx.ShowExternalDocument("http://irhpentest.ir");
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="End Sub";
return "";
}
}