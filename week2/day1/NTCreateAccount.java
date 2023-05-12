package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NTCreateAccount {

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

		// Click on Accounts Button
		driver.findElement(By.linkText("Accounts")).click();

		// Click on Create Account
		driver.findElement(By.linkText("Create Account")).click();

		// Select preferred currency as Indian Rupee using SelectByValue
		WebElement currency = driver.findElement(By.id("currencyUomId"));
		Select currencySelect = new Select(currency);
		currencySelect.selectByValue("INR");

		// Enter the Description text as "NRI Account"
		driver.findElement(By.name("description")).sendKeys("NRI Account");

		// Enter LocalName Field Using Xpath Locator
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Sanmati");

		// Enter SiteName Field Using Xpath Locator
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("TestLeaf");

		// Enter value for AnnualRevenue Field using Xpath Locator but class as
		// Attribute
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("200000");

		// Select Industry as ComputerSoftware
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select industrySelect = new Select(industry);
		industrySelect.selectByIndex(3);

		// Select OwnerShip as S-Corporation using SelectByVisibletext
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select ownershipSelect = new Select(ownership);
		ownershipSelect.selectByVisibleText("S-Corporation");

		// Select Source as Employee using SelectByValue
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select sourceSelect = new Select(source);
		sourceSelect.selectByValue("LEAD_EMPLOYEE");

		// Select Marketing Campaign as eCommerce Site Internal Campaign using
		// SelectbyIndex
		WebElement campaign = driver.findElement(By.id("marketingCampaignId"));
		Select campaignSelect = new Select(campaign);
		campaignSelect.selectByIndex(6);

		// Select State/Province as Texas using SelectByValue
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select stateSelect = new Select(state);
		stateSelect.selectByValue("TX");

		// Click on Create Account using Xpath Locator
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();

	}

}
