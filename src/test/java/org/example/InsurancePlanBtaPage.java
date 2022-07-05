package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsurancePlanBtaPage {
    public WebDriver driver;
    public static Helper helper;

    public InsurancePlanBtaPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        helper = new Helper(driver);
    }

    /**
     * Plan page title
     */
    @FindBy(xpath = "//h2[@class='title' and contains(text(), 'Izvēlies programmu')]")
    private WebElement planPageTitle;


    /**
     * button to select plan - Optimal+
     */
    @FindBy(xpath = "//button[@datatype='selectPolicyPlanOPP']")
    private WebElement optimalPlanButton;

    /**
     * button to submit plan
     */
    @FindBy(xpath = "//button[@class='button red' and @data-button='submit']")
    private WebElement submitPlanButton;

    /**
     * button to check insurance
     */
    @FindBy(xpath = "//button[@class='button-covered-popup' and contains(@data-param, 'OPP')]")
    private WebElement checkInsuranceButton;

    /**
     * method to check plan page title
     */
    public void checkPlanPageTitle() throws Exception {
        if (! planPageTitle.isDisplayed()) {
            throw new Exception("Title did not display!");
        }
    }

    /**
     * method to click Vacancies Insurance Menu
     */
    public void clickOptimalPlanButton(){
        helper.clickObstructedByXpath("//button[@datatype='selectPolicyPlanOPP']");
    }

    /**
     * method to click Vacancies Insurance Menu
     */
    public void clickCheckInsuranceButton(){
        helper.clickObstructedByXpath("//button[@class='button-covered-popup' and contains(@data-param, 'OPP')]/span[@class='title popup-title']");
    }

    /**
     * method to click Vacancies Insurance Menu
     */
    public void clickSubmitButton(){
        submitPlanButton.click();
    }
}
