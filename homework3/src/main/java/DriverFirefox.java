import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.nio.file.Path;
import java.nio.file.Paths;

public  class DriverFirefox extends DriverSetup{


    public DriverFirefox(){

        // this line find the geckodriver path
        Path resourceDirectory = Paths.get("src","main","resources");
        String absolutePath = resourceDirectory.toFile().getAbsolutePath();
        System.setProperty("webdriver.gecko.driver", absolutePath + "/binary/geckodriver.exe");


    }

    @Override
    public void openUrl(String url) {

        //this line created the geckodriver
        try{
            this.driver = new FirefoxDriver();

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
