package seleniumpracticepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TryForGraphicLogo 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.meesho.com/");
	WebElement searchTextfield=driver.findElement(By.xpath("//input[@placeholder='Try Saree, Kurti or Search by Product Code']"));
	searchTextfield.click();
	//searchTextfield.sendKeys("tshirt ");
	Thread.sleep(5000);
	WebElement shoesLink=driver.findElement(By.xpath("//p[text()='shoes']"));
	shoesLink.click();
//	WebElement accountLogo=driver.findElement(By.xpath("(//div[@color='white']//div)[7]"));
//	accountLogo.click();
//	Thread.sleep(2000);
//	WebElement signupButton=driver.findElement(By.xpath("//button[@class='sc-gYbzsP ghVuYS']			"));
//	signupButton.click();
	Thread.sleep(5000);
	driver.manage().window().minimize();
	driver.quit();
}
}
