package com.choucairtesting.cierremaxtime.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;



public class EnReporteDeTiemposPage extends PageObject {

	public static final Target LISTA_USUARIOS_Y_DIAS = Target.the(
			" campo para llevar a cabo el filtro por el usuario al cual se le va a realizar el registro de actividades")
			.locatedBy("//table[@id='Vertical_v1_LE_v2_HFListBox_LBT']/tbody/tr");
	
	public static final Target SELECCIONAR_DIA = Target.the("Seleccionar fecha 2")
			.located(By.id("Vertical_v1_LE_v2_tccell0_0"));
	
	
	
	
	
			
			

}
