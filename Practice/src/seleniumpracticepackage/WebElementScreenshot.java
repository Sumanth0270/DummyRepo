package seleniumpracticepackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementScreenshot 
{
public static void main(String[] args) throws IOException 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
WebElement forgotPasswordLink=driver.findElement(By.linkText("Forgotten password?"));
File tempFile=forgotPasswordLink.getScreenshotAs(OutputType.FILE);
File permFile=new File("./errorshots/facebookforgotLinkscreenshot.png");
FileUtils.copyFile(tempFile, permFile);
driver.manage().window().maximize();
driver.quit();
}
}
