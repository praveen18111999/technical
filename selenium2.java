package seleni;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium2 {
	// Write code for handling Frames
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ""C:\Users\prave\Downloads\chromedriver.exe"");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//body//input")).sendKeys("praveen");
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		driver.close();

	}

}
