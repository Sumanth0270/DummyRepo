package seleniumpracticepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethodRadioButton1 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.myntra.com/fire-boltt?rawQuery=Fire-Boltt&sort=popularity");
Thread.sleep(10000);
WebElement menRadioButton=driver.findElement(By.xpath("//label[text()='Men']/..//div[@class='common-radioIndicator']"));
if(menRadioButton.isSelected())
{
	System.out.println("Fail:menRadioButton is already in selected state");
}
else
{
	System.out.println("Pass:menRadioButton is not in selected state");
	menRadioButton.click();
	Thread.sleep(2000);
}
driver.manage().window().minimize();
driver.quit();
}
}
