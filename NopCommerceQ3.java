package selenium;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class NopCommerceQ3 {
	public void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MN69905\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en");
		driver.manage().window().maximize();
		Thread.sleep(800);
		WebElement usericon =driver.findElement(By.xpath("((//ul[@class='navigation-top-menu navigation-top-menu-user-actions'])/li)[3]"));
		WebElement registerlink=driver.findElement(By.xpath("((//ul[@class='navigation-top-menu-sublist'])[6]/li[2])"));
		Actions action = new Actions(driver);
		action.moveToElement(usericon);
		Thread.sleep(3000);
		action.click(registerlink).build().perform();
		Thread.sleep(5000);
		driver.quit();
	}
}
		
		
		
		
		







