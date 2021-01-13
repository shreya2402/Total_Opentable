package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class san_explore {
	
	WebDriver driver;
	By button1=By.xpath("//input[@placeholder='Location, Restaurant, or Cuisine']");
	By button2=By.xpath("(//button[@type='button'])[11]");
	public san_explore(WebDriver drv) {
		this.driver=drv;
	}
	public void enterloc() throws InterruptedException {
		driver.findElement(button1).click();
    	driver.findElement(button1).sendKeys("delhi");
		Thread.sleep(500);
	}
	public void clicksearch() throws InterruptedException {
		driver.findElement(button2).click();
	}
	public void enterrest() throws InterruptedException {
		driver.findElement(button1).click();
     	driver.findElement(button1).sendKeys("Bimbadgen Pizza Cafe");
		Thread.sleep(500);
	}
	public void entercui() throws InterruptedException {
		driver.findElement(button1).click();
      	driver.findElement(button1).sendKeys("Spice Kitchen");
		Thread.sleep(500);
	}

}
