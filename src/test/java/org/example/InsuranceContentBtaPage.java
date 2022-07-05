package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsuranceContentBtaPage {
    public WebDriver driver;
    public static Helper helper;

    public InsuranceContentBtaPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /**
     * Insurance content page title
     */
    @FindBy(xpath = "//h2[@class='title' and contains(text(), 'Kas ir apdrošināts')]")
    private WebElement contentPageTitle;

    /**
     * Button to close insurance content page
     */
    @FindBy(xpath = "//button[@class='popup-close close']")
    private WebElement closeContentPageButton;

    /**
     * method to check content page title
     */
    public void checkContentPageTitle() throws Exception {
        if (! contentPageTitle.isDisplayed()) {
            throw new Exception("Title did not display!");
        }
    }

    /**
     * method to click content page close button
     */
    public void clickCloseContentPageButton(){
        helper.waitObjectByXpath("//button[@class='popup-close close']");
        closeContentPageButton.click();
    }
}
