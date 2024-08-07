package seleniumpracticepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethodRadioButton 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/signup");
WebElement maleRadioButton=driver.findElement(By.xpath("//label[text()='Male']/..//input[@name='sex']"));
if(maleRadioButton.isSelected())
{
	System.out.println("Fail:maleRadioButton is already in selected state");
}
else
{
	System.out.println("Pass:maleRadioButton not in selected state");
	maleRadioButton.click();
	Thread.sleep(3000);
}
driver.manage().window().minimize();
driver.quit();
}
}
