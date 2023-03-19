package ir.abalfazl.hero.zip.grabber;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("ir.abalfazl.hero.zip.grabber", "ir.abalfazl.hero.zip.grabber.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			anywheresoftware.b4a.shell.ShellBA.delegateBA = new anywheresoftware.b4j.objects.FxBA("ir.abalfazl.hero.zip.grabber", null, null);
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "ir.abalfazl.hero.zip.grabber.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            if (!false)
                System.setProperty("prism.lcdtext", "false");
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.setDensity(javafx.stage.Screen.getPrimary().getDpi());
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 640, 640);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }


private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        b4j.example.dateutils._process_globals();
b4j.example.cssutils._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static anywheresoftware.b4a.keywords.Common __c = null;
public static String[] _extentions = null;
public static anywheresoftware.b4a.objects.collections.List _listnames = null;
public static anywheresoftware.b4a.objects.collections.List _listsites = null;
public static anywheresoftware.b4a.objects.collections.List _resultlvitems = null;
public static anywheresoftware.b4a.objects.collections.Map _taskids = null;
public static int _taskidnum = 0;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _mainform = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static anywheresoftware.b4j.objects.MenuItemWrapper.MenuBarWrapper _menubar1 = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _swet = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _startsearchbtn = null;
public static anywheresoftware.b4j.objects.ListViewWrapper _primarywordslv = null;
public static anywheresoftware.b4j.objects.ListViewWrapper _swlv = null;
public static anywheresoftware.b4j.objects.ListViewWrapper _resultslv = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _urlet = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
public static ir.abalfazl.hero.zip.grabber.b4xdialog _dialog = null;
public static ir.abalfazl.hero.zip.grabber.bctoast _toast = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _selectmultisitebtn = null;
public static ir.abalfazl.hero.zip.grabber.animatedcounter _scanedstatusac = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper _loadingiv = null;
public static ir.abalfazl.hero.zip.grabber.b4xinputtemplate _inputtemplate = null;
public static ir.abalfazl.hero.zip.grabber.anotherprogressbar _progressbar1 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _timestatudlbl = null;
public static b4j.example.dateutils _dateutils = null;
public static b4j.example.cssutils _cssutils = null;
public static ir.abalfazl.hero.zip.grabber.aboutact _aboutact = null;
public static ir.abalfazl.hero.zip.grabber.b4xcollections _b4xcollections = null;
public static ir.abalfazl.hero.zip.grabber.httputils2service _httputils2service = null;
public static ir.abalfazl.hero.zip.grabber.xuiviewsutils _xuiviewsutils = null;
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "appstart", false))
	 {return ((String) Debug.delegate(ba, "appstart", new Object[] {_form1,_args}));}
RDebugUtils.currentLine=65536;
 //BA.debugLineNum = 65536;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
RDebugUtils.currentLine=65538;
 //BA.debugLineNum = 65538;BA.debugLine="MainForm = Form1";
_mainform = _form1;
RDebugUtils.currentLine=65539;
 //BA.debugLineNum = 65539;BA.debugLine="MainForm.RootPane.LoadLayout(\"HomeLayout\")";
_mainform.getRootPane().LoadLayout(ba,"HomeLayout");
RDebugUtils.currentLine=65540;
 //BA.debugLineNum = 65540;BA.debugLine="MainForm.Show";
_mainform.Show();
RDebugUtils.currentLine=65543;
 //BA.debugLineNum = 65543;BA.debugLine="Base = MainForm.RootPane";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_mainform.getRootPane().getObject()));
RDebugUtils.currentLine=65544;
 //BA.debugLineNum = 65544;BA.debugLine="Dialog.Initialize (Base)";
_dialog._initialize /*String*/ (null,ba,_base);
RDebugUtils.currentLine=65545;
 //BA.debugLineNum = 65545;BA.debugLine="Dialog.Title = \"Enter Time between each url check";
_dialog._title /*Object*/  = (Object)("Enter Time between each url check");
RDebugUtils.currentLine=65546;
 //BA.debugLineNum = 65546;BA.debugLine="Dialog.TitleBarColor=0x58CDFF46";
_dialog._titlebarcolor /*int*/  = ((int)0x58cdff46);
RDebugUtils.currentLine=65548;
 //BA.debugLineNum = 65548;BA.debugLine="If File.Exists(File.DirApp, \"url.txt\") Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"url.txt")) { 
RDebugUtils.currentLine=65549;
 //BA.debugLineNum = 65549;BA.debugLine="UrlEt.text = File.ReadString(File.DirApp, \"url.t";
_urlet.setText(anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"url.txt"));
RDebugUtils.currentLine=65550;
 //BA.debugLineNum = 65550;BA.debugLine="If UrlEt.text.EndsWith(\".txt\") Then";
if (_urlet.getText().endsWith(".txt")) { 
RDebugUtils.currentLine=65551;
 //BA.debugLineNum = 65551;BA.debugLine="UrlEt.Tag=\"list\"";
_urlet.setTag((Object)("list"));
 }else {
RDebugUtils.currentLine=65553;
 //BA.debugLineNum = 65553;BA.debugLine="UrlEt.Tag=\"site\"";
_urlet.setTag((Object)("site"));
 };
 }else {
RDebugUtils.currentLine=65557;
 //BA.debugLineNum = 65557;BA.debugLine="UrlEt.Tag=\"site\"";
_urlet.setTag((Object)("site"));
 };
RDebugUtils.currentLine=65560;
 //BA.debugLineNum = 65560;BA.debugLine="If File.Exists(File.DirApp,\"ls\") Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"ls")) { 
RDebugUtils.currentLine=65561;
 //BA.debugLineNum = 65561;BA.debugLine="SWLV.Items.AddAll(File.ReadList(File.DirApp,\"ls\"";
_swlv.getItems().AddAll(anywheresoftware.b4a.keywords.Common.File.ReadList(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"ls"));
 };
RDebugUtils.currentLine=65564;
 //BA.debugLineNum = 65564;BA.debugLine="ResultLVItems.Initialize";
_resultlvitems.Initialize();
RDebugUtils.currentLine=65565;
 //BA.debugLineNum = 65565;BA.debugLine="ListSites.Initialize";
_listsites.Initialize();
RDebugUtils.currentLine=65566;
 //BA.debugLineNum = 65566;BA.debugLine="TaskIds.Initialize";
_taskids.Initialize();
RDebugUtils.currentLine=65568;
 //BA.debugLineNum = 65568;BA.debugLine="Toast.Initialize(MainForm.RootPane)";
_toast._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_mainform.getRootPane().getObject())));
RDebugUtils.currentLine=65569;
 //BA.debugLineNum = 65569;BA.debugLine="Toast.pnl.Color=0x85CDFF46";
_toast._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(((int)0x85cdff46));
RDebugUtils.currentLine=65571;
 //BA.debugLineNum = 65571;BA.debugLine="ResultsLV.Alpha = 0.8";
_resultslv.setAlpha(0.8);
RDebugUtils.currentLine=65573;
 //BA.debugLineNum = 65573;BA.debugLine="If Not(File.Exists(File.DirApp,\"sleeptime\")) Then";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"sleeptime"))) { 
RDebugUtils.currentLine=65574;
 //BA.debugLineNum = 65574;BA.debugLine="File.WriteString(File.DirApp,\"sleeptime\",2000)";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"sleeptime",BA.NumberToString(2000));
 };
RDebugUtils.currentLine=65577;
 //BA.debugLineNum = 65577;BA.debugLine="End Sub";
return "";
}
public static void  _downloadplz() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "downloadplz", false))
	 {Debug.delegate(ba, "downloadplz", null); return;}
ResumableSub_DownloadPlz rsub = new ResumableSub_DownloadPlz(null);
rsub.resume(ba, null);
}
public static class ResumableSub_DownloadPlz extends BA.ResumableSub {
public ResumableSub_DownloadPlz(ir.abalfazl.hero.zip.grabber.main parent) {
this.parent = parent;
}
ir.abalfazl.hero.zip.grabber.main parent;
int _mysleeptime = 0;
String _uri = "";
anywheresoftware.b4h.okhttp.OkHttpClientWrapper _hc = null;
anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest _req = null;
anywheresoftware.b4a.objects.collections.List _templ = null;
anywheresoftware.b4a.BA.IterableList group9;
int index9;
int groupLen9;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="Dim mysleeptime As Int";
_mysleeptime = 0;
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="If File.Exists(File.DirApp,\"sleeptime\") Then";
if (true) break;

case 1:
//if
this.state = 6;
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"sleeptime")) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="mysleeptime = File.ReadString(File.DirApp,\"sleep";
_mysleeptime = (int)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"sleeptime")));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="mysleeptime = 1110";
_mysleeptime = (int) (1110);
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=720906;
 //BA.debugLineNum = 720906;BA.debugLine="TimeStatudlbl.Text = \" From \"&PrimaryWordsLV.Item";
parent._timestatudlbl.setText(" From "+BA.NumberToString(parent._primarywordslv.getItems().getSize())+" item in "+BA.NumberToString((anywheresoftware.b4a.keywords.Common.Round(_mysleeptime/(double)1000*parent._primarywordslv.getItems().getSize()/(double)60)))+" Minute");
RDebugUtils.currentLine=720907;
 //BA.debugLineNum = 720907;BA.debugLine="Toast.Show(\"Start Grabbing \"&PrimaryWordsLV.Items";
parent._toast._show /*void*/ (null,"Start Grabbing "+BA.NumberToString(parent._primarywordslv.getItems().getSize())+" item in "+BA.NumberToString((anywheresoftware.b4a.keywords.Common.Round(_mysleeptime/(double)1000*parent._primarywordslv.getItems().getSize()/(double)60)))+" Minute");
RDebugUtils.currentLine=720909;
 //BA.debugLineNum = 720909;BA.debugLine="For Each uri As String In PrimaryWordsLV.Items";
if (true) break;

case 7:
//for
this.state = 16;
group9 = parent._primarywordslv.getItems();
index9 = 0;
groupLen9 = group9.getSize();
this.state = 23;
if (true) break;

case 23:
//C
this.state = 16;
if (index9 < groupLen9) {
this.state = 9;
_uri = BA.ObjectToString(group9.Get(index9));}
if (true) break;

case 24:
//C
this.state = 23;
index9++;
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=720911;
 //BA.debugLineNum = 720911;BA.debugLine="Dim hc As OkHttpClient";
_hc = new anywheresoftware.b4h.okhttp.OkHttpClientWrapper();
RDebugUtils.currentLine=720912;
 //BA.debugLineNum = 720912;BA.debugLine="hc.Initialize(\"hc\")";
_hc.Initialize("hc");
RDebugUtils.currentLine=720913;
 //BA.debugLineNum = 720913;BA.debugLine="Dim req As OkHttpRequest";
_req = new anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest();
RDebugUtils.currentLine=720914;
 //BA.debugLineNum = 720914;BA.debugLine="req.InitializeHead(uri)";
_req.InitializeHead(_uri);
RDebugUtils.currentLine=720915;
 //BA.debugLineNum = 720915;BA.debugLine="hc.Execute(req, TaskIDNum)";
_hc.Execute(ba,_req,parent._taskidnum);
RDebugUtils.currentLine=720917;
 //BA.debugLineNum = 720917;BA.debugLine="TaskIds.Put(TaskIDNum,uri)";
parent._taskids.Put((Object)(parent._taskidnum),(Object)(_uri));
RDebugUtils.currentLine=720918;
 //BA.debugLineNum = 720918;BA.debugLine="TaskIDNum = TaskIDNum+1";
parent._taskidnum = (int) (parent._taskidnum+1);
RDebugUtils.currentLine=720920;
 //BA.debugLineNum = 720920;BA.debugLine="ScanedStatusAC.Value=TaskIDNum";
parent._scanedstatusac._setvalue /*int*/ (null,parent._taskidnum);
RDebugUtils.currentLine=720923;
 //BA.debugLineNum = 720923;BA.debugLine="Sleep(mysleeptime)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "downloadplz"),_mysleeptime);
this.state = 25;
return;
case 25:
//C
this.state = 10;
;
RDebugUtils.currentLine=720925;
 //BA.debugLineNum = 720925;BA.debugLine="If StartSearchBtn.Tag==\"stopped\" Then Exit";
if (true) break;

case 10:
//if
this.state = 15;
if ((parent._startsearchbtn.getTag()).equals((Object)("stopped"))) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
this.state = 16;
if (true) break;
if (true) break;

case 15:
//C
this.state = 24;
;
 if (true) break;
if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=720930;
 //BA.debugLineNum = 720930;BA.debugLine="Dim templ As List";
_templ = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=720931;
 //BA.debugLineNum = 720931;BA.debugLine="templ.Initialize";
_templ.Initialize();
RDebugUtils.currentLine=720932;
 //BA.debugLineNum = 720932;BA.debugLine="If Not(File.Exists(File.DirData(\"HeroZipGrabber\")";
if (true) break;

case 17:
//if
this.state = 22;
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.DirData("HeroZipGrabber"),"Results"))) { 
this.state = 19;
}else {
this.state = 21;
}if (true) break;

case 19:
//C
this.state = 22;
RDebugUtils.currentLine=720933;
 //BA.debugLineNum = 720933;BA.debugLine="File.WriteList(File.DirData(\"HeroZipGrabber\"),\"R";
anywheresoftware.b4a.keywords.Common.File.WriteList(anywheresoftware.b4a.keywords.Common.File.DirData("HeroZipGrabber"),"Results",_templ);
 if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=720935;
 //BA.debugLineNum = 720935;BA.debugLine="templ = File.ReadList(File.DirData(\"HeroZipGrabb";
_templ = anywheresoftware.b4a.keywords.Common.File.ReadList(anywheresoftware.b4a.keywords.Common.File.DirData("HeroZipGrabber"),"Results");
 if (true) break;

case 22:
//C
this.state = -1;
;
RDebugUtils.currentLine=720937;
 //BA.debugLineNum = 720937;BA.debugLine="templ.AddAll(ResultLVItems)";
_templ.AddAll(parent._resultlvitems);
RDebugUtils.currentLine=720938;
 //BA.debugLineNum = 720938;BA.debugLine="File.WriteList(File.DirData(\"HeroZipGrabber\"),\"Re";
anywheresoftware.b4a.keywords.Common.File.WriteList(anywheresoftware.b4a.keywords.Common.File.DirData("HeroZipGrabber"),"Results",_templ);
RDebugUtils.currentLine=720940;
 //BA.debugLineNum = 720940;BA.debugLine="xui.MsgboxAsync(\"Grabb Ended...\", \"ENDED\")";
parent._xui.MsgboxAsync(ba,"Grabb Ended...","ENDED");
RDebugUtils.currentLine=720941;
 //BA.debugLineNum = 720941;BA.debugLine="StartSearchBtn.Text=\"Start Mission\"";
parent._startsearchbtn.setText("Start Mission");
RDebugUtils.currentLine=720942;
 //BA.debugLineNum = 720942;BA.debugLine="StartSearchBtn.Tag=\"stopped\"";
parent._startsearchbtn.setTag((Object)("stopped"));
RDebugUtils.currentLine=720944;
 //BA.debugLineNum = 720944;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _hc_responseerror(anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse _response,String _reason,int _statuscode,int _taskid) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "hc_responseerror", false))
	 {return ((String) Debug.delegate(ba, "hc_responseerror", new Object[] {_response,_reason,_statuscode,_taskid}));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub hc_ResponseError (Response As OkHttpResponse,";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Log(\"error: \" & StatusCode&\" .:|:. \"&TaskIds.Get(";
anywheresoftware.b4a.keywords.Common.LogImpl("8851969","error: "+BA.NumberToString(_statuscode)+" .:|:. "+BA.ObjectToString(_taskids.Get((Object)(_taskid))),0);
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="If MenuBar1.Tag=\"Show_Errors\" Then";
if ((_menubar1.getTag()).equals((Object)("Show_Errors"))) { 
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="ResultsLV.Items.Add(\"error: \" &StatusCode&\" .:|:";
_resultslv.getItems().Add((Object)("error: "+BA.NumberToString(_statuscode)+" .:|:. "+BA.ObjectToString(_taskids.Get((Object)(_taskid)))));
 };
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="Response.Release";
_response.Release();
RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="End Sub";
return "";
}
public static String  _hc_responsesuccess(anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse _response,int _taskid) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "hc_responsesuccess", false))
	 {return ((String) Debug.delegate(ba, "hc_responsesuccess", new Object[] {_response,_taskid}));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Sub hc_ResponseSuccess (Response As OkHttpResponse";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="If Response.ContentType==\"application/zip\" Then";
if ((_response.getContentType()).equals("application/zip")) { 
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="ResultsLV.Items.Add(Response.StatusCode&\" .:|:.";
_resultslv.getItems().Add((Object)(BA.NumberToString(_response.getStatusCode())+" .:|:. type: "+_response.getContentType()+" .:|:. "+BA.ObjectToString(_taskids.Get((Object)(_taskid)))));
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="ResultLVItems.Add(TaskIds.Get(TaskID))";
_resultlvitems.Add(_taskids.Get((Object)(_taskid)));
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="NotifyAdmin(TaskIds.Get(TaskID))";
_notifyadmin(BA.ObjectToString(_taskids.Get((Object)(_taskid))));
 }else {
RDebugUtils.currentLine=786438;
 //BA.debugLineNum = 786438;BA.debugLine="If MenuBar1.Tag=\"Show_Errors\" Then";
if ((_menubar1.getTag()).equals((Object)("Show_Errors"))) { 
RDebugUtils.currentLine=786439;
 //BA.debugLineNum = 786439;BA.debugLine="ResultsLV.Items.Add(Response.StatusCode&\" .:|:.";
_resultslv.getItems().Add((Object)(BA.NumberToString(_response.getStatusCode())+" .:|:. type: "+_response.getContentType()+" .:|:. length:"+BA.NumberToString(_response.getContentLength())+" .:|:. "+BA.ObjectToString(_taskids.Get((Object)(_taskid)))));
RDebugUtils.currentLine=786440;
 //BA.debugLineNum = 786440;BA.debugLine="Log(\"Fake OK 200 on : \"&TaskIds.Get(TaskID))";
anywheresoftware.b4a.keywords.Common.LogImpl("8786440","Fake OK 200 on : "+BA.ObjectToString(_taskids.Get((Object)(_taskid))),0);
 };
 };
RDebugUtils.currentLine=786443;
 //BA.debugLineNum = 786443;BA.debugLine="Response.Release";
_response.Release();
RDebugUtils.currentLine=786444;
 //BA.debugLineNum = 786444;BA.debugLine="End Sub";
return "";
}
public static void  _notifyadmin(String _text) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "notifyadmin", false))
	 {Debug.delegate(ba, "notifyadmin", new Object[] {_text}); return;}
ResumableSub_NotifyAdmin rsub = new ResumableSub_NotifyAdmin(null,_text);
rsub.resume(ba, null);
}
public static class ResumableSub_NotifyAdmin extends BA.ResumableSub {
public ResumableSub_NotifyAdmin(ir.abalfazl.hero.zip.grabber.main parent,String _text) {
this.parent = parent;
this._text = _text;
}
ir.abalfazl.hero.zip.grabber.main parent;
String _text;
ir.abalfazl.hero.zip.grabber.httpjob _j = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="Dim j As HttpJob";
_j = new ir.abalfazl.hero.zip.grabber.httpjob();
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",main.getObject());
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="j.Download($\"https://api.telegram.org/bot38608232";
_j._download /*String*/ (null,("https://api.telegram.org/bot386082322:AAGo8oGbKxntPwMji_kgA94PQN-dYmP-2d0/sendMessage?chat_id=41132191&disable_web_page_preview=true&text=Hi+%23HZG%0A+"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_text))+""));
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "notifyadmin"), (Object)(_j));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (ir.abalfazl.hero.zip.grabber.httpjob) result[0];
;
RDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="Log(\"Sended\")";
anywheresoftware.b4a.keywords.Common.LogImpl("81048583","Sended",0);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=1048585;
 //BA.debugLineNum = 1048585;BA.debugLine="j.Download($\"http://irhpentest.ir/wp-json/saeloz";
_j._download /*String*/ (null,("http://irhpentest.ir/wp-json/saelozahra-api/notify?msg="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_text))+""));
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=1048587;
 //BA.debugLineNum = 1048587;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=1048589;
 //BA.debugLineNum = 1048589;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _menubar1_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "menubar1_action", false))
	 {Debug.delegate(ba, "menubar1_action", null); return;}
ResumableSub_MenuBar1_Action rsub = new ResumableSub_MenuBar1_Action(null);
rsub.resume(ba, null);
}
public static class ResumableSub_MenuBar1_Action extends BA.ResumableSub {
public ResumableSub_MenuBar1_Action(ir.abalfazl.hero.zip.grabber.main parent) {
this.parent = parent;
}
ir.abalfazl.hero.zip.grabber.main parent;
anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mi = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="Dim mi As MenuItem = Sender";
_mi = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
_mi = (anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper(), (javafx.scene.control.MenuItem)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="Log(mi.Text)";
anywheresoftware.b4a.keywords.Common.LogImpl("8327682",_mi.getText(),0);
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="Select mi.Text";
if (true) break;

case 1:
//select
this.state = 18;
switch (BA.switchObjectToInt(_mi.getText(),"Show_Errors","_Close","Sleep Time","Proxy List","Our Team","Learn","Play / Pause")) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 5;
if (true) break;
}
case 2: {
this.state = 7;
if (true) break;
}
case 3: {
this.state = 13;
if (true) break;
}
case 4: 
case 5: {
this.state = 15;
if (true) break;
}
case 6: {
this.state = 17;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 18;
 if (true) break;

case 5:
//C
this.state = 18;
RDebugUtils.currentLine=327686;
 //BA.debugLineNum = 327686;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=327688;
 //BA.debugLineNum = 327688;BA.debugLine="InputTemplate.initialize";
parent._inputtemplate._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=327689;
 //BA.debugLineNum = 327689;BA.debugLine="InputTemplate.lblTitle.Text = \"Enter time per m";
parent._inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("Enter time per milliSecond(MS)");
RDebugUtils.currentLine=327690;
 //BA.debugLineNum = 327690;BA.debugLine="InputTemplate.Text = 1110";
parent._inputtemplate._text /*String*/  = BA.NumberToString(1110);
RDebugUtils.currentLine=327691;
 //BA.debugLineNum = 327691;BA.debugLine="InputTemplate.RegexPattern = \"\\d\\d\\d\" '<---opti";
parent._inputtemplate._regexpattern /*String*/  = "\\d\\d\\d";
RDebugUtils.currentLine=327692;
 //BA.debugLineNum = 327692;BA.debugLine="Wait For (Dialog.ShowTemplate(InputTemplate, \"S";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "menubar1_action"), parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(parent._inputtemplate),(Object)("Save"),(Object)(""),(Object)("CANCEL")));
this.state = 19;
return;
case 19:
//C
this.state = 8;
_result = (int) result[0];
;
RDebugUtils.currentLine=327693;
 //BA.debugLineNum = 327693;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 8:
//if
this.state = 11;
if (_result==parent._xui.DialogResponse_Positive) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=327694;
 //BA.debugLineNum = 327694;BA.debugLine="Log(InputTemplate.Text)";
anywheresoftware.b4a.keywords.Common.LogImpl("8327694",parent._inputtemplate._text /*String*/ ,0);
RDebugUtils.currentLine=327695;
 //BA.debugLineNum = 327695;BA.debugLine="Toast.Show(InputTemplate.Text)";
parent._toast._show /*void*/ (null,parent._inputtemplate._text /*String*/ );
RDebugUtils.currentLine=327696;
 //BA.debugLineNum = 327696;BA.debugLine="File.WriteString(File.DirApp,\"sleeptime\",Input";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"sleeptime",parent._inputtemplate._text /*String*/ );
 if (true) break;

case 11:
//C
this.state = 18;
;
 if (true) break;

case 13:
//C
this.state = 18;
RDebugUtils.currentLine=327699;
 //BA.debugLineNum = 327699;BA.debugLine="xui.MsgboxAsync(\"You have to pay to use these f";
parent._xui.MsgboxAsync(ba,"You have to pay to use these features","Pay");
 if (true) break;

case 15:
//C
this.state = 18;
RDebugUtils.currentLine=327701;
 //BA.debugLineNum = 327701;BA.debugLine="AboutAct.Show";
parent._aboutact._show /*String*/ ();
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=327703;
 //BA.debugLineNum = 327703;BA.debugLine="StartSearchBtn_Click";
_startsearchbtn_click();
 if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=327705;
 //BA.debugLineNum = 327705;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _startsearchbtn_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "startsearchbtn_click", false))
	 {return ((String) Debug.delegate(ba, "startsearchbtn_click", null));}
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Private Sub StartSearchBtn_Click";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="If Not(ListNames.IsInitialized) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_listnames.IsInitialized())) { 
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="Toast.Show(\"First Enter URl and Press *Enter*\")";
_toast._show /*void*/ (null,"First Enter URl and Press *Enter*");
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="UrlEt.RequestFocus";
_urlet.RequestFocus();
 }else {
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="If StartSearchBtn.Tag == \"started\" Then";
if ((_startsearchbtn.getTag()).equals((Object)("started"))) { 
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="StartSearchBtn.Text=\"Start Mission\"";
_startsearchbtn.setText("Start Mission");
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="StartSearchBtn.Tag=\"stopped\"";
_startsearchbtn.setTag((Object)("stopped"));
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="ScanedStatusAC.Value=0";
_scanedstatusac._setvalue /*int*/ (null,(int) (0));
RDebugUtils.currentLine=589833;
 //BA.debugLineNum = 589833;BA.debugLine="LoadingIV.Visible=False";
_loadingiv.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=589834;
 //BA.debugLineNum = 589834;BA.debugLine="StartSearchBtn.SetAlphaAnimated(1000,1)";
_startsearchbtn.SetAlphaAnimated((int) (1000),1);
RDebugUtils.currentLine=589835;
 //BA.debugLineNum = 589835;BA.debugLine="TimeStatudlbl.Text=\"\"";
_timestatudlbl.setText("");
 }else {
RDebugUtils.currentLine=589838;
 //BA.debugLineNum = 589838;BA.debugLine="StartSearchBtn.Text=\"Stop Mission\"";
_startsearchbtn.setText("Stop Mission");
RDebugUtils.currentLine=589839;
 //BA.debugLineNum = 589839;BA.debugLine="StartSearchBtn.Tag=\"started\"";
_startsearchbtn.setTag((Object)("started"));
RDebugUtils.currentLine=589840;
 //BA.debugLineNum = 589840;BA.debugLine="ResultsLV.Visible=True";
_resultslv.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=589841;
 //BA.debugLineNum = 589841;BA.debugLine="LoadingIV.Visible=True";
_loadingiv.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=589842;
 //BA.debugLineNum = 589842;BA.debugLine="StartSearchBtn.SetAlphaAnimated(1000,0.5)";
_startsearchbtn.SetAlphaAnimated((int) (1000),0.5);
RDebugUtils.currentLine=589843;
 //BA.debugLineNum = 589843;BA.debugLine="DownloadPlz";
_downloadplz();
 };
 };
RDebugUtils.currentLine=589846;
 //BA.debugLineNum = 589846;BA.debugLine="End Sub";
return "";
}
public static String  _menubar1_selectedchange(boolean _selected) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "menubar1_selectedchange", false))
	 {return ((String) Debug.delegate(ba, "menubar1_selectedchange", new Object[] {_selected}));}
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Private Sub MenuBar1_SelectedChange (Selected As B";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="If Selected Then";
if (_selected) { 
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="MenuBar1.Tag=\"Show_Errors\"";
_menubar1.setTag((Object)("Show_Errors"));
 }else {
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="MenuBar1.Tag=\"Hide_Errors\"";
_menubar1.setTag((Object)("Hide_Errors"));
 };
RDebugUtils.currentLine=393222;
 //BA.debugLineNum = 393222;BA.debugLine="End Sub";
return "";
}
public static String  _resultslv_selectedindexchanged(int _index) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "resultslv_selectedindexchanged", false))
	 {return ((String) Debug.delegate(ba, "resultslv_selectedindexchanged", new Object[] {_index}));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Private Sub ResultsLV_SelectedIndexChanged(Index A";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Toast.Show(\"Link Copied to ClipBoard ...\")";
_toast._show /*void*/ (null,"Link Copied to ClipBoard ...");
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="fx.Clipboard.SetString(ResultLVItems.Get(Index))";
_fx.Clipboard.SetString(BA.ObjectToString(_resultlvitems.Get(_index)));
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="End Sub";
return "";
}
public static String  _selectmultisitebtn_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "selectmultisitebtn_click", false))
	 {return ((String) Debug.delegate(ba, "selectmultisitebtn_click", null));}
anywheresoftware.b4j.objects.FileChooserWrapper _fc = null;
String _selected = "";
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Private Sub SelectMultiSiteBtn_Click";
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="Dim FC As FileChooser";
_fc = new anywheresoftware.b4j.objects.FileChooserWrapper();
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="FC.Initialize";
_fc.Initialize();
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="FC.Title = \"Select the text file to check multi s";
_fc.setTitle("Select the text file to check multi sites");
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="FC.SetExtensionFilter(\"TXT\", Array As String(\"*.t";
_fc.SetExtensionFilter("TXT",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"*.txt"}));
RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="Dim selected As String = FC.ShowOpen(MainForm)";
_selected = _fc.ShowOpen(_mainform);
RDebugUtils.currentLine=983049;
 //BA.debugLineNum = 983049;BA.debugLine="Log(selected)";
anywheresoftware.b4a.keywords.Common.LogImpl("8983049",_selected,0);
RDebugUtils.currentLine=983051;
 //BA.debugLineNum = 983051;BA.debugLine="UrlEt.Tag=\"list\"";
_urlet.setTag((Object)("list"));
RDebugUtils.currentLine=983052;
 //BA.debugLineNum = 983052;BA.debugLine="UrlEt.Text = selected";
_urlet.setText(_selected);
RDebugUtils.currentLine=983054;
 //BA.debugLineNum = 983054;BA.debugLine="UrlEt_Action";
_urlet_action();
RDebugUtils.currentLine=983056;
 //BA.debugLineNum = 983056;BA.debugLine="End Sub";
return "";
}
public static String  _urlet_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "urlet_action", false))
	 {return ((String) Debug.delegate(ba, "urlet_action", null));}
anywheresoftware.b4a.objects.collections.List _list1 = null;
int _i = 0;
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Private Sub UrlEt_Action";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="ListSites.Clear";
_listsites.Clear();
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="If UrlEt.Tag=\"list\" Then";
if ((_urlet.getTag()).equals((Object)("list"))) { 
RDebugUtils.currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="If UrlEt.Text.EndsWith(\".txt\") Then";
if (_urlet.getText().endsWith(".txt")) { 
RDebugUtils.currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="Dim List1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="List1 = File.ReadList(\"\",UrlEt.Text)";
_list1 = anywheresoftware.b4a.keywords.Common.File.ReadList("",_urlet.getText());
RDebugUtils.currentLine=131078;
 //BA.debugLineNum = 131078;BA.debugLine="ListSites = List1";
_listsites = _list1;
RDebugUtils.currentLine=131079;
 //BA.debugLineNum = 131079;BA.debugLine="For i = 0 To List1.Size - 1";
{
final int step7 = 1;
final int limit7 = (int) (_list1.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=131080;
 //BA.debugLineNum = 131080;BA.debugLine="Log(List1.Get(i))";
anywheresoftware.b4a.keywords.Common.LogImpl("8131080",BA.ObjectToString(_list1.Get(_i)),0);
 }
};
RDebugUtils.currentLine=131082;
 //BA.debugLineNum = 131082;BA.debugLine="File.WriteString(File.DirApp, \"url.txt\",UrlEt.T";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"url.txt",_urlet.getText());
RDebugUtils.currentLine=131083;
 //BA.debugLineNum = 131083;BA.debugLine="UpdateLists";
_updatelists();
 }else {
RDebugUtils.currentLine=131085;
 //BA.debugLineNum = 131085;BA.debugLine="Toast.Show(\"No Valid \"&CRLF&\" Just Text file\")";
_toast._show /*void*/ (null,"No Valid "+anywheresoftware.b4a.keywords.Common.CRLF+" Just Text file");
 };
 }else {
RDebugUtils.currentLine=131089;
 //BA.debugLineNum = 131089;BA.debugLine="If UrlEt.Text.StartsWith(\"http\") And UrlEt.Text.";
if (_urlet.getText().startsWith("http") && _urlet.getText().contains(".")) { 
RDebugUtils.currentLine=131090;
 //BA.debugLineNum = 131090;BA.debugLine="If UrlEt.Text.EndsWith(\"/\") Then";
if (_urlet.getText().endsWith("/")) { 
RDebugUtils.currentLine=131091;
 //BA.debugLineNum = 131091;BA.debugLine="UrlEt.Text=UrlEt.Text.SubString2(0,UrlEt.Text.";
_urlet.setText(_urlet.getText().substring((int) (0),(int) (_urlet.getText().length()-1)));
 };
RDebugUtils.currentLine=131093;
 //BA.debugLineNum = 131093;BA.debugLine="File.WriteString(File.DirApp, \"url.txt\",UrlEt.T";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"url.txt",_urlet.getText());
RDebugUtils.currentLine=131094;
 //BA.debugLineNum = 131094;BA.debugLine="ListSites.Add(UrlEt.Text)";
_listsites.Add((Object)(_urlet.getText()));
RDebugUtils.currentLine=131095;
 //BA.debugLineNum = 131095;BA.debugLine="UpdateLists";
_updatelists();
 }else {
RDebugUtils.currentLine=131098;
 //BA.debugLineNum = 131098;BA.debugLine="Toast.Show(\"No Valid \"&CRLF&\" Enter Valid URL w";
_toast._show /*void*/ (null,"No Valid "+anywheresoftware.b4a.keywords.Common.CRLF+" Enter Valid URL with http or https");
RDebugUtils.currentLine=131099;
 //BA.debugLineNum = 131099;BA.debugLine="UrlEt.RequestFocus";
_urlet.RequestFocus();
RDebugUtils.currentLine=131100;
 //BA.debugLineNum = 131100;BA.debugLine="UrlEt.SelectAll";
_urlet.SelectAll();
 };
 };
RDebugUtils.currentLine=131103;
 //BA.debugLineNum = 131103;BA.debugLine="End Sub";
return "";
}
public static String  _swaddbtn_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "swaddbtn_click", false))
	 {return ((String) Debug.delegate(ba, "swaddbtn_click", null));}
anywheresoftware.b4a.objects.collections.List _ls = null;
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Private Sub SWAddBtn_Click";
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="Dim LS As List";
_ls = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="LS.Initialize";
_ls.Initialize();
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="If File.Exists(File.DirApp,\"ls\") Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"ls")) { 
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="LS = File.ReadList(File.DirApp,\"ls\")";
_ls = anywheresoftware.b4a.keywords.Common.File.ReadList(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"ls");
 };
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="LS.Add(SWET.Text)";
_ls.Add((Object)(_swet.getText()));
RDebugUtils.currentLine=458761;
 //BA.debugLineNum = 458761;BA.debugLine="File.WriteList(File.DirApp,\"ls\",LS)";
anywheresoftware.b4a.keywords.Common.File.WriteList(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"ls",_ls);
RDebugUtils.currentLine=458763;
 //BA.debugLineNum = 458763;BA.debugLine="SWLV.Items.Add(SWET.Text)";
_swlv.getItems().Add((Object)(_swet.getText()));
RDebugUtils.currentLine=458764;
 //BA.debugLineNum = 458764;BA.debugLine="SWET.Text=\"\"";
_swet.setText("");
RDebugUtils.currentLine=458766;
 //BA.debugLineNum = 458766;BA.debugLine="UpdateLists";
_updatelists();
RDebugUtils.currentLine=458768;
 //BA.debugLineNum = 458768;BA.debugLine="End Sub";
return "";
}
public static String  _updatelists() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "updatelists", false))
	 {return ((String) Debug.delegate(ba, "updatelists", null));}
String _uri = "";
String _url = "";
String _tempdash = "";
String[] _components = null;
String _ex = "";
int _i = 0;
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub UpdateLists";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="PrimaryWordsLV.Items.Clear";
_primarywordslv.getItems().Clear();
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="ListNames = File.ReadList(File.DirAssets, \"names.";
_listnames = anywheresoftware.b4a.keywords.Common.File.ReadList(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"names.txt");
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="For Each uri As String In SWLV.Items";
{
final anywheresoftware.b4a.BA.IterableList group3 = _swlv.getItems();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_uri = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=655366;
 //BA.debugLineNum = 655366;BA.debugLine="ListNames.Add(uri)";
_listnames.Add((Object)(_uri));
 }
};
RDebugUtils.currentLine=655369;
 //BA.debugLineNum = 655369;BA.debugLine="LogColor(\"adding \"&ListSites.Size&\" item\",0xFF0EA";
anywheresoftware.b4a.keywords.Common.LogImpl("8655369","adding "+BA.NumberToString(_listsites.getSize())+" item",((int)0xff0ea313));
RDebugUtils.currentLine=655371;
 //BA.debugLineNum = 655371;BA.debugLine="For Each url As String In ListSites";
{
final anywheresoftware.b4a.BA.IterableList group7 = _listsites;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_url = BA.ObjectToString(group7.Get(index7));
RDebugUtils.currentLine=655373;
 //BA.debugLineNum = 655373;BA.debugLine="If Not(url.StartsWith(\"http\")) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_url.startsWith("http"))) { 
RDebugUtils.currentLine=655374;
 //BA.debugLineNum = 655374;BA.debugLine="url=\"http://\"&url";
_url = "http://"+_url;
 };
RDebugUtils.currentLine=655377;
 //BA.debugLineNum = 655377;BA.debugLine="If url.Contains(\"-\") Then";
if (_url.contains("-")) { 
RDebugUtils.currentLine=655378;
 //BA.debugLineNum = 655378;BA.debugLine="Dim tempdash As String = url";
_tempdash = _url;
RDebugUtils.currentLine=655379;
 //BA.debugLineNum = 655379;BA.debugLine="tempdash = tempdash.Replace(\"http://\",\"\")";
_tempdash = _tempdash.replace("http://","");
RDebugUtils.currentLine=655380;
 //BA.debugLineNum = 655380;BA.debugLine="tempdash = tempdash.Replace(\"https://\",\"\")";
_tempdash = _tempdash.replace("https://","");
RDebugUtils.currentLine=655381;
 //BA.debugLineNum = 655381;BA.debugLine="tempdash = tempdash.SubString2(0,tempdash.LastI";
_tempdash = _tempdash.substring((int) (0),_tempdash.lastIndexOf("."));
RDebugUtils.currentLine=655382;
 //BA.debugLineNum = 655382;BA.debugLine="Log(tempdash&\"  has dash\")";
anywheresoftware.b4a.keywords.Common.LogImpl("8655382",_tempdash+"  has dash",0);
RDebugUtils.currentLine=655383;
 //BA.debugLineNum = 655383;BA.debugLine="ListNames.Add(tempdash)";
_listnames.Add((Object)(_tempdash));
RDebugUtils.currentLine=655384;
 //BA.debugLineNum = 655384;BA.debugLine="ListNames.Add(tempdash&\"-bck\")";
_listnames.Add((Object)(_tempdash+"-bck"));
RDebugUtils.currentLine=655385;
 //BA.debugLineNum = 655385;BA.debugLine="ListNames.Add(tempdash&\"-backup\")";
_listnames.Add((Object)(_tempdash+"-backup"));
RDebugUtils.currentLine=655386;
 //BA.debugLineNum = 655386;BA.debugLine="ListNames.Add(tempdash&\"_backup\")";
_listnames.Add((Object)(_tempdash+"_backup"));
RDebugUtils.currentLine=655387;
 //BA.debugLineNum = 655387;BA.debugLine="ListNames.Add(tempdash&\"_bck\")";
_listnames.Add((Object)(_tempdash+"_bck"));
RDebugUtils.currentLine=655388;
 //BA.debugLineNum = 655388;BA.debugLine="Dim components() As String";
_components = new String[(int) (0)];
java.util.Arrays.fill(_components,"");
RDebugUtils.currentLine=655389;
 //BA.debugLineNum = 655389;BA.debugLine="components = Regex.Split(\"-\", tempdash)";
_components = anywheresoftware.b4a.keywords.Common.Regex.Split("-",_tempdash);
RDebugUtils.currentLine=655390;
 //BA.debugLineNum = 655390;BA.debugLine="Log(components(0))";
anywheresoftware.b4a.keywords.Common.LogImpl("8655390",_components[(int) (0)],0);
RDebugUtils.currentLine=655391;
 //BA.debugLineNum = 655391;BA.debugLine="ListNames.Add(components(0))";
_listnames.Add((Object)(_components[(int) (0)]));
RDebugUtils.currentLine=655392;
 //BA.debugLineNum = 655392;BA.debugLine="Log(components(1))";
anywheresoftware.b4a.keywords.Common.LogImpl("8655392",_components[(int) (1)],0);
RDebugUtils.currentLine=655393;
 //BA.debugLineNum = 655393;BA.debugLine="ListNames.Add(components(1))";
_listnames.Add((Object)(_components[(int) (1)]));
 };
RDebugUtils.currentLine=655396;
 //BA.debugLineNum = 655396;BA.debugLine="If url.Contains(\"_\") Then";
if (_url.contains("_")) { 
RDebugUtils.currentLine=655397;
 //BA.debugLineNum = 655397;BA.debugLine="Dim tempdash As String = url";
_tempdash = _url;
RDebugUtils.currentLine=655398;
 //BA.debugLineNum = 655398;BA.debugLine="tempdash = tempdash.Replace(\"http://\",\"\")";
_tempdash = _tempdash.replace("http://","");
RDebugUtils.currentLine=655399;
 //BA.debugLineNum = 655399;BA.debugLine="tempdash = tempdash.Replace(\"https://\",\"\")";
_tempdash = _tempdash.replace("https://","");
RDebugUtils.currentLine=655400;
 //BA.debugLineNum = 655400;BA.debugLine="tempdash = tempdash.SubString2(0,tempdash.LastI";
_tempdash = _tempdash.substring((int) (0),_tempdash.lastIndexOf("."));
RDebugUtils.currentLine=655401;
 //BA.debugLineNum = 655401;BA.debugLine="Log(tempdash&\"  has _________\")";
anywheresoftware.b4a.keywords.Common.LogImpl("8655401",_tempdash+"  has _________",0);
RDebugUtils.currentLine=655402;
 //BA.debugLineNum = 655402;BA.debugLine="ListNames.Add(tempdash)";
_listnames.Add((Object)(_tempdash));
RDebugUtils.currentLine=655403;
 //BA.debugLineNum = 655403;BA.debugLine="ListNames.Add(tempdash&\"-bck\")";
_listnames.Add((Object)(_tempdash+"-bck"));
RDebugUtils.currentLine=655404;
 //BA.debugLineNum = 655404;BA.debugLine="ListNames.Add(tempdash&\"-backup\")";
_listnames.Add((Object)(_tempdash+"-backup"));
RDebugUtils.currentLine=655405;
 //BA.debugLineNum = 655405;BA.debugLine="ListNames.Add(tempdash&\"_backup\")";
_listnames.Add((Object)(_tempdash+"_backup"));
RDebugUtils.currentLine=655406;
 //BA.debugLineNum = 655406;BA.debugLine="ListNames.Add(tempdash&\"_bck\")";
_listnames.Add((Object)(_tempdash+"_bck"));
RDebugUtils.currentLine=655407;
 //BA.debugLineNum = 655407;BA.debugLine="Dim components() As String";
_components = new String[(int) (0)];
java.util.Arrays.fill(_components,"");
RDebugUtils.currentLine=655408;
 //BA.debugLineNum = 655408;BA.debugLine="components = Regex.Split(\"_\", tempdash)";
_components = anywheresoftware.b4a.keywords.Common.Regex.Split("_",_tempdash);
RDebugUtils.currentLine=655409;
 //BA.debugLineNum = 655409;BA.debugLine="Log(components(0))";
anywheresoftware.b4a.keywords.Common.LogImpl("8655409",_components[(int) (0)],0);
RDebugUtils.currentLine=655410;
 //BA.debugLineNum = 655410;BA.debugLine="ListNames.Add(components(0))";
_listnames.Add((Object)(_components[(int) (0)]));
RDebugUtils.currentLine=655411;
 //BA.debugLineNum = 655411;BA.debugLine="Log(components(1))";
anywheresoftware.b4a.keywords.Common.LogImpl("8655411",_components[(int) (1)],0);
RDebugUtils.currentLine=655412;
 //BA.debugLineNum = 655412;BA.debugLine="ListNames.Add(components(1))";
_listnames.Add((Object)(_components[(int) (1)]));
 };
RDebugUtils.currentLine=655415;
 //BA.debugLineNum = 655415;BA.debugLine="For Each ex As String In extentions";
{
final String[] group47 = _extentions;
final int groupLen47 = group47.length
;int index47 = 0;
;
for (; index47 < groupLen47;index47++){
_ex = group47[index47];
RDebugUtils.currentLine=655416;
 //BA.debugLineNum = 655416;BA.debugLine="For i = 0 To ListNames.Size - 1";
{
final int step48 = 1;
final int limit48 = (int) (_listnames.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit48 ;_i = _i + step48 ) {
RDebugUtils.currentLine=655417;
 //BA.debugLineNum = 655417;BA.debugLine="PrimaryWordsLV.Items.Add(url&\"/\"&ListNames.Get";
_primarywordslv.getItems().Add((Object)(_url+"/"+BA.ObjectToString(_listnames.Get(_i))+_ex));
 }
};
 }
};
 }
};
RDebugUtils.currentLine=655424;
 //BA.debugLineNum = 655424;BA.debugLine="End Sub";
return "";
}
public static void  _swlv_selectedindexchanged(int _index) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "swlv_selectedindexchanged", false))
	 {Debug.delegate(ba, "swlv_selectedindexchanged", new Object[] {_index}); return;}
ResumableSub_SWLV_SelectedIndexChanged rsub = new ResumableSub_SWLV_SelectedIndexChanged(null,_index);
rsub.resume(ba, null);
}
public static class ResumableSub_SWLV_SelectedIndexChanged extends BA.ResumableSub {
public ResumableSub_SWLV_SelectedIndexChanged(ir.abalfazl.hero.zip.grabber.main parent,int _index) {
this.parent = parent;
this._index = _index;
}
ir.abalfazl.hero.zip.grabber.main parent;
int _index;
Object _sf = null;
int _result = 0;
anywheresoftware.b4a.objects.collections.List _ls = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(\"Are You Sure";
_sf = parent._xui.Msgbox2Async(ba,"Are You Sure To Delete Item: "+BA.NumberToString((_index+1)),"Delete!","Yes","Cancel","No",(javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="Wait For (sf) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "swlv_selectedindexchanged"), _sf);
this.state = 8;
return;
case 8:
//C
this.state = 1;
_result = (int) result[0];
;
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==parent._xui.DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=524292;
 //BA.debugLineNum = 524292;BA.debugLine="Log(\"Deleted!!! \"&Index)";
anywheresoftware.b4a.keywords.Common.LogImpl("8524292","Deleted!!! "+BA.NumberToString(_index),0);
RDebugUtils.currentLine=524293;
 //BA.debugLineNum = 524293;BA.debugLine="Dim ls As List = File.ReadList(File.DirApp,\"ls\")";
_ls = new anywheresoftware.b4a.objects.collections.List();
_ls = anywheresoftware.b4a.keywords.Common.File.ReadList(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"ls");
RDebugUtils.currentLine=524294;
 //BA.debugLineNum = 524294;BA.debugLine="ls.RemoveAt(Index)";
_ls.RemoveAt(_index);
RDebugUtils.currentLine=524295;
 //BA.debugLineNum = 524295;BA.debugLine="File.WriteList(File.DirApp,\"ls\",ls)";
anywheresoftware.b4a.keywords.Common.File.WriteList(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"ls",_ls);
 if (true) break;
;
RDebugUtils.currentLine=524298;
 //BA.debugLineNum = 524298;BA.debugLine="If File.Exists(File.DirApp,\"ls\") Then";

case 4:
//if
this.state = 7;
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"ls")) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=524299;
 //BA.debugLineNum = 524299;BA.debugLine="SWLV.Items.Clear";
parent._swlv.getItems().Clear();
RDebugUtils.currentLine=524300;
 //BA.debugLineNum = 524300;BA.debugLine="SWLV.Items.AddAll(File.ReadList(File.DirApp,\"ls\"";
parent._swlv.getItems().AddAll(anywheresoftware.b4a.keywords.Common.File.ReadList(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"ls"));
 if (true) break;

case 7:
//C
this.state = -1;
;
RDebugUtils.currentLine=524303;
 //BA.debugLineNum = 524303;BA.debugLine="UpdateLists";
_updatelists();
RDebugUtils.currentLine=524305;
 //BA.debugLineNum = 524305;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _urlet_focuschanged(boolean _hasfocus) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "urlet_focuschanged", false))
	 {return ((String) Debug.delegate(ba, "urlet_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Private Sub UrlEt_FocusChanged (HasFocus As Boolea";
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="If Not(HasFocus) Then UrlEt_Action";
if (anywheresoftware.b4a.keywords.Common.Not(_hasfocus)) { 
_urlet_action();};
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="End Sub";
return "";
}
public static String  _urlet_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "urlet_textchanged", false))
	 {return ((String) Debug.delegate(ba, "urlet_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Private Sub UrlEt_TextChanged (Old As String, New";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="If UrlEt.Text.StartsWith(\"http\") And UrlEt.Text.C";
if (_urlet.getText().startsWith("http") && _urlet.getText().contains(".")) { 
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="UrlEt.Tag=\"site\"";
_urlet.setTag((Object)("site"));
 };
RDebugUtils.currentLine=196612;
 //BA.debugLineNum = 196612;BA.debugLine="End Sub";
return "";
}
}