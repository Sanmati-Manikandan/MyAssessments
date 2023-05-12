package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

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

		// Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();

		// Click on create Lead Button
		driver.findElement(By.linkText("Create Lead")).click();

		// Enter CompanyName using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

		// Enter FirstName using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sanmati");

		// Enter LastName using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mohan Kumar");

		// Select value as Employee in Source Using SelectbyVisible text
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourceSelect = new Select(source);
		sourceSelect.selectByVisibleText("Employee");

		// Select value as Pay Per Click Advertising in MarketingCampaignId Using
		// SelectbyValue
		WebElement campaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select campaignSelect = new Select(campaign);
		campaignSelect.selectByValue("9001");

		// Select value as Corporation in OwnerShip field Using SelectbyIndex
		WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownershipSelect = new Select(ownership);
		ownershipSelect.selectByIndex(5);

		// Select value as India in Country Field Using SelectbyVisibletext
		WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select countrySelect = new Select(country);
		countrySelect.selectByVisibleText("India");

		// Click on create Lead Button Using name Locator
		driver.findElement(By.name("submitButton")).click();

		// Get the Title of the resulting Page
		String title = driver.getTitle();
		System.out.println(title);

	}

}
