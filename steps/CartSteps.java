package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.features.SearchTest;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.CatalogSearchResults;
import org.fasttrackit.pages.ProductPage;
import org.junit.Assert;

public class CartSteps {
    CartPage cartPage;
    ProductPage productPage;
    CatalogSearchResults catalogSearchResults;
    SearchSteps searchSteps;
    SearchTest searchTest;

    @Step
    public void navigateToCart(){
        cartPage.open();
    }
    @Step
    public void verifyAddedtoCart(){
        Assert.assertTrue(cartPage.checkProduct());
    }
@Step
    public void addToCartStep(){
    String productName = "PEARL NECKLACE SET";
    searchSteps.searchForKeyword(productName);
    searchSteps.clickButton();
    searchSteps.clickOnProduct();
    searchSteps.verifyCheckbox();
    searchSteps.clickBox();
    searchSteps.verifyAddToCart();
    searchSteps.addToCart();
}
@Step
    public void changeCartQty(){
        cartPage.setQuantityBox();
        cartPage.clickUpdate();
}

    }








