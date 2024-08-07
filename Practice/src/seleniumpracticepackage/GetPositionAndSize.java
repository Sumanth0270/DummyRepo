package seleniumpracticepackage;

import java.util.*;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPositionAndSize 
{
public static void main(String[] args) 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
driver.switchTo().newWindow(WindowType.WINDOW);
driver.get("https://www.facebook.com/signup");
Set<String> allWids=driver.getWindowHandles();
for(String wid:allWids)
{
	String widurl=driver.switchTo().window(wid).getCurrentUrl();
	System.out.println(widurl);
	if(widurl.equals("https://www.facebook.com/"))
	{
		
	}
	else if(widurl.equals("https://www.facebook.com/signup"))
	{
		int childWindowHeight=driver.manage().window().getSize().getHeight();
		System.out.println("childWindowHeight = "+childWindowHeight);
		int childWindowWidth=driver.manage().window().getSize().getWidth();
		System.out.println("childWindowWidth = "+childWindowWidth);
		int childWindowXaxis=driver.manage().window().getPosition().getX();
		System.out.println("childWindowXaxis = "+childWindowXaxis);
		int childWindowYaxis= driver.manage().window().getPosition().getY();
		System.out.println("childWindowYaxis = "+childWindowYaxis);
		Dimension size=new Dimension(100, 200);
		driver.manage().window().setSize(size);
		Point position=new Point(400, 200);
		driver.manage().window().setPosition(position);
	}
}
driver.manage().window().minimize();
driver.quit();
}
}
