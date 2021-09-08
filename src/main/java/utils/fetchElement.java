package main.java.utils;

import main.java.pageObjects.cartPageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class fetchElement extends BaseTest{

    public WebElement getWebElement(String identifierType, String identifierValue) {
        switch (identifierType) {
            case "ID":
                return BaseTest.driver.findElement(By.id(identifierValue));
            case "XPATH":
                return BaseTest.driver.findElement(By.xpath(identifierValue));
            case "NAME":
                return BaseTest.driver.findElement(By.name(identifierValue));
            case "TAGNAME":
                return BaseTest.driver.findElement(By.tagName(identifierValue));
            default:
                return null;
        }
    }

        public static void waitForElement(String element, String elementType){
            WebDriverWait wait = new WebDriverWait(driver, 10);
            if(elementType == "XPATH") {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
            }else if(elementType == "ID") {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(element)));
            }
        }

        public List<WebElement> getListWebElements(String identifierType, String identifierValue){
            switch(identifierType){
                case "ID":
                    return BaseTest.driver.findElements(By.id(identifierValue));
                case "XPATH":
                    return BaseTest.driver.findElements(By.xpath(identifierValue));
                case "NAME":
                    return BaseTest.driver.findElements(By.name(identifierValue));
                case "TAGNAME":
                    return BaseTest.driver.findElements(By.tagName(identifierValue));
                default:
                    return null;
            }
    }
}