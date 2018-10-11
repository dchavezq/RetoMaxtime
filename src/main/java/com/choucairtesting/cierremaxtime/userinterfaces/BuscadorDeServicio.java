package com.choucairtesting.cierremaxtime.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class BuscadorDeServicio extends PageObject {

	
	public static final Target TIPO_HORA = Target.the("Tipo de hora")
			.located(By.id("Vertical_v6_MainLayoutEdit_xaf_l148_xaf_dviTipoHora_Edit_DD_I"));

	public static final Target SERVICIO = Target.the("Servicio")
			.located(By.id("Vertical_v6_MainLayoutEdit_xaf_l153_xaf_dviServicio_Edit_Find_CD"));
	
	public static final Target BUSCADOR_SERVICIO = Target.the("Buscador Servicio")
			.located(By.id("Dialog_SearchActionContainer_Menu_ITCNT0_xaf_a0_Ed_I"));
	
	public static final Target BOTON_BUSCAR_SERVICIO = Target.the("Boton Buscador de Servicio")
			.located(By.id("Dialog_SearchActionContainer_Menu_ITCNT0_xaf_a0_B_CD"));
	
	public static final Target OPCION_PARA_ANALISTAS_FUNCIONALES = Target.the("Boton Buscador de Servicio")
			.located(By.id("Dialog_v9_LE_v10_DXSelBtn1_D"));
	
	


	

}
