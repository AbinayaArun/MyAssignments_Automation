package day4Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver(); 
		
//		driver.manage().timeouts().implicitlyWait(5, null);
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
		  driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abcd@gmail.com");
		  driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9876543210"); Thread.sleep(2000);
		   driver.findElement(By.name("submitButton")).click();
	}

}
