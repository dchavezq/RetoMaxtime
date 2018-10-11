package com.choucairtesting.cierremaxtime.tasks;

import com.choucairtesting.cierremaxtime.iteractions.Esperar;
import com.choucairtesting.cierremaxtime.userinterfaces.EnReporteDeTiemposPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarFecha implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Esperar.unMomento(10000));
		actor.attemptsTo(Click.on(EnReporteDeTiemposPage.SELECCIONAR_DIA));
		actor.attemptsTo(Esperar.unMomento(4000));

	}

	public static SeleccionarFecha enLaLista() {

		return Tasks.instrumented(SeleccionarFecha.class);
	}

}
