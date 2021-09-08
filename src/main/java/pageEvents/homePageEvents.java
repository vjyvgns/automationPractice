package main.java.pageEvents;
import main.java.utils.fetchElement;
import main.java.pageObjects.*;

public class homePageEvents {
    fetchElement FetchElement = new fetchElement();
    public void clickOnSearchButton(){
        FetchElement.getWebElement("xpath", homePageElements.searchButton).click();
    }

    public void enterSearchValue(String searchString){
        FetchElement.getWebElement("id",homePageElements.searchBox).sendKeys(searchString);
    }

    public void clickCart(){
        FetchElement.getWebElement("xpath",homePageElements.shoppingCart).click();
    }
}
