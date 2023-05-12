package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {

		// Launch URL
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");

		// Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click on CRM/SFA Link
		driver.findElement(By.partialLinkText("CRM/SFA")).click();

		// Click on contacts Button
		driver.findElement(By.linkText("Contacts")).click();

		// Click on Create Contact
		driver.findElement(By.linkText("Create Contact")).click();

		// Enter FirstName Field Using id Locator
		driver.findElement(By.id("firstNameField")).sendKeys("Sanmati");

		// Enter LastName Field Using id Locator
		driver.findElement(By.id("lastNameField")).sendKeys("Mohan Kumar");

		// Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Sanmati");

		// Enter LastName(Local) Field Using id Locator
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Mohan Kumar");

		// Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Development");

		// Enter Description Field Using any Locator of your choice
		driver.findElement(By.id("createContactForm_description")).sendKeys("Selenium Automation Testing");

		// Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("abc@gmail.com");

		// Select State/Province as NewYork Using Visible Text
		WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select stateSelect = new Select(state);
		stateSelect.selectByVisibleText("New York");

		// Click on Create Contact
		driver.findElement(By.className("smallSubmit")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Click on edit button
		driver.findElement(By.linkText("Edit")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Clear the Description Field using .clear
		driver.findElement(By.id("updateContactForm_description")).clear();

		// Fill ImportantNote Field with Any text
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Selenium Automation Testing");

		// Click on update button using Xpath locator
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Get the Title of Resulting Page
		String title = driver.getTitle();
		System.out.println(title);
	}

}
