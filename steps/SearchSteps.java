package org.fasttrackit.steps;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.*;
import org.junit.Assert;

public class SearchSteps {

    HomePage homePage;
    CatalogSearchResults catalogSearchResults;
    SalesPage salesPage;
    MenPage menPage;
    WomenPage womenPage;
    ProductPage productPage;

    @Step
    public void searchForKeyword(String value) {
        homePage.open();
        homePage.setSearchField(value);

    }

    @Step
    public void clickButton() {
        homePage.clickSearch();
    }

    @Step
    public void verifyProductIsFound(String value) {
        Assert.assertTrue(catalogSearchResults.findProductInGrid(value));
    }


    @Step
    public void sortByPrice() {
        catalogSearchResults.sortByDropdown("Price");
    }

    @Step
    public void verifyProductPricesAscending() {
        Assert.assertTrue(catalogSearchResults.checkPriceAscending());
    }

    @Step
    public void verifyProductPricesDescending() {
        Assert.assertTrue(catalogSearchResults.checkPriceDescending());
    }

    @Step
    public void clickArrow() {
        catalogSearchResults.clickArrow();
    }

    @Step
    public void checkNoResults(String expected) {
        String message = catalogSearchResults.getNoResult();
        Assert.assertEquals(expected, message);
    }

    @Step
    public void clickWomen(){
        homePage.clickWomen();
    }

    @Step
    public void checkWomenPage(String expected){
        String message = womenPage.getPageTitle();
        Assert.assertEquals(expected,message);
    }

    @Step
    public void clickSale() {
        homePage.clickSale();
    }
    @Step
    public void clickMen(){
        homePage.clickMen();
    }
    @Step
    public void checkMenPage(String expected){
        String message = menPage.getPageTitle();
        Assert.assertEquals(expected, message);
    }

    @Step
    public void checkSale(String expected) {
        String message = salesPage.getPageTitle();
        Assert.assertEquals(expected, message);

    }

    @Step
    public void navigateToHompage() {
        homePage.open(); }


    @Step
    public void clickOnProduct(){
        catalogSearchResults.clickProduct();
    }
    @Step
    public boolean verifyProductFound() {
      if (productPage.addToCartDisplayed()) ;
                return true;
    }
    @Step
    public void verifyCheckbox(){
        productPage.checkForCheckbox();
    }
    @Step
    public void clickBox(){ productPage.clickCheckbox();}

    @Step
    public void verifyAddToCart() {
        productPage.addToCartDisplayed();
    }

    @Step
    public void addToCart(){
        productPage.clickAddtoCart();
    }
}
