package Week2.day2;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chromebrowser {

	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://en-gb.facebook.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Nishi");
		 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Divya");
		 driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9994101262");
		 driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Papu@143");
		
		 driver.findElement(By.xpath("//select[@id='day']")).click();
		 WebElement day = driver.findElement(By.id("day"));
		 Select dropDown1 = new Select(day);
		 dropDown1.selectByVisibleText("10");
		
		 WebElement month = driver.findElement(By.id("month"));
		 Select dropDown2 = new Select(month);
		 dropDown2.selectByVisibleText("Aug");
		
		 WebElement year = driver.findElement(By.id("year"));
		 Select dropDown3 = new Select(year);
		 dropDown3.selectByVisibleText("1991");  
		 
		 driver.findElement(By.xpath("//*[contains(text(),'Female')]")).click();
		 
		 
	
	}
}



