package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage {
    private static final String EMAIL = "mrs.christinka22@gmail.com";
    private static final String PASSWORD = "22[hbcnz22";

    @FindBy(xpath = "//input[@id = 'username']")
    WebElement emailInputField;

    @FindBy(xpath = "//input[@id = 'password']")
    WebElement passwordInputField;

    @FindBy(xpath = "//button[@name = 'Submit']")
    WebElement submitButton;
    @FindBy(xpath = "//li[@class = 'tabs__item']")
    WebElement logInSection;

    public LogInPage(WebDriver driver) {
        super(driver);
    }

    public void logIn() throws InterruptedException {
        explicitWaitVisibilityOf(emailInputField, timeOutInSeconds);
        emailInputField.sendKeys(EMAIL);
        passwordInputField.sendKeys(PASSWORD);
        submitButton.click();
    }

    public void navigateToLogInSection() {
        explicitWaitVisibilityOf(logInSection, timeOutInSeconds);
        logInSection.click();

    }
}
