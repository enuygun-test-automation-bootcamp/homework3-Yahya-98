import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class LoginPage {
    // button and input xpath
    By loginbutton = By.id("ctx-LoginBtn");
    By email = By.xpath("//input[@name='_email']");
    By password =By.xpath("//input[@class='MuiInputBase01198 MuiOutlinedInput01183 MuiInputBase01201 MuiInputBase01204 MuiOutlinedInput01187 katalon__modal-password']");
    By popuplogin = By.xpath("//span[@class='MuiButton01222']");

    public void openLoginPage(WebDriver s) {

        // click the login button
        s.findElement(loginbutton).click();

        // wait a second for open the popup login page
        s.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        // switch to popup login page and send email and password
        s.switchTo().activeElement().findElement(email).sendKeys("test0@test.com");
        s.findElement(password).sendKeys("test123");

        // click the login button
        s.findElement(popuplogin).click();


    }

}
