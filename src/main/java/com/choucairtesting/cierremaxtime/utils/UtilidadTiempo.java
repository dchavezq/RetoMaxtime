package com.choucairtesting.cierremaxtime.utils;

import java.util.concurrent.Callable;

public class UtilidadTiempo {
	static Boolean allMessagesProcessed = true;

	private UtilidadTiempo() {
	}
	
	public static Callable<Boolean> condicionExitosa() {
		return new Callable<Boolean>() {
			public Boolean call() throws Exception {
				return allMessagesProcessed;

			}
		};
	}

}

