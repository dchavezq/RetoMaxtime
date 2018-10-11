package com.choucairtesting.cierremaxtime.tasks;

import java.util.List;

import org.fluentlenium.core.annotation.Page;

import com.choucairtesting.cierremaxtime.iteractions.Esperar;
import com.choucairtesting.cierremaxtime.iteractions.IngresoAlIFrame;
import com.choucairtesting.cierremaxtime.models.DatosRegistroMaxtime;
import com.choucairtesting.cierremaxtime.userinterfaces.BuscarProyecto;
import com.choucairtesting.cierremaxtime.userinterfaces.Iframe;
import com.choucairtesting.cierremaxtime.userinterfaces.EnDetalleReporteDiaPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SeleccionarProyecto implements Task {
	@Page
	Iframe iframe;

	private List<DatosRegistroMaxtime> informacion;

	public SeleccionarProyecto(List<DatosRegistroMaxtime> informacion) {
		this.informacion = informacion;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Esperar.unMomento(6000));
		actor.attemptsTo(Click.on(EnDetalleReporteDiaPage.BOTON_BUSCADOR_PROYECTOS));
		actor.attemptsTo(Esperar.unMomento(5000));
		actor.attemptsTo(IngresoAlIFrame.iframe(iframe.getDriver()));
		actor.attemptsTo(Enter.theValue(informacion.get(0).getProyecto().trim())
				.into(BuscarProyecto.ESCRIBIR_PROYECTO_A_ELEGIR));

		actor.attemptsTo(Esperar.unMomento(3000));
		actor.attemptsTo(Click.on(BuscarProyecto.BUSCAR_PROYECTO));
		actor.attemptsTo(Esperar.unMomento(4000));
		actor.attemptsTo(Click.on(BuscarProyecto.SELECCIONAR_PROYECTO));
		actor.attemptsTo(Esperar.unMomento(5000));
		actor.attemptsTo(Click.on(BuscarProyecto.BOTON_ACEPTAR));
		actor.attemptsTo(Esperar.unMomento(5000));

	}

	public static SeleccionarProyecto enproyectos(List<DatosRegistroMaxtime> informacion) {

		return Tasks.instrumented(SeleccionarProyecto.class, informacion);
	}

}
