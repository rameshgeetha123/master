package amazonbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SignInButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Actions a=new Actions(driver);
		//move to specific element
		a.moveToElement(driver.findElement(By.cssSelector("span[id=nav-link-accountList-nav-line-1]"))).build().perform();
				;

	}

}
