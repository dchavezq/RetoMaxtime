package com.choucairtesting.cierremaxtime.iteractions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class IngresoAlIFrame implements Interaction {

	WebDriver driver;

	public IngresoAlIFrame(WebDriver driver) {
		this.driver = driver;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		driver.switchTo().frame(0);
	}

	public static IngresoAlIFrame iframe(WebDriver driver) {
		return instrumented(IngresoAlIFrame.class, driver);
	}

}
