package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadPath {

	public static void main(String[] args)  {

		WebDriverManager.chromedriver().setup(); 

		/*WebDriverManager is a class file available under github.bonigarcia.wdm package
		 * chromedriver() is one of the methods under WebDriverManager class
		 * setup() is one of the methods under WebDriverManager class
		 */

		ChromeDriver driver = new ChromeDriver(); 
		// ChromeDriver is one of the class file available under the package org.openqa.selenium.chrome

		driver.get("http://leaftaps.com/opentaps/control/main"); // driver is an object

		driver.manage().window().maximize();

		WebElement eleName = driver.findElement(By.xpath("//input[@id = 'username']")); // Attribute based xPath

		//eleName is a variable on which web element is stored

		eleName.sendKeys("DemoSalesManager");

		driver.findElement(By.xpath("//input[@name = 'PASSWORD']")).sendKeys("crmsfa"); // // Attribute based xPath

		//Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@class = 'decorativeSubmit']")).click();

		//Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();// Absolute xpath//html/body/div[2]/div[2]/div/div/a/img

	//	Thread.sleep(3000);

		driver.findElement(By.xpath("//a[text() = 'Leads']")).click(); // Text Based

	//	Thread.sleep(3000);

		driver.findElement(By.xpath("//a[text() = 'Create Lead']")).click();

		//Thread.sleep(3000);

		driver.findElement(By.xpath("(//input[@name = 'companyName'])[2]")).sendKeys("SCBGBS"); // Index based as we have more than one for this xpath

		//Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id= 'createLeadForm_firstName']")).sendKeys("Vignesh"); // Attribute Based

	//	Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id= 'createLeadForm_lastName']")).sendKeys("Subramanian"); // Attribute Based

		//Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id= 'createLeadForm_firstNameLocal']")).sendKeys("Vicky");// Attribute Based

//		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id= 'createLeadForm_departmentName']")).sendKeys("SCI");// Attribute Based

//		Thread.sleep(3000);

		driver.findElement(By.xpath("//textarea[@id= 'createLeadForm_description']")).sendKeys("Selenium Training");// Attribute Based

		driver.findElement(By.xpath("//input[@id= 'createLeadForm_primaryEmail']")).sendKeys("wqewq@gmail.com");

	//	Thread.sleep(3000);

		WebElement data = driver.findElement(By.xpath("//select[@name= 'dataSourceId']")); 

		Select sourceInp = new Select(data); 

		// sourceInp.selectByValue("LEAD_COLDCALL");

		// sourceInp.selectByVisibleText("Conference");

		sourceInp.selectByIndex(3); // Index starts from 0

	//	Thread.sleep(3000);

		WebElement stateProv = driver.findElement(By.xpath("//select[@name= 'generalStateProvinceGeoId']"));

		Select province = new Select(stateProv);

		province.selectByVisibleText("Indiana");

	//	Thread.sleep(3000);

		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mr.");

	//	Thread.sleep(3000);

		driver.findElement(By.name("submitButton")).click();

	//	Thread.sleep(3000);
		
		String pageTitle = driver.getTitle();
		
		System.out.println(pageTitle);

		// String title = driver.findElement(By.id("viewLead_generalProfTitle_sp")).getText();

		// System.out.println(title);

		driver.close();

	}

}
