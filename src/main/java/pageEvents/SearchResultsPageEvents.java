package main.java.pageEvents;
import main.java.pageObjects.cartPageElements;
import main.java.pageObjects.searchResultsPageElements;
import main.java.utils.fetchElement;
import org.openqa.selenium.interactions.Actions;

import static main.java.utils.BaseTest.driver;
import static org.testng.Assert.assertTrue;

public class SearchResultsPageEvents {
    fetchElement FetchElement = new fetchElement();

    public void addDressToCart() {
        Actions action = new Actions(driver);
        action.moveToElement(FetchElement.getWebElement("XPATH", searchResultsPageElements.summerDresses)).perform();
        FetchElement.getWebElement("XPATH", cartPageElements.addToCart).click();
    }

    public void verifyCartAddedMessage(){
        assertTrue(FetchElement.getWebElement("XPATH",cartPageElements.productAddedMessage).isDisplayed());
    }
}