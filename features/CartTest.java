package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.CartSteps;
import org.fasttrackit.steps.SearchSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class CartTest extends BaseTest {

    @Steps
    CartSteps cartSteps;
    @Steps
    SearchSteps searchSteps;

    @Test
    public void openCart() {
        cartSteps.navigateToCart();
    }


    @Test
    public void addToCart() {
        String productName = "PEARL NECKLACE SET";
        searchSteps.searchForKeyword(productName);
        searchSteps.clickButton();
        searchSteps.clickOnProduct();
        searchSteps.verifyCheckbox();
        searchSteps.clickBox();
        searchSteps.verifyAddToCart();
        searchSteps.addToCart();
        cartSteps.verifyAddedtoCart();
    }

    @Test
    public void changeQuantity(){
        String productName = "PEARL NECKLACE SET";
        searchSteps.searchForKeyword(productName);
        searchSteps.clickButton();
        searchSteps.clickOnProduct();
        searchSteps.verifyCheckbox();
        searchSteps.clickBox();
        searchSteps.verifyAddToCart();
        searchSteps.addToCart();
        cartSteps.changeCartQty();

    }

}

