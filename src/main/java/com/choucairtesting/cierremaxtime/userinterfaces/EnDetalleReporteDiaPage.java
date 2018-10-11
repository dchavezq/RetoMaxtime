package com.choucairtesting.cierremaxtime.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class EnDetalleReporteDiaPage extends PageObject {

	public static final Target BOTON_BUSCADOR_PROYECTOS = Target.the("Proyecto a elegir")
			.located(By.id("Vertical_v11_MainLayoutEdit_xaf_l135_xaf_dviProyecto_Edit_Find_BImg"));

	public static final Target SERVICIO = Target.the("Seleccionar servicio")
			.located(By.id("Vertical_v6_MainLayoutEdit_xaf_l153_xaf_dviServicio_Edit_Find_BImg"));

	public static final Target ACTIVIDAD = Target.the("Actividad")
			.located(By.id("Vertical_v6_MainLayoutEdit_xaf_l158_xaf_dviActividad_Edit_DD_DDD_L_LBI19T0"));

	public static final Target HORAS_EJECUTADAS = Target.the("Horas ejecutadas")
			.located(By.id("Vertical_v6_MainLayoutEdit_xaf_l182_xaf_dviHoras_Edit_I"));

	public static final Target COMENTARIO = Target.the("Campo Comentario")
			.located(By.id("Vertical_v6_MainLayoutEdit_xaf_l207_xaf_dviComentario_Edit_I"));

	public static final Target BOTON_GUARDAR_CERRAR = Target.the("Guardar y cerrar")
			.locatedBy("//a[contains(text(),'Guardar y cerrar')]");
}
