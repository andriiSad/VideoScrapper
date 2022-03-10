package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CurrentCoursePage extends BasePage {
    private static final String SELECTED_VIDEO_ID = "5.2";

    public CurrentCoursePage(WebDriver driver) {
        super(driver);
    }

    private String getSectionNumber() {
        return SELECTED_VIDEO_ID.split("\\.")[0];
    }

    private String getVideoNumber() {
        return SELECTED_VIDEO_ID.split("\\.")[1];
    }

    public void navigateToSection() {
        WebElement selectedSection = driver.findElement(By.xpath("//div[@id = '" + getSectionNumber() + "_section']"));
        explicitWaitVisibilityOf(selectedSection, timeOutInSeconds);
        selectedSection.click();
    }

    public void navigateToVideo() {
        WebElement selectedVideo = driver.findElement(By.xpath("//nobr[text() = '" + SELECTED_VIDEO_ID + "']"));
        explicitWaitVisibilityOf(selectedVideo, timeOutInSeconds);
        selectedVideo.click();
    }

}
