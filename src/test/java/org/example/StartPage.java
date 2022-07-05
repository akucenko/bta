package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartPage {
    public WebDriver driver;
    public static Helper helper;

    public StartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /**
     * main menu
     */
    @FindBy(xpath = "//button[contains(@class, 'link-with-line') and contains(text(), 'Apdrošināšana')]")
    private WebElement startMenu;

    /**
     * menu Vacation Insurance
     */
    @FindBy(xpath = "//a[contains(@class, 'title menu-item')  and contains(@href, 'celojuma-apdrosinasana')]")
    private WebElement vacationInsuranceMenu;

    /**
     * method to click start drop down menu
     */
    public void selectStartMenu(){
        helper.waitObjectByXpath("//button[contains(@class, 'link-with-line') and contains(text(), 'Apdrošināšana')]");
        startMenu.click();
    }

    /**
     * method to click Vacancies Insurance Menu
     */
    public void clickVacationInsurancesMenu()
    {
        helper.waitObjectByXpath("//a[contains(@class, 'title menu-item')  and contains(@href, 'celojuma-apdrosinasana')]");
        vacationInsuranceMenu.click();
    }
}
