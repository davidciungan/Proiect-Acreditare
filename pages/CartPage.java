package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import java.util.List;

@DefaultUrl("http://testfasttrackit.info/selenium-test/checkout/cart/")
public class CartPage extends PageObject {

    @FindBy (css=".page-title h1")
    private WebElementFacade pageTitle;

    @FindBy (css="h2.product-name")
    private WebElementFacade productInCart;

    @FindBy (css=".product-cart-info")
    private  WebElementFacade productsInCart;

    @FindBy (css=".product-cart-actions")
    private WebElementFacade quantityBox;

    @FindBy (css="#shopping-cart-table > tbody > tr.first.odd > td.product-cart-actions > button > span > span")
    private WebElementFacade updateButton;

public void setQuantityBox(){
    waitFor(quantityBox);
    clickOn(quantityBox);
    String before ="4";
    Integer x = Integer.valueOf(before);

}

public void xxx(){

    String myString = "4";
    int value = Integer.parseInt(myString);;
    try {
        value = Integer.parseInt(myString);
    }
    catch (NumberFormatException e)
    {
        value = 0;
    }
}

    public boolean checkProduct (){
        if (productsInCart.isDisplayed());
        return true;
    }

    public void clickUpdate(){
    updateButton.click();
    }
    public String getPageTitle(){return pageTitle.getText();}

    public String getProductInCart(){return productInCart.getText();}
}
