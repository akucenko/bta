package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectCountryPage {
    public WebDriver driver;
    public static Helper helper;

    public SelectCountryPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /**
     * Button to add country
     */
    @FindBy(xpath = "//[@id, 'regionalSelectorCountry-addCountry']")
    private WebElement buttonAddCountry;

    /**
     * method to add country
     */
    public void clickSelectCountryButton()
    {
        helper.waitObjectByXpath("//[@id, 'regionalSelectorCountry-addCountry']");
        buttonAddCountry.click();
    }
}
