package co.com.test.steps;

import co.com.test.pageobject.busquedaPageObject;

public class busquedaSteps {
	busquedaPageObject busqueda;
	public void ingresarAlAplicativo() {
		busqueda.open();
		
	}
	public void realizarBusqueda(String arg1) {
		busqueda.realizarBusqueda(arg1);
		
	}

}
