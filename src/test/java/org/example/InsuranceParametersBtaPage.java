package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsuranceParametersBtaPage {
    public WebDriver driver;

    public InsuranceParametersBtaPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /**
     * Region field
     */
    @FindBy(xpath = "//*[@class, 'text text-icon' and contains(text(), 'Visa pasaule')]")
    private WebElement regionField;
}