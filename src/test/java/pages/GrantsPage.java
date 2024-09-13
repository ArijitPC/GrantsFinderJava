package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
public class GrantsPage {
    WebDriver driver;


    By connorWebelement = By.xpath("//*/img[@loading ='lazy'][@title = 'Connor | Men’s Clothing & Accessories Online']");
    By elementBanner = By.xpath("//div[@class='nsw-hero-banner__content']/h1");
    By checkbox_business = By.xpath("//label[@class='nsw-form__checkbox-label'][@for='audience-business']");
    By checkbox_individual = By.xpath("//label[@class='nsw-form__checkbox-label'][@for='audience-individual']");
    By checkbox_localgovernment = By.xpath("//label[@class='nsw-form__checkbox-label'][@for='audience-local-government']");
    By checkbox_notforprofit = By.xpath("//label[@class='nsw-form__checkbox-label'][@for='audience-not-for-profit']");
    By button_apply = By.xpath("//div[@class='nsw-filters__accept']/button[@type='submit']");
    //IList<IWebElement> listOfGrants => driver.FindElements(By.XPath("//div[@class='grant-list-detail__audience']/strong"));

    // Constructor to initialize WebDriver
    public GrantsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods to interact with page elements
//    public void openGrantsPage() {
//        driver.get("https://www.nsw.gov.au/grants-and-funding");
//        driver.manage().window().setSize(new Dimension(2565, 1062));
//    }

    public void selectBusinessCheckbox() throws InterruptedException {


       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(checkbox_business));
       js.executeScript("arguments[0].click();", driver.findElement(checkbox_business));

    }
}
