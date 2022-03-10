package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath = "//a[@id = 'enter-button']//span")
    WebElement logInButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickLogInButton() {
        explicitWaitVisibilityOf(logInButton, timeOutInSeconds);
        logInButton.click();
    }

    public void navigateToLogInPage() {
        clickLogInButton();
    }
}
