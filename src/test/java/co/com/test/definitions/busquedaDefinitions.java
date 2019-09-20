package co.com.test.definitions;

import co.com.test.steps.busquedaSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class busquedaDefinitions {
	@Steps
	busquedaSteps busqueda;
	
	@Given("^ingresar al aplicativo$")
	public void ingresarAlAplicativo() throws Exception {
		busqueda.ingresarAlAplicativo();
		// Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
	}


	@When("^realizar busqueda \"([^\"]*)\"$")
	public void realizarBusqueda(String arg1) throws Exception {
		busqueda.realizarBusqueda(arg1);
	}

}
