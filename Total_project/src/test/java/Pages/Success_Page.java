package Pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Success_Page {
	WebDriver driver;
	By signup= By.xpath("//h3[text()='Welcome to OpenTable!']");
	By tas1= By.xpath("//span[text()='Terms of Service']");
	By accdrop= By.xpath("//button[@title='User account dropdown']");
	By signout= By.xpath("//button[text()='Sign out']");
	public Success_Page(WebDriver drv) {
		this.driver=drv;
	}
	public String navigateretpass() throws InterruptedException {
		String s=driver.getTitle();
		return s;
	}
	public String navigatestobook() throws InterruptedException {   
		String parent=driver.getWindowHandle();
        Set<String> winHandles=driver.getWindowHandles();
		for(String winHandle:winHandles) {
			driver.switchTo().window(winHandle);
		}
		Thread.sleep(3000);
		String s=driver.getTitle();
		driver.close();
		driver.switchTo().window(parent);
		return s;
	}
	public String navigatestoface() throws InterruptedException {    
		String parent=driver.getWindowHandle();
        Set<String> winHandles=driver.getWindowHandles();
		for(String winHandle:winHandles) {
			driver.switchTo().window(winHandle);
		}
			Thread.sleep(3000); 
		String s=driver.getTitle();
		driver.close();
		driver.switchTo().window(parent);
		return s;
	}
	public String navigatestogoogle() throws InterruptedException {   
		String parent=driver.getWindowHandle();
        Set<String> winHandles=driver.getWindowHandles();
		for(String winHandle:winHandles) {
			driver.switchTo().window(winHandle);
		}
		Thread.sleep(3000);
		String s=driver.getTitle();
		driver.close();
		driver.switchTo().window(parent);
		return s;
	}
	public String navigatesignUp() throws InterruptedException {
		String s=driver.findElement(signup).getText();
		return s;
	}
	public String navigatetas() throws InterruptedException {
		String s=driver.findElement(tas1).getText();
		return s;
	}
	public void navigateaccountpg() throws InterruptedException {
		//driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.findElement(accdrop).click();
		Thread.sleep(500);
		driver.findElement(signout).click();
		Thread.sleep(500);
	}

}
