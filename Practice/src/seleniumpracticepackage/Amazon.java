package seleniumpracticepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/");
Thread.sleep(2000);
WebElement searchTextField=driver.findElement(By.id("twotabsearchtextbox"));
searchTextField.sendKeys("tshirt");
WebElement searchButton=driver.findElement(By.id("nav-search-submit-button"));
searchButton.click();
Thread.sleep(5000);
driver.manage().window().minimize();
driver.quit();
}
}
