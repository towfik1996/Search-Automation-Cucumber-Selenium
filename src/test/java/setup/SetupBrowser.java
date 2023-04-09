package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class SetupBrowser {
    public WebDriver driver;
    public SetupBrowser(){
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--headed");
        chromeOptions.addArguments("--disable-gup");
        chromeOptions.addArguments("--disable-software-rasterizer");
        chromeOptions.addArguments("--remote-allow-origins=*");
        chromeOptions.addArguments("--disable-dev-shm-usage");
        chromeOptions.addArguments("--no-sandbox");

        driver=new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
}
