package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAccount {

	public static void main(String[] args) {

		// Launch URL
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");

		// Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click on CRM/SFA Link
		driver.findElement(By.partialLinkText("CRM/SFA")).click();

		// Click on Accounts Button
		driver.findElement(By.linkText("Accounts")).click();

		// Click on Find Accounts
		driver.findElement(By.linkText("Find Accounts")).click();

		// Enter AccountName as "Credit Limited Account"
		driver.findElement(By.xpath("(//input[@name = 'accountName'])[2]")).sendKeys("Credit Limited Account");

		// Click on Find Accounts using xpath Locator
		driver.findElement(By.xpath("//button[text() = 'Find Accounts']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text() = 'Credit Limited Account']")).click();

		// Click on the edit Button
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[text() = 'Edit']")).click();

		// Get the Text of Account Name and verify
		WebElement accountName = driver.findElement(By.xpath("//input[@id='accountName']"));
		System.out.println(accountName.getAttribute("value"));

		// Get the Text of Description
		WebElement description = driver.findElement(By.xpath("//textarea[@name='description']"));
		System.out.println(description.getText());

		// Get the title of the page and verify it
		String title = driver.getTitle();
		System.out.println(title);

	}

}
