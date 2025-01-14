package seleniumpracticepackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetScreenshotAsMethod 
{
public static void main(String[] args) throws IOException 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.zomato.com/bangalore");
TakesScreenshot ts=(TakesScreenshot)driver;
File tempFile=ts.getScreenshotAs(OutputType.FILE);
File permFile=new File("./errorshots/zomatowebpagescreenshot.png");
FileUtils.copyFile(tempFile, permFile);
driver.manage().window().minimize();
driver.quit();
}
}
