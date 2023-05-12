package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");

		// Enter the username
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");

		// Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click Login
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click crm/sfa link
		driver.findElement(By.partialLinkText("CRM/SFA")).click();

		// Click Leads link
		driver.findElement(By.linkText("Leads")).click();

		// Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();

		// Click on Phone
		driver.findElement(By.xpath("//span[text()='Phone']//ancestor::a")).click();

		// Enter phone number
		driver.findElement(By.name("phoneNumber")).sendKeys("2345678910");

		// Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(10000);

		// Capture lead ID of First Resulting lead
		WebElement leadId = driver.findElement(By.xpath("(//div[contains(@class, 'x-grid3-row')])[1]//td[1]//a"));
		String leadIdValue = leadId.getText();
		System.out.println(leadIdValue);

		// Click First Resulting lead
		driver.findElement(By.xpath("//a[text()='" + leadIdValue + "']")).click();

		// Click Delete
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Enter captured lead ID
		driver.findElement(By.name("id")).sendKeys(leadIdValue);

		// Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);

		// Verify message "No records to display" in the Lead List. This message
		// confirms the successful deletion
		String noOfRecords = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		System.out.println(noOfRecords);

		// Close the browser (Do not log out)
		driver.close();

	}

}
