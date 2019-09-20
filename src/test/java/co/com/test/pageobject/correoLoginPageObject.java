package co.com.test.pageobject;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
@DefaultUrl("")
public class correoLoginPageObject extends PageObject {

	@FindBy(xpath  = "")
	WebElementFacade usuarioLogin;
	

	public void ingreseUsuario(String strUsuario) {
	
	}

	public void ingresePassword(String strPass) {
		usuarioLogin.type(strPass);
	}

}
