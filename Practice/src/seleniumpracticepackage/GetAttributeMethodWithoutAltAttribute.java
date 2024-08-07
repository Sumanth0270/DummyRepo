package seleniumpracticepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethodWithoutAltAttribute 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("file:///C:/Users/suman/Desktop/Web%20Technology/HTML/favourites.html");
WebElement dhoniImage=driver.findElement(By.xpath("//img[contains(@src,'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTs')]"));
String dhoniImageAltValue=dhoniImage.getAttribute("alt");
Thread.sleep(2000);
if(dhoniImageAltValue.isEmpty())
{
	System.out.println("Dhoni Image Alt Attribute Is Not Present");
}
else
{
	dhoniImage.click();
}
Thread.sleep(2000);
driver.manage().window().maximize();
driver.quit();
}
}
