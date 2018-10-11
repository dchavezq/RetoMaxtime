package com.choucairtesting.cierremaxtime.iteractions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

public class SeleccionarLista implements Interaction {

	private Target lista;
	private String opcion;

	public SeleccionarLista(Target lista, String opcion) {
		this.lista = lista;
		this.opcion = opcion;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		List<WebElement> item = lista.resolveFor(actor).findElements(By.tagName("li"));
		for (int i = 0; i < item.size(); i++) {
			if (item.get(i).getText().trim().equals(opcion)) {
				item.get(i).click();
				break;
			}
		}
	}

	public static SeleccionarLista Desde(Target lista, String opcion) {
		return new SeleccionarLista(lista, opcion);
	}
}
