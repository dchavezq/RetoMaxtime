package com.choucairtesting.cierremaxtime.tasks;

import static com.choucairtesting.cierremaxtime.userinterfaces.EnReporteDiaPage.SELECCIONAR_OPCION_NUEVO;

import com.choucairtesting.cierremaxtime.iteractions.Esperar;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarNuevo implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Esperar.unMomento(5000));
		actor.attemptsTo(Click.on(SELECCIONAR_OPCION_NUEVO));
		actor.attemptsTo(Esperar.unMomento(5000));

	}

	public static SeleccionarNuevo enLaOpcionNuevo() {

		return Tasks.instrumented(SeleccionarNuevo.class);
	}

}
