package ir.abalfazl.hero.zip.grabber;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class bctoast extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("ir.abalfazl.hero.zip.grabber", "ir.abalfazl.hero.zip.grabber.bctoast", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", ir.abalfazl.hero.zip.grabber.bctoast.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public int _showindex = 0;
public ir.abalfazl.hero.zip.grabber.bblabel _bb1 = null;
public ir.abalfazl.hero.zip.grabber.bctextengine _te = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _iv = null;
public int _durationms = 0;
public int _defaulttextcolor = 0;
public int _paddingsides = 0;
public int _paddingtopbottom = 0;
public int _maxheight = 0;
public int _verticalcenterpercentage = 0;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public ir.abalfazl.hero.zip.grabber.main _main = null;
public ir.abalfazl.hero.zip.grabber.aboutact _aboutact = null;
public ir.abalfazl.hero.zip.grabber.b4xcollections _b4xcollections = null;
public ir.abalfazl.hero.zip.grabber.httputils2service _httputils2service = null;
public ir.abalfazl.hero.zip.grabber.xuiviewsutils _xuiviewsutils = null;
public String  _initialize(ir.abalfazl.hero.zip.grabber.bctoast __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _parent) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="bctoast";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_parent}));}
RDebugUtils.currentLine=13500416;
 //BA.debugLineNum = 13500416;BA.debugLine="Public Sub Initialize (Parent As B4XView)";
RDebugUtils.currentLine=13500417;
 //BA.debugLineNum = 13500417;BA.debugLine="pnl = xui.CreatePanel(\"\")";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=13500418;
 //BA.debugLineNum = 13500418;BA.debugLine="Parent.AddView(pnl, 0, 0, Parent.Width - 30dip, M";
_parent.AddView((javafx.scene.Node)(__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,_parent.getWidth()-__c.DipToCurrent((int) (30)),__ref._maxheight /*int*/ );
RDebugUtils.currentLine=13500419;
 //BA.debugLineNum = 13500419;BA.debugLine="pnl.LoadLayout(\"BCToast\")";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("BCToast",ba);
RDebugUtils.currentLine=13500420;
 //BA.debugLineNum = 13500420;BA.debugLine="pnl.SetColorAndBorder(0xFFC3C3C3, 0dip, xui.Color";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(((int)0xffc3c3c3),__c.DipToCurrent((int) (0)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=13500421;
 //BA.debugLineNum = 13500421;BA.debugLine="pnl.Visible = False";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=13500422;
 //BA.debugLineNum = 13500422;BA.debugLine="te.Initialize(pnl)";
__ref._te /*ir.abalfazl.hero.zip.grabber.bctextengine*/ ._initialize /*String*/ (null,ba,__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=13500423;
 //BA.debugLineNum = 13500423;BA.debugLine="iv = BB1.mBase.GetView(0)";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._bb1 /*ir.abalfazl.hero.zip.grabber.bblabel*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0));
RDebugUtils.currentLine=13500424;
 //BA.debugLineNum = 13500424;BA.debugLine="iv.RemoveViewFromParent";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=13500425;
 //BA.debugLineNum = 13500425;BA.debugLine="BB1.DisableResizeEvent = True";
__ref._bb1 /*ir.abalfazl.hero.zip.grabber.bblabel*/ ._disableresizeevent /*boolean*/  = __c.True;
RDebugUtils.currentLine=13500431;
 //BA.debugLineNum = 13500431;BA.debugLine="End Sub";
return "";
}
public void  _show(ir.abalfazl.hero.zip.grabber.bctoast __ref,String _message) throws Exception{
RDebugUtils.currentModule="bctoast";
if (Debug.shouldDelegate(ba, "show", true))
	 {Debug.delegate(ba, "show", new Object[] {_message}); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref,_message);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(ir.abalfazl.hero.zip.grabber.bctoast parent,ir.abalfazl.hero.zip.grabber.bctoast __ref,String _message) {
this.parent = parent;
this.__ref = __ref;
this._message = _message;
this.__ref = parent;
}
ir.abalfazl.hero.zip.grabber.bctoast __ref;
ir.abalfazl.hero.zip.grabber.bctoast parent;
String _message;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
int _w = 0;
int _h = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _parent = null;
int _newleft = 0;
int _dx = 0;
int _dy = 0;
int _myindex = 0;
anywheresoftware.b4a.BA.IterableList group3;
int index3;
int groupLen3;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="bctoast";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13565953;
 //BA.debugLineNum = 13565953;BA.debugLine="BB1.ParseData.DefaultColor = DefaultTextColor";
__ref._bb1 /*ir.abalfazl.hero.zip.grabber.bblabel*/ ._parsedata /*ir.abalfazl.hero.zip.grabber.bbcodeparser._bbcodeparsedata*/ .DefaultColor /*int*/  = __ref._defaulttextcolor /*int*/ ;
RDebugUtils.currentLine=13565954;
 //BA.debugLineNum = 13565954;BA.debugLine="iv.RemoveViewFromParent";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=13565955;
 //BA.debugLineNum = 13565955;BA.debugLine="For Each v As B4XView In pnl.GetAllViewsRecursive";
if (true) break;

case 1:
//for
this.state = 10;
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
group3 = __ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetAllViewsRecursive();
index3 = 0;
groupLen3 = group3.getSize();
this.state = 19;
if (true) break;

case 19:
//C
this.state = 10;
if (index3 < groupLen3) {
this.state = 3;
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group3.Get(index3)));}
if (true) break;

case 20:
//C
this.state = 19;
index3++;
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=13565956;
 //BA.debugLineNum = 13565956;BA.debugLine="If v.Tag = \"to remove\" Then v.RemoveViewFromPare";
if (true) break;

case 4:
//if
this.state = 9;
if ((_v.getTag()).equals((Object)("to remove"))) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
_v.RemoveViewFromParent();
if (true) break;

case 9:
//C
this.state = 20;
;
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=13565958;
 //BA.debugLineNum = 13565958;BA.debugLine="pnl.Width = pnl.Parent.Width - 2 * PaddingSides";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().getWidth()-2*__ref._paddingsides /*int*/ );
RDebugUtils.currentLine=13565959;
 //BA.debugLineNum = 13565959;BA.debugLine="pnl.Height = MaxHeight";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight(__ref._maxheight /*int*/ );
RDebugUtils.currentLine=13565960;
 //BA.debugLineNum = 13565960;BA.debugLine="BB1.mBase.Width = pnl.Width";
__ref._bb1 /*ir.abalfazl.hero.zip.grabber.bblabel*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=13565961;
 //BA.debugLineNum = 13565961;BA.debugLine="BB1.mBase.Height = pnl.Height";
__ref._bb1 /*ir.abalfazl.hero.zip.grabber.bblabel*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight(__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=13565962;
 //BA.debugLineNum = 13565962;BA.debugLine="BB1.mBase.AddView(iv, 0, 0, BB1.mBase.Width, BB1.";
__ref._bb1 /*ir.abalfazl.hero.zip.grabber.bblabel*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,__ref._bb1 /*ir.abalfazl.hero.zip.grabber.bblabel*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._bb1 /*ir.abalfazl.hero.zip.grabber.bblabel*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=13565963;
 //BA.debugLineNum = 13565963;BA.debugLine="BB1.Text = Message";
__ref._bb1 /*ir.abalfazl.hero.zip.grabber.bblabel*/ ._settext /*String*/ (null,_message);
RDebugUtils.currentLine=13565964;
 //BA.debugLineNum = 13565964;BA.debugLine="Dim iv As B4XView = BB1.mBase.GetView(0)";
parent._iv = new anywheresoftware.b4a.objects.B4XViewWrapper();
parent._iv = __ref._bb1 /*ir.abalfazl.hero.zip.grabber.bblabel*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0));
RDebugUtils.currentLine=13565965;
 //BA.debugLineNum = 13565965;BA.debugLine="iv.RemoveViewFromParent";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=13565966;
 //BA.debugLineNum = 13565966;BA.debugLine="Dim w As Int = iv.Width + 2 * PaddingSides";
_w = (int) (__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()+2*__ref._paddingsides /*int*/ );
RDebugUtils.currentLine=13565967;
 //BA.debugLineNum = 13565967;BA.debugLine="Dim h As Int = iv.Height + 2 * PaddingTopBottom";
_h = (int) (__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()+2*__ref._paddingtopbottom /*int*/ );
RDebugUtils.currentLine=13565968;
 //BA.debugLineNum = 13565968;BA.debugLine="Dim Parent As B4XView = pnl.Parent";
_parent = new anywheresoftware.b4a.objects.B4XViewWrapper();
_parent = __ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent();
RDebugUtils.currentLine=13565969;
 //BA.debugLineNum = 13565969;BA.debugLine="Dim NewLeft As Int = Parent.Width / 2 - w / 2";
_newleft = (int) (_parent.getWidth()/(double)2-_w/(double)2);
RDebugUtils.currentLine=13565970;
 //BA.debugLineNum = 13565970;BA.debugLine="pnl.SetLayoutAnimated(0, NewLeft, Parent.Height *";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_newleft,_parent.getHeight()*__ref._verticalcenterpercentage /*int*/ /(double)100-_h/(double)2,_w,_h);
RDebugUtils.currentLine=13565971;
 //BA.debugLineNum = 13565971;BA.debugLine="pnl.BringToFront";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .BringToFront();
RDebugUtils.currentLine=13565972;
 //BA.debugLineNum = 13565972;BA.debugLine="Dim dx As Int = PaddingSides - iv.Left";
_dx = (int) (__ref._paddingsides /*int*/ -__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft());
RDebugUtils.currentLine=13565973;
 //BA.debugLineNum = 13565973;BA.debugLine="Dim dy As Int = PaddingTopBottom - iv.Top";
_dy = (int) (__ref._paddingtopbottom /*int*/ -__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop());
RDebugUtils.currentLine=13565974;
 //BA.debugLineNum = 13565974;BA.debugLine="pnl.AddView(iv, PaddingSides, PaddingTopBottom, i";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),__ref._paddingsides /*int*/ ,__ref._paddingtopbottom /*int*/ ,__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=13565976;
 //BA.debugLineNum = 13565976;BA.debugLine="Do While BB1.mBase.NumberOfViews > 0";
if (true) break;

case 11:
//do while
this.state = 14;
while (__ref._bb1 /*ir.abalfazl.hero.zip.grabber.bblabel*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews()>0) {
this.state = 13;
if (true) break;
}
if (true) break;

case 13:
//C
this.state = 11;
RDebugUtils.currentLine=13565977;
 //BA.debugLineNum = 13565977;BA.debugLine="Dim v As B4XView = BB1.mBase.GetView(0)";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
_v = __ref._bb1 /*ir.abalfazl.hero.zip.grabber.bblabel*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0));
RDebugUtils.currentLine=13565978;
 //BA.debugLineNum = 13565978;BA.debugLine="v.RemoveViewFromParent";
_v.RemoveViewFromParent();
RDebugUtils.currentLine=13565979;
 //BA.debugLineNum = 13565979;BA.debugLine="v.Tag = \"to remove\"";
_v.setTag((Object)("to remove"));
RDebugUtils.currentLine=13565980;
 //BA.debugLineNum = 13565980;BA.debugLine="pnl.AddView(v, dx + v.Left, dy + v.Top, v.Width,";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(_v.getObject()),_dx+_v.getLeft(),_dy+_v.getTop(),_v.getWidth(),_v.getHeight());
 if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=13565982;
 //BA.debugLineNum = 13565982;BA.debugLine="pnl.SetVisibleAnimated(200, True)";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated(ba,(int) (200),parent.__c.True);
RDebugUtils.currentLine=13565983;
 //BA.debugLineNum = 13565983;BA.debugLine="ShowIndex = ShowIndex + 1";
__ref._showindex /*int*/  = (int) (__ref._showindex /*int*/ +1);
RDebugUtils.currentLine=13565984;
 //BA.debugLineNum = 13565984;BA.debugLine="Dim MyIndex As Int = ShowIndex";
_myindex = __ref._showindex /*int*/ ;
RDebugUtils.currentLine=13565985;
 //BA.debugLineNum = 13565985;BA.debugLine="Sleep(DurationMs)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "bctoast", "show"),__ref._durationms /*int*/ );
this.state = 21;
return;
case 21:
//C
this.state = 15;
;
RDebugUtils.currentLine=13565986;
 //BA.debugLineNum = 13565986;BA.debugLine="If MyIndex = ShowIndex Then";
if (true) break;

case 15:
//if
this.state = 18;
if (_myindex==__ref._showindex /*int*/ ) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=13565987;
 //BA.debugLineNum = 13565987;BA.debugLine="pnl.SetVisibleAnimated(200, False)";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated(ba,(int) (200),parent.__c.False);
 if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=13565990;
 //BA.debugLineNum = 13565990;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(ir.abalfazl.hero.zip.grabber.bctoast __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctoast";
RDebugUtils.currentLine=13434880;
 //BA.debugLineNum = 13434880;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=13434881;
 //BA.debugLineNum = 13434881;BA.debugLine="Public pnl As B4XView";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=13434882;
 //BA.debugLineNum = 13434882;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=13434883;
 //BA.debugLineNum = 13434883;BA.debugLine="Private ShowIndex As Int";
_showindex = 0;
RDebugUtils.currentLine=13434884;
 //BA.debugLineNum = 13434884;BA.debugLine="Public BB1 As BBLabel";
_bb1 = new ir.abalfazl.hero.zip.grabber.bblabel();
RDebugUtils.currentLine=13434885;
 //BA.debugLineNum = 13434885;BA.debugLine="Private te As BCTextEngine";
_te = new ir.abalfazl.hero.zip.grabber.bctextengine();
RDebugUtils.currentLine=13434886;
 //BA.debugLineNum = 13434886;BA.debugLine="Private iv As B4XView";
_iv = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=13434887;
 //BA.debugLineNum = 13434887;BA.debugLine="Public DurationMs As Int = 3000";
_durationms = (int) (3000);
RDebugUtils.currentLine=13434888;
 //BA.debugLineNum = 13434888;BA.debugLine="Public DefaultTextColor As Int = 0xFF3E3E3E";
_defaulttextcolor = ((int)0xff3e3e3e);
RDebugUtils.currentLine=13434889;
 //BA.debugLineNum = 13434889;BA.debugLine="Public PaddingSides As Int = 15dip";
_paddingsides = __c.DipToCurrent((int) (15));
RDebugUtils.currentLine=13434890;
 //BA.debugLineNum = 13434890;BA.debugLine="Public PaddingTopBottom As Int = 10dip";
_paddingtopbottom = __c.DipToCurrent((int) (10));
RDebugUtils.currentLine=13434891;
 //BA.debugLineNum = 13434891;BA.debugLine="Public MaxHeight As Int = 100dip";
_maxheight = __c.DipToCurrent((int) (100));
RDebugUtils.currentLine=13434892;
 //BA.debugLineNum = 13434892;BA.debugLine="Public VerticalCenterPercentage As Int = 85";
_verticalcenterpercentage = (int) (85);
RDebugUtils.currentLine=13434893;
 //BA.debugLineNum = 13434893;BA.debugLine="End Sub";
return "";
}
}