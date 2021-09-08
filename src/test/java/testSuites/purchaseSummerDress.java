package test.java.testSuites;

import main.java.pageEvents.SearchResultsPageEvents;
import main.java.pageEvents.cartPageEvents;
import main.java.pageEvents.homePageEvents;
import main.java.utils.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class purchaseSummerDress extends BaseTest {

//    @DataProvider(name="testData")
//    public Object[][] getTestData(){
//        String[][] testRecords = getData("TestData.xlsx", "LoginTestData");
//        return testRecords;
//    }

    @Test
    public void searchForSummerAddress() throws IOException {
        homePageEvents HomePageObj = new homePageEvents();
        SearchResultsPageEvents SearchResultsPageObj = new SearchResultsPageEvents();
        cartPageEvents cartPageObj = new cartPageEvents();

        HomePageObj.clickCart();
//        HomePageObj.enterSearchValue("Summer Dress");
//
//        HomePageObj.clickOnSearchButton();
//
//        SearchResultsPageObj.addDressToCart();
//
//        SearchResultsPageObj.verifyCartAddedMessage();
//
//        cartPageObj.clickOnProceedToCheckout();
//
//        cartPageObj.clickOnProceedToCheckoutSummary();
//
//        cartPageObj.verifyLoginPage();

    }
}