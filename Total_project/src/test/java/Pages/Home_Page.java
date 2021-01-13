package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home_Page {
	WebDriver driver;
    public By button1=By.xpath("//button[text()='Sign in']"); 

	
	public Home_Page(WebDriver drv) {
		this.driver=drv;
	}
	public void clickSignIn() throws InterruptedException {
		Thread.sleep(500);
		driver.findElement(button1).click();
		Thread.sleep(3000);
	}
}
