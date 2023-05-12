package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Enter first name
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Sanmati");

		// Click Find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(10000);

		// Click on first resulting lead
		driver.findElement(By.xpath("(//div[contains(@class, 'x-grid3-row')])[1]//td[3]//a")).click();

		// Verify title of the page
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Click Edit
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Change the company name
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Google");

		// Click Update
		driver.findElement(By.className("smallSubmit")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Confirm the changed name appears
		String companyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(companyName);

		// Close the browser (Do not log out)
		driver.close();

	}

}
