package com.choucairtesting.cierremaxtime.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class BuscarProyecto extends PageObject {

	public static final Target BUSCAR_PROYECTO = Target.the("Boton Buscar proyecto")
			.located(By.id("Dialog_SearchActionContainer_Menu_ITCNT0_xaf_a0_B_CD"));

	public static final Target ESCRIBIR_PROYECTO_A_ELEGIR = Target.the("Boton Buscar proyecto")
			.locatedBy("//input[@id='Dialog_SearchActionContainer_Menu_ITCNT0_xaf_a0_Ed_I']");

	public static final Target SELECCIONAR_PROYECTO = Target.the("Proyecto a elegir")
			.located(By.id("Dialog_v7_LE_v8_DXSelBtn0_D"));

	public static final Target BOTON_ACEPTAR = Target.the("Boton Buscador de Servicio")
			.located(By.id("Dialog_actionContainerHolder_Menu_DXI0_T"));

}
