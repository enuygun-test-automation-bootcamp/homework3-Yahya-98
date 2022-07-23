package OpenDriverWithProfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

import java.nio.file.Path;
import java.nio.file.Paths;

public class DriverFiroxProfile {

   public DriverFiroxProfile(){

       // this line find the geckodriver path
       Path resourceDirectory = Paths.get("src","main","resources");
       String absolutePath = resourceDirectory.toFile().getAbsolutePath();
       System.setProperty("webdriver.gecko.driver", absolutePath + "/binary/geckodriver.exe");

       // open explorer with profile
       ProfilesIni profile = new ProfilesIni();
       FirefoxProfile fireFoxProfile = profile.getProfile("TestProfile");
       FirefoxOptions opt = new FirefoxOptions();
       WebDriver driver = new FirefoxDriver(opt);
       driver.get("https://www.google.com/");

   }

}
