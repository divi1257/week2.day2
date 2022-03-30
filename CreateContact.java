package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");

      driver.manage().window().maximize();
      driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
      driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
      driver.findElement(By.xpath("//input[@class ='decorativeSubmit']")).click();
      driver.findElement(By.partialLinkText("CRM/SFA")).click();
      driver.findElement(By.xpath("//a[text()='Contacts']")).click();
      driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
      driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Divya");
      driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("Arunachalam");
      driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("Divi");
      driver.findElement(By.xpath("//input[@name='lastNameLocal']")).sendKeys("Arunac");
      driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("Non-IT");
      driver.findElement(By.id("createContactForm_description")).sendKeys("Automation Testing is more interesting");
      driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("nishi1257@gmail.com");
      WebElement dropDown = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
      Select state = new Select(dropDown);
      state.selectByVisibleText("New York");
      Thread.sleep(2000);
      driver.findElement(By.xpath("//input[@name='submitButton']")).click();
      driver.findElement(By.partialLinkText("Edit")).click();
      driver.findElement(By.id("updateContactForm_description")).clear();
      driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Java Selenium");
      driver.findElement(By.xpath("//input[@name='submitButton']")).click();
      System.out.println(driver.getTitle());
      
   
      
      
      
      
      
      
      
	}

}
