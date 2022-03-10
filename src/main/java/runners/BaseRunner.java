package runners;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseRunner {
    private WebDriver driver;
    private static final String AUTOCAD_URL = "https://autocad-specialist.ru/";


    public void profileSetup() {
        chromedriver().setup();
    }

    public void runnersSetUp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(1920,1080));

        driver.get(AUTOCAD_URL);
    }
    
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000000);
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public HomePage getHomePage() {
        return new HomePage(getDriver());
    }

    public LogInPage getLogInPage() {
        return new LogInPage(getDriver());
    }

    public CoursesCatalogPage getCoursesCatalogPage() {
        return new CoursesCatalogPage(getDriver());
    }

    public CurrentCoursePage getCurrentCoursePage() {
        return new CurrentCoursePage(getDriver());
    }

    public VideoPage getVideoPage() {
        return new VideoPage(getDriver());
    }
}
