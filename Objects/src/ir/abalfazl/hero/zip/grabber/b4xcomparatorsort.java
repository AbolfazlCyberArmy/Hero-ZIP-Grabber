package ir.abalfazl.hero.zip.grabber;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xcomparatorsort extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("ir.abalfazl.hero.zip.grabber", "ir.abalfazl.hero.zip.grabber.b4xcomparatorsort", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", ir.abalfazl.hero.zip.grabber.b4xcomparatorsort.class).invoke(this, new Object[] {null});
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
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public ir.abalfazl.hero.zip.grabber.main _main = null;
public ir.abalfazl.hero.zip.grabber.aboutact _aboutact = null;
public ir.abalfazl.hero.zip.grabber.b4xcollections _b4xcollections = null;
public ir.abalfazl.hero.zip.grabber.httputils2service _httputils2service = null;
public ir.abalfazl.hero.zip.grabber.xuiviewsutils _xuiviewsutils = null;
public String  _class_globals(ir.abalfazl.hero.zip.grabber.b4xcomparatorsort __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcomparatorsort";
RDebugUtils.currentLine=11665408;
 //BA.debugLineNum = 11665408;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=11665409;
 //BA.debugLineNum = 11665409;BA.debugLine="End Sub";
return "";
}
public String  _initialize(ir.abalfazl.hero.zip.grabber.b4xcomparatorsort __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xcomparatorsort";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=11730944;
 //BA.debugLineNum = 11730944;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=11730945;
 //BA.debugLineNum = 11730945;BA.debugLine="End Sub";
return "";
}
public int  _partition(ir.abalfazl.hero.zip.grabber.b4xcomparatorsort __ref,anywheresoftware.b4a.objects.collections.List _data,int _startindex,int _length,int _pivotindex,Object _comparator) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcomparatorsort";
if (Debug.shouldDelegate(ba, "partition", true))
	 {return ((Integer) Debug.delegate(ba, "partition", new Object[] {_data,_startindex,_length,_pivotindex,_comparator}));}
Object _pivotvalue = null;
int _l = 0;
int _i = 0;
RDebugUtils.currentLine=11927552;
 //BA.debugLineNum = 11927552;BA.debugLine="Private Sub Partition(Data As List, StartIndex As";
RDebugUtils.currentLine=11927553;
 //BA.debugLineNum = 11927553;BA.debugLine="Dim PivotValue As Object = Data.Get(StartIndex +";
_pivotvalue = _data.Get((int) (_startindex+_pivotindex));
RDebugUtils.currentLine=11927554;
 //BA.debugLineNum = 11927554;BA.debugLine="Swap(Data, StartIndex, PivotIndex, Length - 1)";
__ref._swap /*String*/ (null,_data,_startindex,_pivotindex,(int) (_length-1));
RDebugUtils.currentLine=11927555;
 //BA.debugLineNum = 11927555;BA.debugLine="Dim L As Int = 0";
_l = (int) (0);
RDebugUtils.currentLine=11927556;
 //BA.debugLineNum = 11927556;BA.debugLine="For i = 0 To Length - 2";
{
final int step4 = 1;
final int limit4 = (int) (_length-2);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=11927557;
 //BA.debugLineNum = 11927557;BA.debugLine="If CallSub3(Comparator, \"Compare\", Data.Get(Star";
if (((int)(BA.ObjectToNumber(__c.CallSubDebug3(ba,_comparator,"Compare",_data.Get((int) (_startindex+_i)),_pivotvalue))))<0) { 
RDebugUtils.currentLine=11927558;
 //BA.debugLineNum = 11927558;BA.debugLine="L = L + 1";
_l = (int) (_l+1);
RDebugUtils.currentLine=11927559;
 //BA.debugLineNum = 11927559;BA.debugLine="Swap(Data, StartIndex, L - 1, i)";
__ref._swap /*String*/ (null,_data,_startindex,(int) (_l-1),_i);
 };
 }
};
RDebugUtils.currentLine=11927562;
 //BA.debugLineNum = 11927562;BA.debugLine="Swap(Data, StartIndex, Length - 1, L)";
__ref._swap /*String*/ (null,_data,_startindex,(int) (_length-1),_l);
RDebugUtils.currentLine=11927563;
 //BA.debugLineNum = 11927563;BA.debugLine="Return L";
if (true) return _l;
RDebugUtils.currentLine=11927564;
 //BA.debugLineNum = 11927564;BA.debugLine="End Sub";
return 0;
}
public String  _swap(ir.abalfazl.hero.zip.grabber.b4xcomparatorsort __ref,anywheresoftware.b4a.objects.collections.List _data,int _startindex,int _i1,int _i2) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcomparatorsort";
if (Debug.shouldDelegate(ba, "swap", true))
	 {return ((String) Debug.delegate(ba, "swap", new Object[] {_data,_startindex,_i1,_i2}));}
Object _o = null;
RDebugUtils.currentLine=11993088;
 //BA.debugLineNum = 11993088;BA.debugLine="Private Sub Swap (Data As List, StartIndex As Int,";
RDebugUtils.currentLine=11993089;
 //BA.debugLineNum = 11993089;BA.debugLine="Dim o As Object = Data.Get(StartIndex + i1)";
_o = _data.Get((int) (_startindex+_i1));
RDebugUtils.currentLine=11993090;
 //BA.debugLineNum = 11993090;BA.debugLine="Data.Set(StartIndex + i1, Data.Get(StartIndex + i";
_data.Set((int) (_startindex+_i1),_data.Get((int) (_startindex+_i2)));
RDebugUtils.currentLine=11993091;
 //BA.debugLineNum = 11993091;BA.debugLine="Data.Set(StartIndex + i2, o)";
_data.Set((int) (_startindex+_i2),_o);
RDebugUtils.currentLine=11993092;
 //BA.debugLineNum = 11993092;BA.debugLine="End Sub";
return "";
}
public String  _quicksort(ir.abalfazl.hero.zip.grabber.b4xcomparatorsort __ref,anywheresoftware.b4a.objects.collections.List _data,int _startindex,int _length,Object _comparator) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcomparatorsort";
if (Debug.shouldDelegate(ba, "quicksort", true))
	 {return ((String) Debug.delegate(ba, "quicksort", new Object[] {_data,_startindex,_length,_comparator}));}
int _pivotindex = 0;
int _r = 0;
RDebugUtils.currentLine=11862016;
 //BA.debugLineNum = 11862016;BA.debugLine="Private Sub QuickSort (Data As List, StartIndex As";
RDebugUtils.currentLine=11862017;
 //BA.debugLineNum = 11862017;BA.debugLine="If Length > 1 Then";
if (_length>1) { 
RDebugUtils.currentLine=11862018;
 //BA.debugLineNum = 11862018;BA.debugLine="Dim PivotIndex As Int = Rnd(0, Length)";
_pivotindex = __c.Rnd((int) (0),_length);
RDebugUtils.currentLine=11862019;
 //BA.debugLineNum = 11862019;BA.debugLine="Dim r As Int = Partition(Data, StartIndex, Lengt";
_r = __ref._partition /*int*/ (null,_data,_startindex,_length,_pivotindex,_comparator);
RDebugUtils.currentLine=11862020;
 //BA.debugLineNum = 11862020;BA.debugLine="QuickSort(Data, StartIndex, r, Comparator)";
__ref._quicksort /*String*/ (null,_data,_startindex,_r,_comparator);
RDebugUtils.currentLine=11862021;
 //BA.debugLineNum = 11862021;BA.debugLine="QuickSort(Data, StartIndex + r + 1, Length - r -";
__ref._quicksort /*String*/ (null,_data,(int) (_startindex+_r+1),(int) (_length-_r-1),_comparator);
 };
RDebugUtils.currentLine=11862023;
 //BA.debugLineNum = 11862023;BA.debugLine="End Sub";
return "";
}
public String  _sort(ir.abalfazl.hero.zip.grabber.b4xcomparatorsort __ref,anywheresoftware.b4a.objects.collections.List _data,Object _comparator) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcomparatorsort";
if (Debug.shouldDelegate(ba, "sort", true))
	 {return ((String) Debug.delegate(ba, "sort", new Object[] {_data,_comparator}));}
RDebugUtils.currentLine=11796480;
 //BA.debugLineNum = 11796480;BA.debugLine="Public Sub Sort (Data As List, Comparator As Objec";
RDebugUtils.currentLine=11796482;
 //BA.debugLineNum = 11796482;BA.debugLine="QuickSort(Data, 0, Data.Size, Comparator)";
__ref._quicksort /*String*/ (null,_data,(int) (0),_data.getSize(),_comparator);
RDebugUtils.currentLine=11796486;
 //BA.debugLineNum = 11796486;BA.debugLine="End Sub";
return "";
}
}