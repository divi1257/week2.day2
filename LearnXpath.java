package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");

       driver.manage().window().maximize();
       driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
       driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
       driver.findElement(By.xpath("//input[@class ='decorativeSubmit']")).click();
       driver.findElement(By.xpath("//a[contain(text(),'CRM/SFA')]")).click();
       String title = driver.getTitle();
       System.out.println(title);
       
	}

}
