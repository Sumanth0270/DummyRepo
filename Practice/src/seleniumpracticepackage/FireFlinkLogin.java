package seleniumpracticepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FireFlinkLogin 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://app.fireflink.com/signin");
WebElement emailTextField=driver.findElement(By.id("emailId"));
Thread.sleep(2000);
emailTextField.clear();
Thread.sleep(2000);
emailTextField.sendKeys("sumanthp998@gmail.com");
Thread.sleep(2000);
WebElement passwordTextField=driver.findElement(By.name("password"));
passwordTextField.clear();
Thread.sleep(2000);
passwordTextField.sendKeys("Password@1");
Thread.sleep(2000);
WebElement signInButton=driver.findElement(By.xpath("//button[text()='Sign in']"));
signInButton.submit();
Thread.sleep(7000);
driver.manage().window().minimize();
driver.quit();
}
}
