package seleniumpracticepackage;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLoginButtonScreenshot 
{
public static void main(String[] args) throws IOException 
{
	for(int i=1;i<=3;i++)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String timeStamp=LocalDateTime.now().toString().replace(':','-');
		driver.get("https://www.facebook.com/");
		WebElement loginButton=driver.findElement(By.name("login"));
		File tempFile=loginButton.getScreenshotAs(OutputType.FILE);
		File permFile=new File("./errorshots/"+timeStamp+"facebookloginbuttonscreenshot.png");
		FileUtils.copyFile(tempFile, permFile);
		driver.manage().window().minimize();
		driver.quit();
	}
}
}

