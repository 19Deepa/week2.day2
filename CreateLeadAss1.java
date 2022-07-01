package week2.Day2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadAss1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		WebElement username =driver.findElement(By.id ("username"));
		username.sendKeys("Demosalesmanager");
		WebElement password =driver.findElement(By.id ("password"));
		password.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		
		WebElement lead =driver.findElement(By.linkText("Create Lead"));
		lead.click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Deepa");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("ABCLOC");
		
		WebElement kdep =driver.findElement(By.name("departmentName"));
		kdep.sendKeys("ABCDepart");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This prg is great");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("deepval217@gmail.com");
		
		WebElement state =driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select statpro   =new Select(state);
		statpro.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		
		System.out.println("The title is  "+driver.getTitle(  ));
					
		
		
		
	}
}
