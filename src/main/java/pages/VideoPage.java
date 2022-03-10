package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class VideoPage extends BasePage {
    private static double ZOOM_SCALE = 2;
    private static int YCOORDINATESCROLL = 220;
    @FindBy(xpath = "//div[@class = 'ams-cookie-warning show']//button")
    WebElement acceptCookiesButton;

    @FindBy(xpath = "//button")
    List<WebElement> buttonsList;

    public VideoPage(WebDriver driver) {
        super(driver);
    }

    public void acceptCookies() {
        explicitWaitVisibilityOf(acceptCookiesButton, timeOutInSeconds);
        clickUsingJS(acceptCookiesButton);
    }

    public void zoomWindow() {
        zoom(ZOOM_SCALE);
    }

    public void scrollToCoordinates() {
        scroll(0, YCOORDINATESCROLL);
    }

    public void clickOnPlayButton() throws InterruptedException {
        Thread.sleep(1000);
        new Actions(driver).moveByOffset(800,300).click().build().perform();
    }
}
