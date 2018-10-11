package com.choucairtesting.cierremaxtime.stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.choucairtesting.cierremaxtime.models.DatosRegistroMaxtime;
import com.choucairtesting.cierremaxtime.tasks.BuscarServicio;
import com.choucairtesting.cierremaxtime.tasks.DeseaRegistrarActividades;
import com.choucairtesting.cierremaxtime.tasks.IngresarDetalleActividades;
import com.choucairtesting.cierremaxtime.tasks.SeleccionarFecha;
import com.choucairtesting.cierremaxtime.tasks.SeleccionarNuevo;
import com.choucairtesting.cierremaxtime.tasks.SeleccionarProyecto;
import com.choucairtesting.cierremaxtime.tasks.SeleccionarTipoHora;

import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class ReporteMaxtimeDefinitions {

	@Managed(driver = "chrome")
	private WebDriver herBrowser;
	private Actor analista = Actor.named("Analista de pruebas");

	@Before
	public void configuracionInicial() {
		analista.can(BrowseTheWeb.with(herBrowser));

	}

	@Dado("^el analista inicia sesion en maxtime con usuario (.*) y contrasena (.*) para realizar el registro de actividades$")
	public void elAnalistaIniciaSesionEnMaxtimeConUsuarioDchavezqYContrasenaCym_ParaRealizarElRegistroDeActividades(
			String usuario, String contrasena) {

		analista.attemptsTo(DeseaRegistrarActividades.enMaxtime(usuario, contrasena));

	}

	@Cuando("^el analista realiza el filtro por usuario o por dia para realizar el registro de actividades$")
	public void elAnalistaRealizaElFiltroPorUsuarioOPorDiaParaRealizarElRegistroDeActividades() {
		analista.attemptsTo(SeleccionarFecha.enLaLista());
		analista.attemptsTo(SeleccionarNuevo.enLaOpcionNuevo());

	}

	@Entonces("^el realiza el registro de actividades$")
	public void elRealizaElRegistroDeActividades(List<DatosRegistroMaxtime> informacion) throws Exception {
		analista.attemptsTo(SeleccionarProyecto.enproyectos(informacion));
		analista.attemptsTo(SeleccionarTipoHora.enTipoHora(informacion));
		analista.attemptsTo(BuscarServicio.enServicio(informacion));
		analista.attemptsTo(IngresarDetalleActividades.enDetalleActividades(informacion));
		
				}

	@Entonces("^ella deberia cumplir con la tarea diariamente$")
	public void ellaDeberiaCumplirConLaTareaDiariamente() {

	}

}
