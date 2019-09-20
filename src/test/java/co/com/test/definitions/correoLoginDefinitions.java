package co.com.test.definitions;

import co.com.test.steps.correoLoginSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class correoLoginDefinitions {

	@Steps
	correoLoginSteps correo;
	
	@Given("^ingreso aplicativo con usuario \"([^\"]*)\" Y password \"([^\"]*)\"$")
	public void ingresoAplicativoConUsuarioYPassword(String strUsuario, String strPass) throws Exception {
		correo.ingresoAplicativoConUsuarioYPassword(strUsuario,strPass);
	}


	@Given("^dar click$")
	public void darClick() throws Exception {
		correo.darClick();

	}

	@When("^validar que cargue el formulario$")
	public void validarQueCargueElFormulario() throws Exception {
	}

	@Given("^ingreso aplicativo con usuario name(\\d+) Y contrase?a (\\d+)$")
	public void ingresoAplicativoConUsuarioNameYContraseA(int arg1, int arg2) throws Exception {
	}
	
}
