package flipkartbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("Webdriver.Chrome.driver", "E:\\selenium.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("8186010422");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();

	}

}
