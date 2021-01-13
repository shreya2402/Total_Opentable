package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sign_In_Page {
	WebDriver driver;
    public By email=By.xpath("//input[@name='Email']");
    public By pass=By.xpath("//input[@id='Password']");
    public By signin1=By.xpath("//button[@id='signInButton']");
    public By forpass=By.xpath("//a[text()='Forgot Password?']");
    public By frame=By.xpath("//iframe[@title='Sign in']");
    public By book=By.xpath("//button[@data-ng-click='booking()']");
    public By fb=By.xpath("//button[@data-ng-click='facebook()']");
    public By google=By.xpath("//button[@data-ng-click='google()']");
    public By crn=By.xpath("//a[text()='Create an account']");
    public By tas=By.xpath("//a[text()='Terms of Service']");
    public By e1=By.xpath("//span[text()='Please enter your Email']");
    public By e2=By.xpath("//span[@id='loginPopupValidationSummary']");
    public By e3=By.xpath("(//span[text()='Please enter your password.'])");
    public By e4=By.xpath("//span[@id='loginPopupValidationSummary']");
   
    
	
	public Sign_In_Page(WebDriver drv) {
		this.driver=drv;
	}
	public void clickEmail() throws InterruptedException {
		WebElement iframeElement = driver.findElement(frame);
   	    driver.switchTo().frame(iframeElement);
		driver.findElement(email).click();
		Thread.sleep(3000);
	}
	public void clickpass() throws InterruptedException {
		driver.findElement(pass).click();
    	Thread.sleep(1000);
	}
	public void clicksignin1() throws InterruptedException {
		driver.findElement(signin1).click();
    	Thread.sleep(3000);
	}
	public void clickforpass() throws InterruptedException {
		WebElement iframeElement = driver.findElement(frame);
   	    driver.switchTo().frame(iframeElement);
		driver.findElement(forpass).click();
		Thread.sleep(3000);
	}
	public void clickbook() throws InterruptedException {
		WebElement iframeElement = driver.findElement(frame);
   	    driver.switchTo().frame(iframeElement);
		driver.findElement(book).click();
		Thread.sleep(3000);
	}
	public void clickfb() throws InterruptedException {
		WebElement iframeElement = driver.findElement(frame);
   	    driver.switchTo().frame(iframeElement);
		driver.findElement(fb).click();
		Thread.sleep(3000);
	}
	public void clickgoogle() throws InterruptedException {
		WebElement iframeElement = driver.findElement(frame);
   	    driver.switchTo().frame(iframeElement);
		driver.findElement(google).click();
		Thread.sleep(3000);
	}
	public void clickcrn() throws InterruptedException {
		WebElement iframeElement = driver.findElement(frame);
   	    driver.switchTo().frame(iframeElement);
		driver.findElement(crn).click();
		Thread.sleep(3000);
	}
	public void clicktas() throws InterruptedException {
		WebElement iframeElement = driver.findElement(frame);
   	 driver.switchTo().frame(iframeElement);
   	 Thread.sleep(3000);
   	driver.findElement(tas).click();
   	Thread.sleep(3000);
	}
	public void enterinvalidemail() throws InterruptedException {
		driver.findElement(email).clear();
    	driver.findElement(email).sendKeys("a");
    	Thread.sleep(1000);
	}
	public void entervalidemail(String Email) throws InterruptedException {
		driver.findElement(email).clear();
    	driver.findElement(email).sendKeys(Email);
    	Thread.sleep(1000);
	}
	public void entervalidnotregisteredemail() throws InterruptedException {
		driver.findElement(email).clear();
    	driver.findElement(email).sendKeys("aty@gmail.com");
    	Thread.sleep(1000);
	}
	public void enterinvalidpass() throws InterruptedException {
		driver.findElement(pass).clear();
    	driver.findElement(pass).sendKeys("mnbv");
    	Thread.sleep(1000);
	}
	public void entervalidpass(String password) throws InterruptedException {
		driver.findElement(pass).clear();
    	driver.findElement(pass).sendKeys(password);
    	Thread.sleep(1000);
	}
	public void enterpassgreater40() throws InterruptedException {
		driver.findElement(pass).clear();
    	driver.findElement(pass).sendKeys("111111111111111111111111111111111111111111111111111");
    	Thread.sleep(500);
	}
	
	public String verifye1() throws InterruptedException {
    	String act=driver.findElement(e1).getText();
    	return act;
	}
	public String verifye2() throws InterruptedException {
    	String act=driver.findElement(e2).getText();
    	return act;
	}
	public String verifye3() throws InterruptedException {
    	String act=driver.findElement(e3).getText();
    	return act;
	}
	/*public String verifye4() throws InterruptedException {
    	String act=driver.findElement(e4).getText();
    	return act;
	}*/

}
