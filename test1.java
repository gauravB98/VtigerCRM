package vtigerCRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.xpath("(//span[@class='app-icon fa fa-bars'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='dropdown app-modules-dropdown-container'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Organizations")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='btn addButton btn-default module-buttons'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("accountname")).sendKeys("Qspider");
		Thread.sleep(1000);
		driver.findElement(By.name("phone")).sendKeys("8999335098");
		Thread.sleep(1000);
		driver.findElement(By.name("email1")).sendKeys("gauravbavaskar8@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("ownership")).sendKeys("GAURAV B");
		Thread.sleep(1000);
		driver.findElement(By.name("bill_street")).sendKeys("qspider pune");
		Thread.sleep(1000);
		driver.findElement(By.name("ship_street")).sendKeys("karve nagar");
		Thread.sleep(1000);
		driver.findElement(By.id("Accounts_editView_fieldName_employees")).sendKeys("2");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Save']")).click();
	}

}
