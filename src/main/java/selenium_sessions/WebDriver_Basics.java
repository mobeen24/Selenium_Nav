package selenium_sessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriver_Basics {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://postmates.com/");



    }
}
