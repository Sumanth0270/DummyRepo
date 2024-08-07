package seleniumpracticepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethodAndSendKeysMethod 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.vtiger.com/vtigercrm/");
Thread.sleep(2000);
WebElement userNameTextField=driver.findElement(By.id("username"));
userNameTextField.clear();
Thread.sleep(2000);
userNameTextField.sendKeys("admin");
Thread.sleep(2000);
WebElement passwordTextField=driver.findElement(By.id("password"));
passwordTextField.clear();
Thread.sleep(2000);
passwordTextField.sendKeys("admin");
Thread.sleep(2000);
driver.manage().window().minimize();
driver.quit();
}
}
