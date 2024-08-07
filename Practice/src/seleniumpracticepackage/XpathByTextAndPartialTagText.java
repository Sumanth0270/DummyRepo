package seleniumpracticepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByTextAndPartialTagText 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://money.rediff.com/gainers");
Thread.sleep(2000);
//Xpath by Partial Text Tag
WebElement companyOneGlobalServiceLink=driver.findElement(By.xpath("//a[contains(text(),'One Global Service')]"));
companyOneGlobalServiceLink.click();
Thread.sleep(2000);
driver.switchTo().newWindow(WindowType.WINDOW);
driver.manage().window().maximize();
driver.get("https://pib.gov.in/indexd.aspx");
//Xpath by Text Tag
WebElement liaisonOfficerLink=driver.findElement(By.xpath("//a[text()='Liaison Officer']"));
liaisonOfficerLink.click();
Thread.sleep(2000);
driver.navigate().back();
//Xpath by Text Tag
WebElement connectToPMLink=driver.findElement(By.xpath("//a[text()='Connect to PM']"));
connectToPMLink.click();
driver.switchTo().newWindow(WindowType.WINDOW);
driver.get("https://pib.gov.in/indexd.aspx");
//Xpath by Partial Text Tag
WebElement latestPressReleseLink4=driver.findElement(By.xpath("//a[contains(text(),'APEDA')]"));
latestPressReleseLink4.click();
Thread.sleep(2000);
driver.manage().window().minimize();
Thread.sleep(2000);
driver.quit();
}
}
