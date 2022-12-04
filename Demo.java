import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saurabh {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (2)\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("https://www.selenium.dev/downloads/");
System.out.println(driver.getTitle());
	}

}
