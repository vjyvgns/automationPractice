package main.java.pageObjects;

public interface cartPageElements {

    String productAddedMessage = "(//h2)[1]"; //xpath
    String proceedToCheckOutButton = "//a[@title=\"Proceed to checkout\"]"; //xpath
    String ProceedToCheckOutButtonSummary = "(//a[@title=\"Proceed to checkout\"])[2]"; //xpath
    String loginFrame = "//form[@id=\"login_form\"]"; //xpath
    String addToCart = "(//a[@title=\"Add to cart\"])[1]"; //xpath
}
