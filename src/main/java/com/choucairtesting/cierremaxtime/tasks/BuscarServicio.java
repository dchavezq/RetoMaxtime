package com.choucairtesting.cierremaxtime.tasks;

import java.util.List;

import org.fluentlenium.core.annotation.Page;

import com.choucairtesting.cierremaxtime.iteractions.Esperar;
import com.choucairtesting.cierremaxtime.iteractions.IngresoAlIFrame;
import com.choucairtesting.cierremaxtime.models.DatosRegistroMaxtime;
import com.choucairtesting.cierremaxtime.userinterfaces.BuscadorDeServicio;
import com.choucairtesting.cierremaxtime.userinterfaces.BuscarProyecto;
import com.choucairtesting.cierremaxtime.userinterfaces.Iframe;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class BuscarServicio implements Task{
	
	@Page
	Iframe iframe;
	
	private List<DatosRegistroMaxtime> informacion;

	public BuscarServicio(List<DatosRegistroMaxtime> informacion) {
		this.informacion = informacion;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Esperar.unMomento(4000));
		actor.attemptsTo(IngresoAlIFrame.iframe(iframe.getDriver()));
		actor.attemptsTo(Enter.theValue(informacion.get(0).getServicio().trim()).into(BuscadorDeServicio.BUSCADOR_SERVICIO));
		actor.attemptsTo(Esperar.unMomento(6000));
		actor.attemptsTo(Click.on(BuscadorDeServicio.BOTON_BUSCAR_SERVICIO));
		actor.attemptsTo(Esperar.unMomento(6000));
		actor.attemptsTo(Click.on(BuscadorDeServicio.OPCION_PARA_ANALISTAS_FUNCIONALES));
		actor.attemptsTo(Esperar.unMomento(6000));
		actor.attemptsTo(Click.on(BuscarProyecto.BOTON_ACEPTAR));
		actor.attemptsTo(Esperar.unMomento(6000));
		
		
		
	}
	public static BuscarServicio enServicio(List<DatosRegistroMaxtime> informacion) {

		return Tasks.instrumented(BuscarServicio.class, informacion);
	}
}
