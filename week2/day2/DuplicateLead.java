package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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

		// Click on Email
		driver.findElement(By.xpath("//span[text()='Email']//ancestor::a")).click();

		// Enter Email
		driver.findElement(By.name("emailAddress")).sendKeys("smk@gmail.com");

		// Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(10000);

		// Capture name of First Resulting lead
		String leadName = driver.findElement(By.xpath("(//div[contains(@class, 'x-grid3-row')])[1]//td[3]//a"))
				.getText();
		System.out.println(leadName);

		// Click First Resulting lead
		driver.findElement(By.xpath("(//div[contains(@class, 'x-grid3-row')])[1]//td[3]//a")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Click Duplicate Lead
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();

		// Verify the title as 'Duplicate Lead'
		String title = driver.getTitle();
		System.out.println(title);

		// Click Create Lead
		driver.findElement(By.className("smallSubmit")).click();

		// Confirm the duplicated lead name is same as captured name
		driver.findElement(By.id("viewLead_firstName_sp")).getText();

		// Close the browser (Do not log out)
		driver.close();

	}

}
