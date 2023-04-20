package seleni;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium1 {
	//Write code for handling multiple windows
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ""C:\Users\prave\Downloads\chromedriver.exe"");
		WebDriver driver = (WebDriver) new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SeleniumTutorial")).click();
		Set<String> windows = driver.getWindowHandles();
		System.out.println(driver.getCurrentUrl());
		List<String> list = new ArrayList<String>(windows);
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getCurrentUrl());
		driver.quit();

	}

}
