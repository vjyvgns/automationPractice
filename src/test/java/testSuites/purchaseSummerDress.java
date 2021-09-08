package test.java.testSuites;

import com.aventstack.extentreports.Status;
import main.java.pageEvents.SearchResultsPageEvents;
import main.java.pageEvents.cartPageEvents;
import main.java.pageEvents.homePageEvents;
import main.java.pageObjects.cartPageElements;
import main.java.pageObjects.searchResultsPageElements;
import main.java.utils.BaseTest;
import main.java.utils.fetchElement;
import org.testng.annotations.Test;

public class purchaseSummerDress extends BaseTest {
    homePageEvents HomePageObj = new homePageEvents();
    SearchResultsPageEvents SearchResultsPageObj = new SearchResultsPageEvents();
    cartPageEvents cartPageObj = new cartPageEvents();

    String testRecord = getCell("testData.xlsx","DressSearch",2);

    @Test
    public void searchForSummerAddress(){

        //Entering the Search Value in Dress search box and clicking on Search Button
        HomePageObj.enterSearchValue(testRecord);
        HomePageObj.clickOnSearchButton();
        fetchElement.waitForElement(searchResultsPageElements.searchPage,"XPATH");
        logger.log(Status.INFO,"Searching is complete with Dress: "+testRecord);

        //Adding dress to Cart
        SearchResultsPageObj.addDressToCart();
        fetchElement.waitForElement(cartPageElements.productAddedMessage,"XPATH");
        //Verifying the Success Message
        SearchResultsPageObj.verifyCartAddedMessage();
        logger.log(Status.INFO,"Dress added to Cart");

        //Proceeding to Checkout
        cartPageObj.clickOnProceedToCheckout();
        fetchElement.waitForElement(cartPageElements.ProceedToCheckOutButtonSummary,"XPATH");
        cartPageObj.clickOnProceedToCheckoutSummary();
        logger.log(Status.INFO,"User is in Checkout Page");

        //Verifying if the Login options is displayed
        fetchElement.waitForElement(cartPageElements.loginFrame,"XPATH");
        cartPageObj.verifyLoginPage();

        logger.log(Status.PASS,"User is proceeded to Sign In Section");
    }
}