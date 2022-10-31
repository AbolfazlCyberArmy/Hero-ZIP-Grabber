B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=9.3
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private fx As JFX
	Dim F1 As Form
	Private IRHBtn As Button
	Private PenTestBtn As Button
	Private text As Label
End Sub

Sub Show
	F1.Initialize("form",640,480)
	F1.RootPane.LoadLayout("AboutLayout")
	F1.Show
	F1.Resizable=False
End Sub

Private Sub PenTestBtn_Click
	fx.ShowExternalDocument("http://irhpentest.ir")
End Sub

Private Sub IRHBtn_Click
	fx.ShowExternalDocument("http://iranhack.com")
End Sub