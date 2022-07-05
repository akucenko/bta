package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import java.lang.String;
import java.lang.Exception;

public class TravelerDataPage {
    public WebDriver driver;

    public TravelerDataPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    protected void assertNonEmptyValue(By selector) throws Exception {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement field =driver.findElement(selector);
        String fieldValue = field.getAttribute("value");
        if (!fieldValue.isEmpty()){
            throw new Exception("Field isn't empty");
        }
    }

    /**
     * method to check traveler name is empty
     */
    public void assertFirstName() throws Exception {
        assertNonEmptyValue(By.xpath("//input[@id='travelerFirstName0-text']"));
    }

    /**
     * method to check traveler name is empty
     */
    public void assertLastName() throws Exception {
        assertNonEmptyValue(By.xpath("//input[@id='travelerLastName0-text']"));
    }

    /**
     * method to check traveler identity number is empty
     */
    public void assertIdentityNumberName() throws Exception {
        assertNonEmptyValue(By.xpath("//input[@id='travelerIdentityNumber0-text']"));
    }
}
