package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrimerTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		//ChromeDriver driver = new ChromeDriver();	
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver = new EdgeDriver();
		try {
			driver.get("https://www.google.es");
			Thread.sleep(3000);
			driver.findElement(By.id("L2AGLb")).click();
			Thread.sleep(3000);
			driver.findElement(By.linkText("Sobre Google")).click();
			Thread.sleep(3000);
			WebElement titulo = driver.findElement(By.tagName("title"));			
//			String titu = titulo.get
//			System.out.println(driver.getTitle());
//			System.out.println(titulo.getText());
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			driver.quit();
		}
	}
}
