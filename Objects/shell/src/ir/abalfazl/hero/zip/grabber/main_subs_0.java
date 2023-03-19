package ir.abalfazl.hero.zip.grabber;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _appstart(RemoteObject _form1,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,35);
if (RapidSub.canDelegate("appstart")) { return ir.abalfazl.hero.zip.grabber.main.remoteMe.runUserSub(false, "main","appstart", _form1, _args);}
Debug.locals.put("Form1", _form1);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 35;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
Debug.ShouldStop(4);
 BA.debugLineNum = 37;BA.debugLine="MainForm = Form1";
Debug.ShouldStop(16);
main._mainform = _form1;
 BA.debugLineNum = 38;BA.debugLine="MainForm.RootPane.LoadLayout(\"HomeLayout\")";
Debug.ShouldStop(32);
main._mainform.runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",main.ba,(Object)(RemoteObject.createImmutable("HomeLayout")));
 BA.debugLineNum = 39;BA.debugLine="MainForm.Show";
Debug.ShouldStop(64);
main._mainform.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 42;BA.debugLine="Base = MainForm.RootPane";
Debug.ShouldStop(512);
main._base = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), main._mainform.runMethod(false,"getRootPane").getObject());
 BA.debugLineNum = 43;BA.debugLine="Dialog.Initialize (Base)";
Debug.ShouldStop(1024);
main._dialog.runClassMethod (ir.abalfazl.hero.zip.grabber.b4xdialog.class, "_initialize" /*RemoteObject*/ ,main.ba,(Object)(main._base));
 BA.debugLineNum = 44;BA.debugLine="Dialog.Title = \"Enter Time between each url check";
Debug.ShouldStop(2048);
main._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Enter Time between each url check")));
 BA.debugLineNum = 45;BA.debugLine="Dialog.TitleBarColor=0x58CDFF46";
Debug.ShouldStop(4096);
main._dialog.setField ("_titlebarcolor" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0x58cdff46)));
 BA.debugLineNum = 47;BA.debugLine="If File.Exists(File.DirApp, \"url.txt\") Then";
Debug.ShouldStop(16384);
if (main.__c.getField(false,"File").runMethod(true,"Exists",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("url.txt"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 48;BA.debugLine="UrlEt.text = File.ReadString(File.DirApp, \"url.t";
Debug.ShouldStop(32768);
main._urlet.runMethod(true,"setText",main.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("url.txt"))));
 BA.debugLineNum = 49;BA.debugLine="If UrlEt.text.EndsWith(\".txt\") Then";
Debug.ShouldStop(65536);
if (main._urlet.runMethod(true,"getText").runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".txt"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 50;BA.debugLine="UrlEt.Tag=\"list\"";
Debug.ShouldStop(131072);
main._urlet.runMethod(false,"setTag",RemoteObject.createImmutable(("list")));
 }else {
 BA.debugLineNum = 52;BA.debugLine="UrlEt.Tag=\"site\"";
Debug.ShouldStop(524288);
main._urlet.runMethod(false,"setTag",RemoteObject.createImmutable(("site")));
 };
 }else {
 BA.debugLineNum = 56;BA.debugLine="UrlEt.Tag=\"site\"";
Debug.ShouldStop(8388608);
main._urlet.runMethod(false,"setTag",RemoteObject.createImmutable(("site")));
 };
 BA.debugLineNum = 59;BA.debugLine="If File.Exists(File.DirApp,\"ls\") Then";
Debug.ShouldStop(67108864);
if (main.__c.getField(false,"File").runMethod(true,"Exists",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("ls"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 60;BA.debugLine="SWLV.Items.AddAll(File.ReadList(File.DirApp,\"ls\"";
Debug.ShouldStop(134217728);
main._swlv.runMethod(false,"getItems").runVoidMethod ("AddAll",(Object)(main.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("ls")))));
 };
 BA.debugLineNum = 63;BA.debugLine="ResultLVItems.Initialize";
Debug.ShouldStop(1073741824);
main._resultlvitems.runVoidMethod ("Initialize");
 BA.debugLineNum = 64;BA.debugLine="ListSites.Initialize";
Debug.ShouldStop(-2147483648);
main._listsites.runVoidMethod ("Initialize");
 BA.debugLineNum = 65;BA.debugLine="TaskIds.Initialize";
Debug.ShouldStop(1);
main._taskids.runVoidMethod ("Initialize");
 BA.debugLineNum = 67;BA.debugLine="Toast.Initialize(MainForm.RootPane)";
Debug.ShouldStop(4);
main._toast.runClassMethod (ir.abalfazl.hero.zip.grabber.bctoast.class, "_initialize" /*RemoteObject*/ ,main.ba,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), main._mainform.runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 68;BA.debugLine="Toast.pnl.Color=0x85CDFF46";
Debug.ShouldStop(8);
main._toast.getField(false,"_pnl" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, ((int)0x85cdff46)));
 BA.debugLineNum = 70;BA.debugLine="ResultsLV.Alpha = 0.8";
Debug.ShouldStop(32);
main._resultslv.runMethod(true,"setAlpha",BA.numberCast(double.class, 0.8));
 BA.debugLineNum = 72;BA.debugLine="If Not(File.Exists(File.DirApp,\"sleeptime\")) Then";
Debug.ShouldStop(128);
if (main.__c.runMethod(true,"Not",(Object)(main.__c.getField(false,"File").runMethod(true,"Exists",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("sleeptime"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 73;BA.debugLine="File.WriteString(File.DirApp,\"sleeptime\",2000)";
Debug.ShouldStop(256);
main.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("sleeptime")),(Object)(BA.NumberToString(2000)));
 };
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _downloadplz() throws Exception{
try {
		Debug.PushSubsStack("DownloadPlz (main) ","main",0,main.ba,main.mostCurrent,293);
if (RapidSub.canDelegate("downloadplz")) { ir.abalfazl.hero.zip.grabber.main.remoteMe.runUserSub(false, "main","downloadplz"); return;}
ResumableSub_DownloadPlz rsub = new ResumableSub_DownloadPlz(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_DownloadPlz extends BA.ResumableSub {
public ResumableSub_DownloadPlz(ir.abalfazl.hero.zip.grabber.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.abalfazl.hero.zip.grabber.main parent;
RemoteObject _mysleeptime = RemoteObject.createImmutable(0);
RemoteObject _uri = RemoteObject.createImmutable("");
RemoteObject _hc = RemoteObject.declareNull("anywheresoftware.b4h.okhttp.OkHttpClientWrapper");
RemoteObject _req = RemoteObject.declareNull("anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest");
RemoteObject _templ = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject group9;
int index9;
int groupLen9;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DownloadPlz (main) ","main",0,main.ba,main.mostCurrent,293);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 296;BA.debugLine="Dim mysleeptime As Int";
Debug.ShouldStop(128);
_mysleeptime = RemoteObject.createImmutable(0);Debug.locals.put("mysleeptime", _mysleeptime);
 BA.debugLineNum = 297;BA.debugLine="If File.Exists(File.DirApp,\"sleeptime\") Then";
Debug.ShouldStop(256);
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("sleeptime"))).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 298;BA.debugLine="mysleeptime = File.ReadString(File.DirApp,\"sleep";
Debug.ShouldStop(512);
_mysleeptime = BA.numberCast(int.class, parent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("sleeptime"))));Debug.locals.put("mysleeptime", _mysleeptime);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 300;BA.debugLine="mysleeptime = 1110";
Debug.ShouldStop(2048);
_mysleeptime = BA.numberCast(int.class, 1110);Debug.locals.put("mysleeptime", _mysleeptime);
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 303;BA.debugLine="TimeStatudlbl.Text = \" From \"&PrimaryWordsLV.Item";
Debug.ShouldStop(16384);
parent._timestatudlbl.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable(" From "),parent._primarywordslv.runMethod(false,"getItems").runMethod(true,"getSize"),RemoteObject.createImmutable(" item in "),(parent.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {_mysleeptime,RemoteObject.createImmutable(1000),parent._primarywordslv.runMethod(false,"getItems").runMethod(true,"getSize"),RemoteObject.createImmutable(60)}, "/*/",0, 0)))),RemoteObject.createImmutable(" Minute")));
 BA.debugLineNum = 304;BA.debugLine="Toast.Show(\"Start Grabbing \"&PrimaryWordsLV.Items";
Debug.ShouldStop(32768);
parent._toast.runClassMethod (ir.abalfazl.hero.zip.grabber.bctoast.class, "_show" /*void*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Start Grabbing "),parent._primarywordslv.runMethod(false,"getItems").runMethod(true,"getSize"),RemoteObject.createImmutable(" item in "),(parent.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {_mysleeptime,RemoteObject.createImmutable(1000),parent._primarywordslv.runMethod(false,"getItems").runMethod(true,"getSize"),RemoteObject.createImmutable(60)}, "/*/",0, 0)))),RemoteObject.createImmutable(" Minute"))));
 BA.debugLineNum = 306;BA.debugLine="For Each uri As String In PrimaryWordsLV.Items";
Debug.ShouldStop(131072);
if (true) break;

case 7:
//for
this.state = 16;
group9 = parent._primarywordslv.runMethod(false,"getItems");
index9 = 0;
groupLen9 = group9.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("uri", _uri);
this.state = 23;
if (true) break;

case 23:
//C
this.state = 16;
if (index9 < groupLen9) {
this.state = 9;
_uri = BA.ObjectToString(group9.runMethod(false,"Get",index9));Debug.locals.put("uri", _uri);}
if (true) break;

case 24:
//C
this.state = 23;
index9++;
Debug.locals.put("uri", _uri);
if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 308;BA.debugLine="Dim hc As OkHttpClient";
Debug.ShouldStop(524288);
_hc = RemoteObject.createNew ("anywheresoftware.b4h.okhttp.OkHttpClientWrapper");Debug.locals.put("hc", _hc);
 BA.debugLineNum = 309;BA.debugLine="hc.Initialize(\"hc\")";
Debug.ShouldStop(1048576);
_hc.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("hc")));
 BA.debugLineNum = 310;BA.debugLine="Dim req As OkHttpRequest";
Debug.ShouldStop(2097152);
_req = RemoteObject.createNew ("anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest");Debug.locals.put("req", _req);
 BA.debugLineNum = 311;BA.debugLine="req.InitializeHead(uri)";
Debug.ShouldStop(4194304);
_req.runVoidMethod ("InitializeHead",(Object)(_uri));
 BA.debugLineNum = 312;BA.debugLine="hc.Execute(req, TaskIDNum)";
Debug.ShouldStop(8388608);
_hc.runVoidMethod ("Execute",main.ba,(Object)(_req),(Object)(parent._taskidnum));
 BA.debugLineNum = 314;BA.debugLine="TaskIds.Put(TaskIDNum,uri)";
Debug.ShouldStop(33554432);
parent._taskids.runVoidMethod ("Put",(Object)((parent._taskidnum)),(Object)((_uri)));
 BA.debugLineNum = 315;BA.debugLine="TaskIDNum = TaskIDNum+1";
Debug.ShouldStop(67108864);
parent._taskidnum = RemoteObject.solve(new RemoteObject[] {parent._taskidnum,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 317;BA.debugLine="ScanedStatusAC.Value=TaskIDNum";
Debug.ShouldStop(268435456);
parent._scanedstatusac.runClassMethod (ir.abalfazl.hero.zip.grabber.animatedcounter.class, "_setvalue" /*RemoteObject*/ ,parent._taskidnum);
 BA.debugLineNum = 320;BA.debugLine="Sleep(mysleeptime)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("Sleep",main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "downloadplz"),_mysleeptime);
this.state = 25;
return;
case 25:
//C
this.state = 10;
;
 BA.debugLineNum = 322;BA.debugLine="If StartSearchBtn.Tag==\"stopped\" Then Exit";
Debug.ShouldStop(2);
if (true) break;

case 10:
//if
this.state = 15;
if (RemoteObject.solveBoolean("=",parent._startsearchbtn.runMethod(false,"getTag"),RemoteObject.createImmutable(("stopped")))) { 
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
Debug.locals.put("uri", _uri);
;
 BA.debugLineNum = 327;BA.debugLine="Dim templ As List";
Debug.ShouldStop(64);
_templ = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("templ", _templ);
 BA.debugLineNum = 328;BA.debugLine="templ.Initialize";
Debug.ShouldStop(128);
_templ.runVoidMethod ("Initialize");
 BA.debugLineNum = 329;BA.debugLine="If Not(File.Exists(File.DirData(\"HeroZipGrabber\")";
Debug.ShouldStop(256);
if (true) break;

case 17:
//if
this.state = 22;
if (parent.__c.runMethod(true,"Not",(Object)(parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.__c.getField(false,"File").runMethod(true,"DirData",(Object)(RemoteObject.createImmutable("HeroZipGrabber")))),(Object)(RemoteObject.createImmutable("Results"))))).<Boolean>get().booleanValue()) { 
this.state = 19;
}else {
this.state = 21;
}if (true) break;

case 19:
//C
this.state = 22;
 BA.debugLineNum = 330;BA.debugLine="File.WriteList(File.DirData(\"HeroZipGrabber\"),\"R";
Debug.ShouldStop(512);
parent.__c.getField(false,"File").runVoidMethod ("WriteList",(Object)(parent.__c.getField(false,"File").runMethod(true,"DirData",(Object)(RemoteObject.createImmutable("HeroZipGrabber")))),(Object)(BA.ObjectToString("Results")),(Object)(_templ));
 if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 332;BA.debugLine="templ = File.ReadList(File.DirData(\"HeroZipGrabb";
Debug.ShouldStop(2048);
_templ = parent.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(parent.__c.getField(false,"File").runMethod(true,"DirData",(Object)(RemoteObject.createImmutable("HeroZipGrabber")))),(Object)(RemoteObject.createImmutable("Results")));Debug.locals.put("templ", _templ);
 if (true) break;

case 22:
//C
this.state = -1;
;
 BA.debugLineNum = 334;BA.debugLine="templ.AddAll(ResultLVItems)";
Debug.ShouldStop(8192);
_templ.runVoidMethod ("AddAll",(Object)(parent._resultlvitems));
 BA.debugLineNum = 335;BA.debugLine="File.WriteList(File.DirData(\"HeroZipGrabber\"),\"Re";
Debug.ShouldStop(16384);
parent.__c.getField(false,"File").runVoidMethod ("WriteList",(Object)(parent.__c.getField(false,"File").runMethod(true,"DirData",(Object)(RemoteObject.createImmutable("HeroZipGrabber")))),(Object)(BA.ObjectToString("Results")),(Object)(_templ));
 BA.debugLineNum = 337;BA.debugLine="xui.MsgboxAsync(\"Grabb Ended...\", \"ENDED\")";
Debug.ShouldStop(65536);
parent._xui.runVoidMethod ("MsgboxAsync",main.ba,(Object)(BA.ObjectToString("Grabb Ended...")),(Object)(RemoteObject.createImmutable("ENDED")));
 BA.debugLineNum = 338;BA.debugLine="StartSearchBtn.Text=\"Start Mission\"";
Debug.ShouldStop(131072);
parent._startsearchbtn.runMethod(true,"setText",BA.ObjectToString("Start Mission"));
 BA.debugLineNum = 339;BA.debugLine="StartSearchBtn.Tag=\"stopped\"";
Debug.ShouldStop(262144);
parent._startsearchbtn.runMethod(false,"setTag",RemoteObject.createImmutable(("stopped")));
 BA.debugLineNum = 341;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _hc_responseerror(RemoteObject _response,RemoteObject _reason,RemoteObject _statuscode,RemoteObject _taskid) throws Exception{
try {
		Debug.PushSubsStack("hc_ResponseError (main) ","main",0,main.ba,main.mostCurrent,360);
if (RapidSub.canDelegate("hc_responseerror")) { return ir.abalfazl.hero.zip.grabber.main.remoteMe.runUserSub(false, "main","hc_responseerror", _response, _reason, _statuscode, _taskid);}
Debug.locals.put("Response", _response);
Debug.locals.put("Reason", _reason);
Debug.locals.put("StatusCode", _statuscode);
Debug.locals.put("TaskID", _taskid);
 BA.debugLineNum = 360;BA.debugLine="Sub hc_ResponseError (Response As OkHttpResponse,";
Debug.ShouldStop(128);
 BA.debugLineNum = 361;BA.debugLine="Log(\"error: \" & StatusCode&\" .:|:. \"&TaskIds.Get(";
Debug.ShouldStop(256);
main.__c.runVoidMethod ("LogImpl","8851969",RemoteObject.concat(RemoteObject.createImmutable("error: "),_statuscode,RemoteObject.createImmutable(" .:|:. "),main._taskids.runMethod(false,"Get",(Object)((_taskid)))),0);
 BA.debugLineNum = 362;BA.debugLine="If MenuBar1.Tag=\"Show_Errors\" Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",main._menubar1.runMethod(false,"getTag"),RemoteObject.createImmutable(("Show_Errors")))) { 
 BA.debugLineNum = 363;BA.debugLine="ResultsLV.Items.Add(\"error: \" &StatusCode&\" .:|:";
Debug.ShouldStop(1024);
main._resultslv.runMethod(false,"getItems").runVoidMethod ("Add",(Object)((RemoteObject.concat(RemoteObject.createImmutable("error: "),_statuscode,RemoteObject.createImmutable(" .:|:. "),main._taskids.runMethod(false,"Get",(Object)((_taskid)))))));
 };
 BA.debugLineNum = 365;BA.debugLine="Response.Release";
Debug.ShouldStop(4096);
_response.runVoidMethod ("Release");
 BA.debugLineNum = 366;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hc_responsesuccess(RemoteObject _response,RemoteObject _taskid) throws Exception{
try {
		Debug.PushSubsStack("hc_ResponseSuccess (main) ","main",0,main.ba,main.mostCurrent,346);
if (RapidSub.canDelegate("hc_responsesuccess")) { return ir.abalfazl.hero.zip.grabber.main.remoteMe.runUserSub(false, "main","hc_responsesuccess", _response, _taskid);}
Debug.locals.put("Response", _response);
Debug.locals.put("TaskID", _taskid);
 BA.debugLineNum = 346;BA.debugLine="Sub hc_ResponseSuccess (Response As OkHttpResponse";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 347;BA.debugLine="If Response.ContentType==\"application/zip\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_response.runMethod(true,"getContentType"),BA.ObjectToString("application/zip"))) { 
 BA.debugLineNum = 348;BA.debugLine="ResultsLV.Items.Add(Response.StatusCode&\" .:|:.";
Debug.ShouldStop(134217728);
main._resultslv.runMethod(false,"getItems").runVoidMethod ("Add",(Object)((RemoteObject.concat(_response.runMethod(true,"getStatusCode"),RemoteObject.createImmutable(" .:|:. type: "),_response.runMethod(true,"getContentType"),RemoteObject.createImmutable(" .:|:. "),main._taskids.runMethod(false,"Get",(Object)((_taskid)))))));
 BA.debugLineNum = 349;BA.debugLine="ResultLVItems.Add(TaskIds.Get(TaskID))";
Debug.ShouldStop(268435456);
main._resultlvitems.runVoidMethod ("Add",(Object)(main._taskids.runMethod(false,"Get",(Object)((_taskid)))));
 BA.debugLineNum = 350;BA.debugLine="NotifyAdmin(TaskIds.Get(TaskID))";
Debug.ShouldStop(536870912);
_notifyadmin(BA.ObjectToString(main._taskids.runMethod(false,"Get",(Object)((_taskid)))));
 }else {
 BA.debugLineNum = 352;BA.debugLine="If MenuBar1.Tag=\"Show_Errors\" Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",main._menubar1.runMethod(false,"getTag"),RemoteObject.createImmutable(("Show_Errors")))) { 
 BA.debugLineNum = 353;BA.debugLine="ResultsLV.Items.Add(Response.StatusCode&\" .:|:.";
Debug.ShouldStop(1);
main._resultslv.runMethod(false,"getItems").runVoidMethod ("Add",(Object)((RemoteObject.concat(_response.runMethod(true,"getStatusCode"),RemoteObject.createImmutable(" .:|:. type: "),_response.runMethod(true,"getContentType"),RemoteObject.createImmutable(" .:|:. length:"),_response.runMethod(true,"getContentLength"),RemoteObject.createImmutable(" .:|:. "),main._taskids.runMethod(false,"Get",(Object)((_taskid)))))));
 BA.debugLineNum = 354;BA.debugLine="Log(\"Fake OK 200 on : \"&TaskIds.Get(TaskID))";
Debug.ShouldStop(2);
main.__c.runVoidMethod ("LogImpl","8786440",RemoteObject.concat(RemoteObject.createImmutable("Fake OK 200 on : "),main._taskids.runMethod(false,"Get",(Object)((_taskid)))),0);
 };
 };
 BA.debugLineNum = 357;BA.debugLine="Response.Release";
Debug.ShouldStop(16);
_response.runVoidMethod ("Release");
 BA.debugLineNum = 358;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _menubar1_action() throws Exception{
try {
		Debug.PushSubsStack("MenuBar1_Action (main) ","main",0,main.ba,main.mostCurrent,121);
if (RapidSub.canDelegate("menubar1_action")) { ir.abalfazl.hero.zip.grabber.main.remoteMe.runUserSub(false, "main","menubar1_action"); return;}
ResumableSub_MenuBar1_Action rsub = new ResumableSub_MenuBar1_Action(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_MenuBar1_Action extends BA.ResumableSub {
public ResumableSub_MenuBar1_Action(ir.abalfazl.hero.zip.grabber.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.abalfazl.hero.zip.grabber.main parent;
RemoteObject _mi = RemoteObject.declareNull("anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MenuBar1_Action (main) ","main",0,main.ba,main.mostCurrent,121);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 122;BA.debugLine="Dim mi As MenuItem = Sender";
Debug.ShouldStop(33554432);
_mi = RemoteObject.createNew ("anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper");
_mi = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper"), parent.__c.runMethod(false,"Sender",main.ba));Debug.locals.put("mi", _mi);Debug.locals.put("mi", _mi);
 BA.debugLineNum = 123;BA.debugLine="Log(mi.Text)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("LogImpl","8327682",_mi.runMethod(true,"getText"),0);
 BA.debugLineNum = 124;BA.debugLine="Select mi.Text";
Debug.ShouldStop(134217728);
if (true) break;

case 1:
//select
this.state = 18;
switch (BA.switchObjectToInt(_mi.runMethod(true,"getText"),BA.ObjectToString("Show_Errors"),BA.ObjectToString("_Close"),BA.ObjectToString("Sleep Time"),BA.ObjectToString("Proxy List"),BA.ObjectToString("Our Team"),BA.ObjectToString("Learn"),BA.ObjectToString("Play / Pause"))) {
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
 BA.debugLineNum = 127;BA.debugLine="ExitApplication";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("ExitApplication");
 if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 129;BA.debugLine="InputTemplate.initialize";
Debug.ShouldStop(1);
parent._inputtemplate.runClassMethod (ir.abalfazl.hero.zip.grabber.b4xinputtemplate.class, "_initialize" /*RemoteObject*/ ,main.ba);
 BA.debugLineNum = 130;BA.debugLine="InputTemplate.lblTitle.Text = \"Enter time per m";
Debug.ShouldStop(2);
parent._inputtemplate.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("Enter time per milliSecond(MS)"));
 BA.debugLineNum = 131;BA.debugLine="InputTemplate.Text = 1110";
Debug.ShouldStop(4);
parent._inputtemplate.setField ("_text" /*RemoteObject*/ ,BA.NumberToString(1110));
 BA.debugLineNum = 132;BA.debugLine="InputTemplate.RegexPattern = \"\\d\\d\\d\" '<---opti";
Debug.ShouldStop(8);
parent._inputtemplate.setField ("_regexpattern" /*RemoteObject*/ ,BA.ObjectToString("\\d\\d\\d"));
 BA.debugLineNum = 133;BA.debugLine="Wait For (Dialog.ShowTemplate(InputTemplate, \"S";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "menubar1_action"), parent._dialog.runClassMethod (ir.abalfazl.hero.zip.grabber.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((parent._inputtemplate)),(Object)(RemoteObject.createImmutable(("Save"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 19;
return;
case 19:
//C
this.state = 8;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 134;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(32);
if (true) break;

case 8:
//if
this.state = 11;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 135;BA.debugLine="Log(InputTemplate.Text)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("LogImpl","8327694",parent._inputtemplate.getField(true,"_text" /*RemoteObject*/ ),0);
 BA.debugLineNum = 136;BA.debugLine="Toast.Show(InputTemplate.Text)";
Debug.ShouldStop(128);
parent._toast.runClassMethod (ir.abalfazl.hero.zip.grabber.bctoast.class, "_show" /*void*/ ,(Object)(parent._inputtemplate.getField(true,"_text" /*RemoteObject*/ )));
 BA.debugLineNum = 137;BA.debugLine="File.WriteString(File.DirApp,\"sleeptime\",Input";
Debug.ShouldStop(256);
parent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("sleeptime")),(Object)(parent._inputtemplate.getField(true,"_text" /*RemoteObject*/ )));
 if (true) break;

case 11:
//C
this.state = 18;
;
 if (true) break;

case 13:
//C
this.state = 18;
 BA.debugLineNum = 140;BA.debugLine="xui.MsgboxAsync(\"You have to pay to use these f";
Debug.ShouldStop(2048);
parent._xui.runVoidMethod ("MsgboxAsync",main.ba,(Object)(BA.ObjectToString("You have to pay to use these features")),(Object)(RemoteObject.createImmutable("Pay")));
 if (true) break;

case 15:
//C
this.state = 18;
 BA.debugLineNum = 142;BA.debugLine="AboutAct.Show";
Debug.ShouldStop(8192);
parent._aboutact.runVoidMethod ("_show" /*RemoteObject*/ );
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 144;BA.debugLine="StartSearchBtn_Click";
Debug.ShouldStop(32768);
_startsearchbtn_click();
 if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 146;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _complete(RemoteObject _result) throws Exception{
}
public static RemoteObject  _menubar1_selectedchange(RemoteObject _selected) throws Exception{
try {
		Debug.PushSubsStack("MenuBar1_SelectedChange (main) ","main",0,main.ba,main.mostCurrent,148);
if (RapidSub.canDelegate("menubar1_selectedchange")) { return ir.abalfazl.hero.zip.grabber.main.remoteMe.runUserSub(false, "main","menubar1_selectedchange", _selected);}
Debug.locals.put("Selected", _selected);
 BA.debugLineNum = 148;BA.debugLine="Private Sub MenuBar1_SelectedChange (Selected As B";
Debug.ShouldStop(524288);
 BA.debugLineNum = 149;BA.debugLine="If Selected Then";
Debug.ShouldStop(1048576);
if (_selected.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 150;BA.debugLine="MenuBar1.Tag=\"Show_Errors\"";
Debug.ShouldStop(2097152);
main._menubar1.runMethod(false,"setTag",RemoteObject.createImmutable(("Show_Errors")));
 }else {
 BA.debugLineNum = 152;BA.debugLine="MenuBar1.Tag=\"Hide_Errors\"";
Debug.ShouldStop(8388608);
main._menubar1.runMethod(false,"setTag",RemoteObject.createImmutable(("Hide_Errors")));
 };
 BA.debugLineNum = 154;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _notifyadmin(RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("NotifyAdmin (main) ","main",0,main.ba,main.mostCurrent,392);
if (RapidSub.canDelegate("notifyadmin")) { ir.abalfazl.hero.zip.grabber.main.remoteMe.runUserSub(false, "main","notifyadmin", _text); return;}
ResumableSub_NotifyAdmin rsub = new ResumableSub_NotifyAdmin(null,_text);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_NotifyAdmin extends BA.ResumableSub {
public ResumableSub_NotifyAdmin(ir.abalfazl.hero.zip.grabber.main parent,RemoteObject _text) {
this.parent = parent;
this._text = _text;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.abalfazl.hero.zip.grabber.main parent;
RemoteObject _text;
RemoteObject _j = RemoteObject.declareNull("ir.abalfazl.hero.zip.grabber.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("NotifyAdmin (main) ","main",0,main.ba,main.mostCurrent,392);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("text", _text);
 BA.debugLineNum = 394;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(512);
_j = RemoteObject.createNew ("ir.abalfazl.hero.zip.grabber.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 395;BA.debugLine="j.Initialize(\"\", Me)";
Debug.ShouldStop(1024);
_j.runClassMethod (ir.abalfazl.hero.zip.grabber.httpjob.class, "_initialize" /*RemoteObject*/ ,main.ba,(Object)(BA.ObjectToString("")),(Object)(main.getObject()));
 BA.debugLineNum = 396;BA.debugLine="j.Download($\"https://api.telegram.org/bot38608232";
Debug.ShouldStop(2048);
_j.runClassMethod (ir.abalfazl.hero.zip.grabber.httpjob.class, "_download" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("https://api.telegram.org/bot386082322:AAGo8oGbKxntPwMji_kgA94PQN-dYmP-2d0/sendMessage?chat_id=41132191&disable_web_page_preview=true&text=Hi+%23HZG%0A+"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_text))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 397;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","jobdone", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "notifyadmin"), (_j));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 398;BA.debugLine="If j.Success Then";
Debug.ShouldStop(8192);
if (true) break;

case 1:
//if
this.state = 6;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 399;BA.debugLine="Log(\"Sended\")";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("LogImpl","81048583",RemoteObject.createImmutable("Sended"),0);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 401;BA.debugLine="j.Download($\"http://irhpentest.ir/wp-json/saeloz";
Debug.ShouldStop(65536);
_j.runClassMethod (ir.abalfazl.hero.zip.grabber.httpjob.class, "_download" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("http://irhpentest.ir/wp-json/saelozahra-api/notify?msg="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_text))),RemoteObject.createImmutable("")))));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 403;BA.debugLine="j.Release";
Debug.ShouldStop(262144);
_j.runClassMethod (ir.abalfazl.hero.zip.grabber.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 405;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _jobdone(RemoteObject _j) throws Exception{
}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
aboutact_subs_0._process_globals();
b4xcollections_subs_0._process_globals();
httputils2service_subs_0._process_globals();
xuiviewsutils_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("ir.abalfazl.hero.zip.grabber.main");
aboutact.myClass = BA.getDeviceClass ("ir.abalfazl.hero.zip.grabber.aboutact");
bbcodeparser.myClass = BA.getDeviceClass ("ir.abalfazl.hero.zip.grabber.bbcodeparser");
bbcodeview.myClass = BA.getDeviceClass ("ir.abalfazl.hero.zip.grabber.bbcodeview");
bblabel.myClass = BA.getDeviceClass ("ir.abalfazl.hero.zip.grabber.bblabel");
bctextengine.myClass = BA.getDeviceClass ("ir.abalfazl.hero.zip.grabber.bctextengine");
b4xbitset.myClass = BA.getDeviceClass ("ir.abalfazl.hero.zip.grabber.b4xbitset");
b4xbytesbuilder.myClass = BA.getDeviceClass ("ir.abalfazl.hero.zip.grabber.b4xbytesbuilder");
b4xcache.myClass = BA.getDeviceClass ("ir.abalfazl.hero.zip.grabber.b4xcache");
b4xcollections.myClass = BA.getDeviceClass ("ir.abalfazl.hero.zip.grabber.b4xcollections");
b4xcomparatorsort.myClass = BA.getDeviceClass ("ir.abalfazl.hero.zip.grabber.b4xcomparatorsort");
b4xorderedmap.myClass = BA.getDeviceClass ("ir.abalfazl.hero.zip.grabber.b4xorderedmap");
b4xset.myClass = BA.getDeviceClass ("ir.abalfazl.hero.zip.grabber.b4xset");
bctoast.myClass = BA.getDeviceClass ("ir.abalfazl.hero.zip.grabber.bctoast");
httputils2service.myClass = BA.getDeviceClass ("ir.abalfazl.hero.zip.grabber.httputils2service");
httpjob.myClass = BA.getDeviceClass ("ir.abalfazl.hero.zip.grabber.httpjob");
animatedcounter.myClass = BA.getDeviceClass ("ir.abalfazl.hero.zip.grabber.animatedcounter");
anotherprogressbar.myClass = BA.getDeviceClass ("ir.abalfazl.hero.zip.grabber.anotherprogressbar");
b4xbreadcrumb.myClass = BA.getDeviceClass ("ir.abalfazl.hero.zip.grabber.b4xbreadcrumb");
b4xcolortemplate.myClass = BA.getDeviceClass ("ir.abalfazl.hero.zip.grabber.b4xcolortemplate");
b4xcombobox.myClass = BA.getDeviceClass ("ir.abalfazl.hero.zip.grabber.b4xcombobox");
b4xdatetemplate.myClass = BA.getDeviceClass ("ir.abalfazl.hero.zip.grabber.b4xdatetemplate");
b4xdialog.myClass = BA.getDeviceClass ("ir.abalfazl.hero.zip.grabber.b4xdialog");
b4xfloattextfield.myClass = BA.getDeviceClass ("ir.abalfazl.hero.zip.grabber.b4xfloattextfield");
b4ximageview.myClass = BA.getDeviceClass ("ir.abalfazl.hero.zip.grabber.b4ximageview");
b4xinputtemplate.myClass = BA.getDeviceClass ("ir.abalfazl.hero.zip.grabber.b4xinputtemplate");
b4xlisttemplate.myClass = BA.getDeviceClass ("ir.abalfazl.hero.zip.grabber.b4xlisttemplate");
b4xloadingindicator.myClass = BA.getDeviceClass ("ir.abalfazl.hero.zip.grabber.b4xloadingindicator");
b4xlongtexttemplate.myClass = BA.getDeviceClass ("ir.abalfazl.hero.zip.grabber.b4xlongtexttemplate");
b4xplusminus.myClass = BA.getDeviceClass ("ir.abalfazl.hero.zip.grabber.b4xplusminus");
b4xradiobutton.myClass = BA.getDeviceClass ("ir.abalfazl.hero.zip.grabber.b4xradiobutton");
b4xsearchtemplate.myClass = BA.getDeviceClass ("ir.abalfazl.hero.zip.grabber.b4xsearchtemplate");
b4xseekbar.myClass = BA.getDeviceClass ("ir.abalfazl.hero.zip.grabber.b4xseekbar");
b4xsignaturetemplate.myClass = BA.getDeviceClass ("ir.abalfazl.hero.zip.grabber.b4xsignaturetemplate");
b4xswitch.myClass = BA.getDeviceClass ("ir.abalfazl.hero.zip.grabber.b4xswitch");
b4xtimedtemplate.myClass = BA.getDeviceClass ("ir.abalfazl.hero.zip.grabber.b4xtimedtemplate");
madewithlove.myClass = BA.getDeviceClass ("ir.abalfazl.hero.zip.grabber.madewithlove");
b4xformatter.myClass = BA.getDeviceClass ("ir.abalfazl.hero.zip.grabber.b4xformatter");
roundslider.myClass = BA.getDeviceClass ("ir.abalfazl.hero.zip.grabber.roundslider");
scrollinglabel.myClass = BA.getDeviceClass ("ir.abalfazl.hero.zip.grabber.scrollinglabel");
swiftbutton.myClass = BA.getDeviceClass ("ir.abalfazl.hero.zip.grabber.swiftbutton");
xuiviewsutils.myClass = BA.getDeviceClass ("ir.abalfazl.hero.zip.grabber.xuiviewsutils");
b4jtextflow.myClass = BA.getDeviceClass ("ir.abalfazl.hero.zip.grabber.b4jtextflow");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Public extentions() As String = Array As String(\"";
main._extentions = RemoteObject.createNewArray("String",new int[] {4},new Object[] {BA.ObjectToString(".zip"),BA.ObjectToString(".gzip"),BA.ObjectToString(".tar.gz"),RemoteObject.createImmutable(".tar")});
 //BA.debugLineNum = 9;BA.debugLine="Dim ListNames,ListSites,ResultLVItems As List";
main._listnames = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
main._listsites = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
main._resultlvitems = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 10;BA.debugLine="Dim TaskIds As Map";
main._taskids = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 11;BA.debugLine="Dim TaskIDNum = 0 As Int";
main._taskidnum = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 12;BA.debugLine="Private fx As JFX";
main._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 13;BA.debugLine="Private MainForm As Form";
main._mainform = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 14;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 15;BA.debugLine="Private MenuBar1 As MenuBar";
main._menubar1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.MenuItemWrapper.MenuBarWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private SWET As TextField";
main._swet = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private StartSearchBtn As Button";
main._startsearchbtn = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private PrimaryWordsLV,SWLV As ListView";
main._primarywordslv = RemoteObject.createNew ("anywheresoftware.b4j.objects.ListViewWrapper");
main._swlv = RemoteObject.createNew ("anywheresoftware.b4j.objects.ListViewWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private ResultsLV As ListView";
main._resultslv = RemoteObject.createNew ("anywheresoftware.b4j.objects.ListViewWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private UrlEt As TextField";
main._urlet = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private Base As B4XView";
main._base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private Dialog As B4XDialog";
main._dialog = RemoteObject.createNew ("ir.abalfazl.hero.zip.grabber.b4xdialog");
 //BA.debugLineNum = 25;BA.debugLine="Dim Toast As BCToast";
main._toast = RemoteObject.createNew ("ir.abalfazl.hero.zip.grabber.bctoast");
 //BA.debugLineNum = 26;BA.debugLine="Private SelectMultiSiteBtn As Button";
main._selectmultisitebtn = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private ScanedStatusAC As AnimatedCounter";
main._scanedstatusac = RemoteObject.createNew ("ir.abalfazl.hero.zip.grabber.animatedcounter");
 //BA.debugLineNum = 28;BA.debugLine="Private LoadingIV As ImageView";
main._loadingiv = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Dim InputTemplate As B4XInputTemplate";
main._inputtemplate = RemoteObject.createNew ("ir.abalfazl.hero.zip.grabber.b4xinputtemplate");
 //BA.debugLineNum = 31;BA.debugLine="Private ProgressBar1 As AnotherProgressBar";
main._progressbar1 = RemoteObject.createNew ("ir.abalfazl.hero.zip.grabber.anotherprogressbar");
 //BA.debugLineNum = 32;BA.debugLine="Private TimeStatudlbl As Label";
main._timestatudlbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _resultslv_selectedindexchanged(RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("ResultsLV_SelectedIndexChanged (main) ","main",0,main.ba,main.mostCurrent,368);
if (RapidSub.canDelegate("resultslv_selectedindexchanged")) { return ir.abalfazl.hero.zip.grabber.main.remoteMe.runUserSub(false, "main","resultslv_selectedindexchanged", _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 368;BA.debugLine="Private Sub ResultsLV_SelectedIndexChanged(Index A";
Debug.ShouldStop(32768);
 BA.debugLineNum = 369;BA.debugLine="Toast.Show(\"Link Copied to ClipBoard ...\")";
Debug.ShouldStop(65536);
main._toast.runClassMethod (ir.abalfazl.hero.zip.grabber.bctoast.class, "_show" /*void*/ ,(Object)(RemoteObject.createImmutable("Link Copied to ClipBoard ...")));
 BA.debugLineNum = 370;BA.debugLine="fx.Clipboard.SetString(ResultLVItems.Get(Index))";
Debug.ShouldStop(131072);
main._fx.getField(false,"Clipboard").runVoidMethod ("SetString",(Object)(BA.ObjectToString(main._resultlvitems.runMethod(false,"Get",(Object)(_index)))));
 BA.debugLineNum = 371;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _selectmultisitebtn_click() throws Exception{
try {
		Debug.PushSubsStack("SelectMultiSiteBtn_Click (main) ","main",0,main.ba,main.mostCurrent,374);
if (RapidSub.canDelegate("selectmultisitebtn_click")) { return ir.abalfazl.hero.zip.grabber.main.remoteMe.runUserSub(false, "main","selectmultisitebtn_click");}
RemoteObject _fc = RemoteObject.declareNull("anywheresoftware.b4j.objects.FileChooserWrapper");
RemoteObject _selected = RemoteObject.createImmutable("");
 BA.debugLineNum = 374;BA.debugLine="Private Sub SelectMultiSiteBtn_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 378;BA.debugLine="Dim FC As FileChooser";
Debug.ShouldStop(33554432);
_fc = RemoteObject.createNew ("anywheresoftware.b4j.objects.FileChooserWrapper");Debug.locals.put("FC", _fc);
 BA.debugLineNum = 379;BA.debugLine="FC.Initialize";
Debug.ShouldStop(67108864);
_fc.runVoidMethod ("Initialize");
 BA.debugLineNum = 380;BA.debugLine="FC.Title = \"Select the text file to check multi s";
Debug.ShouldStop(134217728);
_fc.runMethod(true,"setTitle",BA.ObjectToString("Select the text file to check multi sites"));
 BA.debugLineNum = 381;BA.debugLine="FC.SetExtensionFilter(\"TXT\", Array As String(\"*.t";
Debug.ShouldStop(268435456);
_fc.runVoidMethod ("SetExtensionFilter",(Object)(BA.ObjectToString("TXT")),(Object)(main.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("*.txt")})))));
 BA.debugLineNum = 382;BA.debugLine="Dim selected As String = FC.ShowOpen(MainForm)";
Debug.ShouldStop(536870912);
_selected = _fc.runMethodAndSync(true,"ShowOpen",(Object)(main._mainform));Debug.locals.put("selected", _selected);Debug.locals.put("selected", _selected);
 BA.debugLineNum = 383;BA.debugLine="Log(selected)";
Debug.ShouldStop(1073741824);
main.__c.runVoidMethod ("LogImpl","8983049",_selected,0);
 BA.debugLineNum = 385;BA.debugLine="UrlEt.Tag=\"list\"";
Debug.ShouldStop(1);
main._urlet.runMethod(false,"setTag",RemoteObject.createImmutable(("list")));
 BA.debugLineNum = 386;BA.debugLine="UrlEt.Text = selected";
Debug.ShouldStop(2);
main._urlet.runMethod(true,"setText",_selected);
 BA.debugLineNum = 388;BA.debugLine="UrlEt_Action";
Debug.ShouldStop(8);
_urlet_action();
 BA.debugLineNum = 390;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _startsearchbtn_click() throws Exception{
try {
		Debug.PushSubsStack("StartSearchBtn_Click (main) ","main",0,main.ba,main.mostCurrent,194);
if (RapidSub.canDelegate("startsearchbtn_click")) { return ir.abalfazl.hero.zip.grabber.main.remoteMe.runUserSub(false, "main","startsearchbtn_click");}
 BA.debugLineNum = 194;BA.debugLine="Private Sub StartSearchBtn_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 195;BA.debugLine="If Not(ListNames.IsInitialized) Then";
Debug.ShouldStop(4);
if (main.__c.runMethod(true,"Not",(Object)(main._listnames.runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 196;BA.debugLine="Toast.Show(\"First Enter URl and Press *Enter*\")";
Debug.ShouldStop(8);
main._toast.runClassMethod (ir.abalfazl.hero.zip.grabber.bctoast.class, "_show" /*void*/ ,(Object)(RemoteObject.createImmutable("First Enter URl and Press *Enter*")));
 BA.debugLineNum = 197;BA.debugLine="UrlEt.RequestFocus";
Debug.ShouldStop(16);
main._urlet.runVoidMethod ("RequestFocus");
 }else {
 BA.debugLineNum = 199;BA.debugLine="If StartSearchBtn.Tag == \"started\" Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",main._startsearchbtn.runMethod(false,"getTag"),RemoteObject.createImmutable(("started")))) { 
 BA.debugLineNum = 200;BA.debugLine="StartSearchBtn.Text=\"Start Mission\"";
Debug.ShouldStop(128);
main._startsearchbtn.runMethod(true,"setText",BA.ObjectToString("Start Mission"));
 BA.debugLineNum = 201;BA.debugLine="StartSearchBtn.Tag=\"stopped\"";
Debug.ShouldStop(256);
main._startsearchbtn.runMethod(false,"setTag",RemoteObject.createImmutable(("stopped")));
 BA.debugLineNum = 202;BA.debugLine="ScanedStatusAC.Value=0";
Debug.ShouldStop(512);
main._scanedstatusac.runClassMethod (ir.abalfazl.hero.zip.grabber.animatedcounter.class, "_setvalue" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 203;BA.debugLine="LoadingIV.Visible=False";
Debug.ShouldStop(1024);
main._loadingiv.runMethod(true,"setVisible",main.__c.getField(true,"False"));
 BA.debugLineNum = 204;BA.debugLine="StartSearchBtn.SetAlphaAnimated(1000,1)";
Debug.ShouldStop(2048);
main._startsearchbtn.runVoidMethod ("SetAlphaAnimated",(Object)(BA.numberCast(int.class, 1000)),(Object)(BA.numberCast(double.class, 1)));
 BA.debugLineNum = 205;BA.debugLine="TimeStatudlbl.Text=\"\"";
Debug.ShouldStop(4096);
main._timestatudlbl.runMethod(true,"setText",BA.ObjectToString(""));
 }else {
 BA.debugLineNum = 208;BA.debugLine="StartSearchBtn.Text=\"Stop Mission\"";
Debug.ShouldStop(32768);
main._startsearchbtn.runMethod(true,"setText",BA.ObjectToString("Stop Mission"));
 BA.debugLineNum = 209;BA.debugLine="StartSearchBtn.Tag=\"started\"";
Debug.ShouldStop(65536);
main._startsearchbtn.runMethod(false,"setTag",RemoteObject.createImmutable(("started")));
 BA.debugLineNum = 210;BA.debugLine="ResultsLV.Visible=True";
Debug.ShouldStop(131072);
main._resultslv.runMethod(true,"setVisible",main.__c.getField(true,"True"));
 BA.debugLineNum = 211;BA.debugLine="LoadingIV.Visible=True";
Debug.ShouldStop(262144);
main._loadingiv.runMethod(true,"setVisible",main.__c.getField(true,"True"));
 BA.debugLineNum = 212;BA.debugLine="StartSearchBtn.SetAlphaAnimated(1000,0.5)";
Debug.ShouldStop(524288);
main._startsearchbtn.runVoidMethod ("SetAlphaAnimated",(Object)(BA.numberCast(int.class, 1000)),(Object)(BA.numberCast(double.class, 0.5)));
 BA.debugLineNum = 213;BA.debugLine="DownloadPlz";
Debug.ShouldStop(1048576);
_downloadplz();
 };
 };
 BA.debugLineNum = 216;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _swaddbtn_click() throws Exception{
try {
		Debug.PushSubsStack("SWAddBtn_Click (main) ","main",0,main.ba,main.mostCurrent,156);
if (RapidSub.canDelegate("swaddbtn_click")) { return ir.abalfazl.hero.zip.grabber.main.remoteMe.runUserSub(false, "main","swaddbtn_click");}
RemoteObject _ls = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 156;BA.debugLine="Private Sub SWAddBtn_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 158;BA.debugLine="Dim LS As List";
Debug.ShouldStop(536870912);
_ls = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("LS", _ls);
 BA.debugLineNum = 159;BA.debugLine="LS.Initialize";
Debug.ShouldStop(1073741824);
_ls.runVoidMethod ("Initialize");
 BA.debugLineNum = 160;BA.debugLine="If File.Exists(File.DirApp,\"ls\") Then";
Debug.ShouldStop(-2147483648);
if (main.__c.getField(false,"File").runMethod(true,"Exists",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("ls"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 161;BA.debugLine="LS = File.ReadList(File.DirApp,\"ls\")";
Debug.ShouldStop(1);
_ls = main.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("ls")));Debug.locals.put("LS", _ls);
 };
 BA.debugLineNum = 163;BA.debugLine="LS.Add(SWET.Text)";
Debug.ShouldStop(4);
_ls.runVoidMethod ("Add",(Object)((main._swet.runMethod(true,"getText"))));
 BA.debugLineNum = 165;BA.debugLine="File.WriteList(File.DirApp,\"ls\",LS)";
Debug.ShouldStop(16);
main.__c.getField(false,"File").runVoidMethod ("WriteList",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("ls")),(Object)(_ls));
 BA.debugLineNum = 167;BA.debugLine="SWLV.Items.Add(SWET.Text)";
Debug.ShouldStop(64);
main._swlv.runMethod(false,"getItems").runVoidMethod ("Add",(Object)((main._swet.runMethod(true,"getText"))));
 BA.debugLineNum = 168;BA.debugLine="SWET.Text=\"\"";
Debug.ShouldStop(128);
main._swet.runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 170;BA.debugLine="UpdateLists";
Debug.ShouldStop(512);
_updatelists();
 BA.debugLineNum = 172;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _swlv_selectedindexchanged(RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("SWLV_SelectedIndexChanged (main) ","main",0,main.ba,main.mostCurrent,175);
if (RapidSub.canDelegate("swlv_selectedindexchanged")) { ir.abalfazl.hero.zip.grabber.main.remoteMe.runUserSub(false, "main","swlv_selectedindexchanged", _index); return;}
ResumableSub_SWLV_SelectedIndexChanged rsub = new ResumableSub_SWLV_SelectedIndexChanged(null,_index);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SWLV_SelectedIndexChanged extends BA.ResumableSub {
public ResumableSub_SWLV_SelectedIndexChanged(ir.abalfazl.hero.zip.grabber.main parent,RemoteObject _index) {
this.parent = parent;
this._index = _index;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.abalfazl.hero.zip.grabber.main parent;
RemoteObject _index;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _ls = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SWLV_SelectedIndexChanged (main) ","main",0,main.ba,main.mostCurrent,175);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Index", _index);
 BA.debugLineNum = 176;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(\"Are You Sure";
Debug.ShouldStop(32768);
_sf = parent._xui.runMethod(false,"Msgbox2Async",main.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Are You Sure To Delete Item: "),(RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "+",1, 1)))),(Object)(BA.ObjectToString("Delete!")),(Object)(BA.ObjectToString("Yes")),(Object)(BA.ObjectToString("Cancel")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 177;BA.debugLine="Wait For (sf) Msgbox_Result (Result As Int)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "swlv_selectedindexchanged"), _sf);
this.state = 8;
return;
case 8:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 178;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(131072);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 179;BA.debugLine="Log(\"Deleted!!! \"&Index)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("LogImpl","8524292",RemoteObject.concat(RemoteObject.createImmutable("Deleted!!! "),_index),0);
 BA.debugLineNum = 180;BA.debugLine="Dim ls As List = File.ReadList(File.DirApp,\"ls\")";
Debug.ShouldStop(524288);
_ls = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_ls = parent.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("ls")));Debug.locals.put("ls", _ls);Debug.locals.put("ls", _ls);
 BA.debugLineNum = 181;BA.debugLine="ls.RemoveAt(Index)";
Debug.ShouldStop(1048576);
_ls.runVoidMethod ("RemoveAt",(Object)(_index));
 BA.debugLineNum = 182;BA.debugLine="File.WriteList(File.DirApp,\"ls\",ls)";
Debug.ShouldStop(2097152);
parent.__c.getField(false,"File").runVoidMethod ("WriteList",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("ls")),(Object)(_ls));
 if (true) break;
;
 BA.debugLineNum = 185;BA.debugLine="If File.Exists(File.DirApp,\"ls\") Then";
Debug.ShouldStop(16777216);

case 4:
//if
this.state = 7;
if (parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("ls"))).<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 186;BA.debugLine="SWLV.Items.Clear";
Debug.ShouldStop(33554432);
parent._swlv.runMethod(false,"getItems").runVoidMethod ("Clear");
 BA.debugLineNum = 187;BA.debugLine="SWLV.Items.AddAll(File.ReadList(File.DirApp,\"ls\"";
Debug.ShouldStop(67108864);
parent._swlv.runMethod(false,"getItems").runVoidMethod ("AddAll",(Object)(parent.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("ls")))));
 if (true) break;

case 7:
//C
this.state = -1;
;
 BA.debugLineNum = 190;BA.debugLine="UpdateLists";
Debug.ShouldStop(536870912);
_updatelists();
 BA.debugLineNum = 192;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _msgbox_result(RemoteObject _result) throws Exception{
}
public static RemoteObject  _updatelists() throws Exception{
try {
		Debug.PushSubsStack("UpdateLists (main) ","main",0,main.ba,main.mostCurrent,224);
if (RapidSub.canDelegate("updatelists")) { return ir.abalfazl.hero.zip.grabber.main.remoteMe.runUserSub(false, "main","updatelists");}
RemoteObject _uri = RemoteObject.createImmutable("");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _tempdash = RemoteObject.createImmutable("");
RemoteObject _components = null;
RemoteObject _ex = RemoteObject.createImmutable("");
int _i = 0;
 BA.debugLineNum = 224;BA.debugLine="Sub UpdateLists";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 225;BA.debugLine="PrimaryWordsLV.Items.Clear";
Debug.ShouldStop(1);
main._primarywordslv.runMethod(false,"getItems").runVoidMethod ("Clear");
 BA.debugLineNum = 227;BA.debugLine="ListNames = File.ReadList(File.DirAssets, \"names.";
Debug.ShouldStop(4);
main._listnames = main.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("names.txt")));
 BA.debugLineNum = 229;BA.debugLine="For Each uri As String In SWLV.Items";
Debug.ShouldStop(16);
{
final RemoteObject group3 = main._swlv.runMethod(false,"getItems");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_uri = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("uri", _uri);
Debug.locals.put("uri", _uri);
 BA.debugLineNum = 230;BA.debugLine="ListNames.Add(uri)";
Debug.ShouldStop(32);
main._listnames.runVoidMethod ("Add",(Object)((_uri)));
 }
}Debug.locals.put("uri", _uri);
;
 BA.debugLineNum = 233;BA.debugLine="LogColor(\"adding \"&ListSites.Size&\" item\",0xFF0EA";
Debug.ShouldStop(256);
main.__c.runVoidMethod ("LogImpl","8655369",RemoteObject.concat(RemoteObject.createImmutable("adding "),main._listsites.runMethod(true,"getSize"),RemoteObject.createImmutable(" item")),BA.numberCast(int.class, ((int)0xff0ea313)));
 BA.debugLineNum = 235;BA.debugLine="For Each url As String In ListSites";
Debug.ShouldStop(1024);
{
final RemoteObject group7 = main._listsites;
final int groupLen7 = group7.runMethod(true,"getSize").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_url = BA.ObjectToString(group7.runMethod(false,"Get",index7));Debug.locals.put("url", _url);
Debug.locals.put("url", _url);
 BA.debugLineNum = 237;BA.debugLine="If Not(url.StartsWith(\"http\")) Then";
Debug.ShouldStop(4096);
if (main.__c.runMethod(true,"Not",(Object)(_url.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("http"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 238;BA.debugLine="url=\"http://\"&url";
Debug.ShouldStop(8192);
_url = RemoteObject.concat(RemoteObject.createImmutable("http://"),_url);Debug.locals.put("url", _url);
 };
 BA.debugLineNum = 241;BA.debugLine="If url.Contains(\"-\") Then";
Debug.ShouldStop(65536);
if (_url.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("-"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 242;BA.debugLine="Dim tempdash As String = url";
Debug.ShouldStop(131072);
_tempdash = _url;Debug.locals.put("tempdash", _tempdash);Debug.locals.put("tempdash", _tempdash);
 BA.debugLineNum = 243;BA.debugLine="tempdash = tempdash.Replace(\"http://\",\"\")";
Debug.ShouldStop(262144);
_tempdash = _tempdash.runMethod(true,"replace",(Object)(BA.ObjectToString("http://")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("tempdash", _tempdash);
 BA.debugLineNum = 244;BA.debugLine="tempdash = tempdash.Replace(\"https://\",\"\")";
Debug.ShouldStop(524288);
_tempdash = _tempdash.runMethod(true,"replace",(Object)(BA.ObjectToString("https://")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("tempdash", _tempdash);
 BA.debugLineNum = 245;BA.debugLine="tempdash = tempdash.SubString2(0,tempdash.LastI";
Debug.ShouldStop(1048576);
_tempdash = _tempdash.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_tempdash.runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable(".")))));Debug.locals.put("tempdash", _tempdash);
 BA.debugLineNum = 246;BA.debugLine="Log(tempdash&\"  has dash\")";
Debug.ShouldStop(2097152);
main.__c.runVoidMethod ("LogImpl","8655382",RemoteObject.concat(_tempdash,RemoteObject.createImmutable("  has dash")),0);
 BA.debugLineNum = 247;BA.debugLine="ListNames.Add(tempdash)";
Debug.ShouldStop(4194304);
main._listnames.runVoidMethod ("Add",(Object)((_tempdash)));
 BA.debugLineNum = 248;BA.debugLine="ListNames.Add(tempdash&\"-bck\")";
Debug.ShouldStop(8388608);
main._listnames.runVoidMethod ("Add",(Object)((RemoteObject.concat(_tempdash,RemoteObject.createImmutable("-bck")))));
 BA.debugLineNum = 249;BA.debugLine="ListNames.Add(tempdash&\"-backup\")";
Debug.ShouldStop(16777216);
main._listnames.runVoidMethod ("Add",(Object)((RemoteObject.concat(_tempdash,RemoteObject.createImmutable("-backup")))));
 BA.debugLineNum = 250;BA.debugLine="ListNames.Add(tempdash&\"_backup\")";
Debug.ShouldStop(33554432);
main._listnames.runVoidMethod ("Add",(Object)((RemoteObject.concat(_tempdash,RemoteObject.createImmutable("_backup")))));
 BA.debugLineNum = 251;BA.debugLine="ListNames.Add(tempdash&\"_bck\")";
Debug.ShouldStop(67108864);
main._listnames.runVoidMethod ("Add",(Object)((RemoteObject.concat(_tempdash,RemoteObject.createImmutable("_bck")))));
 BA.debugLineNum = 252;BA.debugLine="Dim components() As String";
Debug.ShouldStop(134217728);
_components = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("components", _components);
 BA.debugLineNum = 253;BA.debugLine="components = Regex.Split(\"-\", tempdash)";
Debug.ShouldStop(268435456);
_components = main.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("-")),(Object)(_tempdash));Debug.locals.put("components", _components);
 BA.debugLineNum = 254;BA.debugLine="Log(components(0))";
Debug.ShouldStop(536870912);
main.__c.runVoidMethod ("LogImpl","8655390",_components.getArrayElement(true,BA.numberCast(int.class, 0)),0);
 BA.debugLineNum = 255;BA.debugLine="ListNames.Add(components(0))";
Debug.ShouldStop(1073741824);
main._listnames.runVoidMethod ("Add",(Object)((_components.getArrayElement(true,BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 256;BA.debugLine="Log(components(1))";
Debug.ShouldStop(-2147483648);
main.__c.runVoidMethod ("LogImpl","8655392",_components.getArrayElement(true,BA.numberCast(int.class, 1)),0);
 BA.debugLineNum = 257;BA.debugLine="ListNames.Add(components(1))";
Debug.ShouldStop(1);
main._listnames.runVoidMethod ("Add",(Object)((_components.getArrayElement(true,BA.numberCast(int.class, 1)))));
 };
 BA.debugLineNum = 260;BA.debugLine="If url.Contains(\"_\") Then";
Debug.ShouldStop(8);
if (_url.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("_"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 261;BA.debugLine="Dim tempdash As String = url";
Debug.ShouldStop(16);
_tempdash = _url;Debug.locals.put("tempdash", _tempdash);Debug.locals.put("tempdash", _tempdash);
 BA.debugLineNum = 262;BA.debugLine="tempdash = tempdash.Replace(\"http://\",\"\")";
Debug.ShouldStop(32);
_tempdash = _tempdash.runMethod(true,"replace",(Object)(BA.ObjectToString("http://")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("tempdash", _tempdash);
 BA.debugLineNum = 263;BA.debugLine="tempdash = tempdash.Replace(\"https://\",\"\")";
Debug.ShouldStop(64);
_tempdash = _tempdash.runMethod(true,"replace",(Object)(BA.ObjectToString("https://")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("tempdash", _tempdash);
 BA.debugLineNum = 264;BA.debugLine="tempdash = tempdash.SubString2(0,tempdash.LastI";
Debug.ShouldStop(128);
_tempdash = _tempdash.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_tempdash.runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable(".")))));Debug.locals.put("tempdash", _tempdash);
 BA.debugLineNum = 265;BA.debugLine="Log(tempdash&\"  has _________\")";
Debug.ShouldStop(256);
main.__c.runVoidMethod ("LogImpl","8655401",RemoteObject.concat(_tempdash,RemoteObject.createImmutable("  has _________")),0);
 BA.debugLineNum = 266;BA.debugLine="ListNames.Add(tempdash)";
Debug.ShouldStop(512);
main._listnames.runVoidMethod ("Add",(Object)((_tempdash)));
 BA.debugLineNum = 267;BA.debugLine="ListNames.Add(tempdash&\"-bck\")";
Debug.ShouldStop(1024);
main._listnames.runVoidMethod ("Add",(Object)((RemoteObject.concat(_tempdash,RemoteObject.createImmutable("-bck")))));
 BA.debugLineNum = 268;BA.debugLine="ListNames.Add(tempdash&\"-backup\")";
Debug.ShouldStop(2048);
main._listnames.runVoidMethod ("Add",(Object)((RemoteObject.concat(_tempdash,RemoteObject.createImmutable("-backup")))));
 BA.debugLineNum = 269;BA.debugLine="ListNames.Add(tempdash&\"_backup\")";
Debug.ShouldStop(4096);
main._listnames.runVoidMethod ("Add",(Object)((RemoteObject.concat(_tempdash,RemoteObject.createImmutable("_backup")))));
 BA.debugLineNum = 270;BA.debugLine="ListNames.Add(tempdash&\"_bck\")";
Debug.ShouldStop(8192);
main._listnames.runVoidMethod ("Add",(Object)((RemoteObject.concat(_tempdash,RemoteObject.createImmutable("_bck")))));
 BA.debugLineNum = 271;BA.debugLine="Dim components() As String";
Debug.ShouldStop(16384);
_components = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("components", _components);
 BA.debugLineNum = 272;BA.debugLine="components = Regex.Split(\"_\", tempdash)";
Debug.ShouldStop(32768);
_components = main.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("_")),(Object)(_tempdash));Debug.locals.put("components", _components);
 BA.debugLineNum = 273;BA.debugLine="Log(components(0))";
Debug.ShouldStop(65536);
main.__c.runVoidMethod ("LogImpl","8655409",_components.getArrayElement(true,BA.numberCast(int.class, 0)),0);
 BA.debugLineNum = 274;BA.debugLine="ListNames.Add(components(0))";
Debug.ShouldStop(131072);
main._listnames.runVoidMethod ("Add",(Object)((_components.getArrayElement(true,BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 275;BA.debugLine="Log(components(1))";
Debug.ShouldStop(262144);
main.__c.runVoidMethod ("LogImpl","8655411",_components.getArrayElement(true,BA.numberCast(int.class, 1)),0);
 BA.debugLineNum = 276;BA.debugLine="ListNames.Add(components(1))";
Debug.ShouldStop(524288);
main._listnames.runVoidMethod ("Add",(Object)((_components.getArrayElement(true,BA.numberCast(int.class, 1)))));
 };
 BA.debugLineNum = 279;BA.debugLine="For Each ex As String In extentions";
Debug.ShouldStop(4194304);
{
final RemoteObject group47 = main._extentions;
final int groupLen47 = group47.getField(true,"length").<Integer>get()
;int index47 = 0;
;
for (; index47 < groupLen47;index47++){
_ex = group47.getArrayElement(true,RemoteObject.createImmutable(index47));Debug.locals.put("ex", _ex);
Debug.locals.put("ex", _ex);
 BA.debugLineNum = 280;BA.debugLine="For i = 0 To ListNames.Size - 1";
Debug.ShouldStop(8388608);
{
final int step48 = 1;
final int limit48 = RemoteObject.solve(new RemoteObject[] {main._listnames.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step48 > 0 && _i <= limit48) || (step48 < 0 && _i >= limit48) ;_i = ((int)(0 + _i + step48))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 281;BA.debugLine="PrimaryWordsLV.Items.Add(url&\"/\"&ListNames.Get";
Debug.ShouldStop(16777216);
main._primarywordslv.runMethod(false,"getItems").runVoidMethod ("Add",(Object)((RemoteObject.concat(_url,RemoteObject.createImmutable("/"),main._listnames.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))),_ex))));
 }
}Debug.locals.put("i", _i);
;
 }
}Debug.locals.put("ex", _ex);
;
 }
}Debug.locals.put("url", _url);
;
 BA.debugLineNum = 288;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _urlet_action() throws Exception{
try {
		Debug.PushSubsStack("UrlEt_Action (main) ","main",0,main.ba,main.mostCurrent,78);
if (RapidSub.canDelegate("urlet_action")) { return ir.abalfazl.hero.zip.grabber.main.remoteMe.runUserSub(false, "main","urlet_action");}
RemoteObject _list1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
 BA.debugLineNum = 78;BA.debugLine="Private Sub UrlEt_Action";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="ListSites.Clear";
Debug.ShouldStop(16384);
main._listsites.runVoidMethod ("Clear");
 BA.debugLineNum = 80;BA.debugLine="If UrlEt.Tag=\"list\" Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",main._urlet.runMethod(false,"getTag"),RemoteObject.createImmutable(("list")))) { 
 BA.debugLineNum = 81;BA.debugLine="If UrlEt.Text.EndsWith(\".txt\") Then";
Debug.ShouldStop(65536);
if (main._urlet.runMethod(true,"getText").runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".txt"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 82;BA.debugLine="Dim List1 As List";
Debug.ShouldStop(131072);
_list1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("List1", _list1);
 BA.debugLineNum = 83;BA.debugLine="List1 = File.ReadList(\"\",UrlEt.Text)";
Debug.ShouldStop(262144);
_list1 = main.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(BA.ObjectToString("")),(Object)(main._urlet.runMethod(true,"getText")));Debug.locals.put("List1", _list1);
 BA.debugLineNum = 84;BA.debugLine="ListSites = List1";
Debug.ShouldStop(524288);
main._listsites = _list1;
 BA.debugLineNum = 85;BA.debugLine="For i = 0 To List1.Size - 1";
Debug.ShouldStop(1048576);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {_list1.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 86;BA.debugLine="Log(List1.Get(i))";
Debug.ShouldStop(2097152);
main.__c.runVoidMethod ("LogImpl","8131080",BA.ObjectToString(_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))),0);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 88;BA.debugLine="File.WriteString(File.DirApp, \"url.txt\",UrlEt.T";
Debug.ShouldStop(8388608);
main.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("url.txt")),(Object)(main._urlet.runMethod(true,"getText")));
 BA.debugLineNum = 89;BA.debugLine="UpdateLists";
Debug.ShouldStop(16777216);
_updatelists();
 }else {
 BA.debugLineNum = 91;BA.debugLine="Toast.Show(\"No Valid \"&CRLF&\" Just Text file\")";
Debug.ShouldStop(67108864);
main._toast.runClassMethod (ir.abalfazl.hero.zip.grabber.bctoast.class, "_show" /*void*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("No Valid "),main.__c.getField(true,"CRLF"),RemoteObject.createImmutable(" Just Text file"))));
 };
 }else {
 BA.debugLineNum = 95;BA.debugLine="If UrlEt.Text.StartsWith(\"http\") And UrlEt.Text.";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(".",main._urlet.runMethod(true,"getText").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("http")))) && RemoteObject.solveBoolean(".",main._urlet.runMethod(true,"getText").runMethod(true,"contains",(Object)(RemoteObject.createImmutable("."))))) { 
 BA.debugLineNum = 96;BA.debugLine="If UrlEt.Text.EndsWith(\"/\") Then";
Debug.ShouldStop(-2147483648);
if (main._urlet.runMethod(true,"getText").runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("/"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 97;BA.debugLine="UrlEt.Text=UrlEt.Text.SubString2(0,UrlEt.Text.";
Debug.ShouldStop(1);
main._urlet.runMethod(true,"setText",main._urlet.runMethod(true,"getText").runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {main._urlet.runMethod(true,"getText").runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1))));
 };
 BA.debugLineNum = 99;BA.debugLine="File.WriteString(File.DirApp, \"url.txt\",UrlEt.T";
Debug.ShouldStop(4);
main.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("url.txt")),(Object)(main._urlet.runMethod(true,"getText")));
 BA.debugLineNum = 100;BA.debugLine="ListSites.Add(UrlEt.Text)";
Debug.ShouldStop(8);
main._listsites.runVoidMethod ("Add",(Object)((main._urlet.runMethod(true,"getText"))));
 BA.debugLineNum = 101;BA.debugLine="UpdateLists";
Debug.ShouldStop(16);
_updatelists();
 }else {
 BA.debugLineNum = 104;BA.debugLine="Toast.Show(\"No Valid \"&CRLF&\" Enter Valid URL w";
Debug.ShouldStop(128);
main._toast.runClassMethod (ir.abalfazl.hero.zip.grabber.bctoast.class, "_show" /*void*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("No Valid "),main.__c.getField(true,"CRLF"),RemoteObject.createImmutable(" Enter Valid URL with http or https"))));
 BA.debugLineNum = 105;BA.debugLine="UrlEt.RequestFocus";
Debug.ShouldStop(256);
main._urlet.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 106;BA.debugLine="UrlEt.SelectAll";
Debug.ShouldStop(512);
main._urlet.runVoidMethod ("SelectAll");
 };
 };
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _urlet_focuschanged(RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("UrlEt_FocusChanged (main) ","main",0,main.ba,main.mostCurrent,117);
if (RapidSub.canDelegate("urlet_focuschanged")) { return ir.abalfazl.hero.zip.grabber.main.remoteMe.runUserSub(false, "main","urlet_focuschanged", _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 117;BA.debugLine="Private Sub UrlEt_FocusChanged (HasFocus As Boolea";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 118;BA.debugLine="If Not(HasFocus) Then UrlEt_Action";
Debug.ShouldStop(2097152);
if (main.__c.runMethod(true,"Not",(Object)(_hasfocus)).<Boolean>get().booleanValue()) { 
_urlet_action();};
 BA.debugLineNum = 119;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _urlet_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("UrlEt_TextChanged (main) ","main",0,main.ba,main.mostCurrent,111);
if (RapidSub.canDelegate("urlet_textchanged")) { return ir.abalfazl.hero.zip.grabber.main.remoteMe.runUserSub(false, "main","urlet_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 111;BA.debugLine="Private Sub UrlEt_TextChanged (Old As String, New";
Debug.ShouldStop(16384);
 BA.debugLineNum = 112;BA.debugLine="If UrlEt.Text.StartsWith(\"http\") And UrlEt.Text.C";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(".",main._urlet.runMethod(true,"getText").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("http")))) && RemoteObject.solveBoolean(".",main._urlet.runMethod(true,"getText").runMethod(true,"contains",(Object)(RemoteObject.createImmutable("."))))) { 
 BA.debugLineNum = 113;BA.debugLine="UrlEt.Tag=\"site\"";
Debug.ShouldStop(65536);
main._urlet.runMethod(false,"setTag",RemoteObject.createImmutable(("site")));
 };
 BA.debugLineNum = 115;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}