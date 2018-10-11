package com.choucairtesting.cierremaxtime.iteractions;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import org.awaitility.Awaitility;
import static com.choucairtesting.cierremaxtime.utils.Constantes.getLogger;
import static com.choucairtesting.cierremaxtime.utils.UtilidadTiempo.condicionExitosa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class Esperar implements Interaction {

	private int miliSegundos;

	public Esperar(int miliSegundos) {
		super();
		this.miliSegundos = miliSegundos;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			Awaitility.await().forever().pollInterval(miliSegundos, TimeUnit.MILLISECONDS).until(condicionExitosa());
		} catch (Exception e) {
			getLogger().log(Level.SEVERE, "Error " + e);
		}
	}

	public static Esperar unMomento(int miliSegundos) {

		return instrumented(Esperar.class, miliSegundos);
	}

}
