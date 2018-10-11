package com.choucairtesting.cierremaxtime.tasks;

import com.choucairtesting.cierremaxtime.userinterfaces.InicioSesionMaxtimePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class DeseaRegistrarActividades implements Task {

	private InicioSesionMaxtimePage maxtime;
	private  String usuario;
	private  String contrasena;

	public DeseaRegistrarActividades(String usuario, String contrasena) {
		super();
		this.usuario = usuario;
		this.contrasena = contrasena;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Open.browserOn(maxtime));
		actor.attemptsTo(Enter.theValue(usuario).into(InicioSesionMaxtimePage.NOMBRE_USUARIO));
		actor.attemptsTo(Enter.theValue(contrasena).into(InicioSesionMaxtimePage.CONTRASENA));
		actor.attemptsTo(Click.on(InicioSesionMaxtimePage.BOTON_CONECTARSE));

	}

	public static DeseaRegistrarActividades enMaxtime(String usuario, String contrasena) {
		
		return Tasks.instrumented(DeseaRegistrarActividades.class, usuario,contrasena);
	}

}
