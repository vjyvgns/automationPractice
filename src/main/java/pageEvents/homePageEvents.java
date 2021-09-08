package main.java.pageEvents;
import main.java.utils.fetchElement;
import main.java.pageObjects.*;

public class homePageEvents {
    fetchElement FetchElement = new fetchElement();
    public void clickOnSearchButton(){
        FetchElement.getWebElement("XPATH", homePageElements.searchButton).click();
    }

    public void enterSearchValue(String searchString){
        FetchElement.getWebElement("ID",homePageElements.searchBox).sendKeys(searchString);
    }

    public void clickCart(){
        FetchElement.getWebElement("XPATH",homePageElements.shoppingCart).click();


    }
}
