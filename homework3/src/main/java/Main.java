public class Main {

    public static void main(String[] args) {

        // created the drivers
        DriverSetup[] drivers = {new DriverChrome(), new DriverFirefox()};

        // created the login page
        LoginPage loginPage = new LoginPage();



        for(int i = 0; i <drivers.length; i++){

            // go the url for all drivers
            drivers[i].openUrl("https://www.enuygun.com/");

            // log in for all drivers
            loginPage.openLoginPage(drivers[i].driver);

        }
    }
}
