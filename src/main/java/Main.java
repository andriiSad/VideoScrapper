import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        //opening main page
        driver.get("https://autocad-specialist.ru/katalog-kursov.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.get("chrome://settings/");
        driver.executeScript("chrome.settingsPrivate.setDefaultZoom(1.5);");
        Thread.sleep(2000);
        driver.navigate().back();


        WebElement logInButton = driver.findElement(By.xpath("//a[@id = 'enter-button']//span"));
        logInButton.click();
        //log in process
        WebElement emailInput = driver.findElement(By.xpath("//input[@id = 'username']"));
        WebElement passwordInput = driver.findElement(By.xpath("//input[@id = 'password']"));
        WebElement submitButton = driver.findElement(By.xpath("//button[@name = 'Submit']"));
        emailInput.sendKeys("mrs.christinka22@gmail.com");
        passwordInput.sendKeys("22[hbcnz22");
        submitButton.click();
        Thread.sleep(2000);
        //navigate to course
        WebElement toCourseButton = driver.findElement(By.xpath("//div[@class = 'ams-card__kind']"));
        toCourseButton.click();
        //navigate to video
        WebElement firstSectionButton = driver.findElement(By.xpath("//div[@id = '1_section']"));
        firstSectionButton.click();
        WebElement firstVideoButton = driver.findElement(By.xpath("//span[@class = 'course-contents__val']"));
        firstVideoButton.click();
        Thread.sleep(3000);


        new Actions(driver).moveByOffset(800, 500).click().build().perform();
        Thread.sleep(1000);


        Thread.sleep(20000);
        driver.quit();

    }
}
