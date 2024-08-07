package seleniumpracticepackage;

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPositionAndsize1 
{
public static void main(String[] args) 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
driver.switchTo().newWindow(WindowType.WINDOW);
driver.get("https://www.facebook.com/signup");
Set<String> allWids=driver.getWindowHandles();
System.out.println(allWids);
System.out.println(allWids.size());
for(String wid:allWids)
{
String widUrl=driver.switchTo().window(wid).getCurrentUrl();
System.out.println(widUrl);
if(widUrl.equals("https://www.facebook.com/"))
{
	
}
else if(widUrl.equals("https://www.facebook.com/signup"))
{
	int childWidHeight=driver.manage().window().getSize().getHeight();
	System.out.println("childWidHeight = "+childWidHeight);
	int childWidWidth=driver.manage().window().getSize().getWidth();
	System.out.println("childWidWidth = "+childWidWidth);
	int childWidPosXaxis=driver.manage().window().getPosition().getX();
	System.out.println("childWidPosXaxis = "+childWidPosXaxis);
	int childWidPosYaxis=driver.manage().window().getPosition().getY();
	System.out.println("childWidPosYaxis = "+childWidPosYaxis);
	Dimension size=new Dimension(100,700);
	driver.manage().window().setSize(size);
	Point position=new Point(415, 50);
	driver.manage().window().setPosition(position);
}
}
}
}


