package runners;

public class MainRunner extends BaseRunner {
    public static void main(String[] args) throws InterruptedException {
        BaseRunner runner = new BaseRunner();

        runner.profileSetup();
        runner.runnersSetUp();

        runner.getHomePage().navigateToLogInPage();
        //runner.getLogInPage().navigateToLogInSection();
        runner.getLogInPage().logIn();

        runner.getCoursesCatalogPage().navigateToCurrentCoursePage();

        runner.getCurrentCoursePage().navigateToSection();
        runner.getCurrentCoursePage().navigateToVideo();

        runner.getVideoPage().zoomWindow();
        runner.getVideoPage().acceptCookies();
        runner.getVideoPage().scrollToCoordinates();
        runner.getVideoPage().clickOnPlayButton();

        runner.tearDown();
    }
}
