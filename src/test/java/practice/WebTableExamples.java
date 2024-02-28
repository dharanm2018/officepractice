package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableExamples {

	private WebDriver driver;

	private WebTableExamples() {

		driver = new EdgeDriver();
		WebDriverManager.edgedriver().setup();
	}

	private void webtableEx1() {

		driver.get("https://letcode.in/table");
		driver.manage().window().maximize();
		List<WebElement> findElements = driver.findElements
				(By.xpath("//table[@id='simpletable']/thead | //table[@id='simpletable']//tbody"));
		System.out.println(findElements.size());	
		List<WebElement> thRow = driver.findElements(By.xpath("//table[@id='simpletable']/thead/tr/th"));
		int size = thRow.size();
		System.out.println(size);

		for (int i = 1; i <= 1; i++) {

			for (int j = 1; j <=size; j++) {

				WebElement findElement = driver.findElement(By.xpath("//table[@id='simpletable']/thead/tr["+i+"]/th["+j+"]"));

				System.out.print(findElement.getText()+"\t");

			}

		}
		System.out.println();


		List<WebElement> findElements2 = driver.findElements(By.xpath("//table[@id='simpletable']/tbody/tr"));
		int size2 = findElements2.size();
		System.out.println(size2);





		for (int i = 1; i <=size2; i++) {
			List<WebElement> findElements3 = driver.findElements(By.xpath("//table[@id='simpletable']/tbody/tr"));
			int size3 = findElements3.size();
			for (int j = 1; j <=size3; j++) {

				WebElement findElement = driver.findElement(By.xpath("//table[@id='simpletable']/tbody/tr["+i+"]/td["+j+"]"));

				System.out.print(findElement.getText()+"\t");

			}
			System.out.println();

		}
	}

	private void webtableEx2(String email) {

		driver.get("https://letcode.in/table");
		driver.manage().window().maximize();

		for (int i = 1; i <= 3; i++) {
			System.out.println("Connecting Row");

			for (int j = 1; j <=4; j++) {
				System.out.println("Connecting Column");


				WebElement findElement = driver.findElement(By.xpath("//table[@id='simpletable']/tbody/tr["+i+"]/td[3]"));
				String text = findElement.getText();
				if (text.equalsIgnoreCase(email)) {
					WebElement findElement2 = driver.findElement(By.xpath("//table[@id='simpletable']//tbody/tr/td/input[@id='third']"));
					boolean selected = findElement2.isSelected();
					System.out.println(selected);
					driver.findElement(By.xpath("//table[@id='simpletable']//tbody/tr/td/input[@id='third']")).click();
					return;
				}



			}

		}

	}

	private void sortableTable() {
		driver.get("https://letcode.in/table");
		driver.manage().window().maximize();
		List<WebElement> th =driver.findElements(By.xpath("//table[@class='mat-sort table is-bordered is-striped is-narrow is-hoverable is-fullwidth']/thead/th"));
		int size = th.size();
		System.out.println(size);

		List<WebElement> tr = driver.findElements(By.xpath("//table[@class='mat-sort table is-bordered is-striped is-narrow is-hoverable is-fullwidth']/tr"));
		int rsize = tr.size();
		System.out.println(rsize);

		List<WebElement> td = driver.findElements(By.xpath("//table[@class='mat-sort table is-bordered is-striped is-narrow is-hoverable is-fullwidth']/tr[1]/td"));
		int csize = td.size();
		System.out.println(csize);


		for (WebElement webElement : th) {
			String text = webElement.getText();
			System.out.print(text +"\t");

		}
		System.out.println();
		List<String> list = new ArrayList<>();
		for (int i = 1; i <=rsize; i++) {

			for (int j = 1; j<=1; j++) {

				WebElement findElement = driver.findElement(By.xpath("//table[@class='mat-sort table is-bordered is-striped is-narrow is-hoverable is-fullwidth']/tr["+i+"]/td[1]"));
				String text = findElement.getText();
				list.add(text);

			}

		}
		System.out.println("Before Sort----------------------");
		for (String string : list) {
			System.out.println(string);
			
		}
		Collections.sort(list);
		System.out.println("After Sort----------------------");
		for (String string : list) {
			System.out.println(string);
			
		}
		






	}



	public static void main(String[] args) {

		WebTableExamples obj = new WebTableExamples();
		//		obj.webtableEx1();
		//			obj.webtableEx2("man@letcode.in");
		obj.sortableTable();

	}

}
