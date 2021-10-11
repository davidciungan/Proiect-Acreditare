package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MenPage extends PageObject {

@FindBy (css= ".page-title")
    private WebElementFacade pageTitle;

public String getPageTitle (){ return  pageTitle.getText(); }


}
