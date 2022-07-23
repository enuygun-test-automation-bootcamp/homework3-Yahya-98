import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.chrome.ChromeDriver;
import java.nio.file.Path;
import java.nio.file.Paths;
public  class DriverChrome extends DriverSetup {


    public DriverChrome(){

        // this line find the chromedriver path
        Path resourceDirectory = Paths.get("src","main","resources");
        String absolutePath = resourceDirectory.toFile().getAbsolutePath();
        System.setProperty("webdriver.chrome.driver", absolutePath + "/binary/chromedriver.exe");


    }

    @Override
    public void openUrl(String url) {

        //this line created the chromedriver
        try{
           this.driver = new ChromeDriver();

        }catch (SessionNotCreatedException e){
            System.out.println("\nWeb Driver Not Created " + e.getMessage());
        }catch (IllegalStateException e){
            System.out.println("\nWeb Driver Not Found" + e.getMessage());
        }

        super.openUrl(url);
        // this line for get url
        driver.get(url);

    }
}
