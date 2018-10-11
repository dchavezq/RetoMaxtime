package com.choucairtesting.cierremaxtime.tasks;

import java.util.List;

import com.choucairtesting.cierremaxtime.iteractions.Esperar;
import com.choucairtesting.cierremaxtime.models.DatosRegistroMaxtime;
import com.choucairtesting.cierremaxtime.userinterfaces.BuscadorDeServicio;
import com.choucairtesting.cierremaxtime.userinterfaces.EnDetalleReporteDiaPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarDetalleActividades implements Task {

	private List<DatosRegistroMaxtime> informacion;

	public IngresarDetalleActividades(List<DatosRegistroMaxtime> informacion) {

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
		actor.attemptsTo(
				Enter.theValue(informacion.get(0).getActividad().trim()).into(EnDetalleReporteDiaPage.ACTIVIDAD));
		actor.attemptsTo(Esperar.unMomento(3000));
		actor.attemptsTo(Click.on(EnDetalleReporteDiaPage.ACTIVIDAD));
		actor.attemptsTo(Esperar.unMomento(3000));
		actor.attemptsTo(Enter.theValue(informacion.get(0).getHorasejecutadas().trim())
				.into(EnDetalleReporteDiaPage.HORAS_EJECUTADAS));
		actor.attemptsTo(Esperar.unMomento(3000));
		actor.attemptsTo(
				Enter.theValue(informacion.get(0).getComentario().trim()).into(EnDetalleReporteDiaPage.COMENTARIO));
		actor.attemptsTo(Esperar.unMomento(3000));

		actor.attemptsTo(Click.on(EnDetalleReporteDiaPage.BOTON_GUARDAR_CERRAR));

	}

	public static IngresarDetalleActividades enDetalleActividades(List<DatosRegistroMaxtime> informacion) {

		return Tasks.instrumented(IngresarDetalleActividades.class, informacion);
	}

}
