package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VacationInsurancePage {
    public WebDriver driver;
    public static Helper helper;

    public VacationInsurancePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        helper = new Helper(driver);
    }

    /**
     * Page title
     */
    @FindBy(xpath = "//h1[@class = 'title' and contains(text(), 'Ceļojumu apdrošināšana')]")
    private WebElement vacationInsuranceTitle;

    /**
     * Field destination country - Eiropa
     */
    @FindBy(xpath = "//span[contains(@class, 'text text-icon') and contains(text(), 'Eiropa')]")
    private WebElement regionEiropa;

    /**
     * Field destination country - World
     */
    @FindBy(xpath = "//span[contains(@class, 'text text-icon') and contains(text(), 'Visa pasaule')]")
    private WebElement regionWorld;

    /**
     * Field activity - Sports
     */
    @FindBy(xpath = "//span[contains(@class, 'text text-icon') and contains(text(), 'Sports')]")
    private WebElement activitySport;

    /**
     * button destination country
     */
    @FindBy(xpath = "//button[@id='regionalSelectorRegion-open']/parent::div")
    private WebElement destinationButton;

    /**
     * button activity
     */
    @FindBy(xpath = "//button[@id='travelActivities-open']")
    private WebElement activityButton;

    /**
     * button preposal
     */
    @FindBy(xpath = "//button[@class='button red' and contains(text(),'Saņemt piedāvājumu')]")
    private WebElement preposalButton;


    /**
     * method to check title
     */
    public void checkVacationInsuranceTitle() throws Exception {
        if (! vacationInsuranceTitle.isDisplayed()) {
            throw new Exception("Title did not display!");
        }
    }

    /**
     * method to click menu Destination
     */
    public void clickDestinationMenu(){
        helper.clickObstructedById("regionalSelectorRegion-open");
    }

    /**
     * method to check region
     */
    public void checkRegionValue() throws Exception {
        if (! regionWorld.isDisplayed()) {
            throw new Exception("Title did not display!");
        }
    }

    /**
     * method to change activity
     */
    public void clickActivity(){
        helper.clickObstructedById("travelActivities-open");
    }

    /**
     * method to check activity
     */
    public void checkActivityValue() throws Exception {
        if (! activitySport.isDisplayed()) {
            throw new Exception("Title did not display!");
        }
    }

    /**
     * method to click button proposal
     */
    public void clickProposalButton(){
        helper.clickObstructedByXpath("//button[@class='button red' and contains(text(),'Saņemt piedāvājumu')]");
    }
}