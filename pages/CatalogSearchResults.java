package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

public class CatalogSearchResults extends PageObject {

    @FindBy(css = ".products-grid .item")
    private List<WebElementFacade> listOfProducts;

    @FindBy(css = ".category-products > .toolbar select[title='Sort By'")
    private WebElementFacade sortByElement;

    @FindBy (css=".sort-by a")
    WebElementFacade descendingArrow;

   @FindBy (css=".note-msg")
   WebElementFacade noResults;

//   @FindBy(css=".product-info>.product-name a ")
//   private WebElementFacade product;

@FindBy(css ="ul > li:nth-child(6) > div > h2 > a" )
private WebElementFacade product;
   public void clickProduct(){
       clickOn(product);
   }


//    public boolean findProductInGrid(String name) {
//        for (WebElementFacade product : listOfProducts) {
//            if (product.find(By.cssSelector(".product-name a")).getText().equals(name))
//                return true;
//        }
//        return false;
//    }
    public boolean findProductInGrid(String name) {
        for (WebElementFacade product : listOfProducts) {
            if (product.find(By.cssSelector("ul > li:nth-child(6) > div > h2 > a")).getText().equals(name))
                return true;

        }return false;
    }

    public void sortByDropdown(String text) {
        sortByElement.selectByVisibleText(text);
    }


    public boolean checkPriceAscending() {
        String priceAsString = listOfProducts.get(0)
                .find(By.cssSelector(".price")).getText()
                .replace(",00 RON", "");
        int priceFirstProduct = Integer.parseInt(priceAsString);
        String priceAssStringLastProduct = listOfProducts.get(listOfProducts.size() - 1)
                .find(By.cssSelector(".price")).getText()
                .replace(",00 RON", "");
        int priceLastProduct = Integer.parseInt(priceAssStringLastProduct);
        if (priceFirstProduct < priceLastProduct) {
            return true;
        }
        return false;
    }
    public boolean checkPriceDescending() {
        String priceAsString = listOfProducts.get(0)
                .find(By.cssSelector(".price")).getText()
                .replace(",00 RON", "");
        int priceFirstProduct = Integer.parseInt(priceAsString);
        String priceAssStringLastProduct = listOfProducts.get(listOfProducts.size() - 1)
                .find(By.cssSelector(".price")).getText()
                .replace(",00 RON", "");
        int priceLastProduct = Integer.parseInt(priceAssStringLastProduct);
        if (priceFirstProduct > priceLastProduct) {
            return true;
        }
        return false;
    }
public void clickArrow(){
        clickOn(descendingArrow);
}

public String getNoResult (){ return  noResults.getText(); }
}