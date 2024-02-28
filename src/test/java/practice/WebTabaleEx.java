package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTabaleEx {
	
	public static void webTable1(String inputName) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.programiz.com/sql/online-compiler/");
		driver.manage().window().maximize();
		List<WebElement> headers = driver.findElements(By.xpath("(//h2[text()='Available Tables']//following::div/table)[1]/thead/tr"));

		for (WebElement webElement : headers) {
			String text = webElement.getText();
			System.out.print(text+"\t");
		}
		System.out.println();

		List<WebElement> row = driver.findElements(By.xpath("(//h2[text()='Available Tables']//following::div/table)[1]/tbody/tr"));
		int size = row.size();
		List<WebElement> colSize = driver.findElements(By.xpath("(//h2[text()='Available Tables']//following::div/table)[1]/tbody/tr[1]/td"));
		int size2 = colSize.size();


		System.out.println("ROW Size: "+size+" "+"ColumnSize: "+size2);

		boolean found=false;

		for (int rows = 1; rows <= size; rows++) {
			
			

			for (int cols = 1; cols<=size2; cols++) {
				WebElement findElement = driver.findElement
						(By.xpath("(//h2[text()='Available Tables']//following::div/table)[1]/tbody/tr["+rows+"]/td[2]"));
				String text = findElement.getText();
				
				if (text.equalsIgnoreCase(inputName)) {
					WebElement lastName = driver.findElement
							(By.xpath("(//h2[text()='Available Tables']//following::div/table)[1]/tbody/tr["+rows+"]/td[3]"));
					String text2 = lastName.getText();
					WebElement age = driver.findElement
							(By.xpath("(//h2[text()='Available Tables']//following::div/table)[1]/tbody/tr["+rows+"]/td[4]"));
					String text3 = age.getText();
					
					
					System.out.println("FirstName "+text);
					
					System.out.println("LastName "+text2);
					
					System.out.println("Age "+text3);
					break;
					
				}
//				 else {
//					 found=false;
//					break;
//				}
			}
			

		}
		if (found==false) {
			System.out.println("given name not listed");
			
		}
		
	}

	public static void main(String[] args) {
		 webTable1("Kumar");
			}
}








