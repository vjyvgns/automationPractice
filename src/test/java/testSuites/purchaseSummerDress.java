package test.java.testSuites;

import com.aventstack.extentreports.Status;
import main.java.pageEvents.SearchResultsPageEvents;
import main.java.pageEvents.cartPageEvents;
import main.java.pageEvents.homePageEvents;
import main.java.pageObjects.cartPageElements;
import main.java.pageObjects.searchResultsPageElements;
import main.java.utils.BaseTest;
import main.java.utils.fetchElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class purchaseSummerDress extends BaseTest {
    homePageEvents HomePageObj = new homePageEvents();
    SearchResultsPageEvents SearchResultsPageObj = new SearchResultsPageEvents();
    cartPageEvents cartPageObj = new cartPageEvents();

    @DataProvider(name="testData")
    public Object[][] getTestData(){
        String[][] testRecords = getData("TestData.xlsx", "DressSearch");
        return testRecords;
    }

    @Test
    public void searchForSummerAddress() throws IOException, InterruptedException {

        //Entering the Search Value in Dress search box and clicking on Search Button
        HomePageObj.enterSearchValue("Summer Dress");
        HomePageObj.clickOnSearchButton();
        fetchElement.waitForElement(searchResultsPageElements.searchPage,"XPATH");
        logger.log(Status.INFO,"Searching is complete");

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