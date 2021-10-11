package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductPage extends PageObject {

    @FindBy(css = ".add-to-cart-buttons")
    private WebElementFacade addToCartButton;

    @FindBy (css=".checkbox")
    private WebElementFacade checkBox;

    public boolean checkForCheckbox(){
        if (checkBox.isDisplayed());
        return true;
    }
    public void clickCheckbox(){
        checkBox.click();
    }

    public boolean addToCartDisplayed() {
       if (addToCartButton.isDisplayed());
        return true;
}

    public void clickAddtoCart(){
        addToCartButton.click();
    }
}
