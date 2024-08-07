package seleniumpracticepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterTheDataUsingEnum 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.vtiger.com/vtigercrm/");
WebElement usernameTextField=driver.findElement(By.id("username"));
Thread.sleep(2000);
usernameTextField.sendKeys(Keys.CONTROL+"a");
Thread.sleep(2000);
usernameTextField.sendKeys(Keys.DELETE);
Thread.sleep(2000);
usernameTextField.sendKeys(Keys.chord("admin"));
WebElement passwordTextField=driver.findElement(By.id("password"));
Thread.sleep(2000);
passwordTextField.sendKeys(Keys.CONTROL+"a");
Thread.sleep(2000);
passwordTextField.sendKeys(Keys.DELETE);
Thread.sleep(2000);
passwordTextField.sendKeys(Keys.chord("admin"));
WebElement signInButton=driver.findElement(By.xpath("//button[text()='Sign in']"));
Thread.sleep(2000);
signInButton.sendKeys(Keys.ENTER);
Thread.sleep(2000);
driver.manage().window().minimize();
driver.quit();
}
}
