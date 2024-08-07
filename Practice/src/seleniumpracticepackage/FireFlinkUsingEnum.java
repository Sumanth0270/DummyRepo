package seleniumpracticepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FireFlinkUsingEnum 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://app.fireflink.com/");
	WebElement emailTextfield=driver.findElement(By.id("mui-1"));
	emailTextfield.sendKeys(Keys.CONTROL+"a");
	Thread.sleep(2000);
	emailTextfield.sendKeys(Keys.DELETE);
	Thread.sleep(2000);
	emailTextfield.sendKeys(Keys.chord("sumanthp998@gmail.com"));
	WebElement passwordTextField=driver.findElement(By.id("mui-2"));
	passwordTextField.sendKeys(Keys.CONTROL+"a");
	Thread.sleep(2000);
	passwordTextField.sendKeys(Keys.DELETE);
	Thread.sleep(2000);
	passwordTextField.sendKeys(Keys.chord("Password@1"));
	Thread.sleep(2000);
	WebElement signInButton=driver.findElement(By.xpath("//button[text()='Sign in']"));
	signInButton.sendKeys(Keys.ENTER);
	Thread.sleep(7000);
	driver.manage().window().minimize();
	driver.quit();
}
}
