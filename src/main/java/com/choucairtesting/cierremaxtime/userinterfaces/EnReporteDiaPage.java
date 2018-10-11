package com.choucairtesting.cierremaxtime.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class EnReporteDiaPage extends PageObject {

	public static final Target SELECCIONAR_OPCION_NUEVO = Target.the("Seleccionar opcion nuevo para reporte de horas")
			.located(By.id("Vertical_v3_MainLayoutView_xaf_l103_xaf_dviReporteDetallado_ToolBar_Menu_DXI0_T"));
	                        
}
