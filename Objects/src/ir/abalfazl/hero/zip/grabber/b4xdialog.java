package ir.abalfazl.hero.zip.grabber;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xdialog extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("ir.abalfazl.hero.zip.grabber", "ir.abalfazl.hero.zip.grabber.b4xdialog", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", ir.abalfazl.hero.zip.grabber.b4xdialog.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public int _buttonsheight = 0;
public int _titlebarheight = 0;
public int _buttonwidth = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
public int _backgroundcolor = 0;
public int _overlaycolor = 0;
public int _bordercolor = 0;
public int _bordercornersradius = 0;
public int _borderwidth = 0;
public int _buttonscolor = 0;
public int _buttonstextcolor = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _background = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _blurimageview = null;
public boolean _blurbackground = false;
public int _blurreducescale = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _mparent = null;
public Object _title = null;
public int _titlebarcolor = 0;
public int _titlebartextcolor = 0;
public int _bodytextcolor = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _titlebar = null;
public boolean _putattop = false;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _titlebarfont = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _buttonsfont = null;
public int _buttonstextcolordisabled = 0;
public int _visibleanimationduration = 0;
public int[] _buttonsorder = null;
public anywheresoftware.b4a.objects.collections.Map _buttonsstate = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public ir.abalfazl.hero.zip.grabber.main _main = null;
public ir.abalfazl.hero.zip.grabber.aboutact _aboutact = null;
public ir.abalfazl.hero.zip.grabber.b4xcollections _b4xcollections = null;
public ir.abalfazl.hero.zip.grabber.httputils2service _httputils2service = null;
public ir.abalfazl.hero.zip.grabber.xuiviewsutils _xuiviewsutils = null;
public String  _initialize(ir.abalfazl.hero.zip.grabber.b4xdialog __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _parent) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_parent}));}
anywheresoftware.b4j.object.JavaObject _node = null;
anywheresoftware.b4a.objects.collections.List _stylesheets = null;
RDebugUtils.currentLine=21364736;
 //BA.debugLineNum = 21364736;BA.debugLine="Public Sub Initialize (Parent As B4XView)";
RDebugUtils.currentLine=21364737;
 //BA.debugLineNum = 21364737;BA.debugLine="BlurBackground = False";
__ref._blurbackground /*boolean*/  = __c.False;
RDebugUtils.currentLine=21364738;
 //BA.debugLineNum = 21364738;BA.debugLine="If xui.IsB4i Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i()) { 
RDebugUtils.currentLine=21364739;
 //BA.debugLineNum = 21364739;BA.debugLine="BlurReduceScale = 3";
__ref._blurreducescale /*int*/  = (int) (3);
 }else 
{RDebugUtils.currentLine=21364740;
 //BA.debugLineNum = 21364740;BA.debugLine="Else If xui.IsB4J Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
RDebugUtils.currentLine=21364741;
 //BA.debugLineNum = 21364741;BA.debugLine="BlurReduceScale = 1";
__ref._blurreducescale /*int*/  = (int) (1);
 }else 
{RDebugUtils.currentLine=21364742;
 //BA.debugLineNum = 21364742;BA.debugLine="Else if xui.IsB4A Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A()) { 
RDebugUtils.currentLine=21364743;
 //BA.debugLineNum = 21364743;BA.debugLine="BlurReduceScale = 3";
__ref._blurreducescale /*int*/  = (int) (3);
 }}}
;
RDebugUtils.currentLine=21364745;
 //BA.debugLineNum = 21364745;BA.debugLine="mParent = Parent";
__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _parent;
RDebugUtils.currentLine=21364747;
 //BA.debugLineNum = 21364747;BA.debugLine="Dim node As JavaObject = mParent";
_node = new anywheresoftware.b4j.object.JavaObject();
_node = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=21364748;
 //BA.debugLineNum = 21364748;BA.debugLine="Dim stylesheets As List = node.RunMethodJO(\"getSc";
_stylesheets = new anywheresoftware.b4a.objects.collections.List();
_stylesheets = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_node.RunMethodJO("getScene",(Object[])(__c.Null)).RunMethod("getStylesheets",(Object[])(__c.Null))));
RDebugUtils.currentLine=21364749;
 //BA.debugLineNum = 21364749;BA.debugLine="stylesheets.Add(File.GetUri(File.DirAssets, \"Dial";
_stylesheets.Add((Object)(__c.File.GetUri(__c.File.getDirAssets(),"Dialog.css")));
RDebugUtils.currentLine=21364751;
 //BA.debugLineNum = 21364751;BA.debugLine="TitleBarFont = xui.CreateDefaultBoldFont(16)";
__ref._titlebarfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (16));
RDebugUtils.currentLine=21364752;
 //BA.debugLineNum = 21364752;BA.debugLine="ButtonsFont = xui.CreateDefaultBoldFont(15)";
__ref._buttonsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (15));
RDebugUtils.currentLine=21364753;
 //BA.debugLineNum = 21364753;BA.debugLine="TitleBarTextColor = xui.Color_White";
__ref._titlebartextcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=21364754;
 //BA.debugLineNum = 21364754;BA.debugLine="ButtonsState.Initialize";
__ref._buttonsstate /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=21364755;
 //BA.debugLineNum = 21364755;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _showtemplate(ir.abalfazl.hero.zip.grabber.b4xdialog __ref,Object _dialogtemplate,Object _yes,Object _no,Object _cancel) throws Exception{
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "showtemplate", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "showtemplate", new Object[] {_dialogtemplate,_yes,_no,_cancel}));}
ResumableSub_ShowTemplate rsub = new ResumableSub_ShowTemplate(this,__ref,_dialogtemplate,_yes,_no,_cancel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ShowTemplate extends BA.ResumableSub {
public ResumableSub_ShowTemplate(ir.abalfazl.hero.zip.grabber.b4xdialog parent,ir.abalfazl.hero.zip.grabber.b4xdialog __ref,Object _dialogtemplate,Object _yes,Object _no,Object _cancel) {
this.parent = parent;
this.__ref = __ref;
this._dialogtemplate = _dialogtemplate;
this._yes = _yes;
this._no = _no;
this._cancel = _cancel;
this.__ref = parent;
}
ir.abalfazl.hero.zip.grabber.b4xdialog __ref;
ir.abalfazl.hero.zip.grabber.b4xdialog parent;
Object _dialogtemplate;
Object _yes;
Object _no;
Object _cancel;
anywheresoftware.b4a.objects.B4XViewWrapper _content = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xdialog";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=21430273;
 //BA.debugLineNum = 21430273;BA.debugLine="Dim content As B4XView = CallSub2(DialogTemplate,";
_content = new anywheresoftware.b4a.objects.B4XViewWrapper();
_content = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.__c.CallSubDebug2(ba,_dialogtemplate,"GetPanel",parent)));
RDebugUtils.currentLine=21430274;
 //BA.debugLineNum = 21430274;BA.debugLine="CallSub2(DialogTemplate, \"Show\", Me)";
parent.__c.CallSubDebug2(ba,_dialogtemplate,"Show",parent);
RDebugUtils.currentLine=21430275;
 //BA.debugLineNum = 21430275;BA.debugLine="Wait For (ShowCustom(content , Yes, No, Cancel))";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xdialog", "showtemplate"), __ref._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_content,_yes,_no,_cancel));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (int) result[1];
;
RDebugUtils.currentLine=21430276;
 //BA.debugLineNum = 21430276;BA.debugLine="CallSub2(DialogTemplate, \"DialogClosed\", Result)";
parent.__c.CallSubDebug2(ba,_dialogtemplate,"DialogClosed",(Object)(_result));
RDebugUtils.currentLine=21430277;
 //BA.debugLineNum = 21430277;BA.debugLine="PutAtTop = False";
__ref._putattop /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=21430278;
 //BA.debugLineNum = 21430278;BA.debugLine="Return Result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
RDebugUtils.currentLine=21430279;
 //BA.debugLineNum = 21430279;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public boolean  _close(ir.abalfazl.hero.zip.grabber.b4xdialog __ref,int _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "close", true))
	 {return ((Boolean) Debug.delegate(ba, "close", new Object[] {_result}));}
RDebugUtils.currentLine=21954560;
 //BA.debugLineNum = 21954560;BA.debugLine="Public Sub Close (Result As Int) As Boolean";
RDebugUtils.currentLine=21954561;
 //BA.debugLineNum = 21954561;BA.debugLine="If getVisible Then";
if (__ref._getvisible /*boolean*/ (null)) { 
RDebugUtils.currentLine=21954562;
 //BA.debugLineNum = 21954562;BA.debugLine="CallSubDelayed2(Me, \"CloseMessage\", Result)";
__c.CallSubDelayed2(ba,this,"CloseMessage",(Object)(_result));
RDebugUtils.currentLine=21954563;
 //BA.debugLineNum = 21954563;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=21954565;
 //BA.debugLineNum = 21954565;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=21954566;
 //BA.debugLineNum = 21954566;BA.debugLine="End Sub";
return false;
}
public String  _background_click(ir.abalfazl.hero.zip.grabber.b4xdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "background_click", true))
	 {return ((String) Debug.delegate(ba, "background_click", null));}
RDebugUtils.currentLine=22151168;
 //BA.debugLineNum = 22151168;BA.debugLine="Private Sub Background_Click";
RDebugUtils.currentLine=22151170;
 //BA.debugLineNum = 22151170;BA.debugLine="End Sub";
return "";
}
public String  _background_mouseclicked(ir.abalfazl.hero.zip.grabber.b4xdialog __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "background_mouseclicked", true))
	 {return ((String) Debug.delegate(ba, "background_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=22020096;
 //BA.debugLineNum = 22020096;BA.debugLine="Private Sub Background_MouseClicked (EventData As";
RDebugUtils.currentLine=22020097;
 //BA.debugLineNum = 22020097;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=22020098;
 //BA.debugLineNum = 22020098;BA.debugLine="End Sub";
return "";
}
public String  _background_touch(ir.abalfazl.hero.zip.grabber.b4xdialog __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "background_touch", true))
	 {return ((String) Debug.delegate(ba, "background_touch", new Object[] {_action,_x,_y}));}
RDebugUtils.currentLine=22085632;
 //BA.debugLineNum = 22085632;BA.debugLine="Private Sub Background_Touch (Action As Int, X As";
RDebugUtils.currentLine=22085634;
 //BA.debugLineNum = 22085634;BA.debugLine="End Sub";
return "";
}
public b4j.example.bitmapcreator  _blur(ir.abalfazl.hero.zip.grabber.b4xdialog __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "blur", true))
	 {return ((b4j.example.bitmapcreator) Debug.delegate(ba, "blur", new Object[] {_bmp}));}
long _n = 0L;
b4j.example.bitmapcreator _bc = null;
int _reducescale = 0;
int _count = 0;
b4j.example.bitmapcreator._argbcolor[] _clrs = null;
b4j.example.bitmapcreator._argbcolor _temp = null;
int _m = 0;
int _steps = 0;
int _y = 0;
int _x = 0;
RDebugUtils.currentLine=22347776;
 //BA.debugLineNum = 22347776;BA.debugLine="Private Sub Blur (bmp As B4XBitmap) As BitmapCreat";
RDebugUtils.currentLine=22347777;
 //BA.debugLineNum = 22347777;BA.debugLine="Dim n As Long = DateTime.Now";
_n = __c.DateTime.getNow();
RDebugUtils.currentLine=22347778;
 //BA.debugLineNum = 22347778;BA.debugLine="Dim bc As BitmapCreator";
_bc = new b4j.example.bitmapcreator();
RDebugUtils.currentLine=22347779;
 //BA.debugLineNum = 22347779;BA.debugLine="Dim ReduceScale As Int = BlurReduceScale";
_reducescale = __ref._blurreducescale /*int*/ ;
RDebugUtils.currentLine=22347780;
 //BA.debugLineNum = 22347780;BA.debugLine="bc.Initialize(bmp.Width / ReduceScale / bmp.Scale";
_bc._initialize(ba,(int) (_bmp.getWidth()/(double)_reducescale/(double)_bmp.getScale()),(int) (_bmp.getHeight()/(double)_reducescale/(double)_bmp.getScale()));
RDebugUtils.currentLine=22347781;
 //BA.debugLineNum = 22347781;BA.debugLine="bc.CopyPixelsFromBitmap(bmp)";
_bc._copypixelsfrombitmap(_bmp);
RDebugUtils.currentLine=22347782;
 //BA.debugLineNum = 22347782;BA.debugLine="Dim count As Int = 2";
_count = (int) (2);
RDebugUtils.currentLine=22347783;
 //BA.debugLineNum = 22347783;BA.debugLine="Dim clrs(3) As ARGBColor";
_clrs = new b4j.example.bitmapcreator._argbcolor[(int) (3)];
{
int d0 = _clrs.length;
for (int i0 = 0;i0 < d0;i0++) {
_clrs[i0] = new b4j.example.bitmapcreator._argbcolor();
}
}
;
RDebugUtils.currentLine=22347784;
 //BA.debugLineNum = 22347784;BA.debugLine="Dim temp As ARGBColor";
_temp = new b4j.example.bitmapcreator._argbcolor();
RDebugUtils.currentLine=22347785;
 //BA.debugLineNum = 22347785;BA.debugLine="Dim m As Int";
_m = 0;
RDebugUtils.currentLine=22347786;
 //BA.debugLineNum = 22347786;BA.debugLine="For steps = 1 To count";
{
final int step10 = 1;
final int limit10 = _count;
_steps = (int) (1) ;
for (;_steps <= limit10 ;_steps = _steps + step10 ) {
RDebugUtils.currentLine=22347787;
 //BA.debugLineNum = 22347787;BA.debugLine="For y = 0 To bc.mHeight - 1";
{
final int step11 = 1;
final int limit11 = (int) (_bc._mheight-1);
_y = (int) (0) ;
for (;_y <= limit11 ;_y = _y + step11 ) {
RDebugUtils.currentLine=22347788;
 //BA.debugLineNum = 22347788;BA.debugLine="For x = 0 To 2";
{
final int step12 = 1;
final int limit12 = (int) (2);
_x = (int) (0) ;
for (;_x <= limit12 ;_x = _x + step12 ) {
RDebugUtils.currentLine=22347789;
 //BA.debugLineNum = 22347789;BA.debugLine="bc.GetARGB(x, y, clrs(x))";
_bc._getargb(_x,_y,_clrs[_x]);
 }
};
RDebugUtils.currentLine=22347791;
 //BA.debugLineNum = 22347791;BA.debugLine="SetAvg(bc, 1, y, clrs, temp)";
__ref._setavg /*String*/ (null,_bc,(int) (1),_y,_clrs,_temp);
RDebugUtils.currentLine=22347792;
 //BA.debugLineNum = 22347792;BA.debugLine="m = 0";
_m = (int) (0);
RDebugUtils.currentLine=22347793;
 //BA.debugLineNum = 22347793;BA.debugLine="For x = 2 To bc.mWidth - 2";
{
final int step17 = 1;
final int limit17 = (int) (_bc._mwidth-2);
_x = (int) (2) ;
for (;_x <= limit17 ;_x = _x + step17 ) {
RDebugUtils.currentLine=22347794;
 //BA.debugLineNum = 22347794;BA.debugLine="bc.GetARGB(x + 1, y, clrs(m))";
_bc._getargb((int) (_x+1),_y,_clrs[_m]);
RDebugUtils.currentLine=22347795;
 //BA.debugLineNum = 22347795;BA.debugLine="m = (m + 1) Mod 3";
_m = (int) ((_m+1)%3);
RDebugUtils.currentLine=22347796;
 //BA.debugLineNum = 22347796;BA.debugLine="SetAvg(bc, x, y, clrs, temp)";
__ref._setavg /*String*/ (null,_bc,_x,_y,_clrs,_temp);
 }
};
 }
};
RDebugUtils.currentLine=22347799;
 //BA.debugLineNum = 22347799;BA.debugLine="For x = 0 To bc.mWidth - 1";
{
final int step23 = 1;
final int limit23 = (int) (_bc._mwidth-1);
_x = (int) (0) ;
for (;_x <= limit23 ;_x = _x + step23 ) {
RDebugUtils.currentLine=22347800;
 //BA.debugLineNum = 22347800;BA.debugLine="For y = 0 To 2";
{
final int step24 = 1;
final int limit24 = (int) (2);
_y = (int) (0) ;
for (;_y <= limit24 ;_y = _y + step24 ) {
RDebugUtils.currentLine=22347801;
 //BA.debugLineNum = 22347801;BA.debugLine="bc.GetARGB(x, y, clrs(y))";
_bc._getargb(_x,_y,_clrs[_y]);
 }
};
RDebugUtils.currentLine=22347803;
 //BA.debugLineNum = 22347803;BA.debugLine="SetAvg(bc, x, 1, clrs, temp)";
__ref._setavg /*String*/ (null,_bc,_x,(int) (1),_clrs,_temp);
RDebugUtils.currentLine=22347804;
 //BA.debugLineNum = 22347804;BA.debugLine="m = 0";
_m = (int) (0);
RDebugUtils.currentLine=22347805;
 //BA.debugLineNum = 22347805;BA.debugLine="For y = 2 To bc.mHeight - 2";
{
final int step29 = 1;
final int limit29 = (int) (_bc._mheight-2);
_y = (int) (2) ;
for (;_y <= limit29 ;_y = _y + step29 ) {
RDebugUtils.currentLine=22347806;
 //BA.debugLineNum = 22347806;BA.debugLine="bc.GetARGB(x, y + 1, clrs(m))";
_bc._getargb(_x,(int) (_y+1),_clrs[_m]);
RDebugUtils.currentLine=22347807;
 //BA.debugLineNum = 22347807;BA.debugLine="m = (m + 1) Mod 3";
_m = (int) ((_m+1)%3);
RDebugUtils.currentLine=22347808;
 //BA.debugLineNum = 22347808;BA.debugLine="SetAvg(bc, x, y, clrs, temp)";
__ref._setavg /*String*/ (null,_bc,_x,_y,_clrs,_temp);
 }
};
 }
};
 }
};
RDebugUtils.currentLine=22347812;
 //BA.debugLineNum = 22347812;BA.debugLine="Log(\"Time: \" & (DateTime.Now - n))";
__c.LogImpl("922347812","Time: "+BA.NumberToString((__c.DateTime.getNow()-_n)),0);
RDebugUtils.currentLine=22347813;
 //BA.debugLineNum = 22347813;BA.debugLine="Return bc";
if (true) return _bc;
RDebugUtils.currentLine=22347814;
 //BA.debugLineNum = 22347814;BA.debugLine="End Sub";
return null;
}
public String  _setavg(ir.abalfazl.hero.zip.grabber.b4xdialog __ref,b4j.example.bitmapcreator _bc,int _x,int _y,b4j.example.bitmapcreator._argbcolor[] _clrs,b4j.example.bitmapcreator._argbcolor _temp) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "setavg", true))
	 {return ((String) Debug.delegate(ba, "setavg", new Object[] {_bc,_x,_y,_clrs,_temp}));}
b4j.example.bitmapcreator._argbcolor _c = null;
RDebugUtils.currentLine=22413312;
 //BA.debugLineNum = 22413312;BA.debugLine="Private Sub SetAvg(bc As BitmapCreator, x As Int,";
RDebugUtils.currentLine=22413313;
 //BA.debugLineNum = 22413313;BA.debugLine="temp.Initialize";
_temp.Initialize();
RDebugUtils.currentLine=22413314;
 //BA.debugLineNum = 22413314;BA.debugLine="For Each c As ARGBColor In clrs";
{
final b4j.example.bitmapcreator._argbcolor[] group2 = _clrs;
final int groupLen2 = group2.length
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_c = group2[index2];
RDebugUtils.currentLine=22413315;
 //BA.debugLineNum = 22413315;BA.debugLine="temp.r = temp.r + c.r";
_temp.r = (int) (_temp.r+_c.r);
RDebugUtils.currentLine=22413316;
 //BA.debugLineNum = 22413316;BA.debugLine="temp.g = temp.g + c.g";
_temp.g = (int) (_temp.g+_c.g);
RDebugUtils.currentLine=22413317;
 //BA.debugLineNum = 22413317;BA.debugLine="temp.b = temp.b + c.b";
_temp.b = (int) (_temp.b+_c.b);
 }
};
RDebugUtils.currentLine=22413319;
 //BA.debugLineNum = 22413319;BA.debugLine="temp.a = 255";
_temp.a = (int) (255);
RDebugUtils.currentLine=22413320;
 //BA.debugLineNum = 22413320;BA.debugLine="temp.r = temp.r / 3";
_temp.r = (int) (_temp.r/(double)3);
RDebugUtils.currentLine=22413321;
 //BA.debugLineNum = 22413321;BA.debugLine="temp.g = temp.g / 3";
_temp.g = (int) (_temp.g/(double)3);
RDebugUtils.currentLine=22413322;
 //BA.debugLineNum = 22413322;BA.debugLine="temp.b = temp.b / 3";
_temp.b = (int) (_temp.b/(double)3);
RDebugUtils.currentLine=22413323;
 //BA.debugLineNum = 22413323;BA.debugLine="bc.SetARGB(x, y, temp)";
_bc._setargb(_x,_y,_temp);
RDebugUtils.currentLine=22413324;
 //BA.debugLineNum = 22413324;BA.debugLine="End Sub";
return "";
}
public String  _button_click(ir.abalfazl.hero.zip.grabber.b4xdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "button_click", true))
	 {return ((String) Debug.delegate(ba, "button_click", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _b = null;
RDebugUtils.currentLine=21889024;
 //BA.debugLineNum = 21889024;BA.debugLine="Private Sub Button_Click";
RDebugUtils.currentLine=21889025;
 //BA.debugLineNum = 21889025;BA.debugLine="Dim b As B4XView = Sender";
_b = new anywheresoftware.b4a.objects.B4XViewWrapper();
_b = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=21889026;
 //BA.debugLineNum = 21889026;BA.debugLine="If ButtonsState.GetDefault(b.Tag, True) = False T";
if ((__ref._buttonsstate /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault(_b.getTag(),(Object)(__c.True))).equals((Object)(__c.False))) { 
if (true) return "";};
RDebugUtils.currentLine=21889027;
 //BA.debugLineNum = 21889027;BA.debugLine="Close(b.Tag)";
__ref._close /*boolean*/ (null,(int)(BA.ObjectToNumber(_b.getTag())));
RDebugUtils.currentLine=21889028;
 //BA.debugLineNum = 21889028;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(ir.abalfazl.hero.zip.grabber.b4xdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
RDebugUtils.currentLine=21299200;
 //BA.debugLineNum = 21299200;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=21299201;
 //BA.debugLineNum = 21299201;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=21299202;
 //BA.debugLineNum = 21299202;BA.debugLine="Public ButtonsHeight As Int = 40dip";
_buttonsheight = __c.DipToCurrent((int) (40));
RDebugUtils.currentLine=21299203;
 //BA.debugLineNum = 21299203;BA.debugLine="Public TitleBarHeight As Int = 30dip";
_titlebarheight = __c.DipToCurrent((int) (30));
RDebugUtils.currentLine=21299204;
 //BA.debugLineNum = 21299204;BA.debugLine="Private ButtonWidth As Int = 80dip";
_buttonwidth = __c.DipToCurrent((int) (80));
RDebugUtils.currentLine=21299205;
 //BA.debugLineNum = 21299205;BA.debugLine="Public Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=21299206;
 //BA.debugLineNum = 21299206;BA.debugLine="Public BackgroundColor As Int = 0xFF555555 'base";
_backgroundcolor = ((int)0xff555555);
RDebugUtils.currentLine=21299207;
 //BA.debugLineNum = 21299207;BA.debugLine="Public OverlayColor As Int = 0xaa000000";
_overlaycolor = ((int)0xaa000000);
RDebugUtils.currentLine=21299208;
 //BA.debugLineNum = 21299208;BA.debugLine="Public BorderColor As Int = 0xff000000";
_bordercolor = ((int)0xff000000);
RDebugUtils.currentLine=21299209;
 //BA.debugLineNum = 21299209;BA.debugLine="Public BorderCornersRadius As Int = 2dip";
_bordercornersradius = __c.DipToCurrent((int) (2));
RDebugUtils.currentLine=21299210;
 //BA.debugLineNum = 21299210;BA.debugLine="Public BorderWidth As Int = 2dip";
_borderwidth = __c.DipToCurrent((int) (2));
RDebugUtils.currentLine=21299211;
 //BA.debugLineNum = 21299211;BA.debugLine="Public ButtonsColor As Int = 0xFF555555";
_buttonscolor = ((int)0xff555555);
RDebugUtils.currentLine=21299212;
 //BA.debugLineNum = 21299212;BA.debugLine="Public ButtonsTextColor As Int = 0xFF89D5FF";
_buttonstextcolor = ((int)0xff89d5ff);
RDebugUtils.currentLine=21299213;
 //BA.debugLineNum = 21299213;BA.debugLine="Private Background As B4XView";
_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=21299214;
 //BA.debugLineNum = 21299214;BA.debugLine="Private BlurImageView As B4XView";
_blurimageview = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=21299215;
 //BA.debugLineNum = 21299215;BA.debugLine="Public BlurBackground As Boolean";
_blurbackground = false;
RDebugUtils.currentLine=21299216;
 //BA.debugLineNum = 21299216;BA.debugLine="Private BlurReduceScale As Int";
_blurreducescale = 0;
RDebugUtils.currentLine=21299217;
 //BA.debugLineNum = 21299217;BA.debugLine="Public mParent As B4XView";
_mparent = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=21299218;
 //BA.debugLineNum = 21299218;BA.debugLine="Public Title As Object = \"\"";
_title = (Object)("");
RDebugUtils.currentLine=21299219;
 //BA.debugLineNum = 21299219;BA.debugLine="Public TitleBarColor As Int = 0xFF0083B8";
_titlebarcolor = ((int)0xff0083b8);
RDebugUtils.currentLine=21299220;
 //BA.debugLineNum = 21299220;BA.debugLine="Public TitleBarTextColor As Int";
_titlebartextcolor = 0;
RDebugUtils.currentLine=21299221;
 //BA.debugLineNum = 21299221;BA.debugLine="Public BodyTextColor As Int = xui.Color_White";
_bodytextcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=21299222;
 //BA.debugLineNum = 21299222;BA.debugLine="Public TitleBar As B4XView";
_titlebar = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=21299223;
 //BA.debugLineNum = 21299223;BA.debugLine="Public PutAtTop As Boolean";
_putattop = false;
RDebugUtils.currentLine=21299224;
 //BA.debugLineNum = 21299224;BA.debugLine="Public TitleBarFont As B4XFont";
_titlebarfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=21299225;
 //BA.debugLineNum = 21299225;BA.debugLine="Public ButtonsFont As B4XFont";
_buttonsfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=21299226;
 //BA.debugLineNum = 21299226;BA.debugLine="Public ButtonsTextColorDisabled As Int = 0xFF8080";
_buttonstextcolordisabled = ((int)0xff808080);
RDebugUtils.currentLine=21299227;
 //BA.debugLineNum = 21299227;BA.debugLine="Public VisibleAnimationDuration As Int = 100";
_visibleanimationduration = (int) (100);
RDebugUtils.currentLine=21299228;
 //BA.debugLineNum = 21299228;BA.debugLine="Public ButtonsOrder() As Int = Array As Int(xui.D";
_buttonsorder = new int[]{__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Negative,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel};
RDebugUtils.currentLine=21299229;
 //BA.debugLineNum = 21299229;BA.debugLine="Public ButtonsState As Map";
_buttonsstate = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=21299230;
 //BA.debugLineNum = 21299230;BA.debugLine="End Sub";
return "";
}
public boolean  _getvisible(ir.abalfazl.hero.zip.grabber.b4xdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "getvisible", true))
	 {return ((Boolean) Debug.delegate(ba, "getvisible", null));}
RDebugUtils.currentLine=21626880;
 //BA.debugLineNum = 21626880;BA.debugLine="Public Sub getVisible As Boolean";
RDebugUtils.currentLine=21626881;
 //BA.debugLineNum = 21626881;BA.debugLine="Return Background.IsInitialized And Background.Pa";
if (true) return __ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized() && __ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().IsInitialized();
RDebugUtils.currentLine=21626882;
 //BA.debugLineNum = 21626882;BA.debugLine="End Sub";
return false;
}
public String  _createbutton(ir.abalfazl.hero.zip.grabber.b4xdialog __ref,Object _text,int _code) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "createbutton", true))
	 {return ((String) Debug.delegate(ba, "createbutton", new Object[] {_text,_code}));}
anywheresoftware.b4j.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xbtn = null;
int _numberofbuttons = 0;
RDebugUtils.currentLine=21692416;
 //BA.debugLineNum = 21692416;BA.debugLine="Private Sub CreateButton (Text As Object, Code As";
RDebugUtils.currentLine=21692417;
 //BA.debugLineNum = 21692417;BA.debugLine="If Text = \"\" Then Return";
if ((_text).equals((Object)(""))) { 
if (true) return "";};
RDebugUtils.currentLine=21692419;
 //BA.debugLineNum = 21692419;BA.debugLine="Dim btn As Button";
_btn = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=21692423;
 //BA.debugLineNum = 21692423;BA.debugLine="btn.Initialize(\"Button\")";
_btn.Initialize(ba,"Button");
RDebugUtils.currentLine=21692424;
 //BA.debugLineNum = 21692424;BA.debugLine="Dim xbtn As B4XView = btn";
_xbtn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xbtn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject()));
RDebugUtils.currentLine=21692425;
 //BA.debugLineNum = 21692425;BA.debugLine="XUIViewsUtils.SetTextOrCSBuilderToLabel(xbtn, Tex";
_xuiviewsutils._settextorcsbuildertolabel /*String*/ (_xbtn,_text);
RDebugUtils.currentLine=21692426;
 //BA.debugLineNum = 21692426;BA.debugLine="xbtn.Tag = Code";
_xbtn.setTag((Object)(_code));
RDebugUtils.currentLine=21692427;
 //BA.debugLineNum = 21692427;BA.debugLine="xbtn.SetColorAndBorder(ButtonsColor, 0dip, Border";
_xbtn.SetColorAndBorder(__ref._buttonscolor /*int*/ ,__c.DipToCurrent((int) (0)),__ref._bordercolor /*int*/ ,__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=21692428;
 //BA.debugLineNum = 21692428;BA.debugLine="xbtn.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xbtn.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=21692429;
 //BA.debugLineNum = 21692429;BA.debugLine="xbtn.TextColor = ButtonsTextColor";
_xbtn.setTextColor(__ref._buttonstextcolor /*int*/ );
RDebugUtils.currentLine=21692430;
 //BA.debugLineNum = 21692430;BA.debugLine="xbtn.Font = ButtonsFont";
_xbtn.setFont(__ref._buttonsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=21692431;
 //BA.debugLineNum = 21692431;BA.debugLine="Dim numberOfButtons As Int = Base.NumberOfViews '";
_numberofbuttons = __ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews();
RDebugUtils.currentLine=21692432;
 //BA.debugLineNum = 21692432;BA.debugLine="Base.AddView(xbtn, Base.Width - 4dip - numberOfBu";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(_xbtn.getObject()),__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (4))-_numberofbuttons*(__ref._buttonwidth /*int*/ +__c.DipToCurrent((int) (5)))-__ref._buttonwidth /*int*/ ,__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._buttonsheight /*int*/ -__c.DipToCurrent((int) (4)),__ref._buttonwidth /*int*/ ,__ref._buttonsheight /*int*/ );
RDebugUtils.currentLine=21692434;
 //BA.debugLineNum = 21692434;BA.debugLine="If Code = xui.DialogResponse_Cancel Then xbtn.Req";
if (_code==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel) { 
_xbtn.RequestFocus();};
RDebugUtils.currentLine=21692435;
 //BA.debugLineNum = 21692435;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getbutton(ir.abalfazl.hero.zip.grabber.b4xdialog __ref,int _resultcode) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "getbutton", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getbutton", new Object[] {_resultcode}));}
anywheresoftware.b4a.objects.B4XViewWrapper _b = null;
RDebugUtils.currentLine=21757952;
 //BA.debugLineNum = 21757952;BA.debugLine="Public Sub GetButton (ResultCode As Int) As B4XVie";
RDebugUtils.currentLine=21757953;
 //BA.debugLineNum = 21757953;BA.debugLine="For Each b As B4XView In Base.GetAllViewsRecursiv";
_b = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetAllViewsRecursive();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group1.Get(index1)));
RDebugUtils.currentLine=21757954;
 //BA.debugLineNum = 21757954;BA.debugLine="If b.Tag = ResultCode Then Return b 'ignore";
if ((_b.getTag()).equals((Object)(_resultcode))) { 
if (true) return _b;};
 }
};
RDebugUtils.currentLine=21757956;
 //BA.debugLineNum = 21757956;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Null));
RDebugUtils.currentLine=21757957;
 //BA.debugLineNum = 21757957;BA.debugLine="End Sub";
return null;
}
public String  _internaladdstubtoclvifneeded(ir.abalfazl.hero.zip.grabber.b4xdialog __ref,b4j.example.customlistview _customlistview1,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "internaladdstubtoclvifneeded", true))
	 {return ((String) Debug.delegate(ba, "internaladdstubtoclvifneeded", new Object[] {_customlistview1,_color}));}
RDebugUtils.currentLine=22544384;
 //BA.debugLineNum = 22544384;BA.debugLine="Public Sub InternalAddStubToCLVIfNeeded(CustomList";
RDebugUtils.currentLine=22544385;
 //BA.debugLineNum = 22544385;BA.debugLine="XUIViewsUtils.AddStubToCLVIfNeeded(CustomListView";
_xuiviewsutils._addstubtoclvifneeded /*String*/ (_customlistview1,_color);
RDebugUtils.currentLine=22544386;
 //BA.debugLineNum = 22544386;BA.debugLine="End Sub";
return "";
}
public String  _internalsettextorcsbuildertolabel(ir.abalfazl.hero.zip.grabber.b4xdialog __ref,anywheresoftware.b4a.objects.B4XViewWrapper _xlbl,Object _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "internalsettextorcsbuildertolabel", true))
	 {return ((String) Debug.delegate(ba, "internalsettextorcsbuildertolabel", new Object[] {_xlbl,_text}));}
RDebugUtils.currentLine=22478848;
 //BA.debugLineNum = 22478848;BA.debugLine="Public Sub InternalSetTextOrCSBuilderToLabel(xlbl";
RDebugUtils.currentLine=22478849;
 //BA.debugLineNum = 22478849;BA.debugLine="XUIViewsUtils.SetTextOrCSBuilderToLabel(xlbl, Tex";
_xuiviewsutils._settextorcsbuildertolabel /*String*/ (_xlbl,_text);
RDebugUtils.currentLine=22478850;
 //BA.debugLineNum = 22478850;BA.debugLine="End Sub";
return "";
}
public String  _resize(ir.abalfazl.hero.zip.grabber.b4xdialog __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "resize", true))
	 {return ((String) Debug.delegate(ba, "resize", new Object[] {_width,_height}));}
int _top = 0;
RDebugUtils.currentLine=22216704;
 //BA.debugLineNum = 22216704;BA.debugLine="Public Sub Resize (Width As Int, Height As Int)";
RDebugUtils.currentLine=22216706;
 //BA.debugLineNum = 22216706;BA.debugLine="Dim Top As Int = Round(Background.Height / 2 - Ba";
_top = (int) (__c.Round(__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2-__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2));
RDebugUtils.currentLine=22216707;
 //BA.debugLineNum = 22216707;BA.debugLine="If PutAtTop Then Top = 20dip";
if (__ref._putattop /*boolean*/ ) { 
_top = __c.DipToCurrent((int) (20));};
RDebugUtils.currentLine=22216708;
 //BA.debugLineNum = 22216708;BA.debugLine="Background.SetLayoutAnimated(0, 0, 0, Width, Heig";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,_width,_height);
RDebugUtils.currentLine=22216709;
 //BA.debugLineNum = 22216709;BA.debugLine="Base.SetLayoutAnimated(200, Round(Background.Widt";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (200),__c.Round(__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2-__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2),_top,__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=22216710;
 //BA.debugLineNum = 22216710;BA.debugLine="If xui.IsB4J Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
RDebugUtils.currentLine=22216711;
 //BA.debugLineNum = 22216711;BA.debugLine="UpdateBlur";
__ref._updateblur /*String*/ (null);
 };
RDebugUtils.currentLine=22216713;
 //BA.debugLineNum = 22216713;BA.debugLine="End Sub";
return "";
}
public String  _updateblur(ir.abalfazl.hero.zip.grabber.b4xdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "updateblur", true))
	 {return ((String) Debug.delegate(ba, "updateblur", null));}
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _source = null;
b4j.example.bitmapcreator _blurred = null;
RDebugUtils.currentLine=22282240;
 //BA.debugLineNum = 22282240;BA.debugLine="Private Sub UpdateBlur";
RDebugUtils.currentLine=22282241;
 //BA.debugLineNum = 22282241;BA.debugLine="If BlurBackground = False Then Return";
if (__ref._blurbackground /*boolean*/ ==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=22282242;
 //BA.debugLineNum = 22282242;BA.debugLine="Background.Visible = False";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=22282243;
 //BA.debugLineNum = 22282243;BA.debugLine="Dim source As B4XBitmap = Background.Parent.Snaps";
_source = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_source = __ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().Snapshot();
RDebugUtils.currentLine=22282244;
 //BA.debugLineNum = 22282244;BA.debugLine="If source.Width > Background.Width Or source.Heig";
if (_source.getWidth()>__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth() || _source.getHeight()>__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()) { 
RDebugUtils.currentLine=22282245;
 //BA.debugLineNum = 22282245;BA.debugLine="source = source.Crop(0, 0, Background.Width, Bac";
_source = _source.Crop((int) (0),(int) (0),(int) (__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()),(int) (__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
 };
RDebugUtils.currentLine=22282247;
 //BA.debugLineNum = 22282247;BA.debugLine="Background.Visible = True";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=22282248;
 //BA.debugLineNum = 22282248;BA.debugLine="BlurImageView.SetLayoutAnimated(0, 0, 0, Backgrou";
__ref._blurimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=22282249;
 //BA.debugLineNum = 22282249;BA.debugLine="Dim blurred As BitmapCreator = Blur(source)";
_blurred = __ref._blur /*b4j.example.bitmapcreator*/ (null,_source);
RDebugUtils.currentLine=22282250;
 //BA.debugLineNum = 22282250;BA.debugLine="blurred.SetBitmapToImageView(blurred.Bitmap, Blur";
_blurred._setbitmaptoimageview(_blurred._getbitmap(),__ref._blurimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=22282251;
 //BA.debugLineNum = 22282251;BA.debugLine="End Sub";
return "";
}
public String  _setbuttonstate(ir.abalfazl.hero.zip.grabber.b4xdialog __ref,int _resultcode,boolean _enabled) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "setbuttonstate", true))
	 {return ((String) Debug.delegate(ba, "setbuttonstate", new Object[] {_resultcode,_enabled}));}
anywheresoftware.b4a.objects.B4XViewWrapper _b = null;
RDebugUtils.currentLine=21823488;
 //BA.debugLineNum = 21823488;BA.debugLine="Public Sub SetButtonState (ResultCode As Int, Enab";
RDebugUtils.currentLine=21823489;
 //BA.debugLineNum = 21823489;BA.debugLine="Dim b As B4XView = GetButton(ResultCode)";
_b = new anywheresoftware.b4a.objects.B4XViewWrapper();
_b = __ref._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_resultcode);
RDebugUtils.currentLine=21823490;
 //BA.debugLineNum = 21823490;BA.debugLine="If b.IsInitialized Then";
if (_b.IsInitialized()) { 
RDebugUtils.currentLine=21823491;
 //BA.debugLineNum = 21823491;BA.debugLine="b.Enabled = Enabled";
_b.setEnabled(_enabled);
RDebugUtils.currentLine=21823492;
 //BA.debugLineNum = 21823492;BA.debugLine="If Enabled Then b.TextColor = ButtonsTextColor E";
if (_enabled) { 
_b.setTextColor(__ref._buttonstextcolor /*int*/ );}
else {
_b.setTextColor(__ref._buttonstextcolordisabled /*int*/ );};
RDebugUtils.currentLine=21823493;
 //BA.debugLineNum = 21823493;BA.debugLine="ButtonsState.Put(ResultCode, Enabled)";
__ref._buttonsstate /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_resultcode),(Object)(_enabled));
 };
RDebugUtils.currentLine=21823495;
 //BA.debugLineNum = 21823495;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _show(ir.abalfazl.hero.zip.grabber.b4xdialog __ref,Object _text,Object _yes,Object _no,Object _cancel) throws Exception{
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "show", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "show", new Object[] {_text,_yes,_no,_cancel}));}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref,_text,_yes,_no,_cancel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(ir.abalfazl.hero.zip.grabber.b4xdialog parent,ir.abalfazl.hero.zip.grabber.b4xdialog __ref,Object _text,Object _yes,Object _no,Object _cancel) {
this.parent = parent;
this.__ref = __ref;
this._text = _text;
this._yes = _yes;
this._no = _no;
this._cancel = _cancel;
this.__ref = parent;
}
ir.abalfazl.hero.zip.grabber.b4xdialog __ref;
ir.abalfazl.hero.zip.grabber.b4xdialog parent;
Object _text;
Object _yes;
Object _no;
Object _cancel;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4j.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xdialog";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=21495809;
 //BA.debugLineNum = 21495809;BA.debugLine="Dim p As B4XView";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=21495810;
 //BA.debugLineNum = 21495810;BA.debugLine="p = xui.CreatePanel(\"\")";
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=21495811;
 //BA.debugLineNum = 21495811;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 300dip, 100dip)";
_p.SetLayoutAnimated((int) (0),0,0,parent.__c.DipToCurrent((int) (300)),parent.__c.DipToCurrent((int) (100)));
RDebugUtils.currentLine=21495812;
 //BA.debugLineNum = 21495812;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=21495813;
 //BA.debugLineNum = 21495813;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
RDebugUtils.currentLine=21495815;
 //BA.debugLineNum = 21495815;BA.debugLine="lbl.WrapText = True";
_lbl.setWrapText(parent.__c.True);
RDebugUtils.currentLine=21495821;
 //BA.debugLineNum = 21495821;BA.debugLine="Dim xlbl As B4XView = lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=21495822;
 //BA.debugLineNum = 21495822;BA.debugLine="p.AddView(xlbl, 5dip, 0, p.Width - 10dip, p.Heigh";
_p.AddView((javafx.scene.Node)(_xlbl.getObject()),parent.__c.DipToCurrent((int) (5)),0,_p.getWidth()-parent.__c.DipToCurrent((int) (10)),_p.getHeight());
RDebugUtils.currentLine=21495823;
 //BA.debugLineNum = 21495823;BA.debugLine="xlbl.TextColor = BodyTextColor";
_xlbl.setTextColor(__ref._bodytextcolor /*int*/ );
RDebugUtils.currentLine=21495824;
 //BA.debugLineNum = 21495824;BA.debugLine="xlbl.Font = TitleBarFont";
_xlbl.setFont(__ref._titlebarfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=21495825;
 //BA.debugLineNum = 21495825;BA.debugLine="XUIViewsUtils.SetTextOrCSBuilderToLabel(xlbl, Tex";
parent._xuiviewsutils._settextorcsbuildertolabel /*String*/ (_xlbl,_text);
RDebugUtils.currentLine=21495826;
 //BA.debugLineNum = 21495826;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"LEFT\")";
_xlbl.SetTextAlignment("CENTER","LEFT");
RDebugUtils.currentLine=21495827;
 //BA.debugLineNum = 21495827;BA.debugLine="Wait For (ShowCustom(p, Yes, No, Cancel)) Complet";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xdialog", "show"), __ref._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_p,_yes,_no,_cancel));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (int) result[1];
;
RDebugUtils.currentLine=21495828;
 //BA.debugLineNum = 21495828;BA.debugLine="Return Result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
RDebugUtils.currentLine=21495829;
 //BA.debugLineNum = 21495829;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _showcustom(ir.abalfazl.hero.zip.grabber.b4xdialog __ref,anywheresoftware.b4a.objects.B4XViewWrapper _content,Object _yes,Object _no,Object _cancel) throws Exception{
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "showcustom", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "showcustom", new Object[] {_content,_yes,_no,_cancel}));}
ResumableSub_ShowCustom rsub = new ResumableSub_ShowCustom(this,__ref,_content,_yes,_no,_cancel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ShowCustom extends BA.ResumableSub {
public ResumableSub_ShowCustom(ir.abalfazl.hero.zip.grabber.b4xdialog parent,ir.abalfazl.hero.zip.grabber.b4xdialog __ref,anywheresoftware.b4a.objects.B4XViewWrapper _content,Object _yes,Object _no,Object _cancel) {
this.parent = parent;
this.__ref = __ref;
this._content = _content;
this._yes = _yes;
this._no = _no;
this._cancel = _cancel;
this.__ref = parent;
}
ir.abalfazl.hero.zip.grabber.b4xdialog __ref;
ir.abalfazl.hero.zip.grabber.b4xdialog parent;
anywheresoftware.b4a.objects.B4XViewWrapper _content;
Object _yes;
Object _no;
Object _cancel;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
anywheresoftware.b4j.objects.ImageViewWrapper _iv = null;
boolean _includetitle = false;
int _temptitlebarheight = 0;
int _height = 0;
int _width = 0;
int _top = 0;
boolean _removetitle = false;
int _i = 0;
int _btype = 0;
anywheresoftware.b4j.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
int _result = 0;
anywheresoftware.b4a.BA.IterableList group1;
int index1;
int groupLen1;
int step44;
int limit44;
anywheresoftware.b4a.BA.IterableList group72;
int index72;
int groupLen72;
anywheresoftware.b4a.BA.IterableList group76;
int index76;
int groupLen76;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xdialog";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=21561345;
 //BA.debugLineNum = 21561345;BA.debugLine="For Each v As B4XView In mParent.GetAllViewsRecur";
if (true) break;

case 1:
//for
this.state = 8;
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
group1 = __ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetAllViewsRecursive();
index1 = 0;
groupLen1 = group1.getSize();
this.state = 60;
if (true) break;

case 60:
//C
this.state = 8;
if (index1 < groupLen1) {
this.state = 3;
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group1.Get(index1)));}
if (true) break;

case 61:
//C
this.state = 60;
index1++;
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=21561346;
 //BA.debugLineNum = 21561346;BA.debugLine="If v.Tag <> Null And v.Tag = \"b4xdialog_backgrou";
if (true) break;

case 4:
//if
this.state = 7;
if (_v.getTag()!= null && (_v.getTag()).equals((Object)("b4xdialog_background"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=21561347;
 //BA.debugLineNum = 21561347;BA.debugLine="v.RemoveViewFromParent";
_v.RemoveViewFromParent();
RDebugUtils.currentLine=21561348;
 //BA.debugLineNum = 21561348;BA.debugLine="Exit";
this.state = 8;
if (true) break;
 if (true) break;

case 7:
//C
this.state = 61;
;
 if (true) break;
if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=21561351;
 //BA.debugLineNum = 21561351;BA.debugLine="ButtonsState.Clear";
__ref._buttonsstate /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=21561352;
 //BA.debugLineNum = 21561352;BA.debugLine="Dim Background As B4XView = xui.CreatePanel(\"back";
parent._background = new anywheresoftware.b4a.objects.B4XViewWrapper();
parent._background = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"background");
RDebugUtils.currentLine=21561353;
 //BA.debugLineNum = 21561353;BA.debugLine="Background.Tag = \"b4xdialog_background\"";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)("b4xdialog_background"));
RDebugUtils.currentLine=21561354;
 //BA.debugLineNum = 21561354;BA.debugLine="If BlurBackground Then";
if (true) break;

case 9:
//if
this.state = 14;
if (__ref._blurbackground /*boolean*/ ) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
RDebugUtils.currentLine=21561355;
 //BA.debugLineNum = 21561355;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4j.objects.ImageViewWrapper();
RDebugUtils.currentLine=21561356;
 //BA.debugLineNum = 21561356;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
RDebugUtils.currentLine=21561357;
 //BA.debugLineNum = 21561357;BA.debugLine="BlurImageView = iv";
__ref._blurimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
RDebugUtils.currentLine=21561358;
 //BA.debugLineNum = 21561358;BA.debugLine="Background.AddView(BlurImageView, 0, 0, Backgrou";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._blurimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=21561359;
 //BA.debugLineNum = 21561359;BA.debugLine="Background.Color = xui.Color_Transparent";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=21561361;
 //BA.debugLineNum = 21561361;BA.debugLine="Background.Color = OverlayColor";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._overlaycolor /*int*/ );
 if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=21561367;
 //BA.debugLineNum = 21561367;BA.debugLine="mParent.AddView(Background, 0, 0, mParent.Width,";
__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=21561368;
 //BA.debugLineNum = 21561368;BA.debugLine="UpdateBlur";
__ref._updateblur /*String*/ (null);
RDebugUtils.currentLine=21561369;
 //BA.debugLineNum = 21561369;BA.debugLine="Base = xui.CreatePanel(\"\")";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=21561370;
 //BA.debugLineNum = 21561370;BA.debugLine="Base.SetColorAndBorder(BackgroundColor, BorderWid";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._backgroundcolor /*int*/ ,__ref._borderwidth /*int*/ ,__ref._bordercolor /*int*/ ,__ref._bordercornersradius /*int*/ );
RDebugUtils.currentLine=21561371;
 //BA.debugLineNum = 21561371;BA.debugLine="Base.RequestFocus";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RequestFocus();
RDebugUtils.currentLine=21561372;
 //BA.debugLineNum = 21561372;BA.debugLine="Dim IncludeTitle As Boolean = Title <> \"\"";
_includetitle = (__ref._title /*Object*/ ).equals((Object)("")) == false;
RDebugUtils.currentLine=21561373;
 //BA.debugLineNum = 21561373;BA.debugLine="Dim TempTitleBarHeight As Int = 0";
_temptitlebarheight = (int) (0);
RDebugUtils.currentLine=21561374;
 //BA.debugLineNum = 21561374;BA.debugLine="If IncludeTitle Then";
if (true) break;

case 15:
//if
this.state = 18;
if (_includetitle) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=21561375;
 //BA.debugLineNum = 21561375;BA.debugLine="TempTitleBarHeight = TitleBarHeight";
_temptitlebarheight = __ref._titlebarheight /*int*/ ;
 if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=21561377;
 //BA.debugLineNum = 21561377;BA.debugLine="Dim height As Int = Content.Height + ButtonsHeigh";
_height = (int) (_content.getHeight()+__ref._buttonsheight /*int*/ +parent.__c.DipToCurrent((int) (3))+parent.__c.DipToCurrent((int) (3))+_temptitlebarheight);
RDebugUtils.currentLine=21561378;
 //BA.debugLineNum = 21561378;BA.debugLine="Dim width As Int = Content.Width + 4dip";
_width = (int) (_content.getWidth()+parent.__c.DipToCurrent((int) (4)));
RDebugUtils.currentLine=21561379;
 //BA.debugLineNum = 21561379;BA.debugLine="Dim Top As Int = Round(Background.Height / 2 - he";
_top = (int) (parent.__c.Round(__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2-_height/(double)2));
RDebugUtils.currentLine=21561380;
 //BA.debugLineNum = 21561380;BA.debugLine="Dim RemoveTitle As Boolean";
_removetitle = false;
RDebugUtils.currentLine=21561381;
 //BA.debugLineNum = 21561381;BA.debugLine="If PutAtTop Then";
if (true) break;

case 19:
//if
this.state = 28;
if (__ref._putattop /*boolean*/ ) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=21561382;
 //BA.debugLineNum = 21561382;BA.debugLine="Top = 20dip";
_top = parent.__c.DipToCurrent((int) (20));
RDebugUtils.currentLine=21561383;
 //BA.debugLineNum = 21561383;BA.debugLine="If Background.Height - Top - height < 200dip The";
if (true) break;

case 22:
//if
this.state = 27;
if (__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-_top-_height<parent.__c.DipToCurrent((int) (200))) { 
this.state = 24;
;}if (true) break;

case 24:
//C
this.state = 27;
_removetitle = parent.__c.True;
if (true) break;

case 27:
//C
this.state = 28;
;
 if (true) break;
;
RDebugUtils.currentLine=21561385;
 //BA.debugLineNum = 21561385;BA.debugLine="If RemoveTitle Or Background.Height < height Then";

case 28:
//if
this.state = 31;
if (_removetitle || __ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()<_height) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=21561386;
 //BA.debugLineNum = 21561386;BA.debugLine="Top = 1dip";
_top = parent.__c.DipToCurrent((int) (1));
RDebugUtils.currentLine=21561387;
 //BA.debugLineNum = 21561387;BA.debugLine="IncludeTitle = False";
_includetitle = parent.__c.False;
RDebugUtils.currentLine=21561388;
 //BA.debugLineNum = 21561388;BA.debugLine="height = height - TempTitleBarHeight - 3dip";
_height = (int) (_height-_temptitlebarheight-parent.__c.DipToCurrent((int) (3)));
RDebugUtils.currentLine=21561389;
 //BA.debugLineNum = 21561389;BA.debugLine="TempTitleBarHeight = 0";
_temptitlebarheight = (int) (0);
 if (true) break;

case 31:
//C
this.state = 32;
;
RDebugUtils.currentLine=21561391;
 //BA.debugLineNum = 21561391;BA.debugLine="Background.AddView(Base, Round(Background.Width /";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),parent.__c.Round(__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2-_width/(double)2),_top,parent.__c.Round(_width),parent.__c.Round(_height));
RDebugUtils.currentLine=21561393;
 //BA.debugLineNum = 21561393;BA.debugLine="For i = ButtonsOrder.Length - 1 To 0 Step - 1";
if (true) break;

case 32:
//for
this.state = 43;
step44 = -1;
limit44 = (int) (0);
_i = (int) (__ref._buttonsorder /*int[]*/ .length-1) ;
this.state = 62;
if (true) break;

case 62:
//C
this.state = 43;
if ((step44 > 0 && _i <= limit44) || (step44 < 0 && _i >= limit44)) this.state = 34;
if (true) break;

case 63:
//C
this.state = 62;
_i = ((int)(0 + _i + step44)) ;
if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=21561394;
 //BA.debugLineNum = 21561394;BA.debugLine="Dim btype As Int = ButtonsOrder(i)";
_btype = __ref._buttonsorder /*int[]*/ [_i];
RDebugUtils.currentLine=21561395;
 //BA.debugLineNum = 21561395;BA.debugLine="Select btype";
if (true) break;

case 35:
//select
this.state = 42;
switch (BA.switchObjectToInt(_btype,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Negative,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive)) {
case 0: {
this.state = 37;
if (true) break;
}
case 1: {
this.state = 39;
if (true) break;
}
case 2: {
this.state = 41;
if (true) break;
}
}
if (true) break;

case 37:
//C
this.state = 42;
RDebugUtils.currentLine=21561397;
 //BA.debugLineNum = 21561397;BA.debugLine="CreateButton(Cancel, btype)";
__ref._createbutton /*String*/ (null,_cancel,_btype);
 if (true) break;

case 39:
//C
this.state = 42;
RDebugUtils.currentLine=21561399;
 //BA.debugLineNum = 21561399;BA.debugLine="CreateButton(No, btype)";
__ref._createbutton /*String*/ (null,_no,_btype);
 if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=21561401;
 //BA.debugLineNum = 21561401;BA.debugLine="CreateButton(Yes, btype)";
__ref._createbutton /*String*/ (null,_yes,_btype);
 if (true) break;

case 42:
//C
this.state = 63;
;
 if (true) break;
if (true) break;

case 43:
//C
this.state = 44;
;
RDebugUtils.currentLine=21561404;
 //BA.debugLineNum = 21561404;BA.debugLine="Base.Visible = False";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=21561405;
 //BA.debugLineNum = 21561405;BA.debugLine="If IncludeTitle Then";
if (true) break;

case 44:
//if
this.state = 47;
if (_includetitle) { 
this.state = 46;
}if (true) break;

case 46:
//C
this.state = 47;
RDebugUtils.currentLine=21561406;
 //BA.debugLineNum = 21561406;BA.debugLine="TitleBar = xui.CreatePanel(\"TitleBar\")";
__ref._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"TitleBar");
RDebugUtils.currentLine=21561407;
 //BA.debugLineNum = 21561407;BA.debugLine="TitleBar.Color = TitleBarColor";
__ref._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._titlebarcolor /*int*/ );
RDebugUtils.currentLine=21561408;
 //BA.debugLineNum = 21561408;BA.debugLine="Base.AddView(TitleBar, 2dip, 2dip, Content.Width";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),parent.__c.DipToCurrent((int) (2)),parent.__c.DipToCurrent((int) (2)),_content.getWidth(),_temptitlebarheight);
RDebugUtils.currentLine=21561409;
 //BA.debugLineNum = 21561409;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=21561410;
 //BA.debugLineNum = 21561410;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
RDebugUtils.currentLine=21561411;
 //BA.debugLineNum = 21561411;BA.debugLine="Dim xlbl As B4XView = lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=21561412;
 //BA.debugLineNum = 21561412;BA.debugLine="XUIViewsUtils.SetTextOrCSBuilderToLabel(xlbl, Ti";
parent._xuiviewsutils._settextorcsbuildertolabel /*String*/ (_xlbl,__ref._title /*Object*/ );
RDebugUtils.currentLine=21561413;
 //BA.debugLineNum = 21561413;BA.debugLine="xlbl.TextColor = TitleBarTextColor";
_xlbl.setTextColor(__ref._titlebartextcolor /*int*/ );
RDebugUtils.currentLine=21561414;
 //BA.debugLineNum = 21561414;BA.debugLine="xlbl.Font = TitleBarFont";
_xlbl.setFont(__ref._titlebarfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=21561415;
 //BA.debugLineNum = 21561415;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xlbl.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=21561416;
 //BA.debugLineNum = 21561416;BA.debugLine="TitleBar.AddView(xlbl, 0, 0, TitleBar.Width, Tit";
__ref._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(_xlbl.getObject()),0,0,__ref._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 if (true) break;

case 47:
//C
this.state = 48;
;
RDebugUtils.currentLine=21561418;
 //BA.debugLineNum = 21561418;BA.debugLine="Content.RemoveViewFromParent";
_content.RemoveViewFromParent();
RDebugUtils.currentLine=21561419;
 //BA.debugLineNum = 21561419;BA.debugLine="Base.AddView(Content, 2dip, 2dip + TempTitleBarHe";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(_content.getObject()),parent.__c.DipToCurrent((int) (2)),parent.__c.DipToCurrent((int) (2))+_temptitlebarheight,_content.getWidth(),_content.getHeight());
RDebugUtils.currentLine=21561420;
 //BA.debugLineNum = 21561420;BA.debugLine="Base.SetVisibleAnimated(VisibleAnimationDuration,";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated(ba,__ref._visibleanimationduration /*int*/ ,parent.__c.True);
RDebugUtils.currentLine=21561421;
 //BA.debugLineNum = 21561421;BA.debugLine="For Each v As B4XView In Background.GetAllViewsRe";
if (true) break;

case 48:
//for
this.state = 51;
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
group72 = __ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetAllViewsRecursive();
index72 = 0;
groupLen72 = group72.getSize();
this.state = 64;
if (true) break;

case 64:
//C
this.state = 51;
if (index72 < groupLen72) {
this.state = 50;
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group72.Get(index72)));}
if (true) break;

case 65:
//C
this.state = 64;
index72++;
if (true) break;

case 50:
//C
this.state = 65;
RDebugUtils.currentLine=21561422;
 //BA.debugLineNum = 21561422;BA.debugLine="v.Enabled = True";
_v.setEnabled(parent.__c.True);
 if (true) break;
if (true) break;

case 51:
//C
this.state = 52;
;
RDebugUtils.currentLine=21561424;
 //BA.debugLineNum = 21561424;BA.debugLine="Wait For CloseMessage (Result As Int)";
parent.__c.WaitFor("closemessage", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xdialog", "showcustom"), null);
this.state = 66;
return;
case 66:
//C
this.state = 52;
_result = (int) result[1];
;
RDebugUtils.currentLine=21561425;
 //BA.debugLineNum = 21561425;BA.debugLine="For Each v As B4XView In Background.GetAllViewsRe";
if (true) break;

case 52:
//for
this.state = 55;
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
group76 = __ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetAllViewsRecursive();
index76 = 0;
groupLen76 = group76.getSize();
this.state = 67;
if (true) break;

case 67:
//C
this.state = 55;
if (index76 < groupLen76) {
this.state = 54;
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group76.Get(index76)));}
if (true) break;

case 68:
//C
this.state = 67;
index76++;
if (true) break;

case 54:
//C
this.state = 68;
RDebugUtils.currentLine=21561426;
 //BA.debugLineNum = 21561426;BA.debugLine="v.Enabled = False";
_v.setEnabled(parent.__c.False);
 if (true) break;
if (true) break;

case 55:
//C
this.state = 56;
;
RDebugUtils.currentLine=21561428;
 //BA.debugLineNum = 21561428;BA.debugLine="Base.SetVisibleAnimated(VisibleAnimationDuration,";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated(ba,__ref._visibleanimationduration /*int*/ ,parent.__c.False);
RDebugUtils.currentLine=21561429;
 //BA.debugLineNum = 21561429;BA.debugLine="If VisibleAnimationDuration > 0 Then";
if (true) break;

case 56:
//if
this.state = 59;
if (__ref._visibleanimationduration /*int*/ >0) { 
this.state = 58;
}if (true) break;

case 58:
//C
this.state = 59;
RDebugUtils.currentLine=21561430;
 //BA.debugLineNum = 21561430;BA.debugLine="Sleep(VisibleAnimationDuration)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xdialog", "showcustom"),__ref._visibleanimationduration /*int*/ );
this.state = 69;
return;
case 69:
//C
this.state = 59;
;
 if (true) break;

case 59:
//C
this.state = -1;
;
RDebugUtils.currentLine=21561432;
 //BA.debugLineNum = 21561432;BA.debugLine="Background.RemoveViewFromParent";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=21561433;
 //BA.debugLineNum = 21561433;BA.debugLine="Return Result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
RDebugUtils.currentLine=21561434;
 //BA.debugLineNum = 21561434;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _stub_click(ir.abalfazl.hero.zip.grabber.b4xdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "stub_click", true))
	 {return ((String) Debug.delegate(ba, "stub_click", null));}
RDebugUtils.currentLine=22609920;
 //BA.debugLineNum = 22609920;BA.debugLine="Private Sub Stub_Click";
RDebugUtils.currentLine=22609922;
 //BA.debugLineNum = 22609922;BA.debugLine="End Sub";
return "";
}
}