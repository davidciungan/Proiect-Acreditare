package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class SalesPage extends PageObject {

    @FindBy(css = ".page-title")
    private WebElementFacade pageTitle;

    @FindBy(css = ".price-box")
    private WebElementFacade priceBox;

    @FindBy(css = ".old-price")
    private WebElementFacade oldPrice;

    @FindBy(css = "category-products")

    private WebElementFacade listOfProducts;

    public String getPageTitle() {
        return pageTitle.getText();
    }
}


