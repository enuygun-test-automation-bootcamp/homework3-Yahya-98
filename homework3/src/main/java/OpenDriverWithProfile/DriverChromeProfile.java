package OpenDriverWithProfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.nio.file.Path;
import java.nio.file.Paths;

public class DriverChromeProfile {

    public DriverChromeProfile(){

        // this line find the chromedriver path
        Path resourceDirectory = Paths.get("src","main","resources");
        String absolutePath = resourceDirectory.toFile().getAbsolutePath();
        System.setProperty("webdriver.chrome.driver", absolutePath + "/binary/chromedriver.exe");
        // open explorer with profile
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-data-dir=C:\\Users\\MyPC\\AppData\\Local\\Google\\Chrome\\User Data\\TestProfile");
        options.addArguments("--profile-directory=TestProfile");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com/");

    }
}
