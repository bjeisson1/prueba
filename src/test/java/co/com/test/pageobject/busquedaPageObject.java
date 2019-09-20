package co.com.test.pageobject;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

	@DefaultUrl("https://www.google.com/")

public class busquedaPageObject extends PageObject{
	@FindBy(name = "q")
	WebElementFacade elemento;
		
		public void realizarBusqueda(String arg1) {
			//elemento.select
			elemento.sendKeys(arg1);
			
		}
	 
	
	
	
}
