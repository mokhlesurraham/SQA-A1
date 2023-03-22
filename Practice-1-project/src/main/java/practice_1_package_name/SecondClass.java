package practice_1_package_name;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecondClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.rokomari.com/book");
		//driver.findElement(By.className("ion-close-round")).click();
		driver.findElement(By.className("logged-out-user-menu-btn btn btn-secondary")).click();
		driver.manage().window().maximize();
		
		//SIGN UP
		//driver.findElement(By.className("logged-out-user-menu-btn btn btn-secondary")).click();
		//driver.findElement(By.className("js--registration-form-btn text-uppercase active")).click();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.quit();

	}

}
