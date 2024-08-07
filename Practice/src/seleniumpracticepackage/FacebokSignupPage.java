package seleniumpracticepackage;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebokSignupPage 
{
public static void main(String[] args) throws IOException, InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
String timestamp=LocalDateTime.now().toString().replace(':', '-');
driver.get("https://www.facebook.com/signup");
Thread.sleep(2000);
WebElement firstNameTextField=driver.findElement(By.name("firstname"));
firstNameTextField.clear();
firstNameTextField.sendKeys("abc");

Thread.sleep(2000);
WebElement surNameTextField=driver.findElement(By.name("lastname"));
surNameTextField.clear();
surNameTextField.sendKeys("xyz");

Thread.sleep(2000);
WebElement mobileNumberOrEmailAddressTextField=driver.findElement(By.name("reg_email__"));
mobileNumberOrEmailAddressTextField.clear();
mobileNumberOrEmailAddressTextField.sendKeys("abc@gmail.com");

Thread.sleep(2000);
WebElement reEnterEmailAddressTextField=driver.findElement(By.name("reg_email_confirmation__"));
reEnterEmailAddressTextField.sendKeys("abc@gmail.com");

Thread.sleep(2000);
WebElement newPasswordTextField=driver.findElement(By.name("reg_passwd__"));
newPasswordTextField.clear();
newPasswordTextField.sendKeys(Keys.chord("abc@123"));

Thread.sleep(2000);
WebElement dayDropDown=driver.findElement(By.id("day"));
Select daySelect=new Select(dayDropDown);
daySelect.selectByIndex(26);

Thread.sleep(2000);
WebElement monthDropDown=driver.findElement(By.id("month"));
Select monthSelect=new Select(monthDropDown);
monthSelect.selectByValue("2");

Thread.sleep(2000);
WebElement yearDropDown=driver.findElement(By.id("year"));
Select yearSelect=new Select(yearDropDown);
yearSelect.selectByVisibleText("1998");

Thread.sleep(2000);
WebElement maleRadioButton=driver.findElement(By.xpath("//label[text()='Male']/..//input[@name='sex']"));
maleRadioButton.click();

Thread.sleep(2000);
WebElement submitButton=driver.findElement(By.name("websubmit"));

File tempFile=submitButton.getScreenshotAs(OutputType.FILE);
File permFile=new File("./errorshots/"+timestamp+"facebooksignupbuttonscreenshot.png");
FileUtils.copyFile(tempFile, permFile);

submitButton.submit();
TakesScreenshot ts=(TakesScreenshot)driver;
File tempFile1=ts.getScreenshotAs(OutputType.FILE);
File permFile1=new File("./errorshots/"+timestamp+"facebooksignuppagescreenshot.png"); 
FileUtils.copyFile(tempFile1, permFile1);
driver.manage().window().minimize();
driver.close();
}
}
