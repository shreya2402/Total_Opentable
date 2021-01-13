package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Home_Tablebooking {
	
	WebDriver driver;
	
	public By selectdate= By.xpath("//div[@class='_2arG8EjQcHCuJnaI2Zd_m0']");
	public By selecttime= By.xpath("//select[@class='_1w66sL6a6_HxHki4Fk78rf']");
	public By noofpeople= By.xpath("//select[@class='_1vnFSJqpkBpRwkmQY6msho']");
	public By selectlocation= By.xpath("//input[@class='_1Q41kn2s8adMA56-Hgfbqn _3E4ZQkaXNTgwhWX5Ro2Hu2']");
	public By email=By.xpath("//input[@name='Email']");
    public By password=By.xpath("//input[@id='Password']");
    public By SignInbtn= By.xpath("//button[@id='signInButton']");
    public By FindTablebtn= By.xpath("//button[@class='_2N9lzTO4qyj6nRyj1sxFHp _1CXSFpGG929EYzbe8kri9F']");
    public By Timeslot= By.xpath("//a[@class='AnkHgbWFTvFrc-3yvyRdB']");
    public By completereservebtn= By.xpath("//button[@class='_2N9lzTO4qyj6nRyj1sxFHp _1dzkf4HTVXL9Nfg-XSOfqx _1CXSFpGG929EYzbe8kri9F _3owv1qY9Bgc14CyitKpk1t']");
    public By tablebooked= By.xpath("//h1[text() = 'Thanks! Your reservation is confirmed.']");

public Home_Tablebooking(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public void SignIn2() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
   	 	WebElement iframeElement = driver.findElement(By.xpath("//iframe[@title='Sign in']"));
   	 	
   	 	driver.switchTo().frame(iframeElement);
   	 //driver.findElement(email).sendKeys(uname);
   	 //driver.findElement(password).sendKeys(pass);
   	 Thread.sleep(2000);
   	 	driver.findElement(email).sendKeys("tanmayee@gmail.com");
   	 Thread.sleep(2000);
   	 	driver.findElement(password).sendKeys("Tanu1234@!");
   	
     driver.findElement(SignInbtn).click();
     
	}

/*public void Dateselect()
		{//date
		driver.findElement(selectdate).click();
		}*/
	
		public void Timeselect()
		{//time
		 WebElement element = driver.findElement(selecttime);
         Select sel = new Select(element);
         sel.selectByVisibleText("7:30 PM");
     
		}
		
	public void NoPeopleSelect()
         {//people
         WebElement element = driver.findElement(noofpeople);
         Select sel = new Select(element);
         sel.selectByVisibleText("4 people");
         }
	
         public void Location()
         {//location
         driver.findElement(selectlocation).sendKeys("Pune");
         }
         
         public void Findtablebtn()
         {//findbutton
         driver.findElement(FindTablebtn).click();
	}
         
         public void Timeslotselect()
         {//timeslot
         driver.findElement(Timeslot).click();
        
	}
         
	public void CompleteReservation()
         {
         //completereservation
         driver.findElement(completereservebtn).click();
         
         }
	
         public void TableBookbtn()
         {
	 //tablebooked
         driver.findElement(tablebooked);
	}

}
