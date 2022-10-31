package ir.abalfazl.hero.zip.grabber;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class madewithlove extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("ir.abalfazl.hero.zip.grabber", "ir.abalfazl.hero.zip.grabber.madewithlove", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", ir.abalfazl.hero.zip.grabber.madewithlove.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public Object _tag = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public ir.abalfazl.hero.zip.grabber.main _main = null;
public ir.abalfazl.hero.zip.grabber.aboutact _aboutact = null;
public ir.abalfazl.hero.zip.grabber.b4xcollections _b4xcollections = null;
public ir.abalfazl.hero.zip.grabber.httputils2service _httputils2service = null;
public ir.abalfazl.hero.zip.grabber.xuiviewsutils _xuiviewsutils = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 50;BA.debugLine="mBase.GetView(0).SetLayoutAnimated(0, 0, 0, Wid";
_mbase.GetView((int) (0)).SetLayoutAnimated((int) (0),0,0,_width,_height);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 3;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 4;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 6;BA.debugLine="Public Tag As Object";
_tag = new Object();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
ir.abalfazl.hero.zip.grabber.b4jtextflow _tf = null;
 //BA.debugLineNum = 15;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 16;BA.debugLine="log(Props)";
__c.LogImpl("932243713",BA.ObjectToString(_props),0);
 //BA.debugLineNum = 17;BA.debugLine="mBase = Base";
_mbase = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
 //BA.debugLineNum = 18;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_tag = _mbase.getTag();
 //BA.debugLineNum = 18;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_mbase.setTag(this);
 //BA.debugLineNum = 19;BA.debugLine="Dim xlbl As B4XView = Lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
 //BA.debugLineNum = 21;BA.debugLine="Dim tf As B4JTextFlow";
_tf = new ir.abalfazl.hero.zip.grabber.b4jtextflow();
 //BA.debugLineNum = 22;BA.debugLine="tf.Initialize";
_tf._initialize /*String*/ (ba);
 //BA.debugLineNum = 23;BA.debugLine="tf.Append(\"Made with \")";
_tf._append /*ir.abalfazl.hero.zip.grabber.b4jtextflow*/ ("Made with ");
 //BA.debugLineNum = 24;BA.debugLine="tf.SetFont(xlbl.Font)";
_tf._setfont /*ir.abalfazl.hero.zip.grabber.b4jtextflow*/ ((anywheresoftware.b4j.objects.JFX.FontWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.FontWrapper(), (javafx.scene.text.Font)(_xlbl.getFont().getObject())));
 //BA.debugLineNum = 25;BA.debugLine="tf.SetColor(xlbl.TextColor)";
_tf._setcolor /*ir.abalfazl.hero.zip.grabber.b4jtextflow*/ (_xlbl.getTextColor());
 //BA.debugLineNum = 26;BA.debugLine="tf.Append(Chr(0xF004))";
_tf._append /*ir.abalfazl.hero.zip.grabber.b4jtextflow*/ (BA.ObjectToString(__c.Chr(((int)0xf004))));
 //BA.debugLineNum = 27;BA.debugLine="tf.SetFont(xui.CreateFontAwesome(xlbl.Text";
_tf._setfont /*ir.abalfazl.hero.zip.grabber.b4jtextflow*/ ((anywheresoftware.b4j.objects.JFX.FontWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.FontWrapper(), (javafx.scene.text.Font)(_xui.CreateFontAwesome((float) (_xlbl.getTextSize())).getObject())));
 //BA.debugLineNum = 28;BA.debugLine="tf.SetColor(xui.Color_Red)";
_tf._setcolor /*ir.abalfazl.hero.zip.grabber.b4jtextflow*/ (_xui.Color_Red);
 //BA.debugLineNum = 29;BA.debugLine="tf.Append(\" From \")";
_tf._append /*ir.abalfazl.hero.zip.grabber.b4jtextflow*/ (" From ");
 //BA.debugLineNum = 30;BA.debugLine="tf.Append(Lbl.text)";
_tf._append /*ir.abalfazl.hero.zip.grabber.b4jtextflow*/ (_lbl.getText());
 //BA.debugLineNum = 31;BA.debugLine="tf.SetFont(xlbl.Font)";
_tf._setfont /*ir.abalfazl.hero.zip.grabber.b4jtextflow*/ ((anywheresoftware.b4j.objects.JFX.FontWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.FontWrapper(), (javafx.scene.text.Font)(_xlbl.getFont().getObject())));
 //BA.debugLineNum = 32;BA.debugLine="tf.SetColor(xlbl.TextColor)";
_tf._setcolor /*ir.abalfazl.hero.zip.grabber.b4jtextflow*/ (_xlbl.getTextColor());
 //BA.debugLineNum = 33;BA.debugLine="mBase.AddView(tf.CreateTextFlow, 0, 0, mBa";
_mbase.AddView((javafx.scene.Node)(_tf._createtextflow /*anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper*/ ().getObject()),0,0,_mbase.getWidth(),_mbase.getHeight());
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 10;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 11;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
