package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DestinationPage {
    public WebDriver driver;
    public static Helper helper;
    final String country="Indija";

    public DestinationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /**
     * Title of destination country page
     */
    @FindBy(xpath = "//*[@class, 'title'] and contains(text(), 'Ceļojuma galamērķis')]")
    private WebElement destinationMenuTitle;

    /**
     * Button to select country
     */
    @FindBy(xpath = "//div[@id = 'regionalSelectorCountry-showListSearch']")
    private WebElement buttonSelectCountry;

    /**
     * Button to select country
     */
    @FindBy(xpath = "//div[@id = 'regionalSelectorCountry-addCountry']")
    private WebElement buttonAddCountry;

    /**
     * Button to select country
     */
    @FindBy(xpath = "//button[@data-value='"+country+"']")
    private WebElement countryValue;

    /**
     * Apply button
     */
    @FindBy(xpath = "//button[@id='regionalSelectorCountry-applyButton']")
    private WebElement ApplyButton;

    /**
     * method to click button for country selection
     */
    public void clickSelectCountryButton()
    {
        helper.waitObjectByXpath("//div[@id = 'regionalSelectorCountry-showListSearch']");
        buttonSelectCountry.click();
    }

    /**
     * method to click button for country selection
     */
    public void addCountryButton()
    {
        helper.waitObjectById("regionalSelectorCountry-addCountry");
        helper.clickObstructedById("regionalSelectorCountry-addCountry");
    }

    /**
     * method to select India
     */
    public void selectCountry()
    {
        helper.waitObjectByXpath("//button[@data-value='"+country+"']");
        countryValue.click();
    }

    /**
     * method to click apply button
     */
    public void clickApplyButton()
    {
        helper.waitObjectByXpath("//button[@id='regionalSelectorCountry-applyButton']");
        ApplyButton.click();
    }
}