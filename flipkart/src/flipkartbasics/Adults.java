package flipkartbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adults {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		/*for(int i=1;i<9;i++)
			
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		}*/
		int i=1;
		while(i<5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
				
		driver.findElement(By.id("btnclosepaxoption")).click();

	}

}
