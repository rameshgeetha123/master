package Ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ELginPaage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String a, b, c, d;
		int total, Actualvalue = 0, it;
		int Carrot1 = 0, Carrot2 = 0, Brocoli = 0;

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		for (int i = 1; i <= 1; i++) {
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[1]/div[2]/a[2]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[1]/div[3]/button")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[5]/div[2]/a[2]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[5]/div[3]/button")).click();

			a = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[1]/p")).getText();
			Brocoli = Integer.parseInt(a) * (1 + i);
			System.out.println("Brocoli" + Brocoli);
			b = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[5]/p")).getText();
			Carrot1 = Integer.parseInt(b) * (1 + i);

			System.out.println("Carrot" + Carrot1);

		}

		Actualvalue = Brocoli + Carrot1;

		String t = driver
				.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[1]/table/tbody/tr[2]/td[3]/strong"))
				.getText();
		total = Integer.parseInt(t);

		System.out.println("total" + total);
		System.out.println("Actualvalue" + Actualvalue);
		if (Actualvalue == total) {
			System.out.println("resultsmae");
		} else {
			System.out.println("resultwrong");
		}

	}

}
