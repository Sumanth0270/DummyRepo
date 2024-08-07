package seleniumpracticepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByTextAndPartialTagText1 
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://services.india.gov.in/service/detail/indian-citizenship-online-application-forms-ministry-of-home-affairs-1");
	//WebElement educationAndLearningLink=driver.findElement(By.xpath("//a[text()='Education and Learning']"));
	//educationAndLearningLink.click();
	WebElement indianCitizenshipOnlineApplicationLink=driver.findElement(By.xpath("//a[text()='Indian Citizenship Online Application Forms, Ministry of Home Affairs']"));
    indianCitizenshipOnlineApplicationLink.click();
	driver.manage().window().minimize();
	driver.quit();
}
}
