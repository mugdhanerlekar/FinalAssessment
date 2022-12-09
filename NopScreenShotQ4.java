package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

//import testscript.Takescreenshot;

//import selenium.Select;

public class NopScreenShotQ4 {
	public void main(String[] args) throws InterruptedException, IOException {
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
		WebElement firstname = driver.findElement(By.xpath("//input[@id='FirstName']"));
		WebElement lastname = driver.findElement(By.xpath("//input[@id='LastName']"));
		WebElement emailid = driver.findElement(By.xpath("//input[@type='email']"));
		WebElement confirmid = driver.findElement(By.xpath("//input[@name='ConfirmEmail']"));
		WebElement username = driver.findElement(By.xpath("//input[@name='Username']"));
		WebElement checkavailibility = driver.findElement(By.xpath("//input[@type='button']"));
		Select country = new Select(driver.findElement(By.xpath("//select[@name='CountryId']")));
		Select timezone = new Select(driver.findElement(By.xpath("//select[@id='TimeZoneId']")));
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		WebElement Confirmpassword =  driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
		WebElement MyCompany = driver.findElement(By.xpath("/html/body/div[7]/section/div/div/div/div/div/div[2]/form/div/div[3]/div[2]/select"));
		WebElement MyActivity =driver.findElement(By.xpath("/html/body/div[7]/section/div/div/div/div/div/div[2]/form/div/div[3]/div[5]/select"));
		WebElement MyPeople =driver.findElement(By.xpath("/html/body/div[7]/section/div/div/div/div/div/div[2]/form/div/div[3]/div[12]/div"));
	    //action.click().build().perform();
		WebElement register = driver.findElement(By.xpath("//input[@type='submit']"));
		
	   	firstname.sendKeys("mugdha");
		Thread.sleep(2000);
		lastname.sendKeys("nerlekar");
		Thread.sleep(2000);
		emailid.sendKeys("mugdhanerlekar25@gmail.com");
		Thread.sleep(2000);
		confirmid.sendKeys("mugdhanerlekar25@gmail.com");
		Thread.sleep(2000);
		username.sendKeys("mugdha");
		Thread.sleep(2000);
		checkavailibility.click();
		Thread.sleep(2000);
		country.selectByVisibleText("India");
		Thread.sleep(2000);
		timezone.selectByVisibleText("(UTC-10:00)Hawaii");
		Thread.sleep(2000);
		password.sendKeys("Nerlekar@1008");
		Confirmpassword.sendKeys("Nerlekar@1008");
		MyCompany.sendKeys("Other");
		MyActivity.sendKeys("Store administrator(manager)");
		MyPeople.sendKeys("2-5");
		register.click();
		File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(screenshotFile, new File(".//ScreenShots//screen.png"));
		
	}

}
