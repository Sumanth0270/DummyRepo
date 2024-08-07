package seleniumpracticepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram 
{
public static void main(String[] args) 
{
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
String flipkartHomePageTitle=driver.getTitle();
String flipkartHomePageUrl=driver.getCurrentUrl();
System.out.println("flipkartHomePageTitle= "+flipkartHomePageTitle);
System.out.println("flipkartHomePageUrl= "+flipkartHomePageUrl);
}
}
