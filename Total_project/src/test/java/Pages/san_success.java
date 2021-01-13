package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class san_success {
	
	WebDriver driver;
	By res1=By.xpath("//h6[text()='Indian Accent']");
	By res2=By.xpath("//h6[text()='Bimbadgen Pizza Cafe']");
	By res3=By.xpath("//h6[text()='Spice Kitchen']");
	public san_success(WebDriver drv) {
		this.driver=drv;
	}
	public String verifyloc() throws InterruptedException {
		String s=driver.findElement(res1).getText();
		return s;
	}
	public String verifyrest() throws InterruptedException {
		String s=driver.findElement(res2).getText();
		return s;
	}
	public String verifycui() throws InterruptedException {
		String s=driver.findElement(res3).getText();
		return s;
	}

}
