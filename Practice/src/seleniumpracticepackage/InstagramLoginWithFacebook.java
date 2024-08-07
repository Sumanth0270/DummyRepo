package seleniumpracticepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginWithFacebook 
{
public static void main(String[] args) 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.instagram.com/sem/campaign/emailsignup/?campaign_id=13530338610&extra_1=s%7Cc%7C547419127634%7Ce%7Cinstagram%20login%7C&placement=&creative=547419127634&keyword=instagram%20login&partner_id=googlesem&extra_2=campaignid%3D13530338610%26adgroupid%3D126262414054%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-35100690670%26loc_physical_ms%3D9062014%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gad_source=1&gclid=Cj0KCQiAoeGuBhCBARIsAGfKY7wgTDk0OgbgN-15hAL3huPtuFXp1Gq4ifr9vfbOy_QaIEe-snME0aoaAtaVEALw_wcB");
WebElement loginWithFaceBookButton=driver.findElement(By.xpath("//button[text()='Log in with Facebook']"));
loginWithFaceBookButton.submit();
driver.manage().window().minimize();
driver.quit();
}
}
