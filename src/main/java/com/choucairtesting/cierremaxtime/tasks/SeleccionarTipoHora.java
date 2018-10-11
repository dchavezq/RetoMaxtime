package com.choucairtesting.cierremaxtime.tasks;

import java.util.List;

import com.choucairtesting.cierremaxtime.iteractions.Esperar;
import com.choucairtesting.cierremaxtime.models.DatosRegistroMaxtime;
import com.choucairtesting.cierremaxtime.userinterfaces.BuscadorDeServicio;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SeleccionarTipoHora implements Task {

	private List<DatosRegistroMaxtime> informacion;

	public SeleccionarTipoHora(List<DatosRegistroMaxtime> informacion) {

		this.informacion = informacion;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Esperar.unMomento(3000));
		actor.attemptsTo(Enter.theValue(informacion.get(0).getTipoHora().trim()).into(BuscadorDeServicio.TIPO_HORA));
		actor.attemptsTo(Esperar.unMomento(2000));
		actor.attemptsTo(Click.on(BuscadorDeServicio.TIPO_HORA));
		actor.attemptsTo(Esperar.unMomento(3000));
		actor.attemptsTo(Click.on(BuscadorDeServicio.SERVICIO));
		actor.attemptsTo(Esperar.unMomento(6000));
		

	}

	public static SeleccionarTipoHora enTipoHora(List<DatosRegistroMaxtime> informacion) {

		return Tasks.instrumented(SeleccionarTipoHora.class, informacion);
	}
}
