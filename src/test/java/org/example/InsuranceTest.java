package org.example;
import org.junit.BeforeClass;
import org.junit.AfterClass;

import java.lang.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class InsuranceTest {
    public static WebDriver driver;
    public static StartPage startPage;
    public static VacationInsurancePage vacationInsurancePage;
    public static DestinationPage destinationPage;
    public static SelectCountryPage selectCountryPage;
    public static Helper helper;
    public static ActivityPage activityPage;
    public static InsurancePlanBtaPage insurancePlanBtaPage;
    public static InsuranceContentBtaPage insuranceContentBtaPage;
    public static TravelerDataPage travelerDataPage;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        startPage = new StartPage(driver);
        vacationInsurancePage = new VacationInsurancePage(driver);
        destinationPage = new DestinationPage(driver);
        selectCountryPage = new SelectCountryPage(driver);
        helper = new Helper(driver);
        activityPage = new ActivityPage(driver);
        insurancePlanBtaPage = new InsurancePlanBtaPage(driver);
        insuranceContentBtaPage = new InsuranceContentBtaPage(driver);
        travelerDataPage = new TravelerDataPage(driver);

        driver.get(ConfProperties.getProperty("startPage"));
    }

    @Test
    public void checkSportInsurance() throws Exception {
        helper.clickAcceptCookies();
        startPage.selectStartMenu();
        startPage.clickVacationInsurancesMenu();
        vacationInsurancePage.checkVacationInsuranceTitle();
        vacationInsurancePage.clickDestinationMenu();
        destinationPage.clickSelectCountryButton();
        destinationPage.addCountryButton();
        destinationPage.selectCountry();
        destinationPage.clickApplyButton();
        vacationInsurancePage.checkRegionValue();
        vacationInsurancePage.clickActivity();
        activityPage.clickSportButton();
        vacationInsurancePage.checkActivityValue();
        vacationInsurancePage.clickProposalButton();
        insurancePlanBtaPage.checkPlanPageTitle();
        insurancePlanBtaPage.clickOptimalPlanButton();
        insurancePlanBtaPage.clickCheckInsuranceButton();
        insuranceContentBtaPage.checkContentPageTitle();
        insuranceContentBtaPage.clickCloseContentPageButton();
        insurancePlanBtaPage.clickSubmitButton();
        travelerDataPage.assertFirstName();
        travelerDataPage.assertLastName();
        travelerDataPage.assertIdentityNumberName();
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}
