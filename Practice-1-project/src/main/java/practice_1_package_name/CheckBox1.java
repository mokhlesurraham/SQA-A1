package practice_1_package_name;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement checkbox=driver.findElement(By.id("checkBoxOption1"));
		checkbox.click();
		assert checkbox.isDisplayed();
		System.out.println(checkbox.isDisplayed());
		assert checkbox.isEnabled();
		System.out.println(checkbox.isEnabled());
		assert checkbox.isSelected();
		System.out.println(checkbox.isSelected());
		driver.close();

	}

}
