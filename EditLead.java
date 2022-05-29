package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");

		System.out.println("Browser Opened");

		driver.manage().window().maximize();

		System.out.println("Browser Maximized");

		WebElement element = driver.findElement(By.id("username"));

		element.sendKeys("DemoSalesManager");

		System.out.println("UserName Provided");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		System.out.println("Password Provided");

		driver.findElement(By.className("decorativeSubmit")).click();

		System.out.println("Logged In");

		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();

		System.out.println("Clicked on CRM/SFA");

		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();

		System.out.println("Clicked on Leads");

		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();

		System.out.println("Clicked on Create Lead");

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("XYZ Ltd");

		System.out.println("Company Name Entered");

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dheeran");

		System.out.println("First Name Entered");

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("AryaDev");

		System.out.println("Last Name Entered");

		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Vignesh");

		System.out.println("First Name Local Entered");

		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("SCI");

		System.out.println("Dept Name Entered");

		driver.findElement(By.name("description")).sendKeys("Lead Creation");

		System.out.println("Description Entered");

		Thread.sleep(3000);

		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@abc.com");

		System.out.println("Email Entered");

		WebElement dropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));

		Select LovValue = new Select(dropdown);
		
		Thread.sleep(3000);

		LovValue.selectByVisibleText("New York");

		System.out.println("State Province Selected");

		driver.findElement(By.xpath("//input[@value = 'Create Lead']")).click();

		System.out.println("Lead Created");
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[text()= 'Edit']")).click();

		System.out.println("Edit Started");

		driver.findElement(By.name("description")).clear();

		System.out.println("Desc Cleared");

		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Notes");

		System.out.println("Notes Entered");

		driver.findElement(By.xpath("//td[@colspan ='4']/input[@value = 'Update']")).click();

		System.out.println("Updated");

		String pageTitle = driver.getTitle();

		System.out.println(pageTitle);

		driver.close();

		System.out.println("Browser Closed");

	}

}
