package ir.abalfazl.hero.zip.grabber.designerscripts;
import anywheresoftware.b4a.BA;


public class LS_homelayout{

public static void LS_general(anywheresoftware.b4a.BA ba, javafx.scene.Node parent, anywheresoftware.b4j.objects.LayoutValues lv,
anywheresoftware.b4j.objects.LayoutBuilder.LayoutData views, int width, int height, float scale)  throws Exception  {
;
//BA.debugLineNum = 2;BA.debugLine="LoadingIV.HorizontalCenter=50%x"[HomeLayout/General script]
views.get("loadingiv").setLeft((int)((50d / 100 * width) - (views.get("loadingiv").getPrefWidth() / 2)));

}
}