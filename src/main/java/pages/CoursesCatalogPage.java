package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoursesCatalogPage extends BasePage {
    @FindBy(xpath = "//h3[text() = '3ds Max и CORONA для дизайнеров интерьера и визуализаторов']")
    WebElement currentCourseButton;

    public CoursesCatalogPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnCurrentCourseButton() {
        explicitWaitVisibilityOf(currentCourseButton, timeOutInSeconds);
        currentCourseButton.click();
    }

    public void navigateToCurrentCoursePage() {
        clickOnCurrentCourseButton();
    }
}
