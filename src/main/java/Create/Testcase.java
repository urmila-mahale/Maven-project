package Create;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testcase {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","/home/urmila/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement SearchBox = driver.findElement(By.id("twotabsearchtextbox"));
		SearchBox.sendKeys("JBL earphones");
		WebElement  SearchIcon = driver.findElement(By.className("nav-input"));
		SearchIcon.click();
		Thread.sleep(4000);
// WebElement  CheckBox = driver.findElement(By.className("a-icon a-icon-checkbox"));
//   CheckBox.click();
	  
		js.executeScript("window.scrollBy(0,7000)");
		Thread.sleep(4000);
		
		driver.quit();

	}

}
