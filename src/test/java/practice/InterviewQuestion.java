package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InterviewQuestion {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.sc.com/hk/)/");
		driver.findElement(By.xpath("//div[@id='onetrust-close-btn-container']/button")).click();
		Actions actions = new Actions(driver);
		WebElement findElement = driver.findElement(By.xpath("//button[text()='Cross Border']"));
		actions.moveToElement(findElement).build().perform();
		driver.findElement(By.xpath("//button[text()='Cross Border']/following::div/ul/li/a[contains(text(),'International')]")).click();
//		driver.findElement(By.xpath("//P[text()='Cross Border']/following::ul/li/a[contains(text(),'International')]")).click();

	}

}
