package exercicio8_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver webDriver;

		System.setProperty("webdriver.chrome.driver", "apps/chromedriver.exe");
		webDriver = new ChromeDriver();

		webDriver.get("https://www.google.com/");

		System.out.println("Titulo da página: " + webDriver.getTitle());
		webDriver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("CESAR School");
		System.out.println("Titulo da página: " + webDriver.getTitle());

		webDriver.close();

	}

}
