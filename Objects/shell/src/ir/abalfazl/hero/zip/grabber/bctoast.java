
package ir.abalfazl.hero.zip.grabber;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class bctoast {
    public static RemoteObject myClass;
	public bctoast() {
	}
    public static PCBA staticBA = new PCBA(null, bctoast.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _showindex = RemoteObject.createImmutable(0);
public static RemoteObject _bb1 = RemoteObject.declareNull("ir.abalfazl.hero.zip.grabber.bblabel");
public static RemoteObject _te = RemoteObject.declareNull("ir.abalfazl.hero.zip.grabber.bctextengine");
public static RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _durationms = RemoteObject.createImmutable(0);
public static RemoteObject _defaulttextcolor = RemoteObject.createImmutable(0);
public static RemoteObject _paddingsides = RemoteObject.createImmutable(0);
public static RemoteObject _paddingtopbottom = RemoteObject.createImmutable(0);
public static RemoteObject _maxheight = RemoteObject.createImmutable(0);
public static RemoteObject _verticalcenterpercentage = RemoteObject.createImmutable(0);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static ir.abalfazl.hero.zip.grabber.main _main = null;
public static ir.abalfazl.hero.zip.grabber.aboutact _aboutact = null;
public static ir.abalfazl.hero.zip.grabber.b4xcollections _b4xcollections = null;
public static ir.abalfazl.hero.zip.grabber.httputils2service _httputils2service = null;
public static ir.abalfazl.hero.zip.grabber.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"BB1",_ref.getField(false, "_bb1"),"CSSUtils",_ref.getField(false, "_cssutils"),"DateUtils",_ref.getField(false, "_dateutils"),"DefaultTextColor",_ref.getField(false, "_defaulttextcolor"),"DurationMs",_ref.getField(false, "_durationms"),"iv",_ref.getField(false, "_iv"),"MaxHeight",_ref.getField(false, "_maxheight"),"PaddingSides",_ref.getField(false, "_paddingsides"),"PaddingTopBottom",_ref.getField(false, "_paddingtopbottom"),"pnl",_ref.getField(false, "_pnl"),"ShowIndex",_ref.getField(false, "_showindex"),"te",_ref.getField(false, "_te"),"VerticalCenterPercentage",_ref.getField(false, "_verticalcenterpercentage"),"xui",_ref.getField(false, "_xui")};
}
}