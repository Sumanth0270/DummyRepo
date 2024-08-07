package seleniumpracticepackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollByAmountXaxis 
{
public static void main(String[] args) 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.freepik.com/popular-photos");
Actions actions=new Actions(driver);
WebElement peopleAndEmotoionsLoink=driver.findElement(By.xpath("//a[contains(@href,'https://www.freepik.com')]//span[text()='People and emotions']"));
WebElement industryAndTechnologyLink=driver.findElement(By.xpath("//a[contains(@href,'https://www.freepik.com')]//img[contains(@src,'https://img.freepik.com/premium-photo/l')]"));
actions.scrollToElement(peopleAndEmotoionsLoink).pause(1000).scrollToElement(industryAndTechnologyLink).click(industryAndTechnologyLink).perform();

}
}
