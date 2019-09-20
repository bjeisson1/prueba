package co.com.test.steps;

import co.com.test.pageobject.correoLoginPageObject;
import net.thucydides.core.annotations.Step;

public class correoLoginSteps {
	correoLoginPageObject correo;
	
	@Step
	public void ingresoAplicativoConUsuarioYPassword(String strUsuario, String strPass) {
		correo.open();
		correo.ingreseUsuario(strUsuario);
		correo.ingresePassword(strPass);
	}

	@Step
	public void darClick() {
		// TODO Auto-generated method stub
		
	}

}
