import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteBoard 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://trello.com/");
		wait.until(ExpectedConditions.titleIs("Manage Your Team’s Projects From Anywhere | Trello"));
		WebElement loginLink=driver.findElement(By.linkText("Log in"));
		loginLink.click();
        wait.until(ExpectedConditions.titleIs("Log in to continue - Log in with Atlassian account"));
		WebElement emailTF=driver.findElement(By.id("username"));
		emailTF.sendKeys("sumanthp998@gmail.com");
		WebElement continueBtn=driver.findElement(By.id("login-submit"));
		continueBtn.submit();
		WebElement passwordTF=driver.findElement(By.id("password"));
		passwordTF.sendKeys("Sumanth_0270");
		WebElement loginBtn=driver.findElement(By.id("login-submit"));
		loginBtn.submit();
        wait.until(ExpectedConditions.titleIs("Boards | Trello"));
		WebElement createNewBoard=driver.findElement(By.xpath("//div[@class='board-tile mod-add']"));
		createNewBoard.click();
		WebElement boardTitleTF=driver.findElement(By.xpath("//input[@type='text']"));
		boardTitleTF.sendKeys("1stboard");
		WebElement createButton=driver.findElement(By.xpath("//button[text()='Create']"));
		wait.until(ExpectedConditions.elementToBeClickable(createButton));
		createButton.click();
		wait.until(ExpectedConditions.titleIs("1stboard | Trello"));
		WebElement _1stBoadOption=driver.findElement(By.xpath("//a[text()='1stboard']/..//span[@data-testid='OverflowMenuHorizontalIcon']"));
		WebElement closeBoardOption=driver.findElement(By.xpath("(//button[@title='Close board']/span[text()='Close board']"));
		WebElement closeOption=driver.findElement(By.xpath("//button[@title='Close']"));
		WebElement permanentlyDeleteOption=driver.findElement(By.xpath("//button[text()='Permanently delete board']"));
		WebElement deleteOption=driver.findElement(By.xpath("//button[text()='Delete']"));
		WebElement options[]= {_1stBoadOption,closeBoardOption,closeOption,permanentlyDeleteOption,deleteOption};
		Actions actions=new Actions(driver);
		for(int i=0;i<=options.length-1;i++)
		{
			actions.click(options[i]).perform();
		}
		//WebElement boardDeletedConfMsg=driver.findElement(By.xpath("//DIV[@role=\"alert\"]"));
		wait.until(ExpectedConditions.titleIs("Boards | Trello"));
//	if(boardDeletedConfMsg.isDisplayed())
//		{
//			System.out.println("Board deleted confirmation message displayed");
//		}
//		else 
//		{
//			System.out.println("Board deleted confirmation message not displayed");

//		}
		
		
	}
	}