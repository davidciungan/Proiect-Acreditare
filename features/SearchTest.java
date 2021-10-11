package org.fasttrackit.features;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.SearchSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class SearchTest extends BaseTest {
    @Steps
    SearchSteps searchSteps;

    @Test
    public void searchByKeyword() {
        String productName = "AROUND THE WORLD IN 80 DAYS";
        searchSteps.searchForKeyword(productName);
        searchSteps.clickButton();
        searchSteps.verifyProductIsFound(productName);
    }


    @Test
    public void filterByPriceAscending() {
        String productName = "PEARL NECKLACE SET";
        searchSteps.searchForKeyword(productName);
        searchSteps.clickButton();
        searchSteps.sortByPrice();
        searchSteps.verifyProductPricesAscending();
    }

    @Test
    public void filterByPriceDescending() {
        String productName = "PEARL NECKLACE SET";
        searchSteps.searchForKeyword(productName);
        searchSteps.clickButton();
        searchSteps.sortByPrice();
        searchSteps.clickArrow();
        searchSteps.verifyProductPricesDescending();
    }

    @Test
    public void checkNoResults(){
        String productName= "random";
        searchSteps.searchForKeyword(productName);
        searchSteps.clickButton();
        searchSteps.checkNoResults("Your search returns no results.");
    }

    @Test
    public void verifySalePage(){
        searchSteps.navigateToHompage();
        searchSteps.clickSale();
        searchSteps.checkSale("SALE");
    }
    @Test
    public void verifyWomenPage(){
        searchSteps.navigateToHompage();
        searchSteps.clickWomen();
        searchSteps.checkWomenPage("WOMEN");
    }
    @Test
    public void verifyMenPage(){
        searchSteps.navigateToHompage();
        searchSteps.clickMen();
        searchSteps.checkMenPage("MEN");
    }

    @Test
    public void clickOnFoundProduct(){
        String productName = "PEARL NECKLACE SET";
        searchSteps.searchForKeyword(productName);
        searchSteps.clickButton();
        searchSteps.clickOnProduct();
        searchSteps.verifyProductFound();

    }
    @Test
    public void addToCart(){
        String productName = "PEARL NECKLACE SET";
        searchSteps.searchForKeyword(productName);
        searchSteps.clickButton();
        searchSteps.clickOnProduct();
        searchSteps.verifyCheckbox();
        searchSteps.clickBox();
        searchSteps.verifyAddToCart();
        searchSteps.addToCart();

    }
}
