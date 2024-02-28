package practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GooglePracticeExample {

	private void googlePageSource() {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.google.co.in/");
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		Options manage = driver.manage();
		Timeouts timeouts = manage.timeouts();
		Window window = manage.window();
		window.maximize();
		
		Actions action = new Actions(driver);
	}
	
	
	public static void main(String[] args) {
		GooglePracticeExample obj = new GooglePracticeExample();
		obj.googlePageSource();

	}

}
