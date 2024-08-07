package seleniumpracticepackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FlipkartDropDown 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/search?q=vivo+y21&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off&as-pos=1&as-type=HISTORY&p%5B%5D=facets.price_range.from%3D10000&p%5B%5D=facets.price_range.to%3D20000");
    WebElement ram6Gb=driver.findElement(By.xpath("//div[text()='6 GB']/..//div[@class='_24_Dny']"));
    Thread.sleep(3000);
    ram6Gb.click();
    Thread.sleep(3000);
    WebElement ram3Gb=driver.findElement(By.xpath("//div[text()='3 GB']/..//div[@class='_24_Dny']"));
    ram3Gb.click();
    Thread.sleep(3000);
    WebElement priceMinDropDown=driver.findElement(By.xpath("//option[text()='₹10000']"));
    Select priceMinSelect=new Select(priceMinDropDown);
    priceMinSelect.selectByVisibleText("₹15000");
    WebElement priceMaxDropDown=driver.findElement(By.xpath("//option[text()='₹30000+']"));
    Select priceMaxSelect=new Select(priceMaxDropDown);
    priceMaxSelect.selectByVisibleText("₹20000");
    Thread.sleep(3000);
    driver.manage().window().minimize();
    driver.quit();
}
}
