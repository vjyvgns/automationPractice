package main.java.pageEvents;

import main.java.utils.fetchElement;
import org.openqa.selenium.interactions.Actions;
import main.java.pageObjects.*;

import static main.java.utils.BaseTest.driver;
import static org.testng.Assert.assertTrue;

public class cartPageEvents {
    fetchElement FetchElement = new fetchElement();



    public void clickOnProceedToCheckout(){
        FetchElement.getWebElement("xpath",cartPageElements.proceedToCheckOutButton).click();
    }

    public void clickOnProceedToCheckoutSummary(){
        FetchElement.getWebElement("xpath",cartPageElements.ProceedToCheckOutButtonSummary).click();
    }

    public void verifyLoginPage(){
        assertTrue(FetchElement.getWebElement("xpath",cartPageElements.loginFrame).isDisplayed());
    }
}