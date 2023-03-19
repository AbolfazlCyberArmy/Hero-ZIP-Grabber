package ir.abalfazl.hero.zip.grabber;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class bctextengine extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("ir.abalfazl.hero.zip.grabber", "ir.abalfazl.hero.zip.grabber.bctextengine", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", ir.abalfazl.hero.zip.grabber.bctextengine.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _bcfontmetrics{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.collections.Map Glyphs;
public ir.abalfazl.hero.zip.grabber.bctextengine._bcfontmetrics DefaultColorMetrics;
public int xWidth;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont Fnt;
public int Clr;
public anywheresoftware.b4a.objects.collections.Map KerningTable;
public void Initialize() {
IsInitialized = true;
Glyphs = new anywheresoftware.b4a.objects.collections.Map();
DefaultColorMetrics = new ir.abalfazl.hero.zip.grabber.bctextengine._bcfontmetrics();
xWidth = 0;
Fnt = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
Clr = 0;
KerningTable = new anywheresoftware.b4a.objects.collections.Map();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bctextchars{
public boolean IsInitialized;
public String[] Buffer;
public int StartIndex;
public int Length;
public void Initialize() {
IsInitialized = true;
Buffer = new String[0];
java.util.Arrays.fill(Buffer,"");
StartIndex = 0;
Length = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bcparagraphstyle{
public boolean IsInitialized;
public String HorizontalAlignment;
public float LineSpacingFactor;
public int MaxWidth;
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect Padding;
public boolean WordWrap;
public boolean ResizeHeightAutomatically;
public boolean RTL;
public void Initialize() {
IsInitialized = true;
HorizontalAlignment = "";
LineSpacingFactor = 0f;
MaxWidth = 0;
Padding = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
WordWrap = false;
ResizeHeightAutomatically = false;
RTL = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bctextrun{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont TextFont;
public int TextColor;
public String Text;
public ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars TextChars;
public float CharacterSpacingFactor;
public int VerticalOffset;
public boolean Underline;
public boolean AutoUnderline;
public int BackgroundColor;
public int IndentLevel;
public anywheresoftware.b4a.objects.B4XViewWrapper View;
public String HorizontalAlignment;
public Object Tag;
public anywheresoftware.b4a.objects.collections.Map Extra;
public int TextDirection;
public void Initialize() {
IsInitialized = true;
TextFont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
TextColor = 0;
Text = "";
TextChars = new ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars();
CharacterSpacingFactor = 0f;
VerticalOffset = 0;
Underline = false;
AutoUnderline = false;
BackgroundColor = 0;
IndentLevel = 0;
View = new anywheresoftware.b4a.objects.B4XViewWrapper();
HorizontalAlignment = "";
Tag = new Object();
Extra = new anywheresoftware.b4a.objects.collections.Map();
TextDirection = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bcconnectedruns{
public boolean IsInitialized;
public int ConnectedWidth;
public anywheresoftware.b4a.objects.collections.List Runs;
public String Alignment;
public void Initialize() {
IsInitialized = true;
ConnectedWidth = 0;
Runs = new anywheresoftware.b4a.objects.collections.List();
Alignment = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bcstyledunderline{
public boolean IsInitialized;
public int Clr;
public String Style;
public float Thickness;
public void Initialize() {
IsInitialized = true;
Clr = 0;
Style = "";
Thickness = 0f;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bcparagraph{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.collections.List TextLines;
public ir.abalfazl.hero.zip.grabber.bctextengine._bctextline CurrentLine;
public ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraphstyle Style;
public boolean TwoLayers;
public int Width;
public int Height;
public anywheresoftware.b4a.objects.collections.List Views;
public void Initialize() {
IsInitialized = true;
TextLines = new anywheresoftware.b4a.objects.collections.List();
CurrentLine = new ir.abalfazl.hero.zip.grabber.bctextengine._bctextline();
Style = new ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraphstyle();
TwoLayers = false;
Width = 0;
Height = 0;
Views = new anywheresoftware.b4a.objects.collections.List();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bctextline{
public boolean IsInitialized;
public int StartX;
public int BaselineY;
public int Height;
public anywheresoftware.b4a.objects.collections.List Unbreakables;
public int Width;
public boolean EndsWithSoftLineBreak;
public int MaxHeightAboveBaseLine;
public ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraph ParentParagraph;
public int MaxHeightBelowBaseLine;
public void Initialize() {
IsInitialized = true;
StartX = 0;
BaselineY = 0;
Height = 0;
Unbreakables = new anywheresoftware.b4a.objects.collections.List();
Width = 0;
EndsWithSoftLineBreak = false;
MaxHeightAboveBaseLine = 0;
ParentParagraph = new ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraph();
MaxHeightBelowBaseLine = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bcunbreakabletext{
public boolean IsInitialized;
public int Width;
public int StartX;
public ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars NotFullTextChars;
public boolean IsMergable;
public anywheresoftware.b4a.objects.collections.List SingleStyleSections;
public ir.abalfazl.hero.zip.grabber.bctextengine._bctextline ParentLine;
public boolean RTL;
public void Initialize() {
IsInitialized = true;
Width = 0;
StartX = 0;
NotFullTextChars = new ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars();
IsMergable = false;
SingleStyleSections = new anywheresoftware.b4a.objects.collections.List();
ParentLine = new ir.abalfazl.hero.zip.grabber.bctextengine._bctextline();
RTL = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bcsinglestylesection{
public boolean IsInitialized;
public int AbsoluteStartX;
public anywheresoftware.b4a.objects.collections.List GlyphsAndOffsets;
public ir.abalfazl.hero.zip.grabber.bctextengine._bctextrun Run;
public int Width;
public int MaxHeightBelowBaseLine;
public int MaxHeightAboveBaseLine;
public ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext ParentUN;
public ir.abalfazl.hero.zip.grabber.bctextengine._bcfontmetrics fm;
public void Initialize() {
IsInitialized = true;
AbsoluteStartX = 0;
GlyphsAndOffsets = new anywheresoftware.b4a.objects.collections.List();
Run = new ir.abalfazl.hero.zip.grabber.bctextengine._bctextrun();
Width = 0;
MaxHeightBelowBaseLine = 0;
MaxHeightAboveBaseLine = 0;
ParentUN = new ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext();
fm = new ir.abalfazl.hero.zip.grabber.bctextengine._bcfontmetrics();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bcglyphandoffset{
public boolean IsInitialized;
public ir.abalfazl.hero.zip.grabber.bctextengine._bcglyph Glyph;
public int SpaceBetweenThisAndNext;
public void Initialize() {
IsInitialized = true;
Glyph = new ir.abalfazl.hero.zip.grabber.bctextengine._bcglyph();
SpaceBetweenThisAndNext = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bcglyph{
public boolean IsInitialized;
public b4j.example.bitmapcreator._compressedbc cbc;
public int baseline;
public int Width;
public boolean Emoji;
public boolean Empty;
public void Initialize() {
IsInitialized = true;
cbc = new b4j.example.bitmapcreator._compressedbc();
baseline = 0;
Width = 0;
Emoji = false;
Empty = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
public String _extra_connectedruns = "";
public String _extra_styledunderline = "";
public b4j.example.bitmapcreator _charbc = null;
public b4j.example.bitmapcreator._internalcompressedbccache _cbccache = null;
public ir.abalfazl.hero.zip.grabber.bctextengine._bcstyledunderline _defaultunderlinestyle = null;
public float _mscale = 0f;
public float _mspacebetweencharacters = 0f;
public int _mspacebetweenlines = 0;
public anywheresoftware.b4a.objects.collections.Map _fontmetricscache = null;
public b4j.example.bitmapcreator _foregroundbc = null;
public b4j.example.bitmapcreator _backgroundbc = null;
public int _defaultcolor = 0;
public String _wordboundaries = "";
public String _wordboundariesthatcanconnecttoprevword = "";
public anywheresoftware.b4a.objects.collections.Map _brushes = null;
public ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraphstyle _defaultstyle = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _defaultfont = null;
public int _mmingapbetweenlines = 0;
public anywheresoftware.b4j.object.JavaObject _writableimage = null;
public anywheresoftware.b4j.object.JavaObject _sp = null;
public int _tabwidthmeasuredinx = 0;
public ir.abalfazl.hero.zip.grabber.bbcodeparser _tagparser = null;
public ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars _emptytextchars = null;
public ir.abalfazl.hero.zip.grabber.b4xset _emojis = null;
public String _charset = "";
public boolean _lookforcomplexcharacters = false;
public anywheresoftware.b4a.objects.collections.Map _customfonts = null;
public boolean _kerningenabled = false;
public int _indentwidth = 0;
public ir.abalfazl.hero.zip.grabber.b4xset _vowelscodepoints = null;
public ir.abalfazl.hero.zip.grabber.b4xorderedmap _asyncbcs = null;
public b4j.example.bitmapcreator _asyncbc = null;
public anywheresoftware.b4a.objects.collections.List _asynctasks = null;
public boolean _asyncmode = false;
public ir.abalfazl.hero.zip.grabber.b4xset _rtlchars = null;
public int _textdirectionltr = 0;
public int _textdirectionunknown = 0;
public int _textdirectionrtl = 0;
public anywheresoftware.b4a.objects.collections.Map _arabicmap = null;
public ir.abalfazl.hero.zip.grabber.b4xset _arabicnonlinkedletters = null;
public ir.abalfazl.hero.zip.grabber.b4xset _arabiccharsconnectedprev = null;
public b4j.example.bitmapcreator._premultipliedcolor _pmdefaultcolor = null;
public boolean _rtlaware = false;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public ir.abalfazl.hero.zip.grabber.main _main = null;
public ir.abalfazl.hero.zip.grabber.aboutact _aboutact = null;
public ir.abalfazl.hero.zip.grabber.b4xcollections _b4xcollections = null;
public ir.abalfazl.hero.zip.grabber.httputils2service _httputils2service = null;
public ir.abalfazl.hero.zip.grabber.xuiviewsutils _xuiviewsutils = null;
public ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars  _createbctextcharsfromstring(ir.abalfazl.hero.zip.grabber.bctextengine __ref,String _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createbctextcharsfromstring", true))
	 {return ((ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars) Debug.delegate(ba, "createbctextcharsfromstring", new Object[] {_s}));}
byte[] _b = null;
String[] _chars = null;
int _i = 0;
int _bi = 0;
boolean _shouldaddtoprevchar = false;
boolean _therearevowels = false;
int _cp = 0;
RDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Public Sub CreateBCTextCharsFromString (s As Strin";
RDebugUtils.currentLine=8323073;
 //BA.debugLineNum = 8323073;BA.debugLine="Dim b() As Byte = s.GetBytes(Charset)";
_b = _s.getBytes(__ref._charset /*String*/ );
RDebugUtils.currentLine=8323074;
 //BA.debugLineNum = 8323074;BA.debugLine="Dim chars(b.Length / 4) As String";
_chars = new String[(int) (_b.length/(double)4)];
java.util.Arrays.fill(_chars,"");
RDebugUtils.currentLine=8323075;
 //BA.debugLineNum = 8323075;BA.debugLine="Dim i, bi As Int = 0";
_i = 0;
_bi = (int) (0);
RDebugUtils.currentLine=8323076;
 //BA.debugLineNum = 8323076;BA.debugLine="Dim ShouldAddToPrevChar As Boolean";
_shouldaddtoprevchar = false;
RDebugUtils.currentLine=8323077;
 //BA.debugLineNum = 8323077;BA.debugLine="Dim ThereAreVowels As Boolean = VowelsCodePoints.";
_therearevowels = __ref._vowelscodepoints /*ir.abalfazl.hero.zip.grabber.b4xset*/ ._getsize /*int*/ (null)>0;
RDebugUtils.currentLine=8323078;
 //BA.debugLineNum = 8323078;BA.debugLine="Do While bi <= chars.Length - 1";
while (_bi<=_chars.length-1) {
RDebugUtils.currentLine=8323079;
 //BA.debugLineNum = 8323079;BA.debugLine="chars(i) = BytesToString(b, bi * 4, 4, Charset)";
_chars[_i] = __c.BytesToString(_b,(int) (_bi*4),(int) (4),__ref._charset /*String*/ );
RDebugUtils.currentLine=8323080;
 //BA.debugLineNum = 8323080;BA.debugLine="If LookForComplexCharacters Then";
if (__ref._lookforcomplexcharacters /*boolean*/ ) { 
RDebugUtils.currentLine=8323081;
 //BA.debugLineNum = 8323081;BA.debugLine="Dim cp As Int = BytesToInt(b, bi * 4)";
_cp = __ref._bytestoint /*int*/ (null,_b,(int) (_bi*4));
RDebugUtils.currentLine=8323082;
 //BA.debugLineNum = 8323082;BA.debugLine="If i > 0 And (cp = 0x200d Or (cp >= 0xFE00 And";
if (_i>0 && (_cp==((int)0x200d) || (_cp>=((int)0xfe00) && _cp<=((int)0xfe0f)))) { 
RDebugUtils.currentLine=8323083;
 //BA.debugLineNum = 8323083;BA.debugLine="chars(i - 1) = chars(i - 1) & chars(i)";
_chars[(int) (_i-1)] = _chars[(int) (_i-1)]+_chars[_i];
RDebugUtils.currentLine=8323084;
 //BA.debugLineNum = 8323084;BA.debugLine="i = i - 1";
_i = (int) (_i-1);
RDebugUtils.currentLine=8323085;
 //BA.debugLineNum = 8323085;BA.debugLine="ShouldAddToPrevChar = True";
_shouldaddtoprevchar = __c.True;
 }else 
{RDebugUtils.currentLine=8323086;
 //BA.debugLineNum = 8323086;BA.debugLine="Else If i > 0 And (cp >= 0x1F3FB And cp <= 0x1F";
if (_i>0 && (_cp>=((int)0x1f3fb) && _cp<=((int)0x1f3ff))) { 
RDebugUtils.currentLine=8323087;
 //BA.debugLineNum = 8323087;BA.debugLine="chars(i - 1) = chars(i - 1) & chars(i)";
_chars[(int) (_i-1)] = _chars[(int) (_i-1)]+_chars[_i];
RDebugUtils.currentLine=8323088;
 //BA.debugLineNum = 8323088;BA.debugLine="i = i - 1";
_i = (int) (_i-1);
RDebugUtils.currentLine=8323089;
 //BA.debugLineNum = 8323089;BA.debugLine="ShouldAddToPrevChar = False";
_shouldaddtoprevchar = __c.False;
 }else 
{RDebugUtils.currentLine=8323090;
 //BA.debugLineNum = 8323090;BA.debugLine="Else If i > 0 And (ThereAreVowels And VowelsCod";
if (_i>0 && (_therearevowels && __ref._vowelscodepoints /*ir.abalfazl.hero.zip.grabber.b4xset*/ ._contains /*boolean*/ (null,(Object)(_cp)))) { 
RDebugUtils.currentLine=8323091;
 //BA.debugLineNum = 8323091;BA.debugLine="chars(i - 1) = chars(i - 1) & chars(i)";
_chars[(int) (_i-1)] = _chars[(int) (_i-1)]+_chars[_i];
RDebugUtils.currentLine=8323092;
 //BA.debugLineNum = 8323092;BA.debugLine="i = i - 1";
_i = (int) (_i-1);
RDebugUtils.currentLine=8323093;
 //BA.debugLineNum = 8323093;BA.debugLine="ShouldAddToPrevChar = False";
_shouldaddtoprevchar = __c.False;
 }else 
{RDebugUtils.currentLine=8323094;
 //BA.debugLineNum = 8323094;BA.debugLine="Else If RTLAware And i > 0 And chars(i - 1) = \"";
if (__ref._rtlaware /*boolean*/  && _i>0 && (_chars[(int) (_i-1)]).equals("ل") && (_cp==((int)0x622) || _cp==((int)0x623) || _cp==((int)0x625) || _cp==((int)0x627))) { 
RDebugUtils.currentLine=8323095;
 //BA.debugLineNum = 8323095;BA.debugLine="Select cp";
switch (_cp) {
case 0x622: {
RDebugUtils.currentLine=8323097;
 //BA.debugLineNum = 8323097;BA.debugLine="chars(i - 1) = Chr(0xFEF5)";
_chars[(int) (_i-1)] = BA.ObjectToString(__c.Chr(((int)0xfef5)));
 break; }
case 0x623: {
RDebugUtils.currentLine=8323099;
 //BA.debugLineNum = 8323099;BA.debugLine="chars(i - 1) = Chr(0xFEF7)";
_chars[(int) (_i-1)] = BA.ObjectToString(__c.Chr(((int)0xfef7)));
 break; }
case 0x625: {
RDebugUtils.currentLine=8323101;
 //BA.debugLineNum = 8323101;BA.debugLine="chars(i - 1) = Chr(0xFEF9)";
_chars[(int) (_i-1)] = BA.ObjectToString(__c.Chr(((int)0xfef9)));
 break; }
case 0x627: {
RDebugUtils.currentLine=8323103;
 //BA.debugLineNum = 8323103;BA.debugLine="chars(i - 1) = Chr(0xFEFB)";
_chars[(int) (_i-1)] = BA.ObjectToString(__c.Chr(((int)0xfefb)));
 break; }
}
;
RDebugUtils.currentLine=8323105;
 //BA.debugLineNum = 8323105;BA.debugLine="i = i - 1";
_i = (int) (_i-1);
RDebugUtils.currentLine=8323106;
 //BA.debugLineNum = 8323106;BA.debugLine="ShouldAddToPrevChar = False";
_shouldaddtoprevchar = __c.False;
 }else 
{RDebugUtils.currentLine=8323107;
 //BA.debugLineNum = 8323107;BA.debugLine="Else If i > 0 And ShouldAddToPrevChar Then";
if (_i>0 && _shouldaddtoprevchar) { 
RDebugUtils.currentLine=8323108;
 //BA.debugLineNum = 8323108;BA.debugLine="chars(i - 1) = chars(i - 1) & chars(i)";
_chars[(int) (_i-1)] = _chars[(int) (_i-1)]+_chars[_i];
RDebugUtils.currentLine=8323109;
 //BA.debugLineNum = 8323109;BA.debugLine="i = i - 1";
_i = (int) (_i-1);
RDebugUtils.currentLine=8323110;
 //BA.debugLineNum = 8323110;BA.debugLine="ShouldAddToPrevChar = False";
_shouldaddtoprevchar = __c.False;
 }else {
RDebugUtils.currentLine=8323112;
 //BA.debugLineNum = 8323112;BA.debugLine="ShouldAddToPrevChar = False";
_shouldaddtoprevchar = __c.False;
 }}}}}
;
 };
RDebugUtils.currentLine=8323115;
 //BA.debugLineNum = 8323115;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
RDebugUtils.currentLine=8323116;
 //BA.debugLineNum = 8323116;BA.debugLine="bi = bi + 1";
_bi = (int) (_bi+1);
 }
;
RDebugUtils.currentLine=8323118;
 //BA.debugLineNum = 8323118;BA.debugLine="If RTLAware Then";
if (__ref._rtlaware /*boolean*/ ) { 
RDebugUtils.currentLine=8323119;
 //BA.debugLineNum = 8323119;BA.debugLine="PreprocessArabic(chars, i)";
__ref._preprocessarabic /*String*/ (null,_chars,_i);
 };
RDebugUtils.currentLine=8323121;
 //BA.debugLineNum = 8323121;BA.debugLine="Return CreateBCTextChars(chars, 0, i)";
if (true) return __ref._createbctextchars /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars*/ (null,_chars,(int) (0),_i);
RDebugUtils.currentLine=8323122;
 //BA.debugLineNum = 8323122;BA.debugLine="End Sub";
return null;
}
public ir.abalfazl.hero.zip.grabber.bctextengine._bctextrun  _createconnectedparent(ir.abalfazl.hero.zip.grabber.bctextengine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createconnectedparent", true))
	 {return ((ir.abalfazl.hero.zip.grabber.bctextengine._bctextrun) Debug.delegate(ba, "createconnectedparent", null));}
ir.abalfazl.hero.zip.grabber.bctextengine._bcconnectedruns _connected = null;
ir.abalfazl.hero.zip.grabber.bctextengine._bctextrun _parent = null;
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Public Sub CreateConnectedParent As BCTextRun";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="Dim connected As BCConnectedRuns";
_connected = new ir.abalfazl.hero.zip.grabber.bctextengine._bcconnectedruns();
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="connected.Initialize";
_connected.Initialize();
RDebugUtils.currentLine=5111811;
 //BA.debugLineNum = 5111811;BA.debugLine="connected.Runs.Initialize";
_connected.Runs /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=5111812;
 //BA.debugLineNum = 5111812;BA.debugLine="Dim parent As BCTextRun = CreateRun(\"\")";
_parent = __ref._createrun /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextrun*/ (null,"");
RDebugUtils.currentLine=5111813;
 //BA.debugLineNum = 5111813;BA.debugLine="parent.Extra.Initialize";
_parent.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=5111814;
 //BA.debugLineNum = 5111814;BA.debugLine="parent.Extra.Put(EXTRA_CONNECTEDRUNS, connected)";
_parent.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._extra_connectedruns /*String*/ ),(Object)(_connected));
RDebugUtils.currentLine=5111815;
 //BA.debugLineNum = 5111815;BA.debugLine="Return parent";
if (true) return _parent;
RDebugUtils.currentLine=5111816;
 //BA.debugLineNum = 5111816;BA.debugLine="End Sub";
return null;
}
public ir.abalfazl.hero.zip.grabber.bctextengine._bcfontmetrics  _getfontmetrics(ir.abalfazl.hero.zip.grabber.bctextengine __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "getfontmetrics", true))
	 {return ((ir.abalfazl.hero.zip.grabber.bctextengine._bcfontmetrics) Debug.delegate(ba, "getfontmetrics", new Object[] {_fnt,_clr}));}
String _key = "";
ir.abalfazl.hero.zip.grabber.bctextengine._bcfontmetrics _fm = null;
RDebugUtils.currentLine=7405568;
 //BA.debugLineNum = 7405568;BA.debugLine="Public Sub GetFontMetrics(Fnt As B4XFont, clr As I";
RDebugUtils.currentLine=7405569;
 //BA.debugLineNum = 7405569;BA.debugLine="Dim key As String = FontToKey(Fnt, clr)";
_key = __ref._fonttokey /*String*/ (null,_fnt,_clr);
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="If FontMetricsCache.ContainsKey(key) Then Return";
if (__ref._fontmetricscache /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_key))) { 
if (true) return (ir.abalfazl.hero.zip.grabber.bctextengine._bcfontmetrics)(__ref._fontmetricscache /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_key)));};
RDebugUtils.currentLine=7405571;
 //BA.debugLineNum = 7405571;BA.debugLine="Dim fm As BCFontMetrics";
_fm = new ir.abalfazl.hero.zip.grabber.bctextengine._bcfontmetrics();
RDebugUtils.currentLine=7405572;
 //BA.debugLineNum = 7405572;BA.debugLine="fm.Initialize";
_fm.Initialize();
RDebugUtils.currentLine=7405573;
 //BA.debugLineNum = 7405573;BA.debugLine="fm.Glyphs.Initialize";
_fm.Glyphs /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=7405574;
 //BA.debugLineNum = 7405574;BA.debugLine="fm.Clr = clr";
_fm.Clr /*int*/  = _clr;
RDebugUtils.currentLine=7405575;
 //BA.debugLineNum = 7405575;BA.debugLine="fm.Fnt = Fnt";
_fm.Fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _fnt;
RDebugUtils.currentLine=7405576;
 //BA.debugLineNum = 7405576;BA.debugLine="If clr = DefaultColor Then";
if (_clr==__ref._defaultcolor /*int*/ ) { 
RDebugUtils.currentLine=7405577;
 //BA.debugLineNum = 7405577;BA.debugLine="fm.KerningTable.Initialize";
_fm.KerningTable /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=7405578;
 //BA.debugLineNum = 7405578;BA.debugLine="fm.DefaultColorMetrics = fm";
_fm.DefaultColorMetrics /*ir.abalfazl.hero.zip.grabber.bctextengine._bcfontmetrics*/  = _fm;
RDebugUtils.currentLine=7405579;
 //BA.debugLineNum = 7405579;BA.debugLine="fm.xWidth = CreateGlyph(\"x\", fm, False).Width";
_fm.xWidth /*int*/  = __ref._createglyph /*ir.abalfazl.hero.zip.grabber.bctextengine._bcglyph*/ (null,"x",_fm,__c.False).Width /*int*/ ;
 }else {
RDebugUtils.currentLine=7405581;
 //BA.debugLineNum = 7405581;BA.debugLine="fm.DefaultColorMetrics = GetFontMetrics(Fnt, Def";
_fm.DefaultColorMetrics /*ir.abalfazl.hero.zip.grabber.bctextengine._bcfontmetrics*/  = __ref._getfontmetrics /*ir.abalfazl.hero.zip.grabber.bctextengine._bcfontmetrics*/ (null,_fnt,__ref._defaultcolor /*int*/ );
RDebugUtils.currentLine=7405582;
 //BA.debugLineNum = 7405582;BA.debugLine="fm.xWidth = fm.DefaultColorMetrics.xWidth";
_fm.xWidth /*int*/  = _fm.DefaultColorMetrics /*ir.abalfazl.hero.zip.grabber.bctextengine._bcfontmetrics*/ .xWidth /*int*/ ;
RDebugUtils.currentLine=7405583;
 //BA.debugLineNum = 7405583;BA.debugLine="fm.KerningTable = fm.DefaultColorMetrics.Kerning";
_fm.KerningTable /*anywheresoftware.b4a.objects.collections.Map*/  = _fm.DefaultColorMetrics /*ir.abalfazl.hero.zip.grabber.bctextengine._bcfontmetrics*/ .KerningTable /*anywheresoftware.b4a.objects.collections.Map*/ ;
 };
RDebugUtils.currentLine=7405585;
 //BA.debugLineNum = 7405585;BA.debugLine="FontMetricsCache.Put(key, fm)";
__ref._fontmetricscache /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),(Object)(_fm));
RDebugUtils.currentLine=7405586;
 //BA.debugLineNum = 7405586;BA.debugLine="Return fm";
if (true) return _fm;
RDebugUtils.currentLine=7405587;
 //BA.debugLineNum = 7405587;BA.debugLine="End Sub";
return null;
}
public ir.abalfazl.hero.zip.grabber.bctextengine._bctextrun  _createrun(ir.abalfazl.hero.zip.grabber.bctextengine __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createrun", true))
	 {return ((ir.abalfazl.hero.zip.grabber.bctextengine._bctextrun) Debug.delegate(ba, "createrun", new Object[] {_text}));}
ir.abalfazl.hero.zip.grabber.bctextengine._bctextrun _r = null;
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Public Sub CreateRun (Text As String) As BCTextRun";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="Dim r As BCTextRun";
_r = new ir.abalfazl.hero.zip.grabber.bctextengine._bctextrun();
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="r.Initialize";
_r.Initialize();
RDebugUtils.currentLine=5046275;
 //BA.debugLineNum = 5046275;BA.debugLine="r.BackgroundColor = 0";
_r.BackgroundColor /*int*/  = (int) (0);
RDebugUtils.currentLine=5046276;
 //BA.debugLineNum = 5046276;BA.debugLine="r.CharacterSpacingFactor = 1";
_r.CharacterSpacingFactor /*float*/  = (float) (1);
RDebugUtils.currentLine=5046277;
 //BA.debugLineNum = 5046277;BA.debugLine="r.TextFont = DefaultFont";
_r.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._defaultfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
RDebugUtils.currentLine=5046278;
 //BA.debugLineNum = 5046278;BA.debugLine="r.TextChars = CreateBCTextCharsFromString(Text)";
_r.TextChars /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars*/  = __ref._createbctextcharsfromstring /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars*/ (null,_text);
RDebugUtils.currentLine=5046279;
 //BA.debugLineNum = 5046279;BA.debugLine="r.Text = Text";
_r.Text /*String*/  = _text;
RDebugUtils.currentLine=5046280;
 //BA.debugLineNum = 5046280;BA.debugLine="r.TextColor = DefaultColor";
_r.TextColor /*int*/  = __ref._defaultcolor /*int*/ ;
RDebugUtils.currentLine=5046281;
 //BA.debugLineNum = 5046281;BA.debugLine="Return r";
if (true) return _r;
RDebugUtils.currentLine=5046282;
 //BA.debugLineNum = 5046282;BA.debugLine="End Sub";
return null;
}
public ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars  _createbctextchars(ir.abalfazl.hero.zip.grabber.bctextengine __ref,String[] _buffer,int _startindex,int _length) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createbctextchars", true))
	 {return ((ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars) Debug.delegate(ba, "createbctextchars", new Object[] {_buffer,_startindex,_length}));}
ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars _t1 = null;
RDebugUtils.currentLine=8388608;
 //BA.debugLineNum = 8388608;BA.debugLine="Public Sub CreateBCTextChars (Buffer() As String,";
RDebugUtils.currentLine=8388609;
 //BA.debugLineNum = 8388609;BA.debugLine="Dim t1 As BCTextChars";
_t1 = new ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars();
RDebugUtils.currentLine=8388610;
 //BA.debugLineNum = 8388610;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=8388611;
 //BA.debugLineNum = 8388611;BA.debugLine="t1.Buffer = Buffer";
_t1.Buffer /*String[]*/  = _buffer;
RDebugUtils.currentLine=8388612;
 //BA.debugLineNum = 8388612;BA.debugLine="t1.StartIndex = StartIndex";
_t1.StartIndex /*int*/  = _startindex;
RDebugUtils.currentLine=8388613;
 //BA.debugLineNum = 8388613;BA.debugLine="t1.Length = Length";
_t1.Length /*int*/  = _length;
RDebugUtils.currentLine=8388614;
 //BA.debugLineNum = 8388614;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=8388615;
 //BA.debugLineNum = 8388615;BA.debugLine="End Sub";
return null;
}
public ir.abalfazl.hero.zip.grabber.bctextengine._bcsinglestylesection  _findsinglestylesection(ir.abalfazl.hero.zip.grabber.bctextengine __ref,ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraph _paragraph,int _x,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "findsinglestylesection", true))
	 {return ((ir.abalfazl.hero.zip.grabber.bctextengine._bcsinglestylesection) Debug.delegate(ba, "findsinglestylesection", new Object[] {_paragraph,_x,_y}));}
ir.abalfazl.hero.zip.grabber.bctextengine._bctextline _line = null;
ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext _un = null;
ir.abalfazl.hero.zip.grabber.bctextengine._bcsinglestylesection _s = null;
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Public Sub FindSingleStyleSection (Paragraph As BC";
RDebugUtils.currentLine=7208961;
 //BA.debugLineNum = 7208961;BA.debugLine="x = x * mScale";
_x = (int) (_x*__ref._mscale /*float*/ );
RDebugUtils.currentLine=7208962;
 //BA.debugLineNum = 7208962;BA.debugLine="y = y * mScale";
_y = (int) (_y*__ref._mscale /*float*/ );
RDebugUtils.currentLine=7208963;
 //BA.debugLineNum = 7208963;BA.debugLine="For Each line As BCTextLine In Paragraph.TextLine";
{
final anywheresoftware.b4a.BA.IterableList group3 = _paragraph.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_line = (ir.abalfazl.hero.zip.grabber.bctextengine._bctextline)(group3.Get(index3));
RDebugUtils.currentLine=7208965;
 //BA.debugLineNum = 7208965;BA.debugLine="If line.BaseLineY - line.MaxHeightAboveBaseLine";
if (_line.BaselineY /*int*/ -_line.MaxHeightAboveBaseLine /*int*/ <=_y && _line.BaselineY /*int*/ +_line.MaxHeightBelowBaseLine /*int*/ >=_y) { 
RDebugUtils.currentLine=7208966;
 //BA.debugLineNum = 7208966;BA.debugLine="For Each un As BCUnbreakableText In line.Unbrea";
{
final anywheresoftware.b4a.BA.IterableList group5 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_un = (ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext)(group5.Get(index5));
RDebugUtils.currentLine=7208967;
 //BA.debugLineNum = 7208967;BA.debugLine="If (Paragraph.Style.RTL = False And line.Start";
if ((_paragraph.Style /*ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraphstyle*/ .RTL /*boolean*/ ==__c.False && _line.StartX /*int*/ +_un.StartX /*int*/ <=_x && _line.StartX /*int*/ +_un.StartX /*int*/ +_un.Width /*int*/ >=_x) || (_paragraph.Style /*ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraphstyle*/ .RTL /*boolean*/  && _line.BaselineY /*int*/ -_line.MaxHeightAboveBaseLine /*int*/ <=_y && _line.BaselineY /*int*/ +_line.MaxHeightBelowBaseLine /*int*/ >=_y)) { 
RDebugUtils.currentLine=7208969;
 //BA.debugLineNum = 7208969;BA.debugLine="For Each s As BCSingleStyleSection In un.Sing";
{
final anywheresoftware.b4a.BA.IterableList group7 = _un.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_s = (ir.abalfazl.hero.zip.grabber.bctextengine._bcsinglestylesection)(group7.Get(index7));
RDebugUtils.currentLine=7208970;
 //BA.debugLineNum = 7208970;BA.debugLine="If s.AbsoluteStartX <= x And s.AbsoluteStart";
if (_s.AbsoluteStartX /*int*/ <=_x && _s.AbsoluteStartX /*int*/ +_s.Width /*int*/ >=_x) { 
if (true) return _s;};
 }
};
 };
 }
};
 };
 }
};
RDebugUtils.currentLine=7208976;
 //BA.debugLineNum = 7208976;BA.debugLine="Return Null";
if (true) return (ir.abalfazl.hero.zip.grabber.bctextengine._bcsinglestylesection)(__c.Null);
RDebugUtils.currentLine=7208977;
 //BA.debugLineNum = 7208977;BA.debugLine="End Sub";
return null;
}
public String  _drawsingleline(ir.abalfazl.hero.zip.grabber.bctextengine __ref,ir.abalfazl.hero.zip.grabber.bctextengine._bctextline _line,anywheresoftware.b4a.objects.B4XViewWrapper _iv,ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraph _par) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "drawsingleline", true))
	 {return ((String) Debug.delegate(ba, "drawsingleline", new Object[] {_line,_iv,_par}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Public Sub DrawSingleLine (line As BCTextLine, iv";
RDebugUtils.currentLine=6553601;
 //BA.debugLineNum = 6553601;BA.debugLine="Dim r As B4XRect = DrawSingleLineShared(line, iv,";
_r = __ref._drawsinglelineshared /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ (null,_line,_iv,_par);
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="If r.Width > 0 And r.Height > 0 Then";
if (_r.getWidth()>0 && _r.getHeight()>0) { 
RDebugUtils.currentLine=6553603;
 //BA.debugLineNum = 6553603;BA.debugLine="ForegroundBC.DrawRect2(r, GetBrush(xui.Color_Tra";
__ref._foregroundbc /*b4j.example.bitmapcreator*/ ._drawrect2(_r,__ref._getbrush /*b4j.example.bcpath._bcbrush*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent),__c.True,(int) (0));
RDebugUtils.currentLine=6553604;
 //BA.debugLineNum = 6553604;BA.debugLine="DrawLine(line, line.MaxHeightAboveBaseLine)";
__ref._drawline /*String*/ (null,_line,_line.MaxHeightAboveBaseLine /*int*/ );
RDebugUtils.currentLine=6553605;
 //BA.debugLineNum = 6553605;BA.debugLine="ForegroundBC.SetBitmapToImageView(ForegroundBC.B";
__ref._foregroundbc /*b4j.example.bitmapcreator*/ ._setbitmaptoimageview(__ref._foregroundbc /*b4j.example.bitmapcreator*/ ._getbitmap().Crop((int) (0),(int) (0),(int) (_r.getWidth()),(int) (_r.getHeight())),_iv);
 };
RDebugUtils.currentLine=6553607;
 //BA.debugLineNum = 6553607;BA.debugLine="End Sub";
return "";
}
public ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraphstyle  _createstyle(ir.abalfazl.hero.zip.grabber.bctextengine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createstyle", true))
	 {return ((ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraphstyle) Debug.delegate(ba, "createstyle", null));}
ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraphstyle _s = null;
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Public Sub CreateStyle As BCParagraphStyle";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="Dim s As BCParagraphStyle";
_s = new ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraphstyle();
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="s.Initialize";
_s.Initialize();
RDebugUtils.currentLine=4980739;
 //BA.debugLineNum = 4980739;BA.debugLine="s.LineSpacingFactor = 1";
_s.LineSpacingFactor /*float*/  = (float) (1);
RDebugUtils.currentLine=4980740;
 //BA.debugLineNum = 4980740;BA.debugLine="s.HorizontalAlignment = \"Left\"";
_s.HorizontalAlignment /*String*/  = "Left";
RDebugUtils.currentLine=4980741;
 //BA.debugLineNum = 4980741;BA.debugLine="s.MaxWidth = 300dip";
_s.MaxWidth /*int*/  = __c.DipToCurrent((int) (300));
RDebugUtils.currentLine=4980742;
 //BA.debugLineNum = 4980742;BA.debugLine="s.Padding.Initialize(5dip, 5dip, 5dip, 5dip)";
_s.Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .Initialize((float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (5))));
RDebugUtils.currentLine=4980743;
 //BA.debugLineNum = 4980743;BA.debugLine="s.WordWrap = True";
_s.WordWrap /*boolean*/  = __c.True;
RDebugUtils.currentLine=4980744;
 //BA.debugLineNum = 4980744;BA.debugLine="Return s";
if (true) return _s;
RDebugUtils.currentLine=4980745;
 //BA.debugLineNum = 4980745;BA.debugLine="End Sub";
return null;
}
public ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraph  _prepareforlazydrawing(ir.abalfazl.hero.zip.grabber.bctextengine __ref,anywheresoftware.b4a.objects.collections.List _runs,ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraphstyle _style,anywheresoftware.b4a.objects.B4XViewWrapper _sv) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "prepareforlazydrawing", true))
	 {return ((ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraph) Debug.delegate(ba, "prepareforlazydrawing", new Object[] {_runs,_style,_sv}));}
ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraph _par = null;
int _maxheight = 0;
ir.abalfazl.hero.zip.grabber.bctextengine._bctextline _line = null;
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Public Sub PrepareForLazyDrawing (Runs As List, St";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="Dim par As BCParagraph = Prepare(Runs, Style)";
_par = __ref._prepare /*ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraph*/ (null,_runs,_style);
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="sv.ScrollViewContentHeight = Max(sv.Height - 2dip";
_sv.setScrollViewContentHeight(__c.Max(_sv.getHeight()-__c.DipToCurrent((int) (2)),_par.Style /*ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop()+_par.Style /*ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getBottom()+_par.Height /*int*/ /(double)__ref._mscale /*float*/ ));
RDebugUtils.currentLine=5242883;
 //BA.debugLineNum = 5242883;BA.debugLine="Dim MaxHeight As Int";
_maxheight = 0;
RDebugUtils.currentLine=5242884;
 //BA.debugLineNum = 5242884;BA.debugLine="For Each line As BCTextLine In par.TextLines";
{
final anywheresoftware.b4a.BA.IterableList group4 = _par.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_line = (ir.abalfazl.hero.zip.grabber.bctextengine._bctextline)(group4.Get(index4));
RDebugUtils.currentLine=5242885;
 //BA.debugLineNum = 5242885;BA.debugLine="MaxHeight = Max(MaxHeight, line.MaxHeightAboveBa";
_maxheight = (int) (__c.Max(_maxheight,_line.MaxHeightAboveBaseLine /*int*/ +_line.MaxHeightBelowBaseLine /*int*/ ));
 }
};
RDebugUtils.currentLine=5242887;
 //BA.debugLineNum = 5242887;BA.debugLine="ResizeLayers(par.Width / mScale, MaxHeight / mSca";
__ref._resizelayers /*String*/ (null,(int) (_par.Width /*int*/ /(double)__ref._mscale /*float*/ ),(int) (_maxheight/(double)__ref._mscale /*float*/ ));
RDebugUtils.currentLine=5242888;
 //BA.debugLineNum = 5242888;BA.debugLine="AddParagraphViews(par)";
__ref._addparagraphviews /*String*/ (null,_par);
RDebugUtils.currentLine=5242889;
 //BA.debugLineNum = 5242889;BA.debugLine="Return par";
if (true) return _par;
RDebugUtils.currentLine=5242890;
 //BA.debugLineNum = 5242890;BA.debugLine="End Sub";
return null;
}
public ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraph  _drawtext(ir.abalfazl.hero.zip.grabber.bctextengine __ref,anywheresoftware.b4a.objects.collections.List _runs,ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraphstyle _style,anywheresoftware.b4a.objects.B4XViewWrapper _foregroundimageview,anywheresoftware.b4a.objects.B4XViewWrapper _sv) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "drawtext", true))
	 {return ((ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraph) Debug.delegate(ba, "drawtext", new Object[] {_runs,_style,_foregroundimageview,_sv}));}
ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraph _par = null;
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Public Sub DrawText (Runs As List, Style As BCPara";
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="Dim par As BCParagraph = Prepare(Runs, Style)";
_par = __ref._prepare /*ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraph*/ (null,_runs,_style);
RDebugUtils.currentLine=5308420;
 //BA.debugLineNum = 5308420;BA.debugLine="ResizeLayers(par.Width / mScale, par.Height / mSc";
__ref._resizelayers /*String*/ (null,(int) (_par.Width /*int*/ /(double)__ref._mscale /*float*/ ),(int) (_par.Height /*int*/ /(double)__ref._mscale /*float*/ ));
RDebugUtils.currentLine=5308421;
 //BA.debugLineNum = 5308421;BA.debugLine="DrawParagraph(par)";
__ref._drawparagraph /*String*/ (null,_par);
RDebugUtils.currentLine=5308422;
 //BA.debugLineNum = 5308422;BA.debugLine="If par.Width > 0 And par.Height > 0 Then";
if (_par.Width /*int*/ >0 && _par.Height /*int*/ >0) { 
RDebugUtils.currentLine=5308423;
 //BA.debugLineNum = 5308423;BA.debugLine="ResizeImageView(ForegroundBC, par, ForegroundIma";
__ref._resizeimageview /*String*/ (null,__ref._foregroundbc /*b4j.example.bitmapcreator*/ ,_par,_foregroundimageview,_par.Style /*ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraphstyle*/ .ResizeHeightAutomatically /*boolean*/ );
 };
RDebugUtils.currentLine=5308425;
 //BA.debugLineNum = 5308425;BA.debugLine="If par.Style.ResizeHeightAutomatically And sv.IsI";
if (_par.Style /*ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraphstyle*/ .ResizeHeightAutomatically /*boolean*/  && _sv.IsInitialized()) { 
RDebugUtils.currentLine=5308426;
 //BA.debugLineNum = 5308426;BA.debugLine="sv.ScrollViewContentHeight = Max(sv.Height - 2di";
_sv.setScrollViewContentHeight(__c.Max(_sv.getHeight()-__c.DipToCurrent((int) (2)),_foregroundimageview.getHeight()+_par.Style /*ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop()+_par.Style /*ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getBottom()));
 };
RDebugUtils.currentLine=5308428;
 //BA.debugLineNum = 5308428;BA.debugLine="AddParagraphViews(par)";
__ref._addparagraphviews /*String*/ (null,_par);
RDebugUtils.currentLine=5308429;
 //BA.debugLineNum = 5308429;BA.debugLine="Return par";
if (true) return _par;
RDebugUtils.currentLine=5308430;
 //BA.debugLineNum = 5308430;BA.debugLine="End Sub";
return null;
}
public String  _addltritems(ir.abalfazl.hero.zip.grabber.bctextengine __ref,anywheresoftware.b4a.objects.collections.List _ltrlist,anywheresoftware.b4a.objects.collections.List _newlist) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "addltritems", true))
	 {return ((String) Debug.delegate(ba, "addltritems", new Object[] {_ltrlist,_newlist}));}
int _startindex = 0;
int _lastindex = 0;
ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext _lastun = null;
ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext _prev = null;
int _i = 0;
ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext _un = null;
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Private Sub AddLTRItems (LTRList As List, NewList";
RDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="If LTRList.Size = 0 Then Return";
if (_ltrlist.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="NewList.AddAll(LTRList)";
_newlist.AddAll(_ltrlist);
RDebugUtils.currentLine=5636099;
 //BA.debugLineNum = 5636099;BA.debugLine="If LTRList.Size > 1 Then";
if (_ltrlist.getSize()>1) { 
RDebugUtils.currentLine=5636100;
 //BA.debugLineNum = 5636100;BA.debugLine="Dim StartIndex As Int = 1";
_startindex = (int) (1);
RDebugUtils.currentLine=5636101;
 //BA.debugLineNum = 5636101;BA.debugLine="If IsUNSeparator(LTRList.Get(0)) Then";
if (__ref._isunseparator /*boolean*/ (null,(ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext)(_ltrlist.Get((int) (0))))) { 
RDebugUtils.currentLine=5636102;
 //BA.debugLineNum = 5636102;BA.debugLine="StartIndex = 2";
_startindex = (int) (2);
 };
RDebugUtils.currentLine=5636104;
 //BA.debugLineNum = 5636104;BA.debugLine="Dim LastIndex As Int = LTRList.Size - 1";
_lastindex = (int) (_ltrlist.getSize()-1);
RDebugUtils.currentLine=5636105;
 //BA.debugLineNum = 5636105;BA.debugLine="If LastIndex > StartIndex Then";
if (_lastindex>_startindex) { 
RDebugUtils.currentLine=5636106;
 //BA.debugLineNum = 5636106;BA.debugLine="If IsUNSeparator(LTRList.Get(LastIndex)) Then";
if (__ref._isunseparator /*boolean*/ (null,(ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext)(_ltrlist.Get(_lastindex)))) { 
RDebugUtils.currentLine=5636107;
 //BA.debugLineNum = 5636107;BA.debugLine="LastIndex = LastIndex - 1";
_lastindex = (int) (_lastindex-1);
 };
 };
RDebugUtils.currentLine=5636110;
 //BA.debugLineNum = 5636110;BA.debugLine="If LastIndex > StartIndex Then";
if (_lastindex>_startindex) { 
RDebugUtils.currentLine=5636111;
 //BA.debugLineNum = 5636111;BA.debugLine="Dim lastun As BCUnbreakableText = LTRList.Get(L";
_lastun = (ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext)(_ltrlist.Get(_lastindex));
RDebugUtils.currentLine=5636112;
 //BA.debugLineNum = 5636112;BA.debugLine="Dim prev As BCUnbreakableText = LTRList.Get(Sta";
_prev = (ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext)(_ltrlist.Get((int) (_startindex-1)));
RDebugUtils.currentLine=5636113;
 //BA.debugLineNum = 5636113;BA.debugLine="prev.StartX = lastun.StartX";
_prev.StartX /*int*/  = _lastun.StartX /*int*/ ;
RDebugUtils.currentLine=5636114;
 //BA.debugLineNum = 5636114;BA.debugLine="For i = StartIndex To LastIndex";
{
final int step18 = 1;
final int limit18 = _lastindex;
_i = _startindex ;
for (;_i <= limit18 ;_i = _i + step18 ) {
RDebugUtils.currentLine=5636115;
 //BA.debugLineNum = 5636115;BA.debugLine="Dim un As BCUnbreakableText = LTRList.Get(i)";
_un = (ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext)(_ltrlist.Get(_i));
RDebugUtils.currentLine=5636116;
 //BA.debugLineNum = 5636116;BA.debugLine="un.StartX = prev.StartX + prev.Width + mSpaceB";
_un.StartX /*int*/  = (int) (_prev.StartX /*int*/ +_prev.Width /*int*/ +__ref._mspacebetweencharacters /*float*/ );
RDebugUtils.currentLine=5636117;
 //BA.debugLineNum = 5636117;BA.debugLine="prev = un";
_prev = _un;
 }
};
 };
 };
RDebugUtils.currentLine=5636121;
 //BA.debugLineNum = 5636121;BA.debugLine="LTRList.Clear";
_ltrlist.Clear();
RDebugUtils.currentLine=5636122;
 //BA.debugLineNum = 5636122;BA.debugLine="End Sub";
return "";
}
public boolean  _isunseparator(ir.abalfazl.hero.zip.grabber.bctextengine __ref,ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext _un) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "isunseparator", true))
	 {return ((Boolean) Debug.delegate(ba, "isunseparator", new Object[] {_un}));}
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Private Sub IsUNSeparator (un As BCUnbreakableText";
RDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="If un.NotFullTextChars.Length = 0 Then Return Fal";
if (_un.NotFullTextChars /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars*/ .Length /*int*/ ==0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="Return WordBoundaries.Contains(un.NotFullTextChar";
if (true) return __ref._wordboundaries /*String*/ .contains(_un.NotFullTextChars /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars*/ .Buffer /*String[]*/ [_un.NotFullTextChars /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars*/ .StartIndex /*int*/ ]);
RDebugUtils.currentLine=5701635;
 //BA.debugLineNum = 5701635;BA.debugLine="End Sub";
return false;
}
public String  _addparagraphviews(ir.abalfazl.hero.zip.grabber.bctextengine __ref,ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraph _par) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "addparagraphviews", true))
	 {return ((String) Debug.delegate(ba, "addparagraphviews", new Object[] {_par}));}
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Public Sub AddParagraphViews (par As BCParagraph)";
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="If par.Views.IsInitialized Then";
if (_par.Views /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()) { 
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="For Each v As B4XView In par.Views";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group2 = _par.Views /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group2.Get(index2)));
RDebugUtils.currentLine=5373955;
 //BA.debugLineNum = 5373955;BA.debugLine="v.SetLayoutAnimated(0, par.Style.Padding.Left +";
_v.SetLayoutAnimated((int) (0),_par.Style /*ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft()+_v.getLeft(),_par.Style /*ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop()+_v.getTop(),_v.getWidth(),_v.getHeight());
 }
};
 };
RDebugUtils.currentLine=5373958;
 //BA.debugLineNum = 5373958;BA.debugLine="End Sub";
return "";
}
public int  _bytestoint(ir.abalfazl.hero.zip.grabber.bctextengine __ref,byte[] _bytes,int _startindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "bytestoint", true))
	 {return ((Integer) Debug.delegate(ba, "bytestoint", new Object[] {_bytes,_startindex}));}
int _cp = 0;
int _i = 0;
RDebugUtils.currentLine=7602176;
 //BA.debugLineNum = 7602176;BA.debugLine="Private Sub BytesToInt (Bytes() As Byte, StartInde";
RDebugUtils.currentLine=7602177;
 //BA.debugLineNum = 7602177;BA.debugLine="Dim cp As Int";
_cp = 0;
RDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="For i = 0 To 3";
{
final int step2 = 1;
final int limit2 = (int) (3);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=7602179;
 //BA.debugLineNum = 7602179;BA.debugLine="cp = Bit.Or(cp, Bit.ShiftLeft(Bit.And(0xff, Byte";
_cp = __c.Bit.Or(_cp,__c.Bit.ShiftLeft(__c.Bit.And(((int)0xff),(int) (_bytes[(int) (_i+_startindex)])),(int) (8*_i)));
 }
};
RDebugUtils.currentLine=7602181;
 //BA.debugLineNum = 7602181;BA.debugLine="Return cp";
if (true) return _cp;
RDebugUtils.currentLine=7602182;
 //BA.debugLineNum = 7602182;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals(ir.abalfazl.hero.zip.grabber.bctextengine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="Public cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="Type BCFontMetrics (Glyphs As Map, DefaultColorMe";
;
RDebugUtils.currentLine=4784133;
 //BA.debugLineNum = 4784133;BA.debugLine="Type BCTextChars (Buffer() As String, StartIndex";
;
RDebugUtils.currentLine=4784135;
 //BA.debugLineNum = 4784135;BA.debugLine="Type BCParagraphStyle (HorizontalAlignment As Str";
;
RDebugUtils.currentLine=4784136;
 //BA.debugLineNum = 4784136;BA.debugLine="Type BCTextRun (TextFont As B4XFont, TextColor As";
;
RDebugUtils.currentLine=4784139;
 //BA.debugLineNum = 4784139;BA.debugLine="Type BCConnectedRuns (ConnectedWidth As Int, Runs";
;
RDebugUtils.currentLine=4784140;
 //BA.debugLineNum = 4784140;BA.debugLine="Type BCStyledUnderline (Clr As Int, Style As Stri";
;
RDebugUtils.currentLine=4784141;
 //BA.debugLineNum = 4784141;BA.debugLine="Public const EXTRA_CONNECTEDRUNS = \"ConnectedRuns";
_extra_connectedruns = "ConnectedRuns";
_extra_styledunderline = "StyledUnderline";
RDebugUtils.currentLine=4784144;
 //BA.debugLineNum = 4784144;BA.debugLine="Type BCParagraph (TextLines As List, CurrentLine";
;
RDebugUtils.currentLine=4784147;
 //BA.debugLineNum = 4784147;BA.debugLine="Type BCTextLine (StartX As Int, BaselineY As Int,";
;
RDebugUtils.currentLine=4784149;
 //BA.debugLineNum = 4784149;BA.debugLine="Type BCUnbreakableText (Width As Int, StartX As I";
;
RDebugUtils.currentLine=4784151;
 //BA.debugLineNum = 4784151;BA.debugLine="Type BCSingleStyleSection (AbsoluteStartX As Int,";
;
RDebugUtils.currentLine=4784153;
 //BA.debugLineNum = 4784153;BA.debugLine="Type BCGlyphAndOffset (Glyph As BCGlyph, SpaceBet";
;
RDebugUtils.currentLine=4784154;
 //BA.debugLineNum = 4784154;BA.debugLine="Type BCGlyph (cbc As CompressedBC, baseline As In";
;
RDebugUtils.currentLine=4784155;
 //BA.debugLineNum = 4784155;BA.debugLine="Private CharBC As BitmapCreator";
_charbc = new b4j.example.bitmapcreator();
RDebugUtils.currentLine=4784156;
 //BA.debugLineNum = 4784156;BA.debugLine="Private cbccache As InternalCompressedBCCache";
_cbccache = new b4j.example.bitmapcreator._internalcompressedbccache();
RDebugUtils.currentLine=4784157;
 //BA.debugLineNum = 4784157;BA.debugLine="Public DefaultUnderlineStyle As BCStyledUnderline";
_defaultunderlinestyle = new ir.abalfazl.hero.zip.grabber.bctextengine._bcstyledunderline();
RDebugUtils.currentLine=4784158;
 //BA.debugLineNum = 4784158;BA.debugLine="Public mScale As Float = 1";
_mscale = (float) (1);
RDebugUtils.currentLine=4784159;
 //BA.debugLineNum = 4784159;BA.debugLine="Private mSpaceBetweenCharacters As Float";
_mspacebetweencharacters = 0f;
RDebugUtils.currentLine=4784160;
 //BA.debugLineNum = 4784160;BA.debugLine="Private mSpaceBetweenLines As Int";
_mspacebetweenlines = 0;
RDebugUtils.currentLine=4784161;
 //BA.debugLineNum = 4784161;BA.debugLine="Private FontMetricsCache As Map";
_fontmetricscache = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4784162;
 //BA.debugLineNum = 4784162;BA.debugLine="Private ForegroundBC, BackgroundBC As BitmapCreat";
_foregroundbc = new b4j.example.bitmapcreator();
_backgroundbc = new b4j.example.bitmapcreator();
RDebugUtils.currentLine=4784163;
 //BA.debugLineNum = 4784163;BA.debugLine="Public DefaultColor As Int = xui.Color_Black";
_defaultcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=4784164;
 //BA.debugLineNum = 4784164;BA.debugLine="Public WordBoundaries As String = \"&*+-/.<>=\\' ,:";
_wordboundaries = "&*+-/.<>=\\' ,:{}"+__c.TAB+__c.CRLF+BA.ObjectToString(__c.Chr((int) (13)));
RDebugUtils.currentLine=4784165;
 //BA.debugLineNum = 4784165;BA.debugLine="Public WordBoundariesThatCanConnectToPrevWord As";
_wordboundariesthatcanconnecttoprevword = ".,:";
RDebugUtils.currentLine=4784166;
 //BA.debugLineNum = 4784166;BA.debugLine="Private Brushes As Map";
_brushes = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4784167;
 //BA.debugLineNum = 4784167;BA.debugLine="Public DefaultStyle As BCParagraphStyle";
_defaultstyle = new ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraphstyle();
RDebugUtils.currentLine=4784168;
 //BA.debugLineNum = 4784168;BA.debugLine="Public DefaultFont As B4XFont";
_defaultfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=4784169;
 //BA.debugLineNum = 4784169;BA.debugLine="Private mMinGapBetweenLines As Int = 5dip";
_mmingapbetweenlines = __c.DipToCurrent((int) (5));
RDebugUtils.currentLine=4784173;
 //BA.debugLineNum = 4784173;BA.debugLine="Private WritableImage As JavaObject";
_writableimage = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=4784174;
 //BA.debugLineNum = 4784174;BA.debugLine="Private sp As JavaObject";
_sp = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=4784176;
 //BA.debugLineNum = 4784176;BA.debugLine="Private const TabWidthMeasuredInX As Int = 4";
_tabwidthmeasuredinx = (int) (4);
RDebugUtils.currentLine=4784177;
 //BA.debugLineNum = 4784177;BA.debugLine="Public TagParser As BBCodeParser";
_tagparser = new ir.abalfazl.hero.zip.grabber.bbcodeparser();
RDebugUtils.currentLine=4784178;
 //BA.debugLineNum = 4784178;BA.debugLine="Private EmptyTextChars As BCTextChars";
_emptytextchars = new ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars();
RDebugUtils.currentLine=4784179;
 //BA.debugLineNum = 4784179;BA.debugLine="Private Emojis As B4XSet";
_emojis = new ir.abalfazl.hero.zip.grabber.b4xset();
RDebugUtils.currentLine=4784180;
 //BA.debugLineNum = 4784180;BA.debugLine="Public const Charset As String = \"UTF-32LE\"";
_charset = "UTF-32LE";
RDebugUtils.currentLine=4784181;
 //BA.debugLineNum = 4784181;BA.debugLine="Public LookForComplexCharacters As Boolean = True";
_lookforcomplexcharacters = __c.True;
RDebugUtils.currentLine=4784182;
 //BA.debugLineNum = 4784182;BA.debugLine="Public CustomFonts As Map";
_customfonts = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4784183;
 //BA.debugLineNum = 4784183;BA.debugLine="Public KerningEnabled As Boolean = True";
_kerningenabled = __c.True;
RDebugUtils.currentLine=4784184;
 //BA.debugLineNum = 4784184;BA.debugLine="Private IndentWidth As Int";
_indentwidth = 0;
RDebugUtils.currentLine=4784185;
 //BA.debugLineNum = 4784185;BA.debugLine="Public VowelsCodePoints As B4XSet";
_vowelscodepoints = new ir.abalfazl.hero.zip.grabber.b4xset();
RDebugUtils.currentLine=4784186;
 //BA.debugLineNum = 4784186;BA.debugLine="Private AsyncBCs As B4XOrderedMap";
_asyncbcs = new ir.abalfazl.hero.zip.grabber.b4xorderedmap();
RDebugUtils.currentLine=4784187;
 //BA.debugLineNum = 4784187;BA.debugLine="Private AsyncBC As BitmapCreator";
_asyncbc = new b4j.example.bitmapcreator();
RDebugUtils.currentLine=4784188;
 //BA.debugLineNum = 4784188;BA.debugLine="Private AsyncTasks As List";
_asynctasks = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4784189;
 //BA.debugLineNum = 4784189;BA.debugLine="Private AsyncMode As Boolean";
_asyncmode = false;
RDebugUtils.currentLine=4784190;
 //BA.debugLineNum = 4784190;BA.debugLine="Private RTLChars As B4XSet";
_rtlchars = new ir.abalfazl.hero.zip.grabber.b4xset();
RDebugUtils.currentLine=4784191;
 //BA.debugLineNum = 4784191;BA.debugLine="Public Const TextDirectionLTR = 1, TextDirectionU";
_textdirectionltr = (int) (1);
_textdirectionunknown = (int) (0);
_textdirectionrtl = (int) (-1);
RDebugUtils.currentLine=4784192;
 //BA.debugLineNum = 4784192;BA.debugLine="Private ArabicMap As Map";
_arabicmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4784193;
 //BA.debugLineNum = 4784193;BA.debugLine="Private ArabicNonLinkedLetters As B4XSet";
_arabicnonlinkedletters = new ir.abalfazl.hero.zip.grabber.b4xset();
RDebugUtils.currentLine=4784194;
 //BA.debugLineNum = 4784194;BA.debugLine="Private ArabicCharsConnectedPrev As B4XSet";
_arabiccharsconnectedprev = new ir.abalfazl.hero.zip.grabber.b4xset();
RDebugUtils.currentLine=4784195;
 //BA.debugLineNum = 4784195;BA.debugLine="Private PMDefaultColor As PremultipliedColor";
_pmdefaultcolor = new b4j.example.bitmapcreator._premultipliedcolor();
RDebugUtils.currentLine=4784196;
 //BA.debugLineNum = 4784196;BA.debugLine="Public RTLAware As Boolean";
_rtlaware = false;
RDebugUtils.currentLine=4784197;
 //BA.debugLineNum = 4784197;BA.debugLine="End Sub";
return "";
}
public String  _preprocessarabic(ir.abalfazl.hero.zip.grabber.bctextengine __ref,String[] _chars,int _length) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "preprocessarabic", true))
	 {return ((String) Debug.delegate(ba, "preprocessarabic", new Object[] {_chars,_length}));}
b4j.example.bitmapcreator._argbcolor _a = null;
String _line = "";
String[] _split = null;
ir.abalfazl.hero.zip.grabber.b4xbitset _arabicchars = null;
ir.abalfazl.hero.zip.grabber.b4xbitset _arabicnonlinked = null;
boolean _found = false;
int _i = 0;
boolean _connecttoprev = false;
boolean _connecttonext = false;
int _offset = 0;
int _targetcp = 0;
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Public Sub PreprocessArabic(chars() As String, Len";
RDebugUtils.currentLine=8585217;
 //BA.debugLineNum = 8585217;BA.debugLine="If ArabicMap.IsInitialized = False Then";
if (__ref._arabicmap /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=8585218;
 //BA.debugLineNum = 8585218;BA.debugLine="ArabicMap.Initialize";
__ref._arabicmap /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=8585219;
 //BA.debugLineNum = 8585219;BA.debugLine="ArabicNonLinkedLetters.Initialize";
__ref._arabicnonlinkedletters /*ir.abalfazl.hero.zip.grabber.b4xset*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=8585220;
 //BA.debugLineNum = 8585220;BA.debugLine="ArabicCharsConnectedPrev.Initialize";
__ref._arabiccharsconnectedprev /*ir.abalfazl.hero.zip.grabber.b4xset*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=8585221;
 //BA.debugLineNum = 8585221;BA.debugLine="Dim a As ARGBColor";
_a = new b4j.example.bitmapcreator._argbcolor();
RDebugUtils.currentLine=8585222;
 //BA.debugLineNum = 8585222;BA.debugLine="CharBC.ColorToARGB(DefaultColor, a)";
__ref._charbc /*b4j.example.bitmapcreator*/ ._colortoargb(__ref._defaultcolor /*int*/ ,_a);
RDebugUtils.currentLine=8585223;
 //BA.debugLineNum = 8585223;BA.debugLine="CharBC.ARGBToPremultipliedColor(a, PMDefaultColo";
__ref._charbc /*b4j.example.bitmapcreator*/ ._argbtopremultipliedcolor(_a,__ref._pmdefaultcolor /*b4j.example.bitmapcreator._premultipliedcolor*/ );
RDebugUtils.currentLine=8585224;
 //BA.debugLineNum = 8585224;BA.debugLine="For Each line As String In File.ReadList(File.Di";
{
final anywheresoftware.b4a.BA.IterableList group8 = __c.File.ReadList(__c.File.getDirAssets(),"arabic_mapping.txt");
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_line = BA.ObjectToString(group8.Get(index8));
RDebugUtils.currentLine=8585225;
 //BA.debugLineNum = 8585225;BA.debugLine="Dim split() As String = Regex.Split(\",\", line)";
_split = __c.Regex.Split(",",_line);
RDebugUtils.currentLine=8585226;
 //BA.debugLineNum = 8585226;BA.debugLine="ArabicMap.Put(Chr(Bit.ParseInt(split(0), 16)).A";
__ref._arabicmap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)((BA.ObjectToString(__c.Chr(__c.Bit.ParseInt(_split[(int) (0)],(int) (16)))))),(Object)(__c.Bit.ParseInt(_split[(int) (1)],(int) (16))));
RDebugUtils.currentLine=8585227;
 //BA.debugLineNum = 8585227;BA.debugLine="If 2 = split(2) Then";
if (2==(double)(Double.parseDouble(_split[(int) (2)]))) { 
RDebugUtils.currentLine=8585228;
 //BA.debugLineNum = 8585228;BA.debugLine="ArabicNonLinkedLetters.Add(Chr(Bit.ParseInt(sp";
__ref._arabicnonlinkedletters /*ir.abalfazl.hero.zip.grabber.b4xset*/ ._add /*String*/ (null,(Object)((BA.ObjectToString(__c.Chr(__c.Bit.ParseInt(_split[(int) (0)],(int) (16)))))));
 };
 }
};
 };
RDebugUtils.currentLine=8585232;
 //BA.debugLineNum = 8585232;BA.debugLine="Dim ArabicChars, ArabicNonLinked As B4XBitSet";
_arabicchars = new ir.abalfazl.hero.zip.grabber.b4xbitset();
_arabicnonlinked = new ir.abalfazl.hero.zip.grabber.b4xbitset();
RDebugUtils.currentLine=8585233;
 //BA.debugLineNum = 8585233;BA.debugLine="Dim Found As Boolean";
_found = false;
RDebugUtils.currentLine=8585234;
 //BA.debugLineNum = 8585234;BA.debugLine="For i = 0 To Length - 1";
{
final int step18 = 1;
final int limit18 = (int) (_length-1);
_i = (int) (0) ;
for (;_i <= limit18 ;_i = _i + step18 ) {
RDebugUtils.currentLine=8585235;
 //BA.debugLineNum = 8585235;BA.debugLine="If ArabicMap.ContainsKey(chars(i)) Then";
if (__ref._arabicmap /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_chars[_i]))) { 
RDebugUtils.currentLine=8585236;
 //BA.debugLineNum = 8585236;BA.debugLine="If Found = False Then";
if (_found==__c.False) { 
RDebugUtils.currentLine=8585237;
 //BA.debugLineNum = 8585237;BA.debugLine="Found = True";
_found = __c.True;
RDebugUtils.currentLine=8585238;
 //BA.debugLineNum = 8585238;BA.debugLine="ArabicChars.Initialize(Length)";
_arabicchars._initialize /*String*/ (null,ba,_length);
RDebugUtils.currentLine=8585239;
 //BA.debugLineNum = 8585239;BA.debugLine="ArabicNonLinked.Initialize(Length)";
_arabicnonlinked._initialize /*String*/ (null,ba,_length);
 };
RDebugUtils.currentLine=8585241;
 //BA.debugLineNum = 8585241;BA.debugLine="ArabicChars.Set(i, True)";
_arabicchars._set /*String*/ (null,_i,__c.True);
RDebugUtils.currentLine=8585242;
 //BA.debugLineNum = 8585242;BA.debugLine="If ArabicNonLinkedLetters.Contains(chars(i)) Th";
if (__ref._arabicnonlinkedletters /*ir.abalfazl.hero.zip.grabber.b4xset*/ ._contains /*boolean*/ (null,(Object)(_chars[_i]))) { 
RDebugUtils.currentLine=8585243;
 //BA.debugLineNum = 8585243;BA.debugLine="ArabicNonLinked.Set(i, True)";
_arabicnonlinked._set /*String*/ (null,_i,__c.True);
 };
 };
 }
};
RDebugUtils.currentLine=8585247;
 //BA.debugLineNum = 8585247;BA.debugLine="If Found = False Then Return";
if (_found==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=8585248;
 //BA.debugLineNum = 8585248;BA.debugLine="For i = 0 To Length - 1";
{
final int step32 = 1;
final int limit32 = (int) (_length-1);
_i = (int) (0) ;
for (;_i <= limit32 ;_i = _i + step32 ) {
RDebugUtils.currentLine=8585249;
 //BA.debugLineNum = 8585249;BA.debugLine="If ArabicChars.Get(i) Then";
if (_arabicchars._get /*boolean*/ (null,_i)) { 
RDebugUtils.currentLine=8585250;
 //BA.debugLineNum = 8585250;BA.debugLine="Dim ConnectToPrev As Boolean = i > 0 And Arabic";
_connecttoprev = _i>0 && _arabicchars._get /*boolean*/ (null,(int) (_i-1)) && _arabicnonlinked._get /*boolean*/ (null,(int) (_i-1))==__c.False;
RDebugUtils.currentLine=8585251;
 //BA.debugLineNum = 8585251;BA.debugLine="Dim ConnectToNext As Boolean = i < Length - 1 A";
_connecttonext = _i<_length-1 && _arabicchars._get /*boolean*/ (null,(int) (_i+1)) && _arabicnonlinked._get /*boolean*/ (null,_i)==__c.False;
RDebugUtils.currentLine=8585252;
 //BA.debugLineNum = 8585252;BA.debugLine="If ConnectToNext = False And ConnectToPrev = Fa";
if (_connecttonext==__c.False && _connecttoprev==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=8585253;
 //BA.debugLineNum = 8585253;BA.debugLine="Dim offset As Int = IIf(ConnectToPrev And Conne";
_offset = (int)(BA.ObjectToNumber(((_connecttoprev && _connecttonext) ? ((Object)(3)) : (((_connecttoprev) ? ((Object)(1)) : ((Object)(2)))))));
RDebugUtils.currentLine=8585254;
 //BA.debugLineNum = 8585254;BA.debugLine="Dim TargetCP As Int = ArabicMap.Get(chars(i)) +";
_targetcp = (int) ((double)(BA.ObjectToNumber(__ref._arabicmap /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_chars[_i]))))+_offset);
RDebugUtils.currentLine=8585255;
 //BA.debugLineNum = 8585255;BA.debugLine="chars(i) = Chr(TargetCP)";
_chars[_i] = BA.ObjectToString(__c.Chr(_targetcp));
RDebugUtils.currentLine=8585256;
 //BA.debugLineNum = 8585256;BA.debugLine="If ConnectToPrev Then ArabicCharsConnectedPrev.";
if (_connecttoprev) { 
__ref._arabiccharsconnectedprev /*ir.abalfazl.hero.zip.grabber.b4xset*/ ._add /*String*/ (null,(Object)(_chars[_i]));};
 };
 }
};
RDebugUtils.currentLine=8585260;
 //BA.debugLineNum = 8585260;BA.debugLine="End Sub";
return "";
}
public ir.abalfazl.hero.zip.grabber.bctextengine._bcglyph  _createglyph(ir.abalfazl.hero.zip.grabber.bctextengine __ref,String _c,ir.abalfazl.hero.zip.grabber.bctextengine._bcfontmetrics _fontmetrics,boolean _justmeasure) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createglyph", true))
	 {return ((ir.abalfazl.hero.zip.grabber.bctextengine._bcglyph) Debug.delegate(ba, "createglyph", new Object[] {_c,_fontmetrics,_justmeasure}));}
ir.abalfazl.hero.zip.grabber.bctextengine._bcglyph _g = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _baseline = 0;
int _leftoffset = 0;
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r2 = null;
b4j.example.bitmapcreator._compressedbc _cbc = null;
RDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Private Sub CreateGlyph (c As String, FontMetrics";
RDebugUtils.currentLine=7471105;
 //BA.debugLineNum = 7471105;BA.debugLine="Dim g As BCGlyph = FontMetrics.Glyphs.Get(c)";
_g = (ir.abalfazl.hero.zip.grabber.bctextengine._bcglyph)(_fontmetrics.Glyphs /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_c)));
RDebugUtils.currentLine=7471106;
 //BA.debugLineNum = 7471106;BA.debugLine="If g <> Null Then Return g";
if (_g!= null) { 
if (true) return _g;};
RDebugUtils.currentLine=7471107;
 //BA.debugLineNum = 7471107;BA.debugLine="If FontMetrics.clr <> DefaultColor Then";
if (_fontmetrics.Clr /*int*/ !=__ref._defaultcolor /*int*/ ) { 
RDebugUtils.currentLine=7471108;
 //BA.debugLineNum = 7471108;BA.debugLine="Return CreateGlyphFromDefaultColor(c, FontMetric";
if (true) return __ref._createglyphfromdefaultcolor /*ir.abalfazl.hero.zip.grabber.bctextengine._bcglyph*/ (null,_c,_fontmetrics.DefaultColorMetrics /*ir.abalfazl.hero.zip.grabber.bctextengine._bcfontmetrics*/ ,_fontmetrics.Clr /*int*/ );
 }else {
RDebugUtils.currentLine=7471110;
 //BA.debugLineNum = 7471110;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=7471111;
 //BA.debugLineNum = 7471111;BA.debugLine="Dim r As B4XRect = cvs.MeasureText(c, FontMetric";
_r = __ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(_c,_fontmetrics.Fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=7471112;
 //BA.debugLineNum = 7471112;BA.debugLine="Dim BaseLine As Int = -r.Top + 5";
_baseline = (int) (-_r.getTop()+5);
RDebugUtils.currentLine=7471113;
 //BA.debugLineNum = 7471113;BA.debugLine="r.Left = r.Left * mScale";
_r.setLeft((float) (_r.getLeft()*__ref._mscale /*float*/ ));
RDebugUtils.currentLine=7471114;
 //BA.debugLineNum = 7471114;BA.debugLine="r.Top = r.Top * mScale";
_r.setTop((float) (_r.getTop()*__ref._mscale /*float*/ ));
RDebugUtils.currentLine=7471115;
 //BA.debugLineNum = 7471115;BA.debugLine="r.Right = r.Right * mScale";
_r.setRight((float) (_r.getRight()*__ref._mscale /*float*/ ));
RDebugUtils.currentLine=7471116;
 //BA.debugLineNum = 7471116;BA.debugLine="r.Bottom = r.Bottom * mScale";
_r.setBottom((float) (_r.getBottom()*__ref._mscale /*float*/ ));
RDebugUtils.currentLine=7471117;
 //BA.debugLineNum = 7471117;BA.debugLine="If CharBC.mWidth < r.Width + 20 * mScale Or Char";
if (__ref._charbc /*b4j.example.bitmapcreator*/ ._mwidth<_r.getWidth()+20*__ref._mscale /*float*/  || __ref._charbc /*b4j.example.bitmapcreator*/ ._mheight<_r.getHeight()+20*__ref._mscale /*float*/ ) { 
RDebugUtils.currentLine=7471118;
 //BA.debugLineNum = 7471118;BA.debugLine="ResizeCharBC(r.Width + 30 * mScale, r.Height +";
__ref._resizecharbc /*String*/ (null,(int) (_r.getWidth()+30*__ref._mscale /*float*/ ),(int) (_r.getHeight()+30*__ref._mscale /*float*/ ));
 };
RDebugUtils.currentLine=7471121;
 //BA.debugLineNum = 7471121;BA.debugLine="Dim leftOffset As Int = 5";
_leftoffset = (int) (5);
RDebugUtils.currentLine=7471122;
 //BA.debugLineNum = 7471122;BA.debugLine="cvs.DrawText(c, leftOffset, BaseLine, FontMetric";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawText(_c,_leftoffset,_baseline,_fontmetrics.Fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_fontmetrics.Clr /*int*/ ,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"LEFT"));
RDebugUtils.currentLine=7471126;
 //BA.debugLineNum = 7471126;BA.debugLine="Dim jo As JavaObject = cvs";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ ));
RDebugUtils.currentLine=7471127;
 //BA.debugLineNum = 7471127;BA.debugLine="Dim bmp As B4XBitmap = jo.GetFieldJO(\"cvs\").RunM";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (javafx.scene.image.Image)(_jo.GetFieldJO("cvs").RunMethodJO("getObject",(Object[])(__c.Null)).RunMethod("snapshot",new Object[]{(Object)(__ref._sp /*anywheresoftware.b4j.object.JavaObject*/ .getObject()),(Object)(__ref._writableimage /*anywheresoftware.b4j.object.JavaObject*/ .getObject())})));
RDebugUtils.currentLine=7471135;
 //BA.debugLineNum = 7471135;BA.debugLine="CharBC.CopyPixelsFromBitmap(bmp)";
__ref._charbc /*b4j.example.bitmapcreator*/ ._copypixelsfrombitmap(_bmp);
RDebugUtils.currentLine=7471136;
 //BA.debugLineNum = 7471136;BA.debugLine="Dim r2 As B4XRect = FindMinRect(leftOffset + r.R";
_r2 = __ref._findminrect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ (null,(int) (_leftoffset+_r.getRight()+20*__ref._mscale /*float*/ ),(int) (_r.getHeight()+20*__ref._mscale /*float*/ ));
RDebugUtils.currentLine=7471138;
 //BA.debugLineNum = 7471138;BA.debugLine="Dim g As BCGlyph";
_g = new ir.abalfazl.hero.zip.grabber.bctextengine._bcglyph();
RDebugUtils.currentLine=7471139;
 //BA.debugLineNum = 7471139;BA.debugLine="g.Initialize";
_g.Initialize();
RDebugUtils.currentLine=7471140;
 //BA.debugLineNum = 7471140;BA.debugLine="g.baseline = BaseLine * mScale - r2.Top";
_g.baseline /*int*/  = (int) (_baseline*__ref._mscale /*float*/ -_r2.getTop());
RDebugUtils.currentLine=7471141;
 //BA.debugLineNum = 7471141;BA.debugLine="If r2.Width > 0 Then";
if (_r2.getWidth()>0) { 
RDebugUtils.currentLine=7471142;
 //BA.debugLineNum = 7471142;BA.debugLine="r2.Left = Floor(r2.Left)";
_r2.setLeft((float) (__c.Floor(_r2.getLeft())));
RDebugUtils.currentLine=7471143;
 //BA.debugLineNum = 7471143;BA.debugLine="r2.Right = Ceil(r2.Right)";
_r2.setRight((float) (__c.Ceil(_r2.getRight())));
RDebugUtils.currentLine=7471144;
 //BA.debugLineNum = 7471144;BA.debugLine="If RTLAware Then RecolorEdgesOfConnectedCharact";
if (__ref._rtlaware /*boolean*/ ) { 
__ref._recoloredgesofconnectedcharacters /*String*/ (null,_c,_r2);};
RDebugUtils.currentLine=7471150;
 //BA.debugLineNum = 7471150;BA.debugLine="Dim cbc As CompressedBC = CharBC.ExtractCompres";
_cbc = __ref._charbc /*b4j.example.bitmapcreator*/ ._extractcompressedbc(_r2,__ref._cbccache /*b4j.example.bitmapcreator._internalcompressedbccache*/ );
RDebugUtils.currentLine=7471151;
 //BA.debugLineNum = 7471151;BA.debugLine="g.cbc = cbc";
_g.cbc /*b4j.example.bitmapcreator._compressedbc*/  = _cbc;
RDebugUtils.currentLine=7471152;
 //BA.debugLineNum = 7471152;BA.debugLine="g.width = cbc.mWidth";
_g.Width /*int*/  = _cbc.mWidth;
 }else {
RDebugUtils.currentLine=7471154;
 //BA.debugLineNum = 7471154;BA.debugLine="g.Empty = True";
_g.Empty /*boolean*/  = __c.True;
RDebugUtils.currentLine=7471155;
 //BA.debugLineNum = 7471155;BA.debugLine="If c = TAB Then";
if ((_c).equals(__c.TAB)) { 
RDebugUtils.currentLine=7471156;
 //BA.debugLineNum = 7471156;BA.debugLine="g.Width = FontMetrics.xWidth * TabWidthMeasure";
_g.Width /*int*/  = (int) (_fontmetrics.xWidth /*int*/ *__ref._tabwidthmeasuredinx /*int*/ );
 }else 
{RDebugUtils.currentLine=7471157;
 //BA.debugLineNum = 7471157;BA.debugLine="Else if c = \" \" Then";
if ((_c).equals(" ")) { 
RDebugUtils.currentLine=7471158;
 //BA.debugLineNum = 7471158;BA.debugLine="g.width = CreateGlyph(\"x x\", FontMetrics, True";
_g.Width /*int*/  = (int) (__ref._createglyph /*ir.abalfazl.hero.zip.grabber.bctextengine._bcglyph*/ (null,"x x",_fontmetrics,__c.True).Width /*int*/ -_fontmetrics.xWidth /*int*/ *2);
 }else 
{RDebugUtils.currentLine=7471159;
 //BA.debugLineNum = 7471159;BA.debugLine="Else If c = \"x\" Then";
if ((_c).equals("x")) { 
RDebugUtils.currentLine=7471160;
 //BA.debugLineNum = 7471160;BA.debugLine="g = CreateGlyph(\"X\", FontMetrics, True)";
_g = __ref._createglyph /*ir.abalfazl.hero.zip.grabber.bctextengine._bcglyph*/ (null,"X",_fontmetrics,__c.True);
 }else 
{RDebugUtils.currentLine=7471161;
 //BA.debugLineNum = 7471161;BA.debugLine="Else If c = \"x x\" Then";
if ((_c).equals("x x")) { 
RDebugUtils.currentLine=7471162;
 //BA.debugLineNum = 7471162;BA.debugLine="g = CreateGlyph(\"X X\", FontMetrics, True)";
_g = __ref._createglyph /*ir.abalfazl.hero.zip.grabber.bctextengine._bcglyph*/ (null,"X X",_fontmetrics,__c.True);
 }else {
RDebugUtils.currentLine=7471164;
 //BA.debugLineNum = 7471164;BA.debugLine="g.Width = CreateGlyph(\" \", FontMetrics, False)";
_g.Width /*int*/  = __ref._createglyph /*ir.abalfazl.hero.zip.grabber.bctextengine._bcglyph*/ (null," ",_fontmetrics,__c.False).Width /*int*/ ;
 }}}}
;
 };
RDebugUtils.currentLine=7471167;
 //BA.debugLineNum = 7471167;BA.debugLine="If xui.IsB4J = False And MightBeAnEmoji(c) Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()==__c.False && __ref._mightbeanemoji /*boolean*/ (null,_c)) { 
RDebugUtils.currentLine=7471168;
 //BA.debugLineNum = 7471168;BA.debugLine="If Emojis.IsInitialized = False Then LoadData(E";
if (__ref._emojis /*ir.abalfazl.hero.zip.grabber.b4xset*/ .IsInitialized /*boolean*/ ()==__c.False) { 
__ref._loaddata /*String*/ (null,__ref._emojis /*ir.abalfazl.hero.zip.grabber.b4xset*/ ,"emoji-data.txt");};
RDebugUtils.currentLine=7471169;
 //BA.debugLineNum = 7471169;BA.debugLine="g.Emoji = Emojis.Contains(BytesToInt(c.GetBytes";
_g.Emoji /*boolean*/  = __ref._emojis /*ir.abalfazl.hero.zip.grabber.b4xset*/ ._contains /*boolean*/ (null,(Object)(__ref._bytestoint /*int*/ (null,_c.getBytes(__ref._charset /*String*/ ),(int) (0))));
 };
RDebugUtils.currentLine=7471171;
 //BA.debugLineNum = 7471171;BA.debugLine="If JustMeasure = False Then";
if (_justmeasure==__c.False) { 
RDebugUtils.currentLine=7471172;
 //BA.debugLineNum = 7471172;BA.debugLine="FontMetrics.Glyphs.Put(c, g)";
_fontmetrics.Glyphs /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_c),(Object)(_g));
 };
RDebugUtils.currentLine=7471174;
 //BA.debugLineNum = 7471174;BA.debugLine="Return g";
if (true) return _g;
 };
RDebugUtils.currentLine=7471176;
 //BA.debugLineNum = 7471176;BA.debugLine="End Sub";
return null;
}
public ir.abalfazl.hero.zip.grabber.bctextengine._bcglyph  _createglyphfromdefaultcolor(ir.abalfazl.hero.zip.grabber.bctextengine __ref,String _c,ir.abalfazl.hero.zip.grabber.bctextengine._bcfontmetrics _defaultcolormetrics,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createglyphfromdefaultcolor", true))
	 {return ((ir.abalfazl.hero.zip.grabber.bctextengine._bcglyph) Debug.delegate(ba, "createglyphfromdefaultcolor", new Object[] {_c,_defaultcolormetrics,_clr}));}
ir.abalfazl.hero.zip.grabber.bctextengine._bcglyph _blackglyph = null;
ir.abalfazl.hero.zip.grabber.bctextengine._bcglyph _g = null;
byte[] _buffer = null;
b4j.example.bitmapcreator._argbcolor _argb = null;
int _ai = 0;
int _ri = 0;
int _gi = 0;
int _bi = 0;
int _i = 0;
int _a = 0;
float _af = 0f;
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Private Sub CreateGlyphFromDefaultColor(c As Strin";
RDebugUtils.currentLine=7733249;
 //BA.debugLineNum = 7733249;BA.debugLine="Dim BlackGlyph As BCGlyph = CreateGlyph(c, Defaul";
_blackglyph = __ref._createglyph /*ir.abalfazl.hero.zip.grabber.bctextengine._bcglyph*/ (null,_c,_defaultcolormetrics,__c.False);
RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="If BlackGlyph.cbc.IsInitialized = False Or BlackG";
if (_blackglyph.cbc /*b4j.example.bitmapcreator._compressedbc*/ .IsInitialized==__c.False || _blackglyph.Emoji /*boolean*/ ) { 
if (true) return _blackglyph;};
RDebugUtils.currentLine=7733251;
 //BA.debugLineNum = 7733251;BA.debugLine="Dim g As BCGlyph";
_g = new ir.abalfazl.hero.zip.grabber.bctextengine._bcglyph();
RDebugUtils.currentLine=7733252;
 //BA.debugLineNum = 7733252;BA.debugLine="g.Initialize";
_g.Initialize();
RDebugUtils.currentLine=7733253;
 //BA.debugLineNum = 7733253;BA.debugLine="g.baseline = BlackGlyph.baseline";
_g.baseline /*int*/  = _blackglyph.baseline /*int*/ ;
RDebugUtils.currentLine=7733254;
 //BA.debugLineNum = 7733254;BA.debugLine="g.width = BlackGlyph.width";
_g.Width /*int*/  = _blackglyph.Width /*int*/ ;
RDebugUtils.currentLine=7733255;
 //BA.debugLineNum = 7733255;BA.debugLine="g.cbc.Initialize";
_g.cbc /*b4j.example.bitmapcreator._compressedbc*/ .Initialize();
RDebugUtils.currentLine=7733256;
 //BA.debugLineNum = 7733256;BA.debugLine="g.cbc.Cache = BlackGlyph.cbc.Cache";
_g.cbc /*b4j.example.bitmapcreator._compressedbc*/ .Cache = _blackglyph.cbc /*b4j.example.bitmapcreator._compressedbc*/ .Cache;
RDebugUtils.currentLine=7733257;
 //BA.debugLineNum = 7733257;BA.debugLine="g.cbc.mHeight = BlackGlyph.cbc.mHeight";
_g.cbc /*b4j.example.bitmapcreator._compressedbc*/ .mHeight = _blackglyph.cbc /*b4j.example.bitmapcreator._compressedbc*/ .mHeight;
RDebugUtils.currentLine=7733258;
 //BA.debugLineNum = 7733258;BA.debugLine="g.cbc.mWidth = BlackGlyph.cbc.mWidth";
_g.cbc /*b4j.example.bitmapcreator._compressedbc*/ .mWidth = _blackglyph.cbc /*b4j.example.bitmapcreator._compressedbc*/ .mWidth;
RDebugUtils.currentLine=7733259;
 //BA.debugLineNum = 7733259;BA.debugLine="g.cbc.Rows = BlackGlyph.cbc.Rows";
_g.cbc /*b4j.example.bitmapcreator._compressedbc*/ .Rows = _blackglyph.cbc /*b4j.example.bitmapcreator._compressedbc*/ .Rows;
RDebugUtils.currentLine=7733260;
 //BA.debugLineNum = 7733260;BA.debugLine="g.cbc.TargetRect = BlackGlyph.cbc.TargetRect";
_g.cbc /*b4j.example.bitmapcreator._compressedbc*/ .TargetRect = _blackglyph.cbc /*b4j.example.bitmapcreator._compressedbc*/ .TargetRect;
RDebugUtils.currentLine=7733261;
 //BA.debugLineNum = 7733261;BA.debugLine="Dim buffer(BlackGlyph.cbc.mBuffer.Length) As Byte";
_buffer = new byte[_blackglyph.cbc /*b4j.example.bitmapcreator._compressedbc*/ .mBuffer.length];
;
RDebugUtils.currentLine=7733262;
 //BA.debugLineNum = 7733262;BA.debugLine="Dim argb As ARGBColor";
_argb = new b4j.example.bitmapcreator._argbcolor();
RDebugUtils.currentLine=7733263;
 //BA.debugLineNum = 7733263;BA.debugLine="CharBC.ColorToARGB(clr, argb)";
__ref._charbc /*b4j.example.bitmapcreator*/ ._colortoargb(_clr,_argb);
RDebugUtils.currentLine=7733264;
 //BA.debugLineNum = 7733264;BA.debugLine="Dim ai, ri, gi, bi As Int";
_ai = 0;
_ri = 0;
_gi = 0;
_bi = 0;
RDebugUtils.currentLine=7733271;
 //BA.debugLineNum = 7733271;BA.debugLine="ai = 3";
_ai = (int) (3);
RDebugUtils.currentLine=7733272;
 //BA.debugLineNum = 7733272;BA.debugLine="ri = 2";
_ri = (int) (2);
RDebugUtils.currentLine=7733273;
 //BA.debugLineNum = 7733273;BA.debugLine="gi = 1";
_gi = (int) (1);
RDebugUtils.currentLine=7733274;
 //BA.debugLineNum = 7733274;BA.debugLine="bi = 0";
_bi = (int) (0);
RDebugUtils.currentLine=7733276;
 //BA.debugLineNum = 7733276;BA.debugLine="For i = 0 To buffer.Length - 1 Step 4";
{
final int step21 = 4;
final int limit21 = (int) (_buffer.length-1);
_i = (int) (0) ;
for (;_i <= limit21 ;_i = _i + step21 ) {
RDebugUtils.currentLine=7733285;
 //BA.debugLineNum = 7733285;BA.debugLine="Dim a As Int = Bit.And(0xff, BlackGlyph.cbc.mBuf";
_a = __c.Bit.And(((int)0xff),(int) (_blackglyph.cbc /*b4j.example.bitmapcreator._compressedbc*/ .mBuffer[(int) (_i+_ai)]));
RDebugUtils.currentLine=7733286;
 //BA.debugLineNum = 7733286;BA.debugLine="Dim af As Float = a / 255";
_af = (float) (_a/(double)255);
RDebugUtils.currentLine=7733287;
 //BA.debugLineNum = 7733287;BA.debugLine="buffer(i + ai) = a";
_buffer[(int) (_i+_ai)] = (byte) (_a);
RDebugUtils.currentLine=7733288;
 //BA.debugLineNum = 7733288;BA.debugLine="buffer(i + ri) = argb.r * af";
_buffer[(int) (_i+_ri)] = (byte) (_argb.r*_af);
RDebugUtils.currentLine=7733289;
 //BA.debugLineNum = 7733289;BA.debugLine="buffer(i + gi) = argb.g * af";
_buffer[(int) (_i+_gi)] = (byte) (_argb.g*_af);
RDebugUtils.currentLine=7733290;
 //BA.debugLineNum = 7733290;BA.debugLine="buffer(i + bi) = argb.b * af";
_buffer[(int) (_i+_bi)] = (byte) (_argb.b*_af);
 }
};
RDebugUtils.currentLine=7733293;
 //BA.debugLineNum = 7733293;BA.debugLine="g.cbc.mBuffer = buffer";
_g.cbc /*b4j.example.bitmapcreator._compressedbc*/ .mBuffer = _buffer;
RDebugUtils.currentLine=7733294;
 //BA.debugLineNum = 7733294;BA.debugLine="Return g";
if (true) return _g;
RDebugUtils.currentLine=7733295;
 //BA.debugLineNum = 7733295;BA.debugLine="End Sub";
return null;
}
public String  _resizecharbc(ir.abalfazl.hero.zip.grabber.bctextengine __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "resizecharbc", true))
	 {return ((String) Debug.delegate(ba, "resizecharbc", new Object[] {_width,_height}));}
int _scaledwidth = 0;
int _scaledheight = 0;
int _w = 0;
int _h = 0;
anywheresoftware.b4j.objects.JFX _fx = null;
anywheresoftware.b4j.object.JavaObject _transform = null;
double _scale = 0;
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Private Sub ResizeCharBC(width As Int, height As I";
RDebugUtils.currentLine=7143425;
 //BA.debugLineNum = 7143425;BA.debugLine="Dim ScaledWidth As Int = (width + 5) / mScale";
_scaledwidth = (int) ((_width+5)/(double)__ref._mscale /*float*/ );
RDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="Dim ScaledHeight As Int = (height + 5) / mScale";
_scaledheight = (int) ((_height+5)/(double)__ref._mscale /*float*/ );
RDebugUtils.currentLine=7143427;
 //BA.debugLineNum = 7143427;BA.debugLine="CharBC.Initialize(ScaledWidth * mScale, ScaledHei";
__ref._charbc /*b4j.example.bitmapcreator*/ ._initialize(ba,(int) (_scaledwidth*__ref._mscale /*float*/ ),(int) (_scaledheight*__ref._mscale /*float*/ ));
RDebugUtils.currentLine=7143428;
 //BA.debugLineNum = 7143428;BA.debugLine="CharBC.MAX_SAME_COLOR_SIZE = 0";
__ref._charbc /*b4j.example.bitmapcreator*/ ._max_same_color_size = (int) (0);
RDebugUtils.currentLine=7143429;
 //BA.debugLineNum = 7143429;BA.debugLine="CharBC.AlphaThresholdForCBCExtraction = 0";
__ref._charbc /*b4j.example.bitmapcreator*/ ._alphathresholdforcbcextraction = (int) (0);
RDebugUtils.currentLine=7143430;
 //BA.debugLineNum = 7143430;BA.debugLine="cvs.Resize(ScaledWidth, ScaledHeight)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize(_scaledwidth,_scaledheight);
RDebugUtils.currentLine=7143432;
 //BA.debugLineNum = 7143432;BA.debugLine="Dim w As Int = mScale * cvs.TargetRect.Width";
_w = (int) (__ref._mscale /*float*/ *__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getWidth());
RDebugUtils.currentLine=7143433;
 //BA.debugLineNum = 7143433;BA.debugLine="Dim h As Int = mScale * cvs.TargetRect.Height";
_h = (int) (__ref._mscale /*float*/ *__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getHeight());
RDebugUtils.currentLine=7143434;
 //BA.debugLineNum = 7143434;BA.debugLine="WritableImage.InitializeNewInstance(\"javafx.scene";
__ref._writableimage /*anywheresoftware.b4j.object.JavaObject*/ .InitializeNewInstance("javafx.scene.image.WritableImage",new Object[]{(Object)(_w),(Object)(_h)});
RDebugUtils.currentLine=7143435;
 //BA.debugLineNum = 7143435;BA.debugLine="Dim sp As JavaObject";
_sp = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=7143436;
 //BA.debugLineNum = 7143436;BA.debugLine="sp.InitializeNewInstance(\"javafx.scene.SnapshotPa";
__ref._sp /*anywheresoftware.b4j.object.JavaObject*/ .InitializeNewInstance("javafx.scene.SnapshotParameters",(Object[])(__c.Null));
RDebugUtils.currentLine=7143437;
 //BA.debugLineNum = 7143437;BA.debugLine="Dim fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=7143438;
 //BA.debugLineNum = 7143438;BA.debugLine="sp.RunMethod(\"setFill\", Array(fx.Colors.Transpare";
__ref._sp /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setFill",new Object[]{(Object)(_fx.Colors.Transparent)});
RDebugUtils.currentLine=7143439;
 //BA.debugLineNum = 7143439;BA.debugLine="Dim transform As JavaObject";
_transform = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=7143440;
 //BA.debugLineNum = 7143440;BA.debugLine="transform.InitializeStatic(\"javafx.scene.transfor";
_transform.InitializeStatic("javafx.scene.transform.Transform");
RDebugUtils.currentLine=7143441;
 //BA.debugLineNum = 7143441;BA.debugLine="Dim scale As Double = mScale";
_scale = __ref._mscale /*float*/ ;
RDebugUtils.currentLine=7143442;
 //BA.debugLineNum = 7143442;BA.debugLine="sp.RunMethod(\"setTransform\", Array(transform.RunM";
__ref._sp /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setTransform",new Object[]{_transform.RunMethod("scale",new Object[]{(Object)(_scale),(Object)(_scale)})});
RDebugUtils.currentLine=7143444;
 //BA.debugLineNum = 7143444;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect  _findminrect(ir.abalfazl.hero.zip.grabber.bctextengine __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "findminrect", true))
	 {return ((anywheresoftware.b4a.objects.B4XCanvas.B4XRect) Debug.delegate(ba, "findminrect", new Object[] {_width,_height}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _y = 0;
int _x = 0;
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Private Sub FindMinRect (width As Int, height As I";
RDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="r.Initialize(width / 2, -1, -1, 0)";
_r.Initialize((float) (_width/(double)2),(float) (-1),(float) (-1),(float) (0));
RDebugUtils.currentLine=7798787;
 //BA.debugLineNum = 7798787;BA.debugLine="For y = 0 To height - 1";
{
final int step3 = 1;
final int limit3 = (int) (_height-1);
_y = (int) (0) ;
for (;_y <= limit3 ;_y = _y + step3 ) {
RDebugUtils.currentLine=7798788;
 //BA.debugLineNum = 7798788;BA.debugLine="For x = 0 To width - 1";
{
final int step4 = 1;
final int limit4 = (int) (_width-1);
_x = (int) (0) ;
for (;_x <= limit4 ;_x = _x + step4 ) {
RDebugUtils.currentLine=7798789;
 //BA.debugLineNum = 7798789;BA.debugLine="If CharBC.IsTransparent(x, y) = False Then";
if (__ref._charbc /*b4j.example.bitmapcreator*/ ._istransparent(_x,_y)==__c.False) { 
RDebugUtils.currentLine=7798790;
 //BA.debugLineNum = 7798790;BA.debugLine="r.Left = Min(r.Left, x)";
_r.setLeft((float) (__c.Min(_r.getLeft(),_x)));
RDebugUtils.currentLine=7798791;
 //BA.debugLineNum = 7798791;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=7798794;
 //BA.debugLineNum = 7798794;BA.debugLine="If x < width Then";
if (_x<_width) { 
RDebugUtils.currentLine=7798795;
 //BA.debugLineNum = 7798795;BA.debugLine="If r.Top = -1 Then";
if (_r.getTop()==-1) { 
RDebugUtils.currentLine=7798796;
 //BA.debugLineNum = 7798796;BA.debugLine="r.Top = y";
_r.setTop((float) (_y));
 }else {
RDebugUtils.currentLine=7798798;
 //BA.debugLineNum = 7798798;BA.debugLine="r.Bottom = y + 1";
_r.setBottom((float) (_y+1));
 };
RDebugUtils.currentLine=7798800;
 //BA.debugLineNum = 7798800;BA.debugLine="For x = width - 1 To 0 Step -1";
{
final int step16 = -1;
final int limit16 = (int) (0);
_x = (int) (_width-1) ;
for (;_x >= limit16 ;_x = _x + step16 ) {
RDebugUtils.currentLine=7798801;
 //BA.debugLineNum = 7798801;BA.debugLine="If CharBC.IsTransparent(x, y) = False Then";
if (__ref._charbc /*b4j.example.bitmapcreator*/ ._istransparent(_x,_y)==__c.False) { 
RDebugUtils.currentLine=7798802;
 //BA.debugLineNum = 7798802;BA.debugLine="r.Right = Max(r.Right, x + 1)";
_r.setRight((float) (__c.Max(_r.getRight(),_x+1)));
RDebugUtils.currentLine=7798803;
 //BA.debugLineNum = 7798803;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 };
 }
};
RDebugUtils.currentLine=7798808;
 //BA.debugLineNum = 7798808;BA.debugLine="r.Bottom = Max(r.Bottom, r.Top + 1)";
_r.setBottom((float) (__c.Max(_r.getBottom(),_r.getTop()+1)));
RDebugUtils.currentLine=7798809;
 //BA.debugLineNum = 7798809;BA.debugLine="Return r";
if (true) return _r;
RDebugUtils.currentLine=7798810;
 //BA.debugLineNum = 7798810;BA.debugLine="End Sub";
return null;
}
public String  _recoloredgesofconnectedcharacters(ir.abalfazl.hero.zip.grabber.bctextengine __ref,String _c,anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r2) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "recoloredgesofconnectedcharacters", true))
	 {return ((String) Debug.delegate(ba, "recoloredgesofconnectedcharacters", new Object[] {_c,_r2}));}
boolean _first = false;
int _y = 0;
int _x = 0;
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Private Sub RecolorEdgesOfConnectedCharacters(c As";
RDebugUtils.currentLine=7536641;
 //BA.debugLineNum = 7536641;BA.debugLine="If ArabicCharsConnectedPrev.Contains(c) Then";
if (__ref._arabiccharsconnectedprev /*ir.abalfazl.hero.zip.grabber.b4xset*/ ._contains /*boolean*/ (null,(Object)(_c))) { 
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="Dim First As Boolean = True";
_first = __c.True;
RDebugUtils.currentLine=7536643;
 //BA.debugLineNum = 7536643;BA.debugLine="For y = r2.Top To r2.Bottom - 1";
{
final int step3 = 1;
final int limit3 = (int) (_r2.getBottom()-1);
_y = (int) (_r2.getTop()) ;
for (;_y <= limit3 ;_y = _y + step3 ) {
RDebugUtils.currentLine=7536644;
 //BA.debugLineNum = 7536644;BA.debugLine="For x = r2.Right - 1 To Max(r2.Left, r2.Right -";
{
final int step4 = -1;
final int limit4 = (int) (__c.Max(_r2.getLeft(),_r2.getRight()-5));
_x = (int) (_r2.getRight()-1) ;
for (;_x >= limit4 ;_x = _x + step4 ) {
RDebugUtils.currentLine=7536645;
 //BA.debugLineNum = 7536645;BA.debugLine="If CharBC.IsTransparent(x, y) = False Then";
if (__ref._charbc /*b4j.example.bitmapcreator*/ ._istransparent(_x,_y)==__c.False) { 
RDebugUtils.currentLine=7536646;
 //BA.debugLineNum = 7536646;BA.debugLine="If First Then";
if (_first) { 
RDebugUtils.currentLine=7536647;
 //BA.debugLineNum = 7536647;BA.debugLine="First = False";
_first = __c.False;
 }else {
RDebugUtils.currentLine=7536649;
 //BA.debugLineNum = 7536649;BA.debugLine="CharBC.SetPremultipliedColor(x, y, PMDefault";
__ref._charbc /*b4j.example.bitmapcreator*/ ._setpremultipliedcolor(_x,_y,__ref._pmdefaultcolor /*b4j.example.bitmapcreator._premultipliedcolor*/ );
 };
RDebugUtils.currentLine=7536651;
 //BA.debugLineNum = 7536651;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }
};
 };
RDebugUtils.currentLine=7536656;
 //BA.debugLineNum = 7536656;BA.debugLine="End Sub";
return "";
}
public boolean  _mightbeanemoji(ir.abalfazl.hero.zip.grabber.bctextengine __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "mightbeanemoji", true))
	 {return ((Boolean) Debug.delegate(ba, "mightbeanemoji", new Object[] {_c}));}
int _cp = 0;
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Private Sub MightBeAnEmoji(c As String) As Boolean";
RDebugUtils.currentLine=7667713;
 //BA.debugLineNum = 7667713;BA.debugLine="Dim cp As Int = Asc(c)";
_cp = __c.Asc(BA.ObjectToChar(_c));
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="Return cp >= 0x231A Or c.Length > 1";
if (true) return _cp>=((int)0x231a) || _c.length()>1;
RDebugUtils.currentLine=7667715;
 //BA.debugLineNum = 7667715;BA.debugLine="End Sub";
return false;
}
public String  _loaddata(ir.abalfazl.hero.zip.grabber.bctextengine __ref,ir.abalfazl.hero.zip.grabber.b4xset _set,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "loaddata", true))
	 {return ((String) Debug.delegate(ba, "loaddata", new Object[] {_set,_filename}));}
String _line = "";
int _i = 0;
int _a = 0;
RDebugUtils.currentLine=8716288;
 //BA.debugLineNum = 8716288;BA.debugLine="Private Sub LoadData(Set As B4XSet, FileName As St";
RDebugUtils.currentLine=8716289;
 //BA.debugLineNum = 8716289;BA.debugLine="Set.Initialize";
_set._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=8716290;
 //BA.debugLineNum = 8716290;BA.debugLine="For Each line As String In File.ReadList(File.Dir";
{
final anywheresoftware.b4a.BA.IterableList group2 = __c.File.ReadList(__c.File.getDirAssets(),_filename);
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_line = BA.ObjectToString(group2.Get(index2));
RDebugUtils.currentLine=8716291;
 //BA.debugLineNum = 8716291;BA.debugLine="line = line.Trim";
_line = _line.trim();
RDebugUtils.currentLine=8716292;
 //BA.debugLineNum = 8716292;BA.debugLine="Dim i As Int = line.IndexOf(\".\")";
_i = _line.indexOf(".");
RDebugUtils.currentLine=8716293;
 //BA.debugLineNum = 8716293;BA.debugLine="If i = -1 Then";
if (_i==-1) { 
RDebugUtils.currentLine=8716294;
 //BA.debugLineNum = 8716294;BA.debugLine="Set.Add(Bit.ParseInt(line, 16))";
_set._add /*String*/ (null,(Object)(__c.Bit.ParseInt(_line,(int) (16))));
 }else {
RDebugUtils.currentLine=8716296;
 //BA.debugLineNum = 8716296;BA.debugLine="For a = Bit.ParseInt(line.SubString2(0, i), 16)";
{
final int step8 = 1;
final int limit8 = __c.Bit.ParseInt(_line.substring((int) (_i+2)),(int) (16));
_a = __c.Bit.ParseInt(_line.substring((int) (0),_i),(int) (16)) ;
for (;_a <= limit8 ;_a = _a + step8 ) {
RDebugUtils.currentLine=8716297;
 //BA.debugLineNum = 8716297;BA.debugLine="Set.Add(a)";
_set._add /*String*/ (null,(Object)(_a));
 }
};
 };
 }
};
RDebugUtils.currentLine=8716301;
 //BA.debugLineNum = 8716301;BA.debugLine="End Sub";
return "";
}
public String  _createline(ir.abalfazl.hero.zip.grabber.bctextengine __ref,ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraph _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createline", true))
	 {return ((String) Debug.delegate(ba, "createline", new Object[] {_p}));}
ir.abalfazl.hero.zip.grabber.bctextengine._bctextline _line = null;
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Private Sub CreateLine(p As BCParagraph)";
RDebugUtils.currentLine=5898241;
 //BA.debugLineNum = 5898241;BA.debugLine="Dim line As BCTextLine";
_line = new ir.abalfazl.hero.zip.grabber.bctextengine._bctextline();
RDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="line.Initialize";
_line.Initialize();
RDebugUtils.currentLine=5898243;
 //BA.debugLineNum = 5898243;BA.debugLine="line.Unbreakables.Initialize";
_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=5898244;
 //BA.debugLineNum = 5898244;BA.debugLine="line.ParentParagraph = p";
_line.ParentParagraph /*ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraph*/  = _p;
RDebugUtils.currentLine=5898245;
 //BA.debugLineNum = 5898245;BA.debugLine="p.TextLines.Add(line)";
_p.TextLines /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_line));
RDebugUtils.currentLine=5898246;
 //BA.debugLineNum = 5898246;BA.debugLine="p.CurrentLine = line";
_p.CurrentLine /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextline*/  = _line;
RDebugUtils.currentLine=5898248;
 //BA.debugLineNum = 5898248;BA.debugLine="End Sub";
return "";
}
public ir.abalfazl.hero.zip.grabber.bctextengine._bcsinglestylesection  _createsinglesection(ir.abalfazl.hero.zip.grabber.bctextengine __ref,ir.abalfazl.hero.zip.grabber.bctextengine._bctextrun _run,ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars _textchars,ir.abalfazl.hero.zip.grabber.bctextengine._bcfontmetrics _fontmetrics) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createsinglesection", true))
	 {return ((ir.abalfazl.hero.zip.grabber.bctextengine._bcsinglestylesection) Debug.delegate(ba, "createsinglesection", new Object[] {_run,_textchars,_fontmetrics}));}
ir.abalfazl.hero.zip.grabber.bctextengine._bcsinglestylesection _single = null;
String _prevchar = "";
ir.abalfazl.hero.zip.grabber.bctextengine._bcglyphandoffset _prevgo = null;
int _i = 0;
String _s = "";
ir.abalfazl.hero.zip.grabber.bctextengine._bcglyphandoffset _go = null;
ir.abalfazl.hero.zip.grabber.bctextengine._bcglyph _g = null;
ir.abalfazl.hero.zip.grabber.bctextengine._bcstyledunderline _u = null;
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Private Sub CreateSingleSection (Run As BCTextRun,";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="Dim single As BCSingleStyleSection";
_single = new ir.abalfazl.hero.zip.grabber.bctextengine._bcsinglestylesection();
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="single.Initialize";
_single.Initialize();
RDebugUtils.currentLine=6356995;
 //BA.debugLineNum = 6356995;BA.debugLine="single.GlyphsAndOffsets.Initialize";
_single.GlyphsAndOffsets /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=6356996;
 //BA.debugLineNum = 6356996;BA.debugLine="single.Run = Run";
_single.Run /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextrun*/  = _run;
RDebugUtils.currentLine=6356997;
 //BA.debugLineNum = 6356997;BA.debugLine="single.fm = FontMetrics";
_single.fm /*ir.abalfazl.hero.zip.grabber.bctextengine._bcfontmetrics*/  = _fontmetrics;
RDebugUtils.currentLine=6356998;
 //BA.debugLineNum = 6356998;BA.debugLine="Dim PrevChar As String";
_prevchar = "";
RDebugUtils.currentLine=6356999;
 //BA.debugLineNum = 6356999;BA.debugLine="Dim PrevGO As BCGlyphAndOffset";
_prevgo = new ir.abalfazl.hero.zip.grabber.bctextengine._bcglyphandoffset();
RDebugUtils.currentLine=6357000;
 //BA.debugLineNum = 6357000;BA.debugLine="For i = 0 To TextChars.Length - 1";
{
final int step8 = 1;
final int limit8 = (int) (_textchars.Length /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=6357001;
 //BA.debugLineNum = 6357001;BA.debugLine="Dim s As String = TextChars.Buffer(i + TextChars";
_s = _textchars.Buffer /*String[]*/ [(int) (_i+_textchars.StartIndex /*int*/ )];
RDebugUtils.currentLine=6357002;
 //BA.debugLineNum = 6357002;BA.debugLine="Dim go As BCGlyphAndOffset";
_go = new ir.abalfazl.hero.zip.grabber.bctextengine._bcglyphandoffset();
RDebugUtils.currentLine=6357003;
 //BA.debugLineNum = 6357003;BA.debugLine="Dim g As BCGlyph = CreateGlyph(s, FontMetrics, F";
_g = __ref._createglyph /*ir.abalfazl.hero.zip.grabber.bctextengine._bcglyph*/ (null,_s,_fontmetrics,__c.False);
RDebugUtils.currentLine=6357004;
 //BA.debugLineNum = 6357004;BA.debugLine="If i > 0 Then";
if (_i>0) { 
RDebugUtils.currentLine=6357005;
 //BA.debugLineNum = 6357005;BA.debugLine="If KerningEnabled Then";
if (__ref._kerningenabled /*boolean*/ ) { 
RDebugUtils.currentLine=6357006;
 //BA.debugLineNum = 6357006;BA.debugLine="PrevGO.SpaceBetweenThisAndNext = GetKernSpaceB";
_prevgo.SpaceBetweenThisAndNext /*int*/  = __ref._getkernspacebetweenchars /*int*/ (null,_fontmetrics,_prevchar,_s,_prevgo.Glyph /*ir.abalfazl.hero.zip.grabber.bctextengine._bcglyph*/ ,_g);
 }else {
RDebugUtils.currentLine=6357008;
 //BA.debugLineNum = 6357008;BA.debugLine="PrevGO.SpaceBetweenThisAndNext = mSpaceBetween";
_prevgo.SpaceBetweenThisAndNext /*int*/  = (int) (__ref._mspacebetweencharacters /*float*/ );
 };
 };
RDebugUtils.currentLine=6357011;
 //BA.debugLineNum = 6357011;BA.debugLine="go.Glyph = g";
_go.Glyph /*ir.abalfazl.hero.zip.grabber.bctextengine._bcglyph*/  = _g;
RDebugUtils.currentLine=6357012;
 //BA.debugLineNum = 6357012;BA.debugLine="single.GlyphsAndOffsets.Add(go)";
_single.GlyphsAndOffsets /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_go));
RDebugUtils.currentLine=6357013;
 //BA.debugLineNum = 6357013;BA.debugLine="If g.cbc.IsInitialized Then";
if (_g.cbc /*b4j.example.bitmapcreator._compressedbc*/ .IsInitialized) { 
RDebugUtils.currentLine=6357014;
 //BA.debugLineNum = 6357014;BA.debugLine="single.MaxHeightAboveBaseLine = Max(single.MaxH";
_single.MaxHeightAboveBaseLine /*int*/  = (int) (__c.Max(_single.MaxHeightAboveBaseLine /*int*/ ,_g.baseline /*int*/ -_run.VerticalOffset /*int*/ *__ref._mscale /*float*/ ));
RDebugUtils.currentLine=6357015;
 //BA.debugLineNum = 6357015;BA.debugLine="single.MaxHeightBelowBaseLine = Max(single.MaxH";
_single.MaxHeightBelowBaseLine /*int*/  = (int) (__c.Max(_single.MaxHeightBelowBaseLine /*int*/ ,_g.cbc /*b4j.example.bitmapcreator._compressedbc*/ .mHeight-_g.baseline /*int*/ +_run.VerticalOffset /*int*/ *__ref._mscale /*float*/ ));
 };
RDebugUtils.currentLine=6357017;
 //BA.debugLineNum = 6357017;BA.debugLine="single.Width = single.Width + g.Width";
_single.Width /*int*/  = (int) (_single.Width /*int*/ +_g.Width /*int*/ );
RDebugUtils.currentLine=6357018;
 //BA.debugLineNum = 6357018;BA.debugLine="If i > 0 Then single.Width = single.Width + Prev";
if (_i>0) { 
_single.Width /*int*/  = (int) (_single.Width /*int*/ +_prevgo.SpaceBetweenThisAndNext /*int*/ *_run.CharacterSpacingFactor /*float*/ );};
RDebugUtils.currentLine=6357019;
 //BA.debugLineNum = 6357019;BA.debugLine="If Run.Underline Or Run.AutoUnderline Then";
if (_run.Underline /*boolean*/  || _run.AutoUnderline /*boolean*/ ) { 
RDebugUtils.currentLine=6357020;
 //BA.debugLineNum = 6357020;BA.debugLine="Dim u As BCStyledUnderline = GetUnderlineStyle(";
_u = __ref._getunderlinestyle /*ir.abalfazl.hero.zip.grabber.bctextengine._bcstyledunderline*/ (null,_run);
RDebugUtils.currentLine=6357021;
 //BA.debugLineNum = 6357021;BA.debugLine="single.MaxHeightBelowBaseLine = Max((u.Thicknes";
_single.MaxHeightBelowBaseLine /*int*/  = (int) (__c.Max((_u.Thickness /*float*/ +2)*__ref._mscale /*float*/ +_run.VerticalOffset /*int*/ *__ref._mscale /*float*/ ,_single.MaxHeightBelowBaseLine /*int*/ ));
 };
RDebugUtils.currentLine=6357023;
 //BA.debugLineNum = 6357023;BA.debugLine="PrevGO = go";
_prevgo = _go;
RDebugUtils.currentLine=6357024;
 //BA.debugLineNum = 6357024;BA.debugLine="PrevChar = s";
_prevchar = _s;
 }
};
RDebugUtils.currentLine=6357026;
 //BA.debugLineNum = 6357026;BA.debugLine="If i > 0 Then single.Width = single.Width + PrevG";
if (_i>0) { 
_single.Width /*int*/  = (int) (_single.Width /*int*/ +_prevgo.SpaceBetweenThisAndNext /*int*/ *_run.CharacterSpacingFactor /*float*/ );};
RDebugUtils.currentLine=6357027;
 //BA.debugLineNum = 6357027;BA.debugLine="If TextChars.Length = 0 And Run.View.IsInitialize";
if (_textchars.Length /*int*/ ==0 && _run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=6357028;
 //BA.debugLineNum = 6357028;BA.debugLine="Run.View.Left = 0";
_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft(0);
RDebugUtils.currentLine=6357029;
 //BA.debugLineNum = 6357029;BA.debugLine="Run.View.Top = 0";
_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop(0);
RDebugUtils.currentLine=6357030;
 //BA.debugLineNum = 6357030;BA.debugLine="single.Width = Run.View.Width * mScale + mSpaceB";
_single.Width /*int*/  = (int) (_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()*__ref._mscale /*float*/ +__ref._mspacebetweencharacters /*float*/ *2);
RDebugUtils.currentLine=6357031;
 //BA.debugLineNum = 6357031;BA.debugLine="single.MaxHeightAboveBaseLine = (Run.View.Height";
_single.MaxHeightAboveBaseLine /*int*/  = (int) ((_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-_run.VerticalOffset /*int*/ )*__ref._mscale /*float*/ );
RDebugUtils.currentLine=6357032;
 //BA.debugLineNum = 6357032;BA.debugLine="single.MaxHeightBelowBaseLine = Run.View.Height";
_single.MaxHeightBelowBaseLine /*int*/  = (int) (_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()*__ref._mscale /*float*/ -_single.MaxHeightAboveBaseLine /*int*/ );
 };
RDebugUtils.currentLine=6357035;
 //BA.debugLineNum = 6357035;BA.debugLine="Return single";
if (true) return _single;
RDebugUtils.currentLine=6357036;
 //BA.debugLineNum = 6357036;BA.debugLine="End Sub";
return null;
}
public int  _getkernspacebetweenchars(ir.abalfazl.hero.zip.grabber.bctextengine __ref,ir.abalfazl.hero.zip.grabber.bctextengine._bcfontmetrics _fm,String _prevchar,String _thischar,ir.abalfazl.hero.zip.grabber.bctextengine._bcglyph _prevglyph,ir.abalfazl.hero.zip.grabber.bctextengine._bcglyph _thisglyph) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "getkernspacebetweenchars", true))
	 {return ((Integer) Debug.delegate(ba, "getkernspacebetweenchars", new Object[] {_fm,_prevchar,_thischar,_prevglyph,_thisglyph}));}
String _together = "";
int _space = 0;
int _res = 0;
int _w = 0;
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Private Sub GetKernSpaceBetweenChars (fm As BCFont";
RDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="Dim together As String = PrevChar & ThisChar";
_together = _prevchar+_thischar;
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="Dim Space As Int = fm.KerningTable.GetDefault(tog";
_space = (int)(BA.ObjectToNumber(_fm.KerningTable /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_together),(Object)(-1000))));
RDebugUtils.currentLine=6422531;
 //BA.debugLineNum = 6422531;BA.debugLine="If Space > -1000 Then Return Space";
if (_space>-1000) { 
if (true) return _space;};
RDebugUtils.currentLine=6422532;
 //BA.debugLineNum = 6422532;BA.debugLine="Dim res As Int";
_res = 0;
RDebugUtils.currentLine=6422533;
 //BA.debugLineNum = 6422533;BA.debugLine="If ThisGlyph.Empty Or PrevGlyph.Empty Then";
if (_thisglyph.Empty /*boolean*/  || _prevglyph.Empty /*boolean*/ ) { 
RDebugUtils.currentLine=6422534;
 //BA.debugLineNum = 6422534;BA.debugLine="res = mSpaceBetweenCharacters";
_res = (int) (__ref._mspacebetweencharacters /*float*/ );
 }else {
RDebugUtils.currentLine=6422536;
 //BA.debugLineNum = 6422536;BA.debugLine="Dim w As Int = CreateGlyph(together, fm, True).W";
_w = __ref._createglyph /*ir.abalfazl.hero.zip.grabber.bctextengine._bcglyph*/ (null,_together,_fm,__c.True).Width /*int*/ ;
RDebugUtils.currentLine=6422537;
 //BA.debugLineNum = 6422537;BA.debugLine="res = w - PrevGlyph.Width - ThisGlyph.Width";
_res = (int) (_w-_prevglyph.Width /*int*/ -_thisglyph.Width /*int*/ );
 };
RDebugUtils.currentLine=6422539;
 //BA.debugLineNum = 6422539;BA.debugLine="fm.KerningTable.Put(together, res)";
_fm.KerningTable /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_together),(Object)(_res));
RDebugUtils.currentLine=6422540;
 //BA.debugLineNum = 6422540;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=6422541;
 //BA.debugLineNum = 6422541;BA.debugLine="End Sub";
return 0;
}
public ir.abalfazl.hero.zip.grabber.bctextengine._bcstyledunderline  _getunderlinestyle(ir.abalfazl.hero.zip.grabber.bctextengine __ref,ir.abalfazl.hero.zip.grabber.bctextengine._bctextrun _run) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "getunderlinestyle", true))
	 {return ((ir.abalfazl.hero.zip.grabber.bctextengine._bcstyledunderline) Debug.delegate(ba, "getunderlinestyle", new Object[] {_run}));}
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Private Sub GetUnderlineStyle(run As BCTextRun) As";
RDebugUtils.currentLine=7077889;
 //BA.debugLineNum = 7077889;BA.debugLine="If run.Extra.IsInitialized = False Then Return De";
if (_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return __ref._defaultunderlinestyle /*ir.abalfazl.hero.zip.grabber.bctextengine._bcstyledunderline*/ ;};
RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="Return run.Extra.GetDefault(EXTRA_STYLEDUNDERLINE";
if (true) return (ir.abalfazl.hero.zip.grabber.bctextengine._bcstyledunderline)(_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(__ref._extra_styledunderline /*String*/ ),(Object)(__ref._defaultunderlinestyle /*ir.abalfazl.hero.zip.grabber.bctextengine._bcstyledunderline*/ )));
RDebugUtils.currentLine=7077891;
 //BA.debugLineNum = 7077891;BA.debugLine="End Sub";
return null;
}
public ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext  _createunbreakable(ir.abalfazl.hero.zip.grabber.bctextengine __ref,ir.abalfazl.hero.zip.grabber.bctextengine._bctextrun _run,ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars _textchars,ir.abalfazl.hero.zip.grabber.bctextengine._bcfontmetrics _fontmetrics,boolean _isseparator,ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraphstyle _style) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createunbreakable", true))
	 {return ((ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext) Debug.delegate(ba, "createunbreakable", new Object[] {_run,_textchars,_fontmetrics,_isseparator,_style}));}
ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext _unbreakable = null;
ir.abalfazl.hero.zip.grabber.bctextengine._bcsinglestylesection _single = null;
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Private Sub CreateUnbreakable (Run As BCTextRun, T";
RDebugUtils.currentLine=6094849;
 //BA.debugLineNum = 6094849;BA.debugLine="Dim unbreakable As BCUnbreakableText";
_unbreakable = new ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext();
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="unbreakable.Initialize";
_unbreakable.Initialize();
RDebugUtils.currentLine=6094851;
 //BA.debugLineNum = 6094851;BA.debugLine="unbreakable.SingleStyleSections.Initialize";
_unbreakable.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=6094852;
 //BA.debugLineNum = 6094852;BA.debugLine="unbreakable.IsMergable = Not(IsSeparator) And Not";
_unbreakable.IsMergable /*boolean*/  = __c.Not(_isseparator) && __c.Not(_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized());
RDebugUtils.currentLine=6094853;
 //BA.debugLineNum = 6094853;BA.debugLine="Dim single As BCSingleStyleSection = CreateSingle";
_single = __ref._createsinglesection /*ir.abalfazl.hero.zip.grabber.bctextengine._bcsinglestylesection*/ (null,_run,_textchars,_fontmetrics);
RDebugUtils.currentLine=6094854;
 //BA.debugLineNum = 6094854;BA.debugLine="single.ParentUN = unbreakable";
_single.ParentUN /*ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext*/  = _unbreakable;
RDebugUtils.currentLine=6094855;
 //BA.debugLineNum = 6094855;BA.debugLine="unbreakable.SingleStyleSections.Add(single)";
_unbreakable.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_single));
RDebugUtils.currentLine=6094856;
 //BA.debugLineNum = 6094856;BA.debugLine="unbreakable.Width = single.Width";
_unbreakable.Width /*int*/  = _single.Width /*int*/ ;
RDebugUtils.currentLine=6094857;
 //BA.debugLineNum = 6094857;BA.debugLine="unbreakable.NotFullTextChars = TextChars";
_unbreakable.NotFullTextChars /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars*/  = _textchars;
RDebugUtils.currentLine=6094858;
 //BA.debugLineNum = 6094858;BA.debugLine="If style.RTL Then";
if (_style.RTL /*boolean*/ ) { 
RDebugUtils.currentLine=6094859;
 //BA.debugLineNum = 6094859;BA.debugLine="unbreakable.RTL = Run.TextDirection = TextDirect";
_unbreakable.RTL /*boolean*/  = _run.TextDirection /*int*/ ==__ref._textdirectionrtl /*int*/  || (_run.TextDirection /*int*/ ==__ref._textdirectionunknown /*int*/  && __ref._detectrtl /*boolean*/ (null,_unbreakable)==__c.True);
 };
RDebugUtils.currentLine=6094861;
 //BA.debugLineNum = 6094861;BA.debugLine="Return unbreakable";
if (true) return _unbreakable;
RDebugUtils.currentLine=6094862;
 //BA.debugLineNum = 6094862;BA.debugLine="End Sub";
return null;
}
public boolean  _detectrtl(ir.abalfazl.hero.zip.grabber.bctextengine __ref,ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext _un) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "detectrtl", true))
	 {return ((Boolean) Debug.delegate(ba, "detectrtl", new Object[] {_un}));}
String _firstchar = "";
int _cp = 0;
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Private Sub DetectRTL (un As BCUnbreakableText) As";
RDebugUtils.currentLine=6160385;
 //BA.debugLineNum = 6160385;BA.debugLine="If un.NotFullTextChars.Length = 0 Then";
if (_un.NotFullTextChars /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars*/ .Length /*int*/ ==0) { 
RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=6160388;
 //BA.debugLineNum = 6160388;BA.debugLine="If RTLChars.IsInitialized = False Then";
if (__ref._rtlchars /*ir.abalfazl.hero.zip.grabber.b4xset*/ .IsInitialized /*boolean*/ ()==__c.False) { 
RDebugUtils.currentLine=6160389;
 //BA.debugLineNum = 6160389;BA.debugLine="LoadData(RTLChars, \"rtl-data.txt\")";
__ref._loaddata /*String*/ (null,__ref._rtlchars /*ir.abalfazl.hero.zip.grabber.b4xset*/ ,"rtl-data.txt");
 };
RDebugUtils.currentLine=6160391;
 //BA.debugLineNum = 6160391;BA.debugLine="Dim firstChar As String = un.NotFullTextChars.Buf";
_firstchar = _un.NotFullTextChars /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars*/ .Buffer /*String[]*/ [_un.NotFullTextChars /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars*/ .StartIndex /*int*/ ];
RDebugUtils.currentLine=6160392;
 //BA.debugLineNum = 6160392;BA.debugLine="Dim cp As Int = BytesToInt(firstChar.GetBytes(Cha";
_cp = __ref._bytestoint /*int*/ (null,_firstchar.getBytes(__ref._charset /*String*/ ),(int) (0));
RDebugUtils.currentLine=6160393;
 //BA.debugLineNum = 6160393;BA.debugLine="Return RTLChars.Contains(cp)";
if (true) return __ref._rtlchars /*ir.abalfazl.hero.zip.grabber.b4xset*/ ._contains /*boolean*/ (null,(Object)(_cp));
RDebugUtils.currentLine=6160394;
 //BA.debugLineNum = 6160394;BA.debugLine="End Sub";
return false;
}
public String  _drawline(ir.abalfazl.hero.zip.grabber.bctextengine __ref,ir.abalfazl.hero.zip.grabber.bctextengine._bctextline _line,int _offsety) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "drawline", true))
	 {return ((String) Debug.delegate(ba, "drawline", new Object[] {_line,_offsety}));}
ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext _un = null;
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Private Sub DrawLine(line As BCTextLine, OffsetY A";
RDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreaka";
{
final anywheresoftware.b4a.BA.IterableList group1 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_un = (ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext)(group1.Get(index1));
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="DrawUnbreakable(un, OffsetY)";
__ref._drawunbreakable /*String*/ (null,_un,_offsety);
 }
};
RDebugUtils.currentLine=6881284;
 //BA.debugLineNum = 6881284;BA.debugLine="End Sub";
return "";
}
public String  _drawunbreakable(ir.abalfazl.hero.zip.grabber.bctextengine __ref,ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext _un,int _offsety) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "drawunbreakable", true))
	 {return ((String) Debug.delegate(ba, "drawunbreakable", new Object[] {_un,_offsety}));}
ir.abalfazl.hero.zip.grabber.bctextengine._bcsinglestylesection _single = null;
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Private Sub DrawUnbreakable (un As BCUnbreakableTe";
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="For Each single As BCSingleStyleSection In un.Sin";
{
final anywheresoftware.b4a.BA.IterableList group1 = _un.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_single = (ir.abalfazl.hero.zip.grabber.bctextengine._bcsinglestylesection)(group1.Get(index1));
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="DrawSingleStyleSection(single, OffsetY)";
__ref._drawsinglestylesection /*String*/ (null,_single,_offsety);
 }
};
RDebugUtils.currentLine=6946820;
 //BA.debugLineNum = 6946820;BA.debugLine="End Sub";
return "";
}
public String  _drawparagraph(ir.abalfazl.hero.zip.grabber.bctextengine __ref,ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraph _paragraph) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "drawparagraph", true))
	 {return ((String) Debug.delegate(ba, "drawparagraph", new Object[] {_paragraph}));}
ir.abalfazl.hero.zip.grabber.bctextengine._bctextline _line = null;
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Private Sub DrawParagraph (Paragraph As BCParagrap";
RDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="For Each line As BCTextLine In Paragraph.TextLine";
{
final anywheresoftware.b4a.BA.IterableList group1 = _paragraph.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_line = (ir.abalfazl.hero.zip.grabber.bctextengine._bctextline)(group1.Get(index1));
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="DrawLine(line, line.BaselineY)";
__ref._drawline /*String*/ (null,_line,_line.BaselineY /*int*/ );
 }
};
RDebugUtils.currentLine=6488068;
 //BA.debugLineNum = 6488068;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect  _drawsinglelineshared(ir.abalfazl.hero.zip.grabber.bctextengine __ref,ir.abalfazl.hero.zip.grabber.bctextengine._bctextline _line,anywheresoftware.b4a.objects.B4XViewWrapper _iv,ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraph _par) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "drawsinglelineshared", true))
	 {return ((anywheresoftware.b4a.objects.B4XCanvas.B4XRect) Debug.delegate(ba, "drawsinglelineshared", new Object[] {_line,_iv,_par}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Private Sub DrawSingleLineShared (line As BCTextLi";
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="r.Initialize(0, 0, ForegroundBC.mWidth, line.MaxH";
_r.Initialize((float) (0),(float) (0),(float) (__ref._foregroundbc /*b4j.example.bitmapcreator*/ ._mwidth),(float) (_line.MaxHeightAboveBaseLine /*int*/ +_line.MaxHeightBelowBaseLine /*int*/ ));
RDebugUtils.currentLine=6619139;
 //BA.debugLineNum = 6619139;BA.debugLine="iv.SetLayoutAnimated(0,  par.Style.Padding.Left,";
_iv.SetLayoutAnimated((int) (0),_par.Style /*ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft(),_par.Style /*ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop()+(_line.BaselineY /*int*/ -_line.MaxHeightAboveBaseLine /*int*/ )/(double)__ref._mscale /*float*/ ,_r.getWidth()/(double)__ref._mscale /*float*/ ,_r.getHeight()/(double)__ref._mscale /*float*/ );
RDebugUtils.currentLine=6619141;
 //BA.debugLineNum = 6619141;BA.debugLine="Return r";
if (true) return _r;
RDebugUtils.currentLine=6619142;
 //BA.debugLineNum = 6619142;BA.debugLine="End Sub";
return null;
}
public b4j.example.bcpath._bcbrush  _getbrush(ir.abalfazl.hero.zip.grabber.bctextengine __ref,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "getbrush", true))
	 {return ((b4j.example.bcpath._bcbrush) Debug.delegate(ba, "getbrush", new Object[] {_clr}));}
b4j.example.bcpath._bcbrush _b = null;
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Private Sub GetBrush(clr As Int) As BCBrush";
RDebugUtils.currentLine=7340033;
 //BA.debugLineNum = 7340033;BA.debugLine="If Brushes.ContainsKey(clr) Then Return Brushes.G";
if (__ref._brushes /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_clr))) { 
if (true) return (b4j.example.bcpath._bcbrush)(__ref._brushes /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_clr)));};
RDebugUtils.currentLine=7340034;
 //BA.debugLineNum = 7340034;BA.debugLine="Dim b As BCBrush = ForegroundBC.CreateBrushFromCo";
_b = __ref._foregroundbc /*b4j.example.bitmapcreator*/ ._createbrushfromcolor(_clr);
RDebugUtils.currentLine=7340035;
 //BA.debugLineNum = 7340035;BA.debugLine="Brushes.Put(clr, b)";
__ref._brushes /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_clr),(Object)(_b));
RDebugUtils.currentLine=7340036;
 //BA.debugLineNum = 7340036;BA.debugLine="Return b";
if (true) return _b;
RDebugUtils.currentLine=7340037;
 //BA.debugLineNum = 7340037;BA.debugLine="End Sub";
return null;
}
public b4j.example.bitmapcreator  _drawsinglelineasync(ir.abalfazl.hero.zip.grabber.bctextengine __ref,ir.abalfazl.hero.zip.grabber.bctextengine._bctextline _line,anywheresoftware.b4a.objects.B4XViewWrapper _iv,ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraph _par,Object _target) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "drawsinglelineasync", true))
	 {return ((b4j.example.bitmapcreator) Debug.delegate(ba, "drawsinglelineasync", new Object[] {_line,_iv,_par,_target}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Public Sub DrawSingleLineAsync (line As BCTextLine";
RDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="Dim r As B4XRect = DrawSingleLineShared(line, iv,";
_r = __ref._drawsinglelineshared /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ (null,_line,_iv,_par);
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="If r.Width > 0 And r.Height > 0 Then";
if (_r.getWidth()>0 && _r.getHeight()>0) { 
RDebugUtils.currentLine=6684675;
 //BA.debugLineNum = 6684675;BA.debugLine="AsyncMode = True";
__ref._asyncmode /*boolean*/  = __c.True;
RDebugUtils.currentLine=6684676;
 //BA.debugLineNum = 6684676;BA.debugLine="If AsyncBCs.IsInitialized = False Then AsyncBCs.";
if (__ref._asyncbcs /*ir.abalfazl.hero.zip.grabber.b4xorderedmap*/ .IsInitialized /*boolean*/ ()==__c.False) { 
__ref._asyncbcs /*ir.abalfazl.hero.zip.grabber.b4xorderedmap*/ ._initialize /*String*/ (null,ba);};
RDebugUtils.currentLine=6684677;
 //BA.debugLineNum = 6684677;BA.debugLine="Dim AsyncTasks As List";
_asynctasks = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=6684678;
 //BA.debugLineNum = 6684678;BA.debugLine="AsyncTasks.Initialize";
__ref._asynctasks /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=6684679;
 //BA.debugLineNum = 6684679;BA.debugLine="AsyncBC = FindAsyncBC (r.Width, r.Height)";
__ref._asyncbc /*b4j.example.bitmapcreator*/  = __ref._findasyncbc /*b4j.example.bitmapcreator*/ (null,(int) (_r.getWidth()),(int) (_r.getHeight()));
RDebugUtils.currentLine=6684680;
 //BA.debugLineNum = 6684680;BA.debugLine="AsyncTasks.Add(AsyncBC.AsyncDrawRect(r, GetBrush";
__ref._asynctasks /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._asyncbc /*b4j.example.bitmapcreator*/ ._asyncdrawrect(_r,__ref._getbrush /*b4j.example.bcpath._bcbrush*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent),__c.True,(int) (0))));
RDebugUtils.currentLine=6684681;
 //BA.debugLineNum = 6684681;BA.debugLine="DrawLine(line, line.MaxHeightAboveBaseLine)";
__ref._drawline /*String*/ (null,_line,_line.MaxHeightAboveBaseLine /*int*/ );
RDebugUtils.currentLine=6684682;
 //BA.debugLineNum = 6684682;BA.debugLine="AsyncBC.DrawBitmapCreatorsAsync(Target, \"BC\", As";
__ref._asyncbc /*b4j.example.bitmapcreator*/ ._drawbitmapcreatorsasync(_target,"BC",__ref._asynctasks /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=6684683;
 //BA.debugLineNum = 6684683;BA.debugLine="AsyncMode = False";
__ref._asyncmode /*boolean*/  = __c.False;
RDebugUtils.currentLine=6684684;
 //BA.debugLineNum = 6684684;BA.debugLine="Return AsyncBC";
if (true) return __ref._asyncbc /*b4j.example.bitmapcreator*/ ;
 };
RDebugUtils.currentLine=6684686;
 //BA.debugLineNum = 6684686;BA.debugLine="Return Null";
if (true) return (b4j.example.bitmapcreator)(__c.Null);
RDebugUtils.currentLine=6684687;
 //BA.debugLineNum = 6684687;BA.debugLine="End Sub";
return null;
}
public b4j.example.bitmapcreator  _findasyncbc(ir.abalfazl.hero.zip.grabber.bctextengine __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "findasyncbc", true))
	 {return ((b4j.example.bitmapcreator) Debug.delegate(ba, "findasyncbc", new Object[] {_width,_height}));}
b4j.example.bitmapcreator _bc = null;
boolean _used = false;
int _i = 0;
boolean _b = false;
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Private Sub FindAsyncBC (Width As Int, Height As I";
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="For Each bc As BitmapCreator In AsyncBCs.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._asyncbcs /*ir.abalfazl.hero.zip.grabber.b4xorderedmap*/ ._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_bc = (b4j.example.bitmapcreator)(group1.Get(index1));
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="If bc.mWidth = Width And bc.mHeight = Height The";
if (_bc._mwidth==_width && _bc._mheight==_height) { 
RDebugUtils.currentLine=6750211;
 //BA.debugLineNum = 6750211;BA.debugLine="Dim Used As Boolean = AsyncBCs.Get(bc)";
_used = BA.ObjectToBoolean(__ref._asyncbcs /*ir.abalfazl.hero.zip.grabber.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_bc)));
RDebugUtils.currentLine=6750212;
 //BA.debugLineNum = 6750212;BA.debugLine="If Used = False Then";
if (_used==__c.False) { 
RDebugUtils.currentLine=6750213;
 //BA.debugLineNum = 6750213;BA.debugLine="AsyncBCs.Put(bc, True)";
__ref._asyncbcs /*ir.abalfazl.hero.zip.grabber.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_bc),(Object)(__c.True));
RDebugUtils.currentLine=6750214;
 //BA.debugLineNum = 6750214;BA.debugLine="Return bc";
if (true) return _bc;
 };
 };
 }
};
RDebugUtils.currentLine=6750218;
 //BA.debugLineNum = 6750218;BA.debugLine="Dim bc As BitmapCreator";
_bc = new b4j.example.bitmapcreator();
RDebugUtils.currentLine=6750219;
 //BA.debugLineNum = 6750219;BA.debugLine="bc.Initialize(Width, Height)";
_bc._initialize(ba,_width,_height);
RDebugUtils.currentLine=6750220;
 //BA.debugLineNum = 6750220;BA.debugLine="AsyncBCs.Put(bc, True)";
__ref._asyncbcs /*ir.abalfazl.hero.zip.grabber.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_bc),(Object)(__c.True));
RDebugUtils.currentLine=6750221;
 //BA.debugLineNum = 6750221;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=6750222;
 //BA.debugLineNum = 6750222;BA.debugLine="For Each b As Boolean In AsyncBCs.Values";
{
final anywheresoftware.b4a.BA.IterableList group14 = __ref._asyncbcs /*ir.abalfazl.hero.zip.grabber.b4xorderedmap*/ ._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen14 = group14.getSize()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_b = BA.ObjectToBoolean(group14.Get(index14));
RDebugUtils.currentLine=6750223;
 //BA.debugLineNum = 6750223;BA.debugLine="If b Then i = i + 1";
if (_b) { 
_i = (int) (_i+1);};
 }
};
RDebugUtils.currentLine=6750225;
 //BA.debugLineNum = 6750225;BA.debugLine="Return bc";
if (true) return _bc;
RDebugUtils.currentLine=6750226;
 //BA.debugLineNum = 6750226;BA.debugLine="End Sub";
return null;
}
public String  _drawsinglestylesection(ir.abalfazl.hero.zip.grabber.bctextengine __ref,ir.abalfazl.hero.zip.grabber.bctextengine._bcsinglestylesection _single,int _offsety) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "drawsinglestylesection", true))
	 {return ((String) Debug.delegate(ba, "drawsinglestylesection", new Object[] {_single,_offsety}));}
int _offsetx = 0;
boolean _rtl = false;
ir.abalfazl.hero.zip.grabber.bctextengine._bcglyphandoffset _go = null;
ir.abalfazl.hero.zip.grabber.bctextengine._bcglyph _g = null;
int _x = 0;
b4j.example.bitmapcreator._drawtask _dt = null;
ir.abalfazl.hero.zip.grabber.bctextengine._bcstyledunderline _u = null;
int _clr = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Private Sub DrawSingleStyleSection (single As BCSi";
RDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="Dim OffsetX As Int = single.AbsoluteStartX";
_offsetx = _single.AbsoluteStartX /*int*/ ;
RDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="Dim rtl As Boolean = single.ParentUN.RTL";
_rtl = _single.ParentUN /*ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext*/ .RTL /*boolean*/ ;
RDebugUtils.currentLine=7012355;
 //BA.debugLineNum = 7012355;BA.debugLine="If rtl Then OffsetX = single.AbsoluteStartX + sin";
if (_rtl) { 
_offsetx = (int) (_single.AbsoluteStartX /*int*/ +_single.Width /*int*/ );};
RDebugUtils.currentLine=7012356;
 //BA.debugLineNum = 7012356;BA.debugLine="For Each go As BCGlyphAndOffset In single.GlyphsA";
{
final anywheresoftware.b4a.BA.IterableList group4 = _single.GlyphsAndOffsets /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_go = (ir.abalfazl.hero.zip.grabber.bctextengine._bcglyphandoffset)(group4.Get(index4));
RDebugUtils.currentLine=7012357;
 //BA.debugLineNum = 7012357;BA.debugLine="Dim g As BCGlyph = go.Glyph";
_g = _go.Glyph /*ir.abalfazl.hero.zip.grabber.bctextengine._bcglyph*/ ;
RDebugUtils.currentLine=7012361;
 //BA.debugLineNum = 7012361;BA.debugLine="Dim x As Int = OffsetX";
_x = _offsetx;
RDebugUtils.currentLine=7012362;
 //BA.debugLineNum = 7012362;BA.debugLine="If rtl Then x = x - g.cbc.mWidth";
if (_rtl) { 
_x = (int) (_x-_g.cbc /*b4j.example.bitmapcreator._compressedbc*/ .mWidth);};
RDebugUtils.currentLine=7012363;
 //BA.debugLineNum = 7012363;BA.debugLine="If g.cbc.IsInitialized Then";
if (_g.cbc /*b4j.example.bitmapcreator._compressedbc*/ .IsInitialized) { 
RDebugUtils.currentLine=7012364;
 //BA.debugLineNum = 7012364;BA.debugLine="If AsyncMode Then";
if (__ref._asyncmode /*boolean*/ ) { 
RDebugUtils.currentLine=7012365;
 //BA.debugLineNum = 7012365;BA.debugLine="Dim dt As DrawTask = AsyncBC.CreateDrawTask(g.";
_dt = __ref._asyncbc /*b4j.example.bitmapcreator*/ ._createdrawtask((Object)(_g.cbc /*b4j.example.bitmapcreator._compressedbc*/ ),_g.cbc /*b4j.example.bitmapcreator._compressedbc*/ .TargetRect,_x,(int) (_offsety-_g.baseline /*int*/ +_single.Run /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextrun*/ .VerticalOffset /*int*/ *__ref._mscale /*float*/ ),__c.True);
RDebugUtils.currentLine=7012366;
 //BA.debugLineNum = 7012366;BA.debugLine="dt.IsCompressedSource = True";
_dt.IsCompressedSource = __c.True;
RDebugUtils.currentLine=7012367;
 //BA.debugLineNum = 7012367;BA.debugLine="AsyncTasks.Add(dt)";
__ref._asynctasks /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_dt));
 }else {
RDebugUtils.currentLine=7012369;
 //BA.debugLineNum = 7012369;BA.debugLine="ForegroundBC.DrawCompressedBitmap(g.cbc, g.cbc";
__ref._foregroundbc /*b4j.example.bitmapcreator*/ ._drawcompressedbitmap(_g.cbc /*b4j.example.bitmapcreator._compressedbc*/ ,_g.cbc /*b4j.example.bitmapcreator._compressedbc*/ .TargetRect,_x,(int) (_offsety-_g.baseline /*int*/ +_single.Run /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextrun*/ .VerticalOffset /*int*/ *__ref._mscale /*float*/ ));
 };
 };
RDebugUtils.currentLine=7012372;
 //BA.debugLineNum = 7012372;BA.debugLine="If single.Run.Underline Then";
if (_single.Run /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextrun*/ .Underline /*boolean*/ ) { 
RDebugUtils.currentLine=7012373;
 //BA.debugLineNum = 7012373;BA.debugLine="Dim u As BCStyledUnderline = GetUnderlineStyle(";
_u = __ref._getunderlinestyle /*ir.abalfazl.hero.zip.grabber.bctextengine._bcstyledunderline*/ (null,_single.Run /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextrun*/ );
RDebugUtils.currentLine=7012374;
 //BA.debugLineNum = 7012374;BA.debugLine="Dim clr As Int = u.Clr";
_clr = _u.Clr /*int*/ ;
RDebugUtils.currentLine=7012375;
 //BA.debugLineNum = 7012375;BA.debugLine="If clr = 0 Then clr = single.Run.TextColor";
if (_clr==0) { 
_clr = _single.Run /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextrun*/ .TextColor /*int*/ ;};
RDebugUtils.currentLine=7012376;
 //BA.debugLineNum = 7012376;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=7012377;
 //BA.debugLineNum = 7012377;BA.debugLine="r.Initialize(x, single.Run.VerticalOffset * mSc";
_r.Initialize((float) (_x),(float) (_single.Run /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextrun*/ .VerticalOffset /*int*/ *__ref._mscale /*float*/ +_offsety+__ref._mscale /*float*/ ),(float) (_x+_g.Width /*int*/ +__ref._mspacebetweencharacters /*float*/ +_go.SpaceBetweenThisAndNext /*int*/ *_single.Run /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextrun*/ .CharacterSpacingFactor /*float*/ ),(float) (_offsety+__ref._mscale /*float*/ +_u.Thickness /*float*/ *__ref._mscale /*float*/ +_single.Run /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextrun*/ .VerticalOffset /*int*/ *__ref._mscale /*float*/ ));
RDebugUtils.currentLine=7012379;
 //BA.debugLineNum = 7012379;BA.debugLine="If AsyncMode Then";
if (__ref._asyncmode /*boolean*/ ) { 
RDebugUtils.currentLine=7012380;
 //BA.debugLineNum = 7012380;BA.debugLine="AsyncTasks.Add(AsyncBC.AsyncDrawRect(r, GetBru";
__ref._asynctasks /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._asyncbc /*b4j.example.bitmapcreator*/ ._asyncdrawrect(_r,__ref._getbrush /*b4j.example.bcpath._bcbrush*/ (null,_clr),__c.True,(int) (0))));
 }else {
RDebugUtils.currentLine=7012382;
 //BA.debugLineNum = 7012382;BA.debugLine="ForegroundBC.DrawRect2(r, GetBrush(clr), True,";
__ref._foregroundbc /*b4j.example.bitmapcreator*/ ._drawrect2(_r,__ref._getbrush /*b4j.example.bcpath._bcbrush*/ (null,_clr),__c.True,(int) (0));
 };
 };
RDebugUtils.currentLine=7012385;
 //BA.debugLineNum = 7012385;BA.debugLine="If rtl Then";
if (_rtl) { 
RDebugUtils.currentLine=7012386;
 //BA.debugLineNum = 7012386;BA.debugLine="OffsetX = OffsetX - g.Width - go.SpaceBetweenTh";
_offsetx = (int) (_offsetx-_g.Width /*int*/ -_go.SpaceBetweenThisAndNext /*int*/ *_single.Run /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextrun*/ .CharacterSpacingFactor /*float*/ );
 }else {
RDebugUtils.currentLine=7012388;
 //BA.debugLineNum = 7012388;BA.debugLine="OffsetX = OffsetX + g.Width + go.SpaceBetweenTh";
_offsetx = (int) (_offsetx+_g.Width /*int*/ +_go.SpaceBetweenThisAndNext /*int*/ *_single.Run /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextrun*/ .CharacterSpacingFactor /*float*/ );
 };
 }
};
RDebugUtils.currentLine=7012391;
 //BA.debugLineNum = 7012391;BA.debugLine="End Sub";
return "";
}
public ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraph  _prepare(ir.abalfazl.hero.zip.grabber.bctextengine __ref,anywheresoftware.b4a.objects.collections.List _runs,ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraphstyle _style) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "prepare", true))
	 {return ((ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraph) Debug.delegate(ba, "prepare", new Object[] {_runs,_style}));}
ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraph _par = null;
anywheresoftware.b4a.objects.collections.List _unbreakeables = null;
ir.abalfazl.hero.zip.grabber.bctextengine._bctextrun _run = null;
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Private Sub Prepare (Runs As List, Style As BCPara";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="Dim par As BCParagraph";
_par = new ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraph();
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="par.Initialize";
_par.Initialize();
RDebugUtils.currentLine=5177347;
 //BA.debugLineNum = 5177347;BA.debugLine="par.TextLines.Initialize";
_par.TextLines /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=5177348;
 //BA.debugLineNum = 5177348;BA.debugLine="par.Style = Style";
_par.Style /*ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraphstyle*/  = _style;
RDebugUtils.currentLine=5177349;
 //BA.debugLineNum = 5177349;BA.debugLine="IndentWidth = GetFontMetrics(DefaultFont, Default";
__ref._indentwidth /*int*/  = (int) (__ref._getfontmetrics /*ir.abalfazl.hero.zip.grabber.bctextengine._bcfontmetrics*/ (null,__ref._defaultfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,__ref._defaultcolor /*int*/ ).xWidth /*int*/ *__ref._tabwidthmeasuredinx /*int*/ );
RDebugUtils.currentLine=5177350;
 //BA.debugLineNum = 5177350;BA.debugLine="Dim unbreakeables As List";
_unbreakeables = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5177351;
 //BA.debugLineNum = 5177351;BA.debugLine="unbreakeables.Initialize";
_unbreakeables.Initialize();
RDebugUtils.currentLine=5177352;
 //BA.debugLineNum = 5177352;BA.debugLine="For Each run As BCTextRun In Runs";
{
final anywheresoftware.b4a.BA.IterableList group8 = _runs;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_run = (ir.abalfazl.hero.zip.grabber.bctextengine._bctextrun)(group8.Get(index8));
RDebugUtils.currentLine=5177353;
 //BA.debugLineNum = 5177353;BA.debugLine="If run.Extra.IsInitialized And run.Extra.Contain";
if (_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized() && _run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(__ref._extra_connectedruns /*String*/ ))) { 
RDebugUtils.currentLine=5177354;
 //BA.debugLineNum = 5177354;BA.debugLine="HandleConnectedTextRuns(run, unbreakeables, Sty";
__ref._handleconnectedtextruns /*String*/ (null,_run,_unbreakeables,_style);
 }else {
RDebugUtils.currentLine=5177356;
 //BA.debugLineNum = 5177356;BA.debugLine="HandleTextRun(run, unbreakeables, Style)";
__ref._handletextrun /*String*/ (null,_run,_unbreakeables,_style);
 };
 }
};
RDebugUtils.currentLine=5177359;
 //BA.debugLineNum = 5177359;BA.debugLine="CreateLine(par)";
__ref._createline /*String*/ (null,_par);
RDebugUtils.currentLine=5177360;
 //BA.debugLineNum = 5177360;BA.debugLine="OrganizeUnbreakables(par, unbreakeables)";
__ref._organizeunbreakables /*String*/ (null,_par,_unbreakeables);
RDebugUtils.currentLine=5177361;
 //BA.debugLineNum = 5177361;BA.debugLine="OrganizeLines(par)";
__ref._organizelines /*String*/ (null,_par);
RDebugUtils.currentLine=5177362;
 //BA.debugLineNum = 5177362;BA.debugLine="OrganizeSingleStyles(par)";
__ref._organizesinglestyles /*String*/ (null,_par);
RDebugUtils.currentLine=5177363;
 //BA.debugLineNum = 5177363;BA.debugLine="If par.Style.RTL Then OrganizeRTLParagraph(par)";
if (_par.Style /*ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraphstyle*/ .RTL /*boolean*/ ) { 
__ref._organizertlparagraph /*String*/ (null,_par);};
RDebugUtils.currentLine=5177364;
 //BA.debugLineNum = 5177364;BA.debugLine="Return par";
if (true) return _par;
RDebugUtils.currentLine=5177365;
 //BA.debugLineNum = 5177365;BA.debugLine="End Sub";
return null;
}
public String  _resizelayers(ir.abalfazl.hero.zip.grabber.bctextengine __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "resizelayers", true))
	 {return ((String) Debug.delegate(ba, "resizelayers", new Object[] {_width,_height}));}
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Private Sub ResizeLayers (Width As Int, Height As";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="Width = Max(Width, 2) * mScale";
_width = (int) (__c.Max(_width,2)*__ref._mscale /*float*/ );
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="Height = Max(Height, 2) * mScale";
_height = (int) (__c.Max(_height,2)*__ref._mscale /*float*/ );
RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="If ForegroundBC.IsInitialized = False Or Width >";
if (__ref._foregroundbc /*b4j.example.bitmapcreator*/ .IsInitialized()==__c.False || _width>__ref._foregroundbc /*b4j.example.bitmapcreator*/ ._mwidth || _height>__ref._foregroundbc /*b4j.example.bitmapcreator*/ ._mheight) { 
RDebugUtils.currentLine=4915204;
 //BA.debugLineNum = 4915204;BA.debugLine="If ForegroundBC.IsInitialized Then";
if (__ref._foregroundbc /*b4j.example.bitmapcreator*/ .IsInitialized()) { 
RDebugUtils.currentLine=4915205;
 //BA.debugLineNum = 4915205;BA.debugLine="Width = Max(Width, ForegroundBC.mWidth)";
_width = (int) (__c.Max(_width,__ref._foregroundbc /*b4j.example.bitmapcreator*/ ._mwidth));
RDebugUtils.currentLine=4915206;
 //BA.debugLineNum = 4915206;BA.debugLine="Height = Max(Height, ForegroundBC.mHeight)";
_height = (int) (__c.Max(_height,__ref._foregroundbc /*b4j.example.bitmapcreator*/ ._mheight));
 };
RDebugUtils.currentLine=4915211;
 //BA.debugLineNum = 4915211;BA.debugLine="Brushes.Clear";
__ref._brushes /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=4915212;
 //BA.debugLineNum = 4915212;BA.debugLine="ForegroundBC.Initialize(Width, Height)";
__ref._foregroundbc /*b4j.example.bitmapcreator*/ ._initialize(ba,_width,_height);
 }else {
RDebugUtils.currentLine=4915214;
 //BA.debugLineNum = 4915214;BA.debugLine="ForegroundBC.DrawRect2(ForegroundBC.TargetRect,";
__ref._foregroundbc /*b4j.example.bitmapcreator*/ ._drawrect2(__ref._foregroundbc /*b4j.example.bitmapcreator*/ ._targetrect,__ref._getbrush /*b4j.example.bcpath._bcbrush*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent),__c.True,(int) (0));
 };
RDebugUtils.currentLine=4915216;
 //BA.debugLineNum = 4915216;BA.debugLine="End Sub";
return "";
}
public String  _resizeimageview(ir.abalfazl.hero.zip.grabber.bctextengine __ref,b4j.example.bitmapcreator _bc,ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraph _par,anywheresoftware.b4a.objects.B4XViewWrapper _iv,boolean _resizeheight) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "resizeimageview", true))
	 {return ((String) Debug.delegate(ba, "resizeimageview", new Object[] {_bc,_par,_iv,_resizeheight}));}
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
int _ivheight = 0;
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Private Sub ResizeImageView (bc As BitmapCreator,";
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="Dim bmp As B4XBitmap = bc.Bitmap";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = _bc._getbitmap();
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="Dim ivHeight As Int = par.Height / mScale";
_ivheight = (int) (_par.Height /*int*/ /(double)__ref._mscale /*float*/ );
RDebugUtils.currentLine=5439491;
 //BA.debugLineNum = 5439491;BA.debugLine="If ResizeHeight = False Then ivHeight = Min(ivHei";
if (_resizeheight==__c.False) { 
_ivheight = (int) (__c.Min(_ivheight,_iv.getParent().getHeight()-_par.Style /*ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop()-_par.Style /*ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getBottom()));};
RDebugUtils.currentLine=5439492;
 //BA.debugLineNum = 5439492;BA.debugLine="iv.SetLayoutAnimated(0, par.Style.Padding.Left, p";
_iv.SetLayoutAnimated((int) (0),_par.Style /*ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft(),_par.Style /*ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop(),_par.Width /*int*/ /(double)__ref._mscale /*float*/ ,_ivheight);
RDebugUtils.currentLine=5439493;
 //BA.debugLineNum = 5439493;BA.debugLine="bc.SetBitmapToImageView(bmp.Crop(0, 0, iv.Width *";
_bc._setbitmaptoimageview(_bmp.Crop((int) (0),(int) (0),(int) (_iv.getWidth()*__ref._mscale /*float*/ ),(int) (_iv.getHeight()*__ref._mscale /*float*/ )),_iv);
RDebugUtils.currentLine=5439494;
 //BA.debugLineNum = 5439494;BA.debugLine="End Sub";
return "";
}
public String  _fonttokey(ir.abalfazl.hero.zip.grabber.bctextengine __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "fonttokey", true))
	 {return ((String) Debug.delegate(ba, "fonttokey", new Object[] {_fnt,_clr}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Private Sub FontToKey (fnt As B4XFont, Clr As Int)";
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="Dim jo As JavaObject = fnt.ToNativeFont";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_fnt.ToNativeFont().getObject()));
RDebugUtils.currentLine=7864323;
 //BA.debugLineNum = 7864323;BA.debugLine="Return Clr + jo.RunMethod(\"hashCode\", Null) + fnt";
if (true) return BA.NumberToString(_clr+(double)(BA.ObjectToNumber(_jo.RunMethod("hashCode",(Object[])(__c.Null))))+_fnt.getSize());
RDebugUtils.currentLine=7864329;
 //BA.debugLineNum = 7864329;BA.debugLine="End Sub";
return "";
}
public ir.abalfazl.hero.zip.grabber.bctextengine._bcsinglestylesection  _getfirstsinglestyle(ir.abalfazl.hero.zip.grabber.bctextengine __ref,ir.abalfazl.hero.zip.grabber.bctextengine._bctextline _line) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "getfirstsinglestyle", true))
	 {return ((ir.abalfazl.hero.zip.grabber.bctextengine._bcsinglestylesection) Debug.delegate(ba, "getfirstsinglestyle", new Object[] {_line}));}
ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext _firstun = null;
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Private Sub GetFirstSingleStyle (Line As BCTextLin";
RDebugUtils.currentLine=5832705;
 //BA.debugLineNum = 5832705;BA.debugLine="Dim FirstUN As BCUnbreakableText = Line.Unbreakab";
_firstun = (ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext)(_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="Return FirstUN.SingleStyleSections.Get(0)";
if (true) return (ir.abalfazl.hero.zip.grabber.bctextengine._bcsinglestylesection)(_firstun.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
RDebugUtils.currentLine=5832707;
 //BA.debugLineNum = 5832707;BA.debugLine="End Sub";
return null;
}
public int  _getmingapbetweenlines(ir.abalfazl.hero.zip.grabber.bctextengine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "getmingapbetweenlines", true))
	 {return ((Integer) Debug.delegate(ba, "getmingapbetweenlines", null));}
RDebugUtils.currentLine=8257536;
 //BA.debugLineNum = 8257536;BA.debugLine="Public Sub getMinGapBetweenLines As Int";
RDebugUtils.currentLine=8257537;
 //BA.debugLineNum = 8257537;BA.debugLine="Return mMinGapBetweenLines";
if (true) return __ref._mmingapbetweenlines /*int*/ ;
RDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="End Sub";
return 0;
}
public float  _getspacebetweencharacters(ir.abalfazl.hero.zip.grabber.bctextengine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "getspacebetweencharacters", true))
	 {return ((Float) Debug.delegate(ba, "getspacebetweencharacters", null));}
RDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Public Sub getSpaceBetweenCharacters As Float";
RDebugUtils.currentLine=7929857;
 //BA.debugLineNum = 7929857;BA.debugLine="Return mSpaceBetweenCharacters / mScale";
if (true) return (float) (__ref._mspacebetweencharacters /*float*/ /(double)__ref._mscale /*float*/ );
RDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="End Sub";
return 0f;
}
public float  _getspacebetweenlines(ir.abalfazl.hero.zip.grabber.bctextengine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "getspacebetweenlines", true))
	 {return ((Float) Debug.delegate(ba, "getspacebetweenlines", null));}
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Public Sub getSpaceBetweenLines As Float";
RDebugUtils.currentLine=8060929;
 //BA.debugLineNum = 8060929;BA.debugLine="Return mSpaceBetweenLines / mScale";
if (true) return (float) (__ref._mspacebetweenlines /*int*/ /(double)__ref._mscale /*float*/ );
RDebugUtils.currentLine=8060930;
 //BA.debugLineNum = 8060930;BA.debugLine="End Sub";
return 0f;
}
public String  _handleconnectedtextruns(ir.abalfazl.hero.zip.grabber.bctextengine __ref,ir.abalfazl.hero.zip.grabber.bctextengine._bctextrun _run,anywheresoftware.b4a.objects.collections.List _unbreakables,ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraphstyle _style) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "handleconnectedtextruns", true))
	 {return ((String) Debug.delegate(ba, "handleconnectedtextruns", new Object[] {_run,_unbreakables,_style}));}
anywheresoftware.b4a.objects.collections.List _children = null;
ir.abalfazl.hero.zip.grabber.bctextengine._bcconnectedruns _cr = null;
ir.abalfazl.hero.zip.grabber.bctextengine._bctextrun _r = null;
int _width = 0;
ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext _un = null;
ir.abalfazl.hero.zip.grabber.bctextengine._bcfontmetrics _fm = null;
int _connectedwidth = 0;
ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext _u = null;
int _i = 0;
int _leftoffset = 0;
ir.abalfazl.hero.zip.grabber.bctextengine._bcsinglestylesection _single = null;
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Private Sub HandleConnectedTextRuns (Run As BCText";
RDebugUtils.currentLine=5963777;
 //BA.debugLineNum = 5963777;BA.debugLine="Dim children As List";
_children = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="children.Initialize";
_children.Initialize();
RDebugUtils.currentLine=5963779;
 //BA.debugLineNum = 5963779;BA.debugLine="Dim cr As BCConnectedRuns = Run.EXTRA.Get(EXTRA_C";
_cr = (ir.abalfazl.hero.zip.grabber.bctextengine._bcconnectedruns)(_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(__ref._extra_connectedruns /*String*/ )));
RDebugUtils.currentLine=5963780;
 //BA.debugLineNum = 5963780;BA.debugLine="For Each r As BCTextRun In cr.Runs";
{
final anywheresoftware.b4a.BA.IterableList group4 = _cr.Runs /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_r = (ir.abalfazl.hero.zip.grabber.bctextengine._bctextrun)(group4.Get(index4));
RDebugUtils.currentLine=5963781;
 //BA.debugLineNum = 5963781;BA.debugLine="HandleTextRun(r, children, Style)";
__ref._handletextrun /*String*/ (null,_r,_children,_style);
 }
};
RDebugUtils.currentLine=5963783;
 //BA.debugLineNum = 5963783;BA.debugLine="Dim width As Int";
_width = 0;
RDebugUtils.currentLine=5963784;
 //BA.debugLineNum = 5963784;BA.debugLine="For Each un As BCUnbreakableText In children";
{
final anywheresoftware.b4a.BA.IterableList group8 = _children;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_un = (ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext)(group8.Get(index8));
RDebugUtils.currentLine=5963785;
 //BA.debugLineNum = 5963785;BA.debugLine="un.IsMergable = True";
_un.IsMergable /*boolean*/  = __c.True;
RDebugUtils.currentLine=5963786;
 //BA.debugLineNum = 5963786;BA.debugLine="width = width + un.Width";
_width = (int) (_width+_un.Width /*int*/ );
 }
};
RDebugUtils.currentLine=5963788;
 //BA.debugLineNum = 5963788;BA.debugLine="Dim fm As BCFontMetrics = GetFontMetrics(Run.Text";
_fm = __ref._getfontmetrics /*ir.abalfazl.hero.zip.grabber.bctextengine._bcfontmetrics*/ (null,_run.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_run.TextColor /*int*/ );
RDebugUtils.currentLine=5963789;
 //BA.debugLineNum = 5963789;BA.debugLine="Dim ConnectedWidth As Int = cr.ConnectedWidth * m";
_connectedwidth = (int) (_cr.ConnectedWidth /*int*/ *__ref._mscale /*float*/ );
RDebugUtils.currentLine=5963791;
 //BA.debugLineNum = 5963791;BA.debugLine="Dim u As BCUnbreakableText = children.Get(0)";
_u = (ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext)(_children.Get((int) (0)));
RDebugUtils.currentLine=5963792;
 //BA.debugLineNum = 5963792;BA.debugLine="For i = 1 To children.Size - 1";
{
final int step15 = 1;
final int limit15 = (int) (_children.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=5963793;
 //BA.debugLineNum = 5963793;BA.debugLine="MergeUnbreakables(u, children.Get(i))";
__ref._mergeunbreakables /*String*/ (null,_u,(ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext)(_children.Get(_i)));
 }
};
RDebugUtils.currentLine=5963795;
 //BA.debugLineNum = 5963795;BA.debugLine="If width < ConnectedWidth Then";
if (_width<_connectedwidth) { 
RDebugUtils.currentLine=5963796;
 //BA.debugLineNum = 5963796;BA.debugLine="Dim leftOffset As Int";
_leftoffset = 0;
RDebugUtils.currentLine=5963797;
 //BA.debugLineNum = 5963797;BA.debugLine="Select cr.Alignment.ToLowerCase";
switch (BA.switchObjectToInt(_cr.Alignment /*String*/ .toLowerCase(),"center","right")) {
case 0: {
RDebugUtils.currentLine=5963799;
 //BA.debugLineNum = 5963799;BA.debugLine="leftOffset = (ConnectedWidth - u.Width) / 2";
_leftoffset = (int) ((_connectedwidth-_u.Width /*int*/ )/(double)2);
 break; }
case 1: {
RDebugUtils.currentLine=5963801;
 //BA.debugLineNum = 5963801;BA.debugLine="leftOffset = ConnectedWidth - u.Width - mSpace";
_leftoffset = (int) (_connectedwidth-_u.Width /*int*/ -__ref._mspacebetweencharacters /*float*/ );
 break; }
}
;
RDebugUtils.currentLine=5963803;
 //BA.debugLineNum = 5963803;BA.debugLine="u.Width = ConnectedWidth";
_u.Width /*int*/  = _connectedwidth;
RDebugUtils.currentLine=5963804;
 //BA.debugLineNum = 5963804;BA.debugLine="If leftOffset > 0 Then";
if (_leftoffset>0) { 
RDebugUtils.currentLine=5963805;
 //BA.debugLineNum = 5963805;BA.debugLine="Dim single As BCSingleStyleSection = CreateSing";
_single = __ref._createsinglesection /*ir.abalfazl.hero.zip.grabber.bctextengine._bcsinglestylesection*/ (null,_run,__ref._emptytextchars /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars*/ ,_fm);
RDebugUtils.currentLine=5963806;
 //BA.debugLineNum = 5963806;BA.debugLine="single.Width = leftOffset";
_single.Width /*int*/  = _leftoffset;
RDebugUtils.currentLine=5963807;
 //BA.debugLineNum = 5963807;BA.debugLine="u.SingleStyleSections.InsertAt(0, single)";
_u.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ .InsertAt((int) (0),(Object)(_single));
 };
 };
RDebugUtils.currentLine=5963810;
 //BA.debugLineNum = 5963810;BA.debugLine="u.IsMergable = False";
_u.IsMergable /*boolean*/  = __c.False;
RDebugUtils.currentLine=5963811;
 //BA.debugLineNum = 5963811;BA.debugLine="Unbreakables.Add(u)";
_unbreakables.Add((Object)(_u));
RDebugUtils.currentLine=5963812;
 //BA.debugLineNum = 5963812;BA.debugLine="End Sub";
return "";
}
public String  _handletextrun(ir.abalfazl.hero.zip.grabber.bctextengine __ref,ir.abalfazl.hero.zip.grabber.bctextengine._bctextrun _run,anywheresoftware.b4a.objects.collections.List _unbreakables,ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraphstyle _style) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "handletextrun", true))
	 {return ((String) Debug.delegate(ba, "handletextrun", new Object[] {_run,_unbreakables,_style}));}
ir.abalfazl.hero.zip.grabber.bctextengine._bcfontmetrics _fm = null;
int _i1 = 0;
int _i = 0;
String _c = "";
boolean _separatorgoestogetherwithtext = false;
int _offset = 0;
RDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Private Sub HandleTextRun (Run As BCTextRun, Unbre";
RDebugUtils.currentLine=6029313;
 //BA.debugLineNum = 6029313;BA.debugLine="Dim fm As BCFontMetrics = GetFontMetrics(Run.Text";
_fm = __ref._getfontmetrics /*ir.abalfazl.hero.zip.grabber.bctextengine._bcfontmetrics*/ (null,_run.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_run.TextColor /*int*/ );
RDebugUtils.currentLine=6029314;
 //BA.debugLineNum = 6029314;BA.debugLine="Dim i1 As Int";
_i1 = 0;
RDebugUtils.currentLine=6029315;
 //BA.debugLineNum = 6029315;BA.debugLine="For i = 0 To Run.TextChars.Length - 1";
{
final int step3 = 1;
final int limit3 = (int) (_run.TextChars /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars*/ .Length /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=6029316;
 //BA.debugLineNum = 6029316;BA.debugLine="Dim c As String = Run.TextChars.Buffer(Run.TextC";
_c = _run.TextChars /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars*/ .Buffer /*String[]*/ [(int) (_run.TextChars /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars*/ .StartIndex /*int*/ +_i)];
RDebugUtils.currentLine=6029317;
 //BA.debugLineNum = 6029317;BA.debugLine="If WordBoundaries.Contains(c) Then";
if (__ref._wordboundaries /*String*/ .contains(_c)) { 
RDebugUtils.currentLine=6029318;
 //BA.debugLineNum = 6029318;BA.debugLine="Dim SeparatorGoesTogetherWithText As Boolean";
_separatorgoestogetherwithtext = false;
RDebugUtils.currentLine=6029319;
 //BA.debugLineNum = 6029319;BA.debugLine="If i >= i1 + 1 Then";
if (_i>=_i1+1) { 
RDebugUtils.currentLine=6029320;
 //BA.debugLineNum = 6029320;BA.debugLine="Dim offset As Int";
_offset = 0;
RDebugUtils.currentLine=6029321;
 //BA.debugLineNum = 6029321;BA.debugLine="If WordBoundariesThatCanConnectToPrevWord.Inde";
if (__ref._wordboundariesthatcanconnecttoprevword /*String*/ .indexOf(_c)>-1) { 
RDebugUtils.currentLine=6029322;
 //BA.debugLineNum = 6029322;BA.debugLine="offset = 1";
_offset = (int) (1);
RDebugUtils.currentLine=6029323;
 //BA.debugLineNum = 6029323;BA.debugLine="SeparatorGoesTogetherWithText = True";
_separatorgoestogetherwithtext = __c.True;
 };
RDebugUtils.currentLine=6029325;
 //BA.debugLineNum = 6029325;BA.debugLine="Unbreakables.Add(CreateUnbreakable(Run, TextCh";
_unbreakables.Add((Object)(__ref._createunbreakable /*ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext*/ (null,_run,__ref._textcharssubstring /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars*/ (null,_run.TextChars /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars*/ ,_i1,(int) (_i+_offset)),_fm,__c.True,_style)));
 };
RDebugUtils.currentLine=6029327;
 //BA.debugLineNum = 6029327;BA.debugLine="If SeparatorGoesTogetherWithText = False Then";
if (_separatorgoestogetherwithtext==__c.False) { 
RDebugUtils.currentLine=6029328;
 //BA.debugLineNum = 6029328;BA.debugLine="Unbreakables.Add(CreateUnbreakable(Run, TextCh";
_unbreakables.Add((Object)(__ref._createunbreakable /*ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext*/ (null,_run,__ref._textcharssubstring /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars*/ (null,_run.TextChars /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars*/ ,_i,(int) (_i+1)),_fm,__c.True,_style)));
 }else {
RDebugUtils.currentLine=6029330;
 //BA.debugLineNum = 6029330;BA.debugLine="Unbreakables.Add(CreateUnbreakable(Run, EmptyT";
_unbreakables.Add((Object)(__ref._createunbreakable /*ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext*/ (null,_run,__ref._emptytextchars /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars*/ ,_fm,__c.True,_style)));
 };
RDebugUtils.currentLine=6029332;
 //BA.debugLineNum = 6029332;BA.debugLine="i1 = i + 1";
_i1 = (int) (_i+1);
 }else 
{RDebugUtils.currentLine=6029333;
 //BA.debugLineNum = 6029333;BA.debugLine="Else If c = Chr(13) Then";
if ((_c).equals(BA.ObjectToString(__c.Chr((int) (13))))) { 
RDebugUtils.currentLine=6029334;
 //BA.debugLineNum = 6029334;BA.debugLine="Continue";
if (true) continue;
 }}
;
 }
};
RDebugUtils.currentLine=6029337;
 //BA.debugLineNum = 6029337;BA.debugLine="If i1 < Run.TextChars.Length Then Unbreakables.Ad";
if (_i1<_run.TextChars /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars*/ .Length /*int*/ ) { 
_unbreakables.Add((Object)(__ref._createunbreakable /*ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext*/ (null,_run,__ref._textcharssubstring /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars*/ (null,_run.TextChars /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars*/ ,_i1,_run.TextChars /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars*/ .Length /*int*/ ),_fm,__c.False,_style)));};
RDebugUtils.currentLine=6029338;
 //BA.debugLineNum = 6029338;BA.debugLine="If Run.View.IsInitialized Then";
if (_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=6029339;
 //BA.debugLineNum = 6029339;BA.debugLine="Unbreakables.Add(CreateUnbreakable(Run, EmptyTex";
_unbreakables.Add((Object)(__ref._createunbreakable /*ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext*/ (null,_run,__ref._emptytextchars /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars*/ ,_fm,__c.False,_style)));
 };
RDebugUtils.currentLine=6029341;
 //BA.debugLineNum = 6029341;BA.debugLine="End Sub";
return "";
}
public String  _mergeunbreakables(ir.abalfazl.hero.zip.grabber.bctextengine __ref,ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext _un1,ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext _un2) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "mergeunbreakables", true))
	 {return ((String) Debug.delegate(ba, "mergeunbreakables", new Object[] {_un1,_un2}));}
ir.abalfazl.hero.zip.grabber.bctextengine._bcsinglestylesection _single = null;
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Private Sub MergeUnbreakables (un1 As BCUnbreakabl";
RDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="un1.Width = un1.Width + un2.Width + mSpaceBetween";
_un1.Width /*int*/  = (int) (_un1.Width /*int*/ +_un2.Width /*int*/ +__ref._mspacebetweencharacters /*float*/ );
RDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="For Each single As BCSingleStyleSection In un2.Si";
{
final anywheresoftware.b4a.BA.IterableList group2 = _un2.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_single = (ir.abalfazl.hero.zip.grabber.bctextengine._bcsinglestylesection)(group2.Get(index2));
RDebugUtils.currentLine=6291459;
 //BA.debugLineNum = 6291459;BA.debugLine="single.ParentUN = un1";
_single.ParentUN /*ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext*/  = _un1;
 }
};
RDebugUtils.currentLine=6291461;
 //BA.debugLineNum = 6291461;BA.debugLine="un1.SingleStyleSections.AddAll(un2.SingleStyleSec";
_un1.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(_un2.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=6291462;
 //BA.debugLineNum = 6291462;BA.debugLine="If un1.NotFullTextChars.Length = 0 Then un1.NotFu";
if (_un1.NotFullTextChars /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars*/ .Length /*int*/ ==0) { 
_un1.NotFullTextChars /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars*/  = _un2.NotFullTextChars /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars*/ ;};
RDebugUtils.currentLine=6291463;
 //BA.debugLineNum = 6291463;BA.debugLine="End Sub";
return "";
}
public ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars  _textcharssubstring(ir.abalfazl.hero.zip.grabber.bctextengine __ref,ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars _tc,int _startindex,int _endindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "textcharssubstring", true))
	 {return ((ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars) Debug.delegate(ba, "textcharssubstring", new Object[] {_tc,_startindex,_endindex}));}
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Private Sub TextCharsSubstring(TC As BCTextChars,";
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="Return CreateBCTextChars(TC.Buffer, StartIndex +";
if (true) return __ref._createbctextchars /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars*/ (null,_tc.Buffer /*String[]*/ ,(int) (_startindex+_tc.StartIndex /*int*/ ),(int) (_endindex-_startindex));
RDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="End Sub";
return null;
}
public String  _initialize(ir.abalfazl.hero.zip.grabber.bctextengine __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _parent) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_parent}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4j.objects.JFX _fx = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
byte[] _b = null;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Public Sub Initialize (Parent As B4XView)";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="CustomFonts.Initialize";
__ref._customfonts /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="VowelsCodePoints.Initialize";
__ref._vowelscodepoints /*ir.abalfazl.hero.zip.grabber.b4xset*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=4849667;
 //BA.debugLineNum = 4849667;BA.debugLine="EmptyTextChars = CreateBCTextCharsFromString(\"\")";
__ref._emptytextchars /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars*/  = __ref._createbctextcharsfromstring /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars*/ (null,"");
RDebugUtils.currentLine=4849668;
 //BA.debugLineNum = 4849668;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=4849669;
 //BA.debugLineNum = 4849669;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 2dip, 2dip)";
_p.SetLayoutAnimated((int) (0),0,0,__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=4849673;
 //BA.debugLineNum = 4849673;BA.debugLine="Try";
try {RDebugUtils.currentLine=4849674;
 //BA.debugLineNum = 4849674;BA.debugLine="Dim fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=4849675;
 //BA.debugLineNum = 4849675;BA.debugLine="Dim jo As JavaObject = fx.PrimaryScreen";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_fx.getPrimaryScreen().getObject()));
RDebugUtils.currentLine=4849676;
 //BA.debugLineNum = 4849676;BA.debugLine="mScale = Ceil(jo.RunMethod(\"getOutputScaleX\", Nu";
__ref._mscale /*float*/  = (float) (__c.Ceil((double)(BA.ObjectToNumber(_jo.RunMethod("getOutputScaleX",(Object[])(__c.Null))))));
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=4849678;
 //BA.debugLineNum = 4849678;BA.debugLine="mScale = 1";
__ref._mscale /*float*/  = (float) (1);
 };
RDebugUtils.currentLine=4849682;
 //BA.debugLineNum = 4849682;BA.debugLine="setSpaceBetweenCharacters(100dip / 100)";
__ref._setspacebetweencharacters /*String*/ (null,(float) (__c.DipToCurrent((int) (100))/(double)100));
RDebugUtils.currentLine=4849683;
 //BA.debugLineNum = 4849683;BA.debugLine="setSpaceBetweenLines(20dip)";
__ref._setspacebetweenlines /*String*/ (null,(float) (__c.DipToCurrent((int) (20))));
RDebugUtils.currentLine=4849684;
 //BA.debugLineNum = 4849684;BA.debugLine="cvs.Initialize(p)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(ba,_p);
RDebugUtils.currentLine=4849685;
 //BA.debugLineNum = 4849685;BA.debugLine="ResizeCharBC(50dip * mScale, 50dip * mScale)";
__ref._resizecharbc /*String*/ (null,(int) (__c.DipToCurrent((int) (50))*__ref._mscale /*float*/ ),(int) (__c.DipToCurrent((int) (50))*__ref._mscale /*float*/ ));
RDebugUtils.currentLine=4849686;
 //BA.debugLineNum = 4849686;BA.debugLine="Brushes.Initialize";
__ref._brushes /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=4849687;
 //BA.debugLineNum = 4849687;BA.debugLine="ResizeLayers(200dip, 100dip)";
__ref._resizelayers /*String*/ (null,__c.DipToCurrent((int) (200)),__c.DipToCurrent((int) (100)));
RDebugUtils.currentLine=4849688;
 //BA.debugLineNum = 4849688;BA.debugLine="cbccache.Initialize";
__ref._cbccache /*b4j.example.bitmapcreator._internalcompressedbccache*/ .Initialize();
RDebugUtils.currentLine=4849689;
 //BA.debugLineNum = 4849689;BA.debugLine="cbccache.ColorsMap.Initialize";
__ref._cbccache /*b4j.example.bitmapcreator._internalcompressedbccache*/ .ColorsMap.Initialize();
RDebugUtils.currentLine=4849690;
 //BA.debugLineNum = 4849690;BA.debugLine="FontMetricsCache.Initialize";
__ref._fontmetricscache /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=4849691;
 //BA.debugLineNum = 4849691;BA.debugLine="Dim b(CharBC.SAME_COLOR_LENGTH_FOR_CACHE * 4 * Ch";
_b = new byte[(int) (__ref._charbc /*b4j.example.bitmapcreator*/ ._same_color_length_for_cache*4*__ref._charbc /*b4j.example.bitmapcreator*/ ._max_same_color_size+4)];
;
RDebugUtils.currentLine=4849692;
 //BA.debugLineNum = 4849692;BA.debugLine="cbccache.mBuffer = b";
__ref._cbccache /*b4j.example.bitmapcreator._internalcompressedbccache*/ .mBuffer = _b;
RDebugUtils.currentLine=4849693;
 //BA.debugLineNum = 4849693;BA.debugLine="DefaultFont = xui.CreateDefaultFont(16)";
__ref._defaultfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (16));
RDebugUtils.currentLine=4849694;
 //BA.debugLineNum = 4849694;BA.debugLine="DefaultStyle = CreateStyle";
__ref._defaultstyle /*ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraphstyle*/  = __ref._createstyle /*ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraphstyle*/ (null);
RDebugUtils.currentLine=4849695;
 //BA.debugLineNum = 4849695;BA.debugLine="TagParser.Initialize (Me)";
__ref._tagparser /*ir.abalfazl.hero.zip.grabber.bbcodeparser*/ ._initialize /*String*/ (null,ba,(ir.abalfazl.hero.zip.grabber.bctextengine)(this));
RDebugUtils.currentLine=4849696;
 //BA.debugLineNum = 4849696;BA.debugLine="DefaultUnderlineStyle.Initialize";
__ref._defaultunderlinestyle /*ir.abalfazl.hero.zip.grabber.bctextengine._bcstyledunderline*/ .Initialize();
RDebugUtils.currentLine=4849697;
 //BA.debugLineNum = 4849697;BA.debugLine="DefaultUnderlineStyle.Clr = 0";
__ref._defaultunderlinestyle /*ir.abalfazl.hero.zip.grabber.bctextengine._bcstyledunderline*/ .Clr /*int*/  = (int) (0);
RDebugUtils.currentLine=4849698;
 //BA.debugLineNum = 4849698;BA.debugLine="DefaultUnderlineStyle.Style = \"line\"";
__ref._defaultunderlinestyle /*ir.abalfazl.hero.zip.grabber.bctextengine._bcstyledunderline*/ .Style /*String*/  = "line";
RDebugUtils.currentLine=4849699;
 //BA.debugLineNum = 4849699;BA.debugLine="DefaultUnderlineStyle.Thickness = 1dip";
__ref._defaultunderlinestyle /*ir.abalfazl.hero.zip.grabber.bctextengine._bcstyledunderline*/ .Thickness /*float*/  = (float) (__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=4849700;
 //BA.debugLineNum = 4849700;BA.debugLine="For Each v As B4XView In Parent.GetAllViewsRecurs";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group31 = _parent.GetAllViewsRecursive();
final int groupLen31 = group31.getSize()
;int index31 = 0;
;
for (; index31 < groupLen31;index31++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group31.Get(index31)));
RDebugUtils.currentLine=4849701;
 //BA.debugLineNum = 4849701;BA.debugLine="If v.Tag Is BBCodeView Or v.Tag Is BBLabel Then";
if (_v.getTag() instanceof ir.abalfazl.hero.zip.grabber.bbcodeview || _v.getTag() instanceof ir.abalfazl.hero.zip.grabber.bblabel) { 
RDebugUtils.currentLine=4849702;
 //BA.debugLineNum = 4849702;BA.debugLine="CallSub2(v.Tag, \"setTextEngine\", Me)";
__c.CallSubDebug2(ba,_v.getTag(),"setTextEngine",this);
 };
 }
};
RDebugUtils.currentLine=4849706;
 //BA.debugLineNum = 4849706;BA.debugLine="End Sub";
return "";
}
public String  _setspacebetweencharacters(ir.abalfazl.hero.zip.grabber.bctextengine __ref,float _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "setspacebetweencharacters", true))
	 {return ((String) Debug.delegate(ba, "setspacebetweencharacters", new Object[] {_f}));}
RDebugUtils.currentLine=7995392;
 //BA.debugLineNum = 7995392;BA.debugLine="Public Sub setSpaceBetweenCharacters(f As Float)";
RDebugUtils.currentLine=7995393;
 //BA.debugLineNum = 7995393;BA.debugLine="mSpaceBetweenCharacters = f * mScale";
__ref._mspacebetweencharacters /*float*/  = (float) (_f*__ref._mscale /*float*/ );
RDebugUtils.currentLine=7995394;
 //BA.debugLineNum = 7995394;BA.debugLine="End Sub";
return "";
}
public String  _setspacebetweenlines(ir.abalfazl.hero.zip.grabber.bctextengine __ref,float _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "setspacebetweenlines", true))
	 {return ((String) Debug.delegate(ba, "setspacebetweenlines", new Object[] {_f}));}
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Public Sub setSpaceBetweenLines(f As Float)";
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="mSpaceBetweenLines = f * mScale";
__ref._mspacebetweenlines /*int*/  = (int) (_f*__ref._mscale /*float*/ );
RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="End Sub";
return "";
}
public boolean  _isspace(ir.abalfazl.hero.zip.grabber.bctextengine __ref,ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars _tc) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "isspace", true))
	 {return ((Boolean) Debug.delegate(ba, "isspace", new Object[] {_tc}));}
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Private Sub IsSpace(TC As BCTextChars) As Boolean";
RDebugUtils.currentLine=7274497;
 //BA.debugLineNum = 7274497;BA.debugLine="Return TextCharEquals(TC, \" \")";
if (true) return __ref._textcharequals /*boolean*/ (null,_tc," ");
RDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="End Sub";
return false;
}
public boolean  _textcharequals(ir.abalfazl.hero.zip.grabber.bctextengine __ref,ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars _tc,String _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "textcharequals", true))
	 {return ((Boolean) Debug.delegate(ba, "textcharequals", new Object[] {_tc,_s}));}
int _i = 0;
RDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Private Sub TextCharEquals (TC As BCTextChars, s A";
RDebugUtils.currentLine=8519681;
 //BA.debugLineNum = 8519681;BA.debugLine="If TC.Length <> s.Length Then Return False";
if (_tc.Length /*int*/ !=_s.length()) { 
if (true) return __c.False;};
RDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="For i = 0 To TC.Length - 1";
{
final int step2 = 1;
final int limit2 = (int) (_tc.Length /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=8519683;
 //BA.debugLineNum = 8519683;BA.debugLine="If TC.Buffer(i + TC.StartIndex) <> s.CharAt(i) T";
if ((_tc.Buffer /*String[]*/ [(int) (_i+_tc.StartIndex /*int*/ )]).equals(BA.ObjectToString(_s.charAt(_i))) == false) { 
if (true) return __c.False;};
 }
};
RDebugUtils.currentLine=8519685;
 //BA.debugLineNum = 8519685;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=8519686;
 //BA.debugLineNum = 8519686;BA.debugLine="End Sub";
return false;
}
public String  _organizelines(ir.abalfazl.hero.zip.grabber.bctextengine __ref,ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraph _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "organizelines", true))
	 {return ((String) Debug.delegate(ba, "organizelines", new Object[] {_p}));}
String _paralignment = "";
int _count = 0;
int _prevlinebelowbaselineheight = 0;
ir.abalfazl.hero.zip.grabber.bctextengine._bctextline _line = null;
ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext _un = null;
ir.abalfazl.hero.zip.grabber.bctextengine._bcsinglestylesection _single = null;
int _maxwidth = 0;
String _alignment = "";
ir.abalfazl.hero.zip.grabber.bctextengine._bcsinglestylesection _linestyle = null;
ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext _last = null;
int _numberofgaps = 0;
float _delta = 0f;
float _accumalated = 0f;
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Private Sub OrganizeLines (p As BCParagraph)";
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="Dim ParAlignment As String = p.Style.HorizontalAl";
_paralignment = _p.Style /*ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraphstyle*/ .HorizontalAlignment /*String*/ .toLowerCase();
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="Dim count As Int";
_count = 0;
RDebugUtils.currentLine=5505027;
 //BA.debugLineNum = 5505027;BA.debugLine="Dim PrevLineBelowBaselineHeight As Int";
_prevlinebelowbaselineheight = 0;
RDebugUtils.currentLine=5505028;
 //BA.debugLineNum = 5505028;BA.debugLine="For Each line As BCTextLine In p.TextLines";
{
final anywheresoftware.b4a.BA.IterableList group4 = _p.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_line = (ir.abalfazl.hero.zip.grabber.bctextengine._bctextline)(group4.Get(index4));
RDebugUtils.currentLine=5505029;
 //BA.debugLineNum = 5505029;BA.debugLine="p.Width = Max(p.Width, line.Width)";
_p.Width /*int*/  = (int) (__c.Max(_p.Width /*int*/ ,_line.Width /*int*/ ));
RDebugUtils.currentLine=5505030;
 //BA.debugLineNum = 5505030;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreak";
{
final anywheresoftware.b4a.BA.IterableList group6 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_un = (ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext)(group6.Get(index6));
RDebugUtils.currentLine=5505031;
 //BA.debugLineNum = 5505031;BA.debugLine="For Each single As BCSingleStyleSection In un.S";
{
final anywheresoftware.b4a.BA.IterableList group7 = _un.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_single = (ir.abalfazl.hero.zip.grabber.bctextengine._bcsinglestylesection)(group7.Get(index7));
RDebugUtils.currentLine=5505032;
 //BA.debugLineNum = 5505032;BA.debugLine="line.MaxHeightAboveBaseLine = Max(single.MaxHe";
_line.MaxHeightAboveBaseLine /*int*/  = (int) (__c.Max(_single.MaxHeightAboveBaseLine /*int*/ ,_line.MaxHeightAboveBaseLine /*int*/ ));
RDebugUtils.currentLine=5505033;
 //BA.debugLineNum = 5505033;BA.debugLine="line.MaxHeightBelowBaseLine = Max(single.MaxHe";
_line.MaxHeightBelowBaseLine /*int*/  = (int) (__c.Max(_single.MaxHeightBelowBaseLine /*int*/ ,_line.MaxHeightBelowBaseLine /*int*/ ));
 }
};
 }
};
RDebugUtils.currentLine=5505036;
 //BA.debugLineNum = 5505036;BA.debugLine="If count = 0 Then";
if (_count==0) { 
RDebugUtils.currentLine=5505037;
 //BA.debugLineNum = 5505037;BA.debugLine="line.Height = line.MaxHeightAboveBaseLine";
_line.Height /*int*/  = _line.MaxHeightAboveBaseLine /*int*/ ;
 }else {
RDebugUtils.currentLine=5505039;
 //BA.debugLineNum = 5505039;BA.debugLine="line.Height =  Max(line.MaxHeightAboveBaseLine";
_line.Height /*int*/  = (int) (__c.Max(_line.MaxHeightAboveBaseLine /*int*/ +_prevlinebelowbaselineheight+__ref._mmingapbetweenlines /*int*/ *__ref._mscale /*float*/ ,__ref._mspacebetweenlines /*int*/ *_p.Style /*ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraphstyle*/ .LineSpacingFactor /*float*/ ));
 };
RDebugUtils.currentLine=5505041;
 //BA.debugLineNum = 5505041;BA.debugLine="p.Height = p.Height + line.Height";
_p.Height /*int*/  = (int) (_p.Height /*int*/ +_line.Height /*int*/ );
RDebugUtils.currentLine=5505042;
 //BA.debugLineNum = 5505042;BA.debugLine="line.BaselineY = p.Height";
_line.BaselineY /*int*/  = _p.Height /*int*/ ;
RDebugUtils.currentLine=5505043;
 //BA.debugLineNum = 5505043;BA.debugLine="PrevLineBelowBaselineHeight = line.MaxHeightBelo";
_prevlinebelowbaselineheight = _line.MaxHeightBelowBaseLine /*int*/ ;
RDebugUtils.currentLine=5505044;
 //BA.debugLineNum = 5505044;BA.debugLine="count = count + 1";
_count = (int) (_count+1);
 }
};
RDebugUtils.currentLine=5505046;
 //BA.debugLineNum = 5505046;BA.debugLine="Dim MaxWidth As Int = (p.Style.MaxWidth - p.Style";
_maxwidth = (int) ((_p.Style /*ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraphstyle*/ .MaxWidth /*int*/ -_p.Style /*ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft()-_p.Style /*ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getRight())*__ref._mscale /*float*/ );
RDebugUtils.currentLine=5505047;
 //BA.debugLineNum = 5505047;BA.debugLine="p.Width = Min(MaxWidth, p.Width)";
_p.Width /*int*/  = (int) (__c.Min(_maxwidth,_p.Width /*int*/ ));
RDebugUtils.currentLine=5505048;
 //BA.debugLineNum = 5505048;BA.debugLine="p.Height = p.Height + line.MaxHeightBelowBaseLine";
_p.Height /*int*/  = (int) (_p.Height /*int*/ +_line.MaxHeightBelowBaseLine /*int*/ );
RDebugUtils.currentLine=5505049;
 //BA.debugLineNum = 5505049;BA.debugLine="Dim alignment As String";
_alignment = "";
RDebugUtils.currentLine=5505050;
 //BA.debugLineNum = 5505050;BA.debugLine="For Each line As BCTextLine In p.TextLines";
{
final anywheresoftware.b4a.BA.IterableList group26 = _p.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen26 = group26.getSize()
;int index26 = 0;
;
for (; index26 < groupLen26;index26++){
_line = (ir.abalfazl.hero.zip.grabber.bctextengine._bctextline)(group26.Get(index26));
RDebugUtils.currentLine=5505051;
 //BA.debugLineNum = 5505051;BA.debugLine="If line.Unbreakables.Size = 0 Then Continue";
if (_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) continue;};
RDebugUtils.currentLine=5505052;
 //BA.debugLineNum = 5505052;BA.debugLine="Dim linestyle As BCSingleStyleSection = GetFirst";
_linestyle = __ref._getfirstsinglestyle /*ir.abalfazl.hero.zip.grabber.bctextengine._bcsinglestylesection*/ (null,_line);
RDebugUtils.currentLine=5505053;
 //BA.debugLineNum = 5505053;BA.debugLine="If linestyle.Run.HorizontalAlignment = \"\" Then a";
if ((_linestyle.Run /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextrun*/ .HorizontalAlignment /*String*/ ).equals("")) { 
_alignment = _paralignment;}
else {
_alignment = _linestyle.Run /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextrun*/ .HorizontalAlignment /*String*/ .toLowerCase();};
RDebugUtils.currentLine=5505054;
 //BA.debugLineNum = 5505054;BA.debugLine="If alignment = \"left\" Then";
if ((_alignment).equals("left")) { 
RDebugUtils.currentLine=5505055;
 //BA.debugLineNum = 5505055;BA.debugLine="If linestyle.Run.IndentLevel > 0 Then";
if (_linestyle.Run /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextrun*/ .IndentLevel /*int*/ >0) { 
RDebugUtils.currentLine=5505056;
 //BA.debugLineNum = 5505056;BA.debugLine="line.StartX = IndentWidth * linestyle.Run.Inde";
_line.StartX /*int*/  = (int) (__ref._indentwidth /*int*/ *_linestyle.Run /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextrun*/ .IndentLevel /*int*/ );
RDebugUtils.currentLine=5505057;
 //BA.debugLineNum = 5505057;BA.debugLine="p.Width = Max(p.Width, Min(MaxWidth, line.Widt";
_p.Width /*int*/  = (int) (__c.Max(_p.Width /*int*/ ,__c.Min(_maxwidth,_line.Width /*int*/ +_line.StartX /*int*/ )));
 };
 }else {
RDebugUtils.currentLine=5505060;
 //BA.debugLineNum = 5505060;BA.debugLine="p.Width = MaxWidth";
_p.Width /*int*/  = _maxwidth;
 };
RDebugUtils.currentLine=5505062;
 //BA.debugLineNum = 5505062;BA.debugLine="Select alignment";
switch (BA.switchObjectToInt(_alignment,"center","right","justify")) {
case 0: {
RDebugUtils.currentLine=5505064;
 //BA.debugLineNum = 5505064;BA.debugLine="line.StartX = p.Width / 2 - line.Width / 2";
_line.StartX /*int*/  = (int) (_p.Width /*int*/ /(double)2-_line.Width /*int*/ /(double)2);
 break; }
case 1: {
RDebugUtils.currentLine=5505066;
 //BA.debugLineNum = 5505066;BA.debugLine="line.StartX = p.Width - line.Width";
_line.StartX /*int*/  = (int) (_p.Width /*int*/ -_line.Width /*int*/ );
 break; }
case 2: {
RDebugUtils.currentLine=5505068;
 //BA.debugLineNum = 5505068;BA.debugLine="If line.EndsWithSoftLineBreak Then";
if (_line.EndsWithSoftLineBreak /*boolean*/ ) { 
RDebugUtils.currentLine=5505069;
 //BA.debugLineNum = 5505069;BA.debugLine="Dim last As BCUnbreakableText = line.Unbreaka";
_last = (ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext)(_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
RDebugUtils.currentLine=5505070;
 //BA.debugLineNum = 5505070;BA.debugLine="If IsSpace(last.NotFullTextChars) Then";
if (__ref._isspace /*boolean*/ (null,_last.NotFullTextChars /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars*/ )) { 
RDebugUtils.currentLine=5505071;
 //BA.debugLineNum = 5505071;BA.debugLine="line.Unbreakables.RemoveAt(line.Unbreakables";
_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
RDebugUtils.currentLine=5505072;
 //BA.debugLineNum = 5505072;BA.debugLine="line.Width = line.Width - last.Width";
_line.Width /*int*/  = (int) (_line.Width /*int*/ -_last.Width /*int*/ );
 };
RDebugUtils.currentLine=5505074;
 //BA.debugLineNum = 5505074;BA.debugLine="Dim NumberOfGaps As Int = line.Unbreakables.S";
_numberofgaps = (int) (_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
RDebugUtils.currentLine=5505075;
 //BA.debugLineNum = 5505075;BA.debugLine="If NumberOfGaps > 0 Then";
if (_numberofgaps>0) { 
RDebugUtils.currentLine=5505076;
 //BA.debugLineNum = 5505076;BA.debugLine="Dim delta As Float = (p.Width - line.Width)";
_delta = (float) ((_p.Width /*int*/ -_line.Width /*int*/ )/(double)_numberofgaps);
RDebugUtils.currentLine=5505077;
 //BA.debugLineNum = 5505077;BA.debugLine="Dim accumalated As Float = 0";
_accumalated = (float) (0);
RDebugUtils.currentLine=5505078;
 //BA.debugLineNum = 5505078;BA.debugLine="For Each un As BCUnbreakableText In line.Unb";
{
final anywheresoftware.b4a.BA.IterableList group54 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen54 = group54.getSize()
;int index54 = 0;
;
for (; index54 < groupLen54;index54++){
_un = (ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext)(group54.Get(index54));
RDebugUtils.currentLine=5505079;
 //BA.debugLineNum = 5505079;BA.debugLine="un.StartX = un.StartX + accumalated";
_un.StartX /*int*/  = (int) (_un.StartX /*int*/ +_accumalated);
RDebugUtils.currentLine=5505080;
 //BA.debugLineNum = 5505080;BA.debugLine="accumalated = accumalated + delta";
_accumalated = (float) (_accumalated+_delta);
 }
};
 };
 };
 break; }
}
;
 }
};
RDebugUtils.currentLine=5505086;
 //BA.debugLineNum = 5505086;BA.debugLine="End Sub";
return "";
}
public String  _organizertlparagraph(ir.abalfazl.hero.zip.grabber.bctextengine __ref,ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraph _par) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "organizertlparagraph", true))
	 {return ((String) Debug.delegate(ba, "organizertlparagraph", new Object[] {_par}));}
anywheresoftware.b4a.objects.collections.List _ltrlist = null;
ir.abalfazl.hero.zip.grabber.bctextengine._bctextline _line = null;
anywheresoftware.b4a.objects.collections.List _newlist = null;
ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext _un = null;
int _x = 0;
ir.abalfazl.hero.zip.grabber.bctextengine._bcsinglestylesection _single = null;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Private Sub OrganizeRTLParagraph (par As BCParagra";
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="Dim LTRList As List";
_ltrlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="LTRList.Initialize";
_ltrlist.Initialize();
RDebugUtils.currentLine=5570564;
 //BA.debugLineNum = 5570564;BA.debugLine="For Each line As BCTextLine In par.TextLines";
{
final anywheresoftware.b4a.BA.IterableList group3 = _par.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_line = (ir.abalfazl.hero.zip.grabber.bctextengine._bctextline)(group3.Get(index3));
RDebugUtils.currentLine=5570565;
 //BA.debugLineNum = 5570565;BA.debugLine="Dim NewList As List";
_newlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5570566;
 //BA.debugLineNum = 5570566;BA.debugLine="NewList.Initialize";
_newlist.Initialize();
RDebugUtils.currentLine=5570570;
 //BA.debugLineNum = 5570570;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreak";
{
final anywheresoftware.b4a.BA.IterableList group6 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_un = (ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext)(group6.Get(index6));
RDebugUtils.currentLine=5570571;
 //BA.debugLineNum = 5570571;BA.debugLine="If un.RTL Then";
if (_un.RTL /*boolean*/ ) { 
RDebugUtils.currentLine=5570572;
 //BA.debugLineNum = 5570572;BA.debugLine="AddLTRItems(LTRList, NewList)";
__ref._addltritems /*String*/ (null,_ltrlist,_newlist);
RDebugUtils.currentLine=5570573;
 //BA.debugLineNum = 5570573;BA.debugLine="NewList.Add(un)";
_newlist.Add((Object)(_un));
 }else {
RDebugUtils.currentLine=5570575;
 //BA.debugLineNum = 5570575;BA.debugLine="LTRList.InsertAt(0, un)";
_ltrlist.InsertAt((int) (0),(Object)(_un));
 };
 }
};
RDebugUtils.currentLine=5570578;
 //BA.debugLineNum = 5570578;BA.debugLine="AddLTRItems(LTRList, NewList)";
__ref._addltritems /*String*/ (null,_ltrlist,_newlist);
RDebugUtils.currentLine=5570579;
 //BA.debugLineNum = 5570579;BA.debugLine="line.Unbreakables = NewList";
_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/  = _newlist;
RDebugUtils.currentLine=5570584;
 //BA.debugLineNum = 5570584;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreak";
{
final anywheresoftware.b4a.BA.IterableList group16 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen16 = group16.getSize()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_un = (ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext)(group16.Get(index16));
RDebugUtils.currentLine=5570585;
 //BA.debugLineNum = 5570585;BA.debugLine="un.StartX = line.Width - un.StartX";
_un.StartX /*int*/  = (int) (_line.Width /*int*/ -_un.StartX /*int*/ );
RDebugUtils.currentLine=5570586;
 //BA.debugLineNum = 5570586;BA.debugLine="Dim x As Int = line.StartX + un.StartX";
_x = (int) (_line.StartX /*int*/ +_un.StartX /*int*/ );
RDebugUtils.currentLine=5570587;
 //BA.debugLineNum = 5570587;BA.debugLine="For Each single As BCSingleStyleSection In un.S";
{
final anywheresoftware.b4a.BA.IterableList group19 = _un.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen19 = group19.getSize()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_single = (ir.abalfazl.hero.zip.grabber.bctextengine._bcsinglestylesection)(group19.Get(index19));
RDebugUtils.currentLine=5570588;
 //BA.debugLineNum = 5570588;BA.debugLine="x = x - single.Width";
_x = (int) (_x-_single.Width /*int*/ );
RDebugUtils.currentLine=5570589;
 //BA.debugLineNum = 5570589;BA.debugLine="single.AbsoluteStartX = x";
_single.AbsoluteStartX /*int*/  = _x;
RDebugUtils.currentLine=5570590;
 //BA.debugLineNum = 5570590;BA.debugLine="x = x - mSpaceBetweenCharacters";
_x = (int) (_x-__ref._mspacebetweencharacters /*float*/ );
RDebugUtils.currentLine=5570591;
 //BA.debugLineNum = 5570591;BA.debugLine="If single.Run.View.IsInitialized Then";
if (_single.Run /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextrun*/ .View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=5570592;
 //BA.debugLineNum = 5570592;BA.debugLine="Dim v As B4XView = single.Run.View";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
_v = _single.Run /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextrun*/ .View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=5570593;
 //BA.debugLineNum = 5570593;BA.debugLine="v.Left = (x + mSpaceBetweenCharacters) / mSca";
_v.setLeft((_x+__ref._mspacebetweencharacters /*float*/ )/(double)__ref._mscale /*float*/ );
 };
 }
};
 }
};
 }
};
RDebugUtils.currentLine=5570598;
 //BA.debugLineNum = 5570598;BA.debugLine="End Sub";
return "";
}
public String  _organizesinglestyles(ir.abalfazl.hero.zip.grabber.bctextengine __ref,ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraph _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "organizesinglestyles", true))
	 {return ((String) Debug.delegate(ba, "organizesinglestyles", new Object[] {_p}));}
ir.abalfazl.hero.zip.grabber.bctextengine._bctextline _line = null;
ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext _un = null;
int _x = 0;
ir.abalfazl.hero.zip.grabber.bctextengine._bcsinglestylesection _single = null;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraph _par = null;
RDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Private Sub OrganizeSingleStyles (p As BCParagraph";
RDebugUtils.currentLine=5767169;
 //BA.debugLineNum = 5767169;BA.debugLine="For Each line As BCTextLine In p.TextLines";
{
final anywheresoftware.b4a.BA.IterableList group1 = _p.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_line = (ir.abalfazl.hero.zip.grabber.bctextengine._bctextline)(group1.Get(index1));
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreak";
{
final anywheresoftware.b4a.BA.IterableList group2 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_un = (ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext)(group2.Get(index2));
RDebugUtils.currentLine=5767171;
 //BA.debugLineNum = 5767171;BA.debugLine="Dim x As Int = line.StartX + un.StartX";
_x = (int) (_line.StartX /*int*/ +_un.StartX /*int*/ );
RDebugUtils.currentLine=5767172;
 //BA.debugLineNum = 5767172;BA.debugLine="For Each single As BCSingleStyleSection In un.S";
{
final anywheresoftware.b4a.BA.IterableList group4 = _un.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_single = (ir.abalfazl.hero.zip.grabber.bctextengine._bcsinglestylesection)(group4.Get(index4));
RDebugUtils.currentLine=5767173;
 //BA.debugLineNum = 5767173;BA.debugLine="single.AbsoluteStartX = x";
_single.AbsoluteStartX /*int*/  = _x;
RDebugUtils.currentLine=5767174;
 //BA.debugLineNum = 5767174;BA.debugLine="If single.GlyphsAndOffsets.Size = 0 And single";
if (_single.GlyphsAndOffsets /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0 && _single.Run /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextrun*/ .View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=5767175;
 //BA.debugLineNum = 5767175;BA.debugLine="Dim v As B4XView = single.Run.View";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
_v = _single.Run /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextrun*/ .View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=5767176;
 //BA.debugLineNum = 5767176;BA.debugLine="Dim par As BCParagraph = single.ParentUN.Pare";
_par = _single.ParentUN /*ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext*/ .ParentLine /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextline*/ .ParentParagraph /*ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraph*/ ;
RDebugUtils.currentLine=5767177;
 //BA.debugLineNum = 5767177;BA.debugLine="If par.Views.IsInitialized = False Then par.V";
if (_par.Views /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False) { 
_par.Views /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();};
RDebugUtils.currentLine=5767178;
 //BA.debugLineNum = 5767178;BA.debugLine="v.Left = (x + mSpaceBetweenCharacters) / mSca";
_v.setLeft((_x+__ref._mspacebetweencharacters /*float*/ )/(double)__ref._mscale /*float*/ );
RDebugUtils.currentLine=5767179;
 //BA.debugLineNum = 5767179;BA.debugLine="v.Top = line.BaselineY / mScale - v.Height +";
_v.setTop(_line.BaselineY /*int*/ /(double)__ref._mscale /*float*/ -_v.getHeight()+_single.Run /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextrun*/ .VerticalOffset /*int*/ );
RDebugUtils.currentLine=5767180;
 //BA.debugLineNum = 5767180;BA.debugLine="par.Views.Add(v)";
_par.Views /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_v.getObject()));
 };
RDebugUtils.currentLine=5767182;
 //BA.debugLineNum = 5767182;BA.debugLine="x = x + single.Width + mSpaceBetweenCharacters";
_x = (int) (_x+_single.Width /*int*/ +__ref._mspacebetweencharacters /*float*/ );
 }
};
 }
};
 }
};
RDebugUtils.currentLine=5767186;
 //BA.debugLineNum = 5767186;BA.debugLine="End Sub";
return "";
}
public String  _organizeunbreakables(ir.abalfazl.hero.zip.grabber.bctextengine __ref,ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraph _p,anywheresoftware.b4a.objects.collections.List _unbreakables) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "organizeunbreakables", true))
	 {return ((String) Debug.delegate(ba, "organizeunbreakables", new Object[] {_p,_unbreakables}));}
ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext _un = null;
int _i = 0;
ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext _nextun = null;
ir.abalfazl.hero.zip.grabber.bctextengine._bcsinglestylesection _singlestyle = null;
int _indent = 0;
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Private Sub OrganizeUnbreakables (p As BCParagraph";
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="If unbreakables.Size = 0 Then Return";
if (_unbreakables.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="Dim un As BCUnbreakableText = unbreakables.Get(0)";
_un = (ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext)(_unbreakables.Get((int) (0)));
RDebugUtils.currentLine=6225923;
 //BA.debugLineNum = 6225923;BA.debugLine="Dim i As Int = 1";
_i = (int) (1);
RDebugUtils.currentLine=6225924;
 //BA.debugLineNum = 6225924;BA.debugLine="Do While i < unbreakables.Size";
while (_i<_unbreakables.getSize()) {
RDebugUtils.currentLine=6225925;
 //BA.debugLineNum = 6225925;BA.debugLine="Dim NextUn As BCUnbreakableText = unbreakables.G";
_nextun = (ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext)(_unbreakables.Get(_i));
RDebugUtils.currentLine=6225926;
 //BA.debugLineNum = 6225926;BA.debugLine="If un.IsMergable = True And NextUn.IsMergable =";
if (_un.IsMergable /*boolean*/ ==__c.True && _nextun.IsMergable /*boolean*/ ==__c.True && _un.RTL /*boolean*/ ==_nextun.RTL /*boolean*/ ) { 
RDebugUtils.currentLine=6225927;
 //BA.debugLineNum = 6225927;BA.debugLine="MergeUnbreakables(un, NextUn)";
__ref._mergeunbreakables /*String*/ (null,_un,_nextun);
RDebugUtils.currentLine=6225928;
 //BA.debugLineNum = 6225928;BA.debugLine="unbreakables.RemoveAt(i)";
_unbreakables.RemoveAt(_i);
RDebugUtils.currentLine=6225929;
 //BA.debugLineNum = 6225929;BA.debugLine="i = i - 1";
_i = (int) (_i-1);
 }else {
RDebugUtils.currentLine=6225931;
 //BA.debugLineNum = 6225931;BA.debugLine="un = NextUn";
_un = _nextun;
 };
RDebugUtils.currentLine=6225933;
 //BA.debugLineNum = 6225933;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
;
RDebugUtils.currentLine=6225935;
 //BA.debugLineNum = 6225935;BA.debugLine="For Each un As BCUnbreakableText In unbreakables";
{
final anywheresoftware.b4a.BA.IterableList group15 = _unbreakables;
final int groupLen15 = group15.getSize()
;int index15 = 0;
;
for (; index15 < groupLen15;index15++){
_un = (ir.abalfazl.hero.zip.grabber.bctextengine._bcunbreakabletext)(group15.Get(index15));
RDebugUtils.currentLine=6225936;
 //BA.debugLineNum = 6225936;BA.debugLine="If TextCharEquals(un.NotFullTextChars, Chr(13))";
if (__ref._textcharequals /*boolean*/ (null,_un.NotFullTextChars /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars*/ ,BA.ObjectToString(__c.Chr((int) (13))))) { 
if (true) continue;};
RDebugUtils.currentLine=6225937;
 //BA.debugLineNum = 6225937;BA.debugLine="If TextCharEquals(un.NotFullTextChars, Chr(10))";
if (__ref._textcharequals /*boolean*/ (null,_un.NotFullTextChars /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars*/ ,BA.ObjectToString(__c.Chr((int) (10))))) { 
RDebugUtils.currentLine=6225938;
 //BA.debugLineNum = 6225938;BA.debugLine="CreateLine(p)";
__ref._createline /*String*/ (null,_p);
RDebugUtils.currentLine=6225939;
 //BA.debugLineNum = 6225939;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=6225941;
 //BA.debugLineNum = 6225941;BA.debugLine="If p.CurrentLine.Unbreakables.Size > 0 And p.Sty";
if (_p.CurrentLine /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextline*/ .Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0 && _p.Style /*ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraphstyle*/ .WordWrap /*boolean*/ ) { 
RDebugUtils.currentLine=6225942;
 //BA.debugLineNum = 6225942;BA.debugLine="Dim SingleStyle As BCSingleStyleSection = un.Si";
_singlestyle = (ir.abalfazl.hero.zip.grabber.bctextengine._bcsinglestylesection)(_un.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
RDebugUtils.currentLine=6225943;
 //BA.debugLineNum = 6225943;BA.debugLine="Dim indent As Int = IndentWidth * SingleStyle.R";
_indent = (int) (__ref._indentwidth /*int*/ *_singlestyle.Run /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextrun*/ .IndentLevel /*int*/ );
RDebugUtils.currentLine=6225944;
 //BA.debugLineNum = 6225944;BA.debugLine="If p.CurrentLine.Width + mSpaceBetweenCharacter";
if (_p.CurrentLine /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextline*/ .Width /*int*/ +__ref._mspacebetweencharacters /*float*/ +_un.Width /*int*/ +_indent>(_p.Style /*ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraphstyle*/ .MaxWidth /*int*/ -_p.Style /*ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft()-_p.Style /*ir.abalfazl.hero.zip.grabber.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getRight())*__ref._mscale /*float*/ ) { 
RDebugUtils.currentLine=6225945;
 //BA.debugLineNum = 6225945;BA.debugLine="p.CurrentLine.EndsWithSoftLineBreak = True";
_p.CurrentLine /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextline*/ .EndsWithSoftLineBreak /*boolean*/  = __c.True;
RDebugUtils.currentLine=6225946;
 //BA.debugLineNum = 6225946;BA.debugLine="CreateLine(p)";
__ref._createline /*String*/ (null,_p);
 };
 };
RDebugUtils.currentLine=6225949;
 //BA.debugLineNum = 6225949;BA.debugLine="p.CurrentLine.Unbreakables.Add(un)";
_p.CurrentLine /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextline*/ .Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_un));
RDebugUtils.currentLine=6225950;
 //BA.debugLineNum = 6225950;BA.debugLine="un.ParentLine = p.CurrentLine";
_un.ParentLine /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextline*/  = _p.CurrentLine /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextline*/ ;
RDebugUtils.currentLine=6225951;
 //BA.debugLineNum = 6225951;BA.debugLine="If IsSpace(un.NotFullTextChars) And p.CurrentLin";
if (__ref._isspace /*boolean*/ (null,_un.NotFullTextChars /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars*/ ) && _p.CurrentLine /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextline*/ .Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==1) { 
RDebugUtils.currentLine=6225952;
 //BA.debugLineNum = 6225952;BA.debugLine="un.Width = 0";
_un.Width /*int*/  = (int) (0);
 };
RDebugUtils.currentLine=6225954;
 //BA.debugLineNum = 6225954;BA.debugLine="If p.CurrentLine.Unbreakables.Size > 0 Then p.Cu";
if (_p.CurrentLine /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextline*/ .Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
_p.CurrentLine /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextline*/ .Width /*int*/  = (int) (_p.CurrentLine /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextline*/ .Width /*int*/ +__ref._mspacebetweencharacters /*float*/ );};
RDebugUtils.currentLine=6225955;
 //BA.debugLineNum = 6225955;BA.debugLine="un.StartX = p.CurrentLine.Width";
_un.StartX /*int*/  = _p.CurrentLine /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextline*/ .Width /*int*/ ;
RDebugUtils.currentLine=6225956;
 //BA.debugLineNum = 6225956;BA.debugLine="p.CurrentLine.Width = p.CurrentLine.Width + un.W";
_p.CurrentLine /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextline*/ .Width /*int*/  = (int) (_p.CurrentLine /*ir.abalfazl.hero.zip.grabber.bctextengine._bctextline*/ .Width /*int*/ +_un.Width /*int*/ );
 }
};
RDebugUtils.currentLine=6225958;
 //BA.debugLineNum = 6225958;BA.debugLine="End Sub";
return "";
}
public String  _printtextchars(ir.abalfazl.hero.zip.grabber.bctextengine __ref,ir.abalfazl.hero.zip.grabber.bctextengine._bctextchars _tc) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "printtextchars", true))
	 {return ((String) Debug.delegate(ba, "printtextchars", new Object[] {_tc}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Public Sub PrintTextChars(TC As BCTextChars)";
RDebugUtils.currentLine=8650753;
 //BA.debugLineNum = 8650753;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=8650754;
 //BA.debugLineNum = 8650754;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=8650755;
 //BA.debugLineNum = 8650755;BA.debugLine="For i = TC.StartIndex To TC.StartIndex + TC.Lengt";
{
final int step3 = 1;
final int limit3 = (int) (_tc.StartIndex /*int*/ +_tc.Length /*int*/ -1);
_i = _tc.StartIndex /*int*/  ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=8650756;
 //BA.debugLineNum = 8650756;BA.debugLine="sb.Append(TC.Buffer(i))";
_sb.Append(_tc.Buffer /*String[]*/ [_i]);
 }
};
RDebugUtils.currentLine=8650758;
 //BA.debugLineNum = 8650758;BA.debugLine="Log(sb.ToString)";
__c.LogImpl("98650758",_sb.ToString(),0);
RDebugUtils.currentLine=8650759;
 //BA.debugLineNum = 8650759;BA.debugLine="End Sub";
return "";
}
public String  _releaseasyncbc(ir.abalfazl.hero.zip.grabber.bctextengine __ref,b4j.example.bitmapcreator _bc) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "releaseasyncbc", true))
	 {return ((String) Debug.delegate(ba, "releaseasyncbc", new Object[] {_bc}));}
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Public Sub ReleaseAsyncBC(bc As BitmapCreator)";
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="AsyncBCs.Put(bc, False)";
__ref._asyncbcs /*ir.abalfazl.hero.zip.grabber.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_bc),(Object)(__c.False));
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="End Sub";
return "";
}
public String  _setmingapbetweenlines(ir.abalfazl.hero.zip.grabber.bctextengine __ref,int _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "setmingapbetweenlines", true))
	 {return ((String) Debug.delegate(ba, "setmingapbetweenlines", new Object[] {_i}));}
RDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Public Sub setMinGapBetweenLines(i As Int)";
RDebugUtils.currentLine=8192001;
 //BA.debugLineNum = 8192001;BA.debugLine="mMinGapBetweenLines = i";
__ref._mmingapbetweenlines /*int*/  = _i;
RDebugUtils.currentLine=8192002;
 //BA.debugLineNum = 8192002;BA.debugLine="End Sub";
return "";
}
}