package ir.abalfazl.hero.zip.grabber;


import anywheresoftware.b4a.BA;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("ir.abalfazl.hero.zip.grabber", "ir.abalfazl.hero.zip.grabber.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
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
public static anywheresoftware.b4a.keywords.Common __c = null;
public static String[] _extentions = null;
public static anywheresoftware.b4a.objects.collections.List _listnames = null;
public static anywheresoftware.b4a.objects.collections.List _listsites = null;
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
public static ir.abalfazl.hero.zip.grabber.b4xcollections _b4xcollections = null;
public static ir.abalfazl.hero.zip.grabber.httputils2service _httputils2service = null;
public static ir.abalfazl.hero.zip.grabber.xuiviewsutils _xuiviewsutils = null;
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
 //BA.debugLineNum = 37;BA.debugLine="MainForm = Form1";
_mainform = _form1;
 //BA.debugLineNum = 38;BA.debugLine="MainForm.RootPane.LoadLayout(\"HomeLayout\")";
_mainform.getRootPane().LoadLayout(ba,"HomeLayout");
 //BA.debugLineNum = 39;BA.debugLine="MainForm.Show";
_mainform.Show();
 //BA.debugLineNum = 42;BA.debugLine="Base = MainForm.RootPane";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_mainform.getRootPane().getObject()));
 //BA.debugLineNum = 43;BA.debugLine="Dialog.Initialize (Base)";
_dialog._initialize /*String*/ (ba,_base);
 //BA.debugLineNum = 44;BA.debugLine="Dialog.Title = \"Enter Time between each url check";
_dialog._title /*Object*/  = (Object)("Enter Time between each url check");
 //BA.debugLineNum = 45;BA.debugLine="Dialog.TitleBarColor=0x58CDFF46";
_dialog._titlebarcolor /*int*/  = ((int)0x58cdff46);
 //BA.debugLineNum = 47;BA.debugLine="If File.Exists(File.DirApp, \"url.txt\") Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"url.txt")) { 
 //BA.debugLineNum = 48;BA.debugLine="UrlEt.text = File.ReadString(File.DirApp, \"url.t";
_urlet.setText(anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"url.txt"));
 //BA.debugLineNum = 49;BA.debugLine="If UrlEt.text.EndsWith(\".txt\") Then";
if (_urlet.getText().endsWith(".txt")) { 
 //BA.debugLineNum = 50;BA.debugLine="UrlEt.Tag=\"list\"";
_urlet.setTag((Object)("list"));
 }else {
 //BA.debugLineNum = 52;BA.debugLine="UrlEt.Tag=\"site\"";
_urlet.setTag((Object)("site"));
 };
 }else {
 //BA.debugLineNum = 56;BA.debugLine="UrlEt.Tag=\"site\"";
_urlet.setTag((Object)("site"));
 };
 //BA.debugLineNum = 59;BA.debugLine="If File.Exists(File.DirApp,\"ls\") Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"ls")) { 
 //BA.debugLineNum = 60;BA.debugLine="SWLV.Items.AddAll(File.ReadList(File.DirApp,\"ls\"";
_swlv.getItems().AddAll(anywheresoftware.b4a.keywords.Common.File.ReadList(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"ls"));
 };
 //BA.debugLineNum = 63;BA.debugLine="ListSites.Initialize";
_listsites.Initialize();
 //BA.debugLineNum = 64;BA.debugLine="TaskIds.Initialize";
_taskids.Initialize();
 //BA.debugLineNum = 66;BA.debugLine="Toast.Initialize(MainForm.RootPane)";
_toast._initialize /*String*/ (ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_mainform.getRootPane().getObject())));
 //BA.debugLineNum = 67;BA.debugLine="Toast.pnl.Color=0x85CDFF46";
_toast._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(((int)0x85cdff46));
 //BA.debugLineNum = 69;BA.debugLine="ResultsLV.Alpha = 0.8";
_resultslv.setAlpha(0.8);
 //BA.debugLineNum = 71;BA.debugLine="If Not(File.Exists(File.DirApp,\"sleeptime\")) Then";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"sleeptime"))) { 
 //BA.debugLineNum = 72;BA.debugLine="File.WriteString(File.DirApp,\"sleeptime\",2000)";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"sleeptime",BA.NumberToString(2000));
 };
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return "";
}
public static void  _downloadplz() throws Exception{
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
anywheresoftware.b4a.BA.IterableList group9;
int index9;
int groupLen9;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 296;BA.debugLine="Dim mysleeptime As Int";
_mysleeptime = 0;
 //BA.debugLineNum = 297;BA.debugLine="If File.Exists(File.DirApp,\"sleeptime\") Then";
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
 //BA.debugLineNum = 298;BA.debugLine="mysleeptime = File.ReadString(File.DirApp,\"sleep";
_mysleeptime = (int)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"sleeptime")));
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 300;BA.debugLine="mysleeptime = 1110";
_mysleeptime = (int) (1110);
 if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 303;BA.debugLine="TimeStatudlbl.Text = \" From \"&PrimaryWordsLV.Item";
parent._timestatudlbl.setText(" From "+BA.NumberToString(parent._primarywordslv.getItems().getSize())+" item in "+BA.NumberToString((anywheresoftware.b4a.keywords.Common.Round(_mysleeptime/(double)1000*parent._primarywordslv.getItems().getSize()/(double)60)))+" Minute");
 //BA.debugLineNum = 304;BA.debugLine="Toast.Show(\"Start Grabbing \"&PrimaryWordsLV.Items";
parent._toast._show /*void*/ ("Start Grabbing "+BA.NumberToString(parent._primarywordslv.getItems().getSize())+" item in "+BA.NumberToString((anywheresoftware.b4a.keywords.Common.Round(_mysleeptime/(double)1000*parent._primarywordslv.getItems().getSize()/(double)60)))+" Minute");
 //BA.debugLineNum = 306;BA.debugLine="For Each uri As String In PrimaryWordsLV.Items";
if (true) break;

case 7:
//for
this.state = 16;
group9 = parent._primarywordslv.getItems();
index9 = 0;
groupLen9 = group9.getSize();
this.state = 17;
if (true) break;

case 17:
//C
this.state = 16;
if (index9 < groupLen9) {
this.state = 9;
_uri = BA.ObjectToString(group9.Get(index9));}
if (true) break;

case 18:
//C
this.state = 17;
index9++;
if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 308;BA.debugLine="Dim hc As OkHttpClient";
_hc = new anywheresoftware.b4h.okhttp.OkHttpClientWrapper();
 //BA.debugLineNum = 309;BA.debugLine="hc.Initialize(\"hc\")";
_hc.Initialize("hc");
 //BA.debugLineNum = 310;BA.debugLine="Dim req As OkHttpRequest";
_req = new anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest();
 //BA.debugLineNum = 311;BA.debugLine="req.InitializeHead(uri)";
_req.InitializeHead(_uri);
 //BA.debugLineNum = 312;BA.debugLine="hc.Execute(req, TaskIDNum)";
_hc.Execute(ba,_req,parent._taskidnum);
 //BA.debugLineNum = 314;BA.debugLine="TaskIds.Put(TaskIDNum,uri)";
parent._taskids.Put((Object)(parent._taskidnum),(Object)(_uri));
 //BA.debugLineNum = 315;BA.debugLine="TaskIDNum = TaskIDNum+1";
parent._taskidnum = (int) (parent._taskidnum+1);
 //BA.debugLineNum = 317;BA.debugLine="ScanedStatusAC.Value=TaskIDNum";
parent._scanedstatusac._setvalue /*int*/ (parent._taskidnum);
 //BA.debugLineNum = 320;BA.debugLine="Sleep(mysleeptime)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,_mysleeptime);
this.state = 19;
return;
case 19:
//C
this.state = 10;
;
 //BA.debugLineNum = 322;BA.debugLine="If StartSearchBtn.Tag==\"stopped\" Then Exit";
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
this.state = 18;
;
 if (true) break;
if (true) break;

case 16:
//C
this.state = -1;
;
 //BA.debugLineNum = 326;BA.debugLine="xui.MsgboxAsync(\"Grabb Ended...\", \"ENDED\")";
parent._xui.MsgboxAsync(ba,"Grabb Ended...","ENDED");
 //BA.debugLineNum = 327;BA.debugLine="StartSearchBtn.Text=\"Start Mission\"";
parent._startsearchbtn.setText("Start Mission");
 //BA.debugLineNum = 328;BA.debugLine="StartSearchBtn.Tag=\"stopped\"";
parent._startsearchbtn.setTag((Object)("stopped"));
 //BA.debugLineNum = 330;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _hc_responseerror(anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse _response,String _reason,int _statuscode,int _taskid) throws Exception{
 //BA.debugLineNum = 372;BA.debugLine="Sub hc_ResponseError (Response As OkHttpResponse,";
 //BA.debugLineNum = 373;BA.debugLine="Log(\"error: \" & StatusCode&\" .:|:. \"&TaskIds.Get(";
anywheresoftware.b4a.keywords.Common.LogImpl("3851969","error: "+BA.NumberToString(_statuscode)+" .:|:. "+BA.ObjectToString(_taskids.Get((Object)(_taskid))),0);
 //BA.debugLineNum = 374;BA.debugLine="If MenuBar1.Tag=\"Show_Errors\" Then";
if ((_menubar1.getTag()).equals((Object)("Show_Errors"))) { 
 //BA.debugLineNum = 375;BA.debugLine="ResultsLV.Items.Add(\"error: \" &StatusCode&\" .:|:";
_resultslv.getItems().Add((Object)("error: "+BA.NumberToString(_statuscode)+" .:|:. "+BA.ObjectToString(_taskids.Get((Object)(_taskid)))));
 };
 //BA.debugLineNum = 377;BA.debugLine="Response.Release";
_response.Release();
 //BA.debugLineNum = 378;BA.debugLine="End Sub";
return "";
}
public static String  _hc_responsesuccess(anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse _response,int _taskid) throws Exception{
 //BA.debugLineNum = 335;BA.debugLine="Sub hc_ResponseSuccess (Response As OkHttpResponse";
 //BA.debugLineNum = 336;BA.debugLine="If Response.ContentType==\"application/zip\" Then";
if ((_response.getContentType()).equals("application/zip")) { 
 //BA.debugLineNum = 338;BA.debugLine="ResultsLV.Items.Add(Response.StatusCode&\" .:|:.";
_resultslv.getItems().Add((Object)(BA.NumberToString(_response.getStatusCode())+" .:|:. type: "+_response.getContentType()+" .:|:. "+BA.ObjectToString(_taskids.Get((Object)(_taskid)))));
 }else {
 //BA.debugLineNum = 364;BA.debugLine="If MenuBar1.Tag=\"Show_Errors\" Then";
if ((_menubar1.getTag()).equals((Object)("Show_Errors"))) { 
 //BA.debugLineNum = 365;BA.debugLine="ResultsLV.Items.Add(Response.StatusCode&\" .:|:.";
_resultslv.getItems().Add((Object)(BA.NumberToString(_response.getStatusCode())+" .:|:. type: "+_response.getContentType()+" .:|:. length:"+BA.NumberToString(_response.getContentLength())+" .:|:. "+BA.ObjectToString(_taskids.Get((Object)(_taskid)))));
 //BA.debugLineNum = 366;BA.debugLine="Log(\"Fake OK 200 on : \"&TaskIds.Get(TaskID))";
anywheresoftware.b4a.keywords.Common.LogImpl("3786463","Fake OK 200 on : "+BA.ObjectToString(_taskids.Get((Object)(_taskid))),0);
 };
 };
 //BA.debugLineNum = 369;BA.debugLine="Response.Release";
_response.Release();
 //BA.debugLineNum = 370;BA.debugLine="End Sub";
return "";
}
public static void  _menubar1_action() throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 121;BA.debugLine="Dim mi As MenuItem = Sender";
_mi = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
_mi = (anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper(), (javafx.scene.control.MenuItem)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
 //BA.debugLineNum = 122;BA.debugLine="Log(mi.Text)";
anywheresoftware.b4a.keywords.Common.LogImpl("3327682",_mi.getText(),0);
 //BA.debugLineNum = 123;BA.debugLine="Select mi.Text";
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
 //BA.debugLineNum = 126;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 128;BA.debugLine="InputTemplate.initialize";
parent._inputtemplate._initialize /*String*/ (ba);
 //BA.debugLineNum = 129;BA.debugLine="InputTemplate.lblTitle.Text = \"Enter time per m";
parent._inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("Enter time per milliSecond(MS)");
 //BA.debugLineNum = 130;BA.debugLine="InputTemplate.Text = 1110";
parent._inputtemplate._text /*String*/  = BA.NumberToString(1110);
 //BA.debugLineNum = 131;BA.debugLine="InputTemplate.RegexPattern = \"\\d\\d\\d\\d\" '<---op";
parent._inputtemplate._regexpattern /*String*/  = "\\d\\d\\d\\d";
 //BA.debugLineNum = 132;BA.debugLine="Wait For (Dialog.ShowTemplate(InputTemplate, \"S";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent._inputtemplate),(Object)("Save"),(Object)(""),(Object)("CANCEL")));
this.state = 19;
return;
case 19:
//C
this.state = 8;
_result = (int) result[0];
;
 //BA.debugLineNum = 133;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
 //BA.debugLineNum = 134;BA.debugLine="Log(InputTemplate.Text)";
anywheresoftware.b4a.keywords.Common.LogImpl("3327694",parent._inputtemplate._text /*String*/ ,0);
 //BA.debugLineNum = 135;BA.debugLine="Toast.Show(InputTemplate.Text)";
parent._toast._show /*void*/ (parent._inputtemplate._text /*String*/ );
 //BA.debugLineNum = 136;BA.debugLine="File.WriteString(File.DirApp,\"sleeptime\",Input";
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
 //BA.debugLineNum = 139;BA.debugLine="xui.MsgboxAsync(\"You have to pay to use these f";
parent._xui.MsgboxAsync(ba,"You have to pay to use these features","Pay");
 if (true) break;

case 15:
//C
this.state = 18;
 //BA.debugLineNum = 141;BA.debugLine="fx.ShowExternalDocument(\"http://iranhack.com\")";
parent._fx.ShowExternalDocument("http://iranhack.com");
 //BA.debugLineNum = 142;BA.debugLine="fx.ShowExternalDocument(\"http://irhpentest.ir\")";
parent._fx.ShowExternalDocument("http://irhpentest.ir");
 if (true) break;

case 17:
//C
this.state = 18;
 //BA.debugLineNum = 144;BA.debugLine="StartSearchBtn_Click";
_startsearchbtn_click();
 if (true) break;

case 18:
//C
this.state = -1;
;
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _complete(int _result) throws Exception{
}
public static String  _menubar1_selectedchange(boolean _selected) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Private Sub MenuBar1_SelectedChange (Selected As B";
 //BA.debugLineNum = 149;BA.debugLine="If Selected Then";
if (_selected) { 
 //BA.debugLineNum = 150;BA.debugLine="MenuBar1.Tag=\"Show_Errors\"";
_menubar1.setTag((Object)("Show_Errors"));
 }else {
 //BA.debugLineNum = 152;BA.debugLine="MenuBar1.Tag=\"Hide_Errors\"";
_menubar1.setTag((Object)("Hide_Errors"));
 };
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return "";
}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        b4j.example.dateutils._process_globals();
b4j.example.cssutils._process_globals();
main._process_globals();
b4xcollections._process_globals();
httputils2service._process_globals();
xuiviewsutils._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Public extentions() As String = Array As String(\"";
_extentions = new String[]{".zip",".gzip",".tar.gz",".tar"};
 //BA.debugLineNum = 9;BA.debugLine="Dim ListNames,ListSites As List";
_listnames = new anywheresoftware.b4a.objects.collections.List();
_listsites = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 10;BA.debugLine="Dim TaskIds As Map";
_taskids = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 11;BA.debugLine="Dim TaskIDNum = 0 As Int";
_taskidnum = (int) (0);
 //BA.debugLineNum = 12;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 13;BA.debugLine="Private MainForm As Form";
_mainform = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 14;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 15;BA.debugLine="Private MenuBar1 As MenuBar";
_menubar1 = new anywheresoftware.b4j.objects.MenuItemWrapper.MenuBarWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private SWET As TextField";
_swet = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private StartSearchBtn As Button";
_startsearchbtn = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private PrimaryWordsLV,SWLV As ListView";
_primarywordslv = new anywheresoftware.b4j.objects.ListViewWrapper();
_swlv = new anywheresoftware.b4j.objects.ListViewWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private ResultsLV As ListView";
_resultslv = new anywheresoftware.b4j.objects.ListViewWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private UrlEt As TextField";
_urlet = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new ir.abalfazl.hero.zip.grabber.b4xdialog();
 //BA.debugLineNum = 25;BA.debugLine="Dim Toast As BCToast";
_toast = new ir.abalfazl.hero.zip.grabber.bctoast();
 //BA.debugLineNum = 26;BA.debugLine="Private SelectMultiSiteBtn As Button";
_selectmultisitebtn = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private ScanedStatusAC As AnimatedCounter";
_scanedstatusac = new ir.abalfazl.hero.zip.grabber.animatedcounter();
 //BA.debugLineNum = 28;BA.debugLine="Private LoadingIV As ImageView";
_loadingiv = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Dim InputTemplate As B4XInputTemplate";
_inputtemplate = new ir.abalfazl.hero.zip.grabber.b4xinputtemplate();
 //BA.debugLineNum = 31;BA.debugLine="Private ProgressBar1 As AnotherProgressBar";
_progressbar1 = new ir.abalfazl.hero.zip.grabber.anotherprogressbar();
 //BA.debugLineNum = 32;BA.debugLine="Private TimeStatudlbl As Label";
_timestatudlbl = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return "";
}
public static String  _resultslv_selectedindexchanged(int _index) throws Exception{
 //BA.debugLineNum = 380;BA.debugLine="Private Sub ResultsLV_SelectedIndexChanged(Index A";
 //BA.debugLineNum = 381;BA.debugLine="Toast.Show(\"Link Copied to ClipBoard ...\")";
_toast._show /*void*/ ("Link Copied to ClipBoard ...");
 //BA.debugLineNum = 382;BA.debugLine="fx.Clipboard.SetString(TaskIds.Get(Index))";
_fx.Clipboard.SetString(BA.ObjectToString(_taskids.Get((Object)(_index))));
 //BA.debugLineNum = 383;BA.debugLine="End Sub";
return "";
}
public static String  _selectmultisitebtn_click() throws Exception{
anywheresoftware.b4j.objects.FileChooserWrapper _fc = null;
String _selected = "";
 //BA.debugLineNum = 386;BA.debugLine="Private Sub SelectMultiSiteBtn_Click";
 //BA.debugLineNum = 390;BA.debugLine="Dim FC As FileChooser";
_fc = new anywheresoftware.b4j.objects.FileChooserWrapper();
 //BA.debugLineNum = 391;BA.debugLine="FC.Initialize";
_fc.Initialize();
 //BA.debugLineNum = 392;BA.debugLine="FC.Title = \"Select the text file to check multi s";
_fc.setTitle("Select the text file to check multi sites");
 //BA.debugLineNum = 393;BA.debugLine="FC.SetExtensionFilter(\"TXT\", Array As String(\"*.t";
_fc.SetExtensionFilter("TXT",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"*.txt"}));
 //BA.debugLineNum = 394;BA.debugLine="Dim selected As String = FC.ShowOpen(MainForm)";
_selected = _fc.ShowOpen(_mainform);
 //BA.debugLineNum = 395;BA.debugLine="Log(selected)";
anywheresoftware.b4a.keywords.Common.LogImpl("3983049",_selected,0);
 //BA.debugLineNum = 397;BA.debugLine="UrlEt.Tag=\"list\"";
_urlet.setTag((Object)("list"));
 //BA.debugLineNum = 398;BA.debugLine="UrlEt.Text = selected";
_urlet.setText(_selected);
 //BA.debugLineNum = 400;BA.debugLine="UrlEt_Action";
_urlet_action();
 //BA.debugLineNum = 402;BA.debugLine="End Sub";
return "";
}
public static String  _startsearchbtn_click() throws Exception{
 //BA.debugLineNum = 194;BA.debugLine="Private Sub StartSearchBtn_Click";
 //BA.debugLineNum = 195;BA.debugLine="If Not(ListNames.IsInitialized) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_listnames.IsInitialized())) { 
 //BA.debugLineNum = 196;BA.debugLine="Toast.Show(\"First Enter URl and Press *Enter*\")";
_toast._show /*void*/ ("First Enter URl and Press *Enter*");
 //BA.debugLineNum = 197;BA.debugLine="UrlEt.RequestFocus";
_urlet.RequestFocus();
 }else {
 //BA.debugLineNum = 199;BA.debugLine="If StartSearchBtn.Tag == \"started\" Then";
if ((_startsearchbtn.getTag()).equals((Object)("started"))) { 
 //BA.debugLineNum = 200;BA.debugLine="StartSearchBtn.Text=\"Start Mission\"";
_startsearchbtn.setText("Start Mission");
 //BA.debugLineNum = 201;BA.debugLine="StartSearchBtn.Tag=\"stopped\"";
_startsearchbtn.setTag((Object)("stopped"));
 //BA.debugLineNum = 202;BA.debugLine="ScanedStatusAC.Value=0";
_scanedstatusac._setvalue /*int*/ ((int) (0));
 //BA.debugLineNum = 203;BA.debugLine="LoadingIV.Visible=False";
_loadingiv.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 204;BA.debugLine="StartSearchBtn.SetAlphaAnimated(1000,1)";
_startsearchbtn.SetAlphaAnimated((int) (1000),1);
 //BA.debugLineNum = 205;BA.debugLine="TimeStatudlbl.Text=\"\"";
_timestatudlbl.setText("");
 }else {
 //BA.debugLineNum = 208;BA.debugLine="StartSearchBtn.Text=\"Stop Mission\"";
_startsearchbtn.setText("Stop Mission");
 //BA.debugLineNum = 209;BA.debugLine="StartSearchBtn.Tag=\"started\"";
_startsearchbtn.setTag((Object)("started"));
 //BA.debugLineNum = 210;BA.debugLine="ResultsLV.Visible=True";
_resultslv.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 211;BA.debugLine="LoadingIV.Visible=True";
_loadingiv.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 212;BA.debugLine="StartSearchBtn.SetAlphaAnimated(1000,0.5)";
_startsearchbtn.SetAlphaAnimated((int) (1000),0.5);
 //BA.debugLineNum = 213;BA.debugLine="DownloadPlz";
_downloadplz();
 };
 };
 //BA.debugLineNum = 216;BA.debugLine="End Sub";
return "";
}
public static String  _swaddbtn_click() throws Exception{
anywheresoftware.b4a.objects.collections.List _ls = null;
 //BA.debugLineNum = 156;BA.debugLine="Private Sub SWAddBtn_Click";
 //BA.debugLineNum = 158;BA.debugLine="Dim LS As List";
_ls = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 159;BA.debugLine="LS.Initialize";
_ls.Initialize();
 //BA.debugLineNum = 160;BA.debugLine="If File.Exists(File.DirApp,\"ls\") Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"ls")) { 
 //BA.debugLineNum = 161;BA.debugLine="LS = File.ReadList(File.DirApp,\"ls\")";
_ls = anywheresoftware.b4a.keywords.Common.File.ReadList(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"ls");
 };
 //BA.debugLineNum = 163;BA.debugLine="LS.Add(SWET.Text)";
_ls.Add((Object)(_swet.getText()));
 //BA.debugLineNum = 165;BA.debugLine="File.WriteList(File.DirApp,\"ls\",LS)";
anywheresoftware.b4a.keywords.Common.File.WriteList(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"ls",_ls);
 //BA.debugLineNum = 167;BA.debugLine="SWLV.Items.Add(SWET.Text)";
_swlv.getItems().Add((Object)(_swet.getText()));
 //BA.debugLineNum = 168;BA.debugLine="SWET.Text=\"\"";
_swet.setText("");
 //BA.debugLineNum = 170;BA.debugLine="UpdateLists";
_updatelists();
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return "";
}
public static void  _swlv_selectedindexchanged(int _index) throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 176;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(\"Are You Sure";
_sf = parent._xui.Msgbox2Async(ba,"Are You Sure To Delete Item: "+BA.NumberToString((_index+1)),"Delete!","Yes","Cancel","No",(javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 177;BA.debugLine="Wait For (sf) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, this, _sf);
this.state = 8;
return;
case 8:
//C
this.state = 1;
_result = (int) result[0];
;
 //BA.debugLineNum = 178;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
 //BA.debugLineNum = 179;BA.debugLine="Log(\"Deleted!!! \"&Index)";
anywheresoftware.b4a.keywords.Common.LogImpl("3524292","Deleted!!! "+BA.NumberToString(_index),0);
 //BA.debugLineNum = 180;BA.debugLine="Dim ls As List = File.ReadList(File.DirApp,\"ls\")";
_ls = new anywheresoftware.b4a.objects.collections.List();
_ls = anywheresoftware.b4a.keywords.Common.File.ReadList(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"ls");
 //BA.debugLineNum = 181;BA.debugLine="ls.RemoveAt(Index)";
_ls.RemoveAt(_index);
 //BA.debugLineNum = 182;BA.debugLine="File.WriteList(File.DirApp,\"ls\",ls)";
anywheresoftware.b4a.keywords.Common.File.WriteList(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"ls",_ls);
 if (true) break;
;
 //BA.debugLineNum = 185;BA.debugLine="If File.Exists(File.DirApp,\"ls\") Then";

case 4:
//if
this.state = 7;
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"ls")) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 186;BA.debugLine="SWLV.Items.Clear";
parent._swlv.getItems().Clear();
 //BA.debugLineNum = 187;BA.debugLine="SWLV.Items.AddAll(File.ReadList(File.DirApp,\"ls\"";
parent._swlv.getItems().AddAll(anywheresoftware.b4a.keywords.Common.File.ReadList(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"ls"));
 if (true) break;

case 7:
//C
this.state = -1;
;
 //BA.debugLineNum = 190;BA.debugLine="UpdateLists";
_updatelists();
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _msgbox_result(int _result) throws Exception{
}
public static String  _updatelists() throws Exception{
String _uri = "";
String _url = "";
String _tempdash = "";
String[] _components = null;
String _ex = "";
int _i = 0;
 //BA.debugLineNum = 224;BA.debugLine="Sub UpdateLists";
 //BA.debugLineNum = 225;BA.debugLine="PrimaryWordsLV.Items.Clear";
_primarywordslv.getItems().Clear();
 //BA.debugLineNum = 227;BA.debugLine="ListNames = File.ReadList(File.DirAssets, \"names.";
_listnames = anywheresoftware.b4a.keywords.Common.File.ReadList(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"names.txt");
 //BA.debugLineNum = 229;BA.debugLine="For Each uri As String In SWLV.Items";
{
final anywheresoftware.b4a.BA.IterableList group3 = _swlv.getItems();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_uri = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 230;BA.debugLine="ListNames.Add(uri)";
_listnames.Add((Object)(_uri));
 }
};
 //BA.debugLineNum = 233;BA.debugLine="LogColor(\"adding \"&ListSites.Size&\" item\",0xFF0EA";
anywheresoftware.b4a.keywords.Common.LogImpl("3655369","adding "+BA.NumberToString(_listsites.getSize())+" item",((int)0xff0ea313));
 //BA.debugLineNum = 235;BA.debugLine="For Each url As String In ListSites";
{
final anywheresoftware.b4a.BA.IterableList group7 = _listsites;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_url = BA.ObjectToString(group7.Get(index7));
 //BA.debugLineNum = 237;BA.debugLine="If Not(url.StartsWith(\"http\")) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_url.startsWith("http"))) { 
 //BA.debugLineNum = 238;BA.debugLine="url=\"http://\"&url";
_url = "http://"+_url;
 };
 //BA.debugLineNum = 241;BA.debugLine="If url.Contains(\"-\") Then";
if (_url.contains("-")) { 
 //BA.debugLineNum = 242;BA.debugLine="Dim tempdash As String = url";
_tempdash = _url;
 //BA.debugLineNum = 243;BA.debugLine="tempdash = tempdash.Replace(\"http://\",\"\")";
_tempdash = _tempdash.replace("http://","");
 //BA.debugLineNum = 244;BA.debugLine="tempdash = tempdash.Replace(\"https://\",\"\")";
_tempdash = _tempdash.replace("https://","");
 //BA.debugLineNum = 245;BA.debugLine="tempdash = tempdash.SubString2(0,tempdash.LastI";
_tempdash = _tempdash.substring((int) (0),_tempdash.lastIndexOf("."));
 //BA.debugLineNum = 246;BA.debugLine="Log(tempdash&\"  has dash\")";
anywheresoftware.b4a.keywords.Common.LogImpl("3655382",_tempdash+"  has dash",0);
 //BA.debugLineNum = 247;BA.debugLine="ListNames.Add(tempdash)";
_listnames.Add((Object)(_tempdash));
 //BA.debugLineNum = 248;BA.debugLine="ListNames.Add(tempdash&\"-bck\")";
_listnames.Add((Object)(_tempdash+"-bck"));
 //BA.debugLineNum = 249;BA.debugLine="ListNames.Add(tempdash&\"-backup\")";
_listnames.Add((Object)(_tempdash+"-backup"));
 //BA.debugLineNum = 250;BA.debugLine="ListNames.Add(tempdash&\"_backup\")";
_listnames.Add((Object)(_tempdash+"_backup"));
 //BA.debugLineNum = 251;BA.debugLine="ListNames.Add(tempdash&\"_bck\")";
_listnames.Add((Object)(_tempdash+"_bck"));
 //BA.debugLineNum = 252;BA.debugLine="Dim components() As String";
_components = new String[(int) (0)];
java.util.Arrays.fill(_components,"");
 //BA.debugLineNum = 253;BA.debugLine="components = Regex.Split(\"-\", tempdash)";
_components = anywheresoftware.b4a.keywords.Common.Regex.Split("-",_tempdash);
 //BA.debugLineNum = 254;BA.debugLine="Log(components(0))";
anywheresoftware.b4a.keywords.Common.LogImpl("3655390",_components[(int) (0)],0);
 //BA.debugLineNum = 255;BA.debugLine="ListNames.Add(components(0))";
_listnames.Add((Object)(_components[(int) (0)]));
 //BA.debugLineNum = 256;BA.debugLine="Log(components(1))";
anywheresoftware.b4a.keywords.Common.LogImpl("3655392",_components[(int) (1)],0);
 //BA.debugLineNum = 257;BA.debugLine="ListNames.Add(components(1))";
_listnames.Add((Object)(_components[(int) (1)]));
 };
 //BA.debugLineNum = 260;BA.debugLine="If url.Contains(\"_\") Then";
if (_url.contains("_")) { 
 //BA.debugLineNum = 261;BA.debugLine="Dim tempdash As String = url";
_tempdash = _url;
 //BA.debugLineNum = 262;BA.debugLine="tempdash = tempdash.Replace(\"http://\",\"\")";
_tempdash = _tempdash.replace("http://","");
 //BA.debugLineNum = 263;BA.debugLine="tempdash = tempdash.Replace(\"https://\",\"\")";
_tempdash = _tempdash.replace("https://","");
 //BA.debugLineNum = 264;BA.debugLine="tempdash = tempdash.SubString2(0,tempdash.LastI";
_tempdash = _tempdash.substring((int) (0),_tempdash.lastIndexOf("."));
 //BA.debugLineNum = 265;BA.debugLine="Log(tempdash&\"  has _________\")";
anywheresoftware.b4a.keywords.Common.LogImpl("3655401",_tempdash+"  has _________",0);
 //BA.debugLineNum = 266;BA.debugLine="ListNames.Add(tempdash)";
_listnames.Add((Object)(_tempdash));
 //BA.debugLineNum = 267;BA.debugLine="ListNames.Add(tempdash&\"-bck\")";
_listnames.Add((Object)(_tempdash+"-bck"));
 //BA.debugLineNum = 268;BA.debugLine="ListNames.Add(tempdash&\"-backup\")";
_listnames.Add((Object)(_tempdash+"-backup"));
 //BA.debugLineNum = 269;BA.debugLine="ListNames.Add(tempdash&\"_backup\")";
_listnames.Add((Object)(_tempdash+"_backup"));
 //BA.debugLineNum = 270;BA.debugLine="ListNames.Add(tempdash&\"_bck\")";
_listnames.Add((Object)(_tempdash+"_bck"));
 //BA.debugLineNum = 271;BA.debugLine="Dim components() As String";
_components = new String[(int) (0)];
java.util.Arrays.fill(_components,"");
 //BA.debugLineNum = 272;BA.debugLine="components = Regex.Split(\"_\", tempdash)";
_components = anywheresoftware.b4a.keywords.Common.Regex.Split("_",_tempdash);
 //BA.debugLineNum = 273;BA.debugLine="Log(components(0))";
anywheresoftware.b4a.keywords.Common.LogImpl("3655409",_components[(int) (0)],0);
 //BA.debugLineNum = 274;BA.debugLine="ListNames.Add(components(0))";
_listnames.Add((Object)(_components[(int) (0)]));
 //BA.debugLineNum = 275;BA.debugLine="Log(components(1))";
anywheresoftware.b4a.keywords.Common.LogImpl("3655411",_components[(int) (1)],0);
 //BA.debugLineNum = 276;BA.debugLine="ListNames.Add(components(1))";
_listnames.Add((Object)(_components[(int) (1)]));
 };
 //BA.debugLineNum = 279;BA.debugLine="For Each ex As String In extentions";
{
final String[] group47 = _extentions;
final int groupLen47 = group47.length
;int index47 = 0;
;
for (; index47 < groupLen47;index47++){
_ex = group47[index47];
 //BA.debugLineNum = 280;BA.debugLine="For i = 0 To ListNames.Size - 1";
{
final int step48 = 1;
final int limit48 = (int) (_listnames.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit48 ;_i = _i + step48 ) {
 //BA.debugLineNum = 281;BA.debugLine="PrimaryWordsLV.Items.Add(url&\"/\"&ListNames.Get";
_primarywordslv.getItems().Add((Object)(_url+"/"+BA.ObjectToString(_listnames.Get(_i))+_ex));
 }
};
 }
};
 }
};
 //BA.debugLineNum = 288;BA.debugLine="End Sub";
return "";
}
public static String  _urlet_action() throws Exception{
anywheresoftware.b4a.objects.collections.List _list1 = null;
int _i = 0;
 //BA.debugLineNum = 77;BA.debugLine="Private Sub UrlEt_Action";
 //BA.debugLineNum = 78;BA.debugLine="ListSites.Clear";
_listsites.Clear();
 //BA.debugLineNum = 79;BA.debugLine="If UrlEt.Tag=\"list\" Then";
if ((_urlet.getTag()).equals((Object)("list"))) { 
 //BA.debugLineNum = 80;BA.debugLine="If UrlEt.Text.EndsWith(\".txt\") Then";
if (_urlet.getText().endsWith(".txt")) { 
 //BA.debugLineNum = 81;BA.debugLine="Dim List1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 82;BA.debugLine="List1 = File.ReadList(\"\",UrlEt.Text)";
_list1 = anywheresoftware.b4a.keywords.Common.File.ReadList("",_urlet.getText());
 //BA.debugLineNum = 83;BA.debugLine="ListSites = List1";
_listsites = _list1;
 //BA.debugLineNum = 84;BA.debugLine="For i = 0 To List1.Size - 1";
{
final int step7 = 1;
final int limit7 = (int) (_list1.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
 //BA.debugLineNum = 85;BA.debugLine="Log(List1.Get(i))";
anywheresoftware.b4a.keywords.Common.LogImpl("3131080",BA.ObjectToString(_list1.Get(_i)),0);
 }
};
 //BA.debugLineNum = 87;BA.debugLine="File.WriteString(File.DirApp, \"url.txt\",UrlEt.T";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"url.txt",_urlet.getText());
 //BA.debugLineNum = 88;BA.debugLine="UpdateLists";
_updatelists();
 }else {
 //BA.debugLineNum = 90;BA.debugLine="Toast.Show(\"No Valid \"&CRLF&\" Just Text file\")";
_toast._show /*void*/ ("No Valid "+anywheresoftware.b4a.keywords.Common.CRLF+" Just Text file");
 };
 }else {
 //BA.debugLineNum = 94;BA.debugLine="If UrlEt.Text.StartsWith(\"http\") And UrlEt.Text.";
if (_urlet.getText().startsWith("http") && _urlet.getText().contains(".")) { 
 //BA.debugLineNum = 95;BA.debugLine="If UrlEt.Text.EndsWith(\"/\") Then";
if (_urlet.getText().endsWith("/")) { 
 //BA.debugLineNum = 96;BA.debugLine="UrlEt.Text=UrlEt.Text.SubString2(0,UrlEt.Text.";
_urlet.setText(_urlet.getText().substring((int) (0),(int) (_urlet.getText().length()-1)));
 };
 //BA.debugLineNum = 98;BA.debugLine="File.WriteString(File.DirApp, \"url.txt\",UrlEt.T";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"url.txt",_urlet.getText());
 //BA.debugLineNum = 99;BA.debugLine="ListSites.Add(UrlEt.Text)";
_listsites.Add((Object)(_urlet.getText()));
 //BA.debugLineNum = 100;BA.debugLine="UpdateLists";
_updatelists();
 }else {
 //BA.debugLineNum = 103;BA.debugLine="Toast.Show(\"No Valid \"&CRLF&\" Enter Valid URL w";
_toast._show /*void*/ ("No Valid "+anywheresoftware.b4a.keywords.Common.CRLF+" Enter Valid URL with http or https");
 //BA.debugLineNum = 104;BA.debugLine="UrlEt.RequestFocus";
_urlet.RequestFocus();
 //BA.debugLineNum = 105;BA.debugLine="UrlEt.SelectAll";
_urlet.SelectAll();
 };
 };
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return "";
}
public static String  _urlet_focuschanged(boolean _hasfocus) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Private Sub UrlEt_FocusChanged (HasFocus As Boolea";
 //BA.debugLineNum = 117;BA.debugLine="If Not(HasFocus) Then UrlEt_Action";
if (anywheresoftware.b4a.keywords.Common.Not(_hasfocus)) { 
_urlet_action();};
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return "";
}
public static String  _urlet_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Private Sub UrlEt_TextChanged (Old As String, New";
 //BA.debugLineNum = 111;BA.debugLine="If UrlEt.Text.StartsWith(\"http\") And UrlEt.Text.C";
if (_urlet.getText().startsWith("http") && _urlet.getText().contains(".")) { 
 //BA.debugLineNum = 112;BA.debugLine="UrlEt.Tag=\"site\"";
_urlet.setTag((Object)("site"));
 };
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return "";
}
}
