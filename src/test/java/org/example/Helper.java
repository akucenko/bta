package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper {
    public static WebDriver driver;
    static int delay = 6;

    public Helper(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /**
     * accept cookies button
     */
    @FindBy(xpath = "//*[contains(@class, 'button green allow')]")
    private WebElement cookiesButton;

    /**
     * method to click
     */
    public void clickAcceptCookies(){
        if (cookiesButton.isDisplayed())
        cookiesButton.click();
    }

    public static void clickObstructedById(String id){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement button =driver.findElement(By.id(id));
        js.executeScript("arguments[0].click();", button);
    }

    public static void clickObstructedByXpath(String xpath){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement button =driver.findElement(By.xpath(xpath));
        js.executeScript("arguments[0].click();", button);
    }

    public static void waitObjectByXpath(String xpath) {
        WebDriverWait wt = new WebDriverWait(driver, delay);
        wt.until(ExpectedConditions.elementToBeClickable (By.xpath(xpath)));
    }

    public static void waitObjectById(String id) {
        WebDriverWait wt = new WebDriverWait(driver,delay);
        wt.until(ExpectedConditions.elementToBeClickable (By.id(id)));
    }
}
