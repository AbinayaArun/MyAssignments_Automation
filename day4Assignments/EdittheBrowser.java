package day4Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EdittheBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABCD");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("ABINAYA");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("ARUN");
		 driver.findElement(By.name("submitButton")).click();
		  driver.findElement(By.linkText("Edit")).click();
		   driver.findElement(By.id("updateLeadForm_companyName")).clear();
		   driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("XYZ");
		      driver.findElement(By.name("submitButton")).click();
	}

}
