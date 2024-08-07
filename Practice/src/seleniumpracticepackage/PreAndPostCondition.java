package seleniumpracticepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PreAndPostCondition 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
Thread.sleep(1000);
driver.manage().window().maximize();
driver.get("https://www.apple.com/");
String appleHomePageTitle=driver.getTitle();
String appleHomePageUrl=driver.getCurrentUrl();
System.out.println("appleHomePageTitle= "+appleHomePageTitle);
System.out.println("appleHomePageUrl= "+appleHomePageUrl);
driver.manage().window().minimize();
}
}
