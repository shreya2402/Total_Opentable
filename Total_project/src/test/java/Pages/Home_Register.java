package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Register {
	WebDriver driver;
	

	private By SignUp = By.xpath("//button[@class='_1ne6cGD8CL2x_1xIImjIFp _1FpqChvjnfdczUl5bA5xyI'][text()='Sign up']");
	private By FirstName = By.id("FirstName");
	private By LastName = By.id("LastName");
	private By Email = By.id("Email");
	private By Password = By.id("Password");
	private By Password2 = By.id("Password2");
	private By PrimaryDiningLocation = By.xpath("//div[@class='clearfix']");
	private By LocationOption = By.xpath("//option[@value='279']");
	private By CreateAccount = By.xpath("//button[@type='submit']");
	private By error = By.id("Email-error");
	//private By Profile = By.xpath("//div[@class='_26piPXlXi1GjYFJMSeTlFd _3E4ZQkaXNTgwhWX5Ro2Hu2']");
	//private By SignOut = By.xpath("(//button[@class=' '])");
	
	public Home_Register(WebDriver drive)
	{
		this.driver = drive;
	}
	
	public void clickSignUp()
	{
		driver.findElement(SignUp).click();
	}
	public void firstname()
	{
		WebElement iframeElement = driver.findElement(By.xpath("//iframe[@title='Sign up']"));
    	driver.switchTo().frame(iframeElement);
    	driver.findElement(FirstName).sendKeys("Arohi");
	}
	public void lastname()
	{
		driver.findElement(LastName).sendKeys("Shirke");
	}
	public void email()
	{
		driver.findElement(Email).sendKeys("as123@gmail.com");
	}
	public void password()
	{
		driver.findElement(Password).sendKeys("Arohishirke123");
	}
	public void reenter_pass()
	{
		driver.findElement(Password2).sendKeys("Arohishirke123");
	}
	public void dininglocation()
	{
		driver.findElement(PrimaryDiningLocation).click();
    	driver.findElement(LocationOption).click();
	}
	public void clickCreateAccount()
	{
		//WebElement iframeElement = driver.findElement(By.xpath("//iframe[@title='Sign up']"));
    	//driver.switchTo().frame(iframeElement);
		driver.findElement(CreateAccount).click();
	}
	public void Invaliddata()
	{
		WebElement iframeElement = driver.findElement(By.xpath("//iframe[@title='Sign up']"));
    	driver.switchTo().frame(iframeElement);
    	driver.findElement(Email).sendKeys("as123gmail.com");  	
	}
	public String email_error()
	{
		String err = driver.findElement(error).getText();
		driver.switchTo().defaultContent();
		return err;
	}
}
