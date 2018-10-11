package com.choucairtesting.cierremaxtime.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.choucairtesting.com:18000/MaxTimeCHC/Login.aspx")
public class InicioSesionMaxtimePage extends PageObject{
	
	public static final Target NOMBRE_USUARIO = Target.the("Campo para ingresar nombre de usuario")
			.located(By.name("Logon$v0$MainLayoutEdit$xaf_l30$xaf_dviUserName_Edit"));
	
	public static final Target CONTRASENA = Target.the("Campo para ingresar contrase�a")
			.located(By.id("Logon_v0_MainLayoutEdit_xaf_l35_xaf_dviPassword_Edit_I"));
	
	public static final Target BOTON_CONECTARSE = Target.the("Boton conectarse")
			.locatedBy("//a[@title='Conectarse']");
	
	
	
	
	

}
