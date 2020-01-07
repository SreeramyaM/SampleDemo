package packagesample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class First {


	
	public static void main(String[] args){
		
		System.setProperty("webdriver.gecko.driver","C:\\Automation\\Software\\Gecko\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		// Launch website
		
		driver.navigate().to("https://s1.demo.opensourcecms.com/s/44");
		// Click on the search text box and send value
		
		driver.findElement(By.id("txtUsername")).sendKeys("opensourcecms");
		driver.findElement(By.id("txtPassword")).sendKeys("opensourcecms");
		//driver.findElement(By.name("submit")).click();
		
		driver.findElement(By.id("btnLogin")).click();
		driver.navigate().refresh();
		
		
		
		
				
	}
}
