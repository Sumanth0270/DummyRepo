package seleniumpracticepackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrelloDragAndDrop {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://trello.com/");
	Actions actions=new Actions(driver);
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
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
	boardTitleTF.sendKeys("selenium");
	WebElement createButton=driver.findElement(By.xpath("//button[@data-testid='create-board-submit-button']"));
	wait.until(ExpectedConditions.elementToBeClickable(createButton));
	createButton.click();
	wait.until(ExpectedConditions.titleIs("selenium | Trello"));
	String lists[]= {"topics","manual","sql","java","selenium"};
	for(String list:lists)
	{
		driver.switchTo().activeElement().sendKeys(list);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
	}
//	for(int i=0;i<=lists.length-1;i++)
//	{
//		driver.switchTo().activeElement().sendKeys(lists[i]);
//		driver.switchTo().activeElement().sendKeys(Keys.TAB);
//		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
//	}
	WebElement addACardOption=driver.findElement(By.xpath("//h2[text()='topics']/../../..//button[text()='Add a card']"));
	addACardOption.click();
	String cards[]= {"framework","joins","oops","agile"};
	for(String card:cards)
	{
		driver.switchTo().activeElement().sendKeys(card);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
	}
//	for(int i=0;i<=cards.length-1;i++)
//	{
//		driver.switchTo().activeElement().sendKeys(cards[i]);
//		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
//	}
	driver.navigate().refresh();
	wait.until(ExpectedConditions.titleIs("selenium | Trello"));
	WebElement frameworkCard=driver.findElement(By.xpath("//div[@class='amUfYqLTZOvGsn']/a[text()='framework']"));
	WebElement joinsCard=driver.findElement(By.xpath("//a[text()='joins']"));
	WebElement oopsCard=driver.findElement(By.xpath("//a[text()='oops']"));
	WebElement agileCard=driver.findElement(By.xpath("//a[text()='agile']"));
	WebElement manualList=driver.findElement(By.xpath("//h2[text()='manual']"));
	WebElement sqlList=driver.findElement(By.xpath("//h2[text()='sql']"));
	WebElement javaList=driver.findElement(By.xpath("//h2[text()='java']"));
	WebElement seleniumList=driver.findElement(By.xpath("//div[@class='mKJWg6W_CLHoiO']/h2[text()='selenium']"));
	WebElement srcWebEle[]= {frameworkCard,joinsCard,oopsCard,agileCard};
	WebElement targetWebEle[]= {seleniumList,sqlList,javaList,manualList};
	for(int i=0;i<=srcWebEle.length-1;i++)
	{
		actions.dragAndDrop(srcWebEle[i],targetWebEle[i]).pause(1000).perform();
	}

	
	//actions.dragAndDrop(frameworkCard, seleniumList).dragAndDrop(joinsCard,sqlList).dragAndDrop(oopsCard, javaList).dragAndDrop(manualList, agileCard).perform();
}
}
