package ir.abalfazl.hero.zip.grabber;


import anywheresoftware.b4a.BA;

public class aboutact extends Object{
public static aboutact mostCurrent = new aboutact();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("ir.abalfazl.hero.zip.grabber", "ir.abalfazl.hero.zip.grabber.aboutact", null);
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
public static String  _irhbtn_click() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Private Sub IRHBtn_Click";
 //BA.debugLineNum = 22;BA.debugLine="fx.ShowExternalDocument(\"http://iranhack.com\")";
_fx.ShowExternalDocument("http://iranhack.com");
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public static String  _pentestbtn_click() throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Private Sub PenTestBtn_Click";
 //BA.debugLineNum = 18;BA.debugLine="fx.ShowExternalDocument(\"http://irhpentest.ir\")";
_fx.ShowExternalDocument("http://irhpentest.ir");
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 4;BA.debugLine="Dim F1 As Form";
_f1 = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 5;BA.debugLine="Private IRHBtn As Button";
_irhbtn = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Private PenTestBtn As Button";
_pentestbtn = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Private text As Label";
_text = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public static String  _show() throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Sub Show";
 //BA.debugLineNum = 11;BA.debugLine="F1.Initialize(\"form\",640,480)";
_f1.Initialize(ba,"form",640,480);
 //BA.debugLineNum = 12;BA.debugLine="F1.RootPane.LoadLayout(\"AboutLayout\")";
_f1.getRootPane().LoadLayout(ba,"AboutLayout");
 //BA.debugLineNum = 13;BA.debugLine="F1.Show";
_f1.Show();
 //BA.debugLineNum = 14;BA.debugLine="F1.Resizable=False";
_f1.setResizable(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
}
