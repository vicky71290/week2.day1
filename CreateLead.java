package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup(); 

		/*WebDriverManager is a class file available under github.bonigarcia.wdm package
		 * chromedriver() is one of the methods under WebDriverManager class
		 * setup() is one of the methods under WebDriverManager clas
		 */

		ChromeDriver driver = new ChromeDriver(); 
		// ChromeDriver is one of the class file available under the package org.openqa.selenium.chrome

		driver.get("http://leaftaps.com/opentaps/control/main"); // driver is an object

		driver.manage().window().maximize();

		WebElement eleName = driver.findElement(By.id("username")); // Ctrl + 2, L

		//eleName is a variable on which web element is stored

		eleName.sendKeys("DemoSalesManager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		Thread.sleep(3000);

		driver.findElement(By.className("decorativeSubmit")).click();

		Thread.sleep(3000);

		driver.findElement(By.linkText("CRM/SFA")).click();

		Thread.sleep(3000);

		driver.findElement(By.linkText("Leads")).click();

		Thread.sleep(3000);

		driver.findElement(By.linkText("Create Lead")).click();

		Thread.sleep(3000);

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("SCBGBS");

		Thread.sleep(3000);

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vignesh");

		Thread.sleep(3000);

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Subramanian");

		Thread.sleep(3000);

		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Vicky");

		Thread.sleep(3000);

		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("SCI");

		Thread.sleep(3000);

		driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Training");

		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("wqewq@gmail.com");

		Thread.sleep(3000);

		WebElement data = driver.findElement(By.id("createLeadForm_dataSourceId")); 

		Select sourceInp = new Select(data); 

		// sourceInp.selectByValue("LEAD_COLDCALL");

		// sourceInp.selectByVisibleText("Conference");

		sourceInp.selectByIndex(3); // Index starts from 0

		Thread.sleep(3000);

		WebElement stateProv = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));

		Select province = new Select(stateProv);

		province.selectByVisibleText("Indiana");

		Thread.sleep(3000);

		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mr.");

		Thread.sleep(3000);

		driver.findElement(By.name("submitButton")).click();

		Thread.sleep(3000);
		
		String pageTitle = driver.getTitle();
		
		System.out.println(pageTitle);

		// String title = driver.findElement(By.id("viewLead_generalProfTitle_sp")).getText();

		// System.out.println(title);

		driver.close();

	}

}
