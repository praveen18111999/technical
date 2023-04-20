package seleni;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selenium3 {
//Select multiple options from the dropdown
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ""C:\Users\prave\Downloads\chromedriver.exe"");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Select a = new Select(driver.findElement(By.id("oldSelectMenu")));
		a.selectByIndex(1);
		Thread.sleep(2000);
		a.selectByValue("4");
		Thread.sleep(2000);
		a.selectByVisibleText("Yellow");
		driver.quit();
	}

}
