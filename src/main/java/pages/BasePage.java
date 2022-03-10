package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    WebDriver driver;
    public static long timeOutInSeconds = 15;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnElement(WebElement element) {
        element.click();
    }

    public void implicitWait(long timeToWait) {
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(timeToWait));
    }

    public WebElement explicitWaitVisibilityOf(WebElement webElement, long timeOutInSeconds) {
        new WebDriverWait(driver, Duration.ofSeconds(timeOutInSeconds)).until(ExpectedConditions.visibilityOf(webElement));
        return webElement;
    }

    public WebElement explicitWaitTextToBePresentInElement(WebElement webElement, long timeOutInSeconds, String text) {
        new WebDriverWait(driver, Duration.ofSeconds(timeOutInSeconds)).until(ExpectedConditions.textToBePresentInElement(webElement, text));
        return webElement;
    }

    public void zoom(double scale) {
        driver.get("chrome://settings/");
        ((JavascriptExecutor) driver).executeScript("chrome.settingsPrivate.setDefaultZoom(" + scale + ");");
        driver.navigate().back();
    }

    public void clickUsingJS(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    public void scroll(int xCoordinate, int yCoordinate) {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(" + xCoordinate + "," + yCoordinate + ")", "");
    }
}
