package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityPage {
    public WebDriver driver;
    public static Helper helper;

    public ActivityPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /**
     * button Sport
     */
    @FindBy(xpath = "//button[@id='travelActivities-popup-select-option-3']")
    private WebElement sportButton;

    /**
     * method to click button for country selection
     */
    public void clickSportButton()
    {
        helper.waitObjectByXpath("//button[@id='travelActivities-popup-select-option-3']");
        sportButton.click();
    }
}
