package stepDefinition;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Home_Page;
import Pages.Sign_In_Page;
import Pages.Success_Page;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sprint2_stepdefination1 {
	WebDriver driver;
	Home_Page hp;
	Sign_In_Page sip;
	Success_Page sp;
	Pages.Home_Register hr;
	Pages.Home_details hd;
	Pages.san_explore exp;
	Pages.san_success exps;
	Pages.Home_Tablebooking ht;
	Pages.Home_Page_details hpd;
    
	@After
	public void teardown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
	@Before
	    public void setup() throws Throwable {
			 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.get("https://www.opentable.com/"); 
				hp=new Home_Page(driver);
				sip=new Sign_In_Page(driver);
				sp=new Success_Page(driver); 
	    }
	 @Given("^User click on Sign In button$")
	    public void user_click_on_sign_in_button() throws Throwable {
		 hp.clickSignIn();
	    }

	    @When("^User click on Email field$")
	    public void user_click_on_email_field() throws Throwable {
	    	sip.clickEmail();
	    }

	    @When("^User click on Forgot password$")
	    public void user_click_on_forgot_password() throws Throwable {
	    	sip.clickforpass();
	    }

	    @When("^User click on Continue with booking$")
	    public void user_click_on_continue_with_booking() throws Throwable {
	    	sip.clickbook();  
	    }

	    @When("^User click on Continue with facebook$")
	    public void user_click_on_continue_with_facebook() throws Throwable {
	    	sip.clickfb();
	    }

	    @When("^User click on Continue with Google$")
	    public void user_click_on_continue_with_google() throws Throwable {
	    	sip.clickgoogle();
	    }

	    @When("^User click on Create New Account$")
	    public void user_click_on_create_new_account() throws Throwable {
	    	sip.clickcrn();
	    }

	    @When("^User click on Terms of Service$")
	    public void user_click_on_terms_of_service() throws Throwable {
	    	sip.clicktas();
	    }

	   /*@When("^User click on Privacy Policy$")
	    public void user_click_on_privacy_policy() throws Throwable {
	    	WebElement iframeElement = driver.findElement(By.xpath("//iframe[@title='Sign in']"));
	    	 driver.switchTo().frame(iframeElement);
	    	 Thread.sleep(3000);
	    	driver.findElement(By.xpath("//a[text()='Privacy Policy']")).click();
	    	Thread.sleep(3000);
	    	System.out.println("11");
	    	
	    }*/

	    @Then("^User verify the error message 1$")
	    public void user_verify_the_error_message_1() throws Throwable {
	    	String exp="Please enter your Email";
	    	String act=sip.verifye1();
	    	org.junit.Assert.assertEquals(exp,act);
	    	System.out.println(act);
	    	driver.switchTo().defaultContent();
	    }

	    @Then("^User verify the error message 2$")
	    public void user_verify_the_error_message_2() throws Throwable {
	    	String exp="Your email and password don't match. Please try again.";
	    	String act=sip.verifye2();
	    	org.junit.Assert.assertEquals(exp,act);
	    	System.out.println(act);
	    	driver.switchTo().defaultContent();
	    }

	    @Then("^User verify the error message 3$")
	    public void user_verify_the_error_message_3() throws Throwable {
	    	String exp="Please enter your password.";
	    	String act=sip.verifye3();
	    	org.junit.Assert.assertEquals(exp,act);
	    	System.out.println(act);
	    	driver.switchTo().defaultContent();
	    }
	    /*@Then("^User verify the error message 4$")
	    public void user_verify_the_error_message_4() throws Throwable {
	    	String exp="Your email and password don't match. Please try again.";
	    	String act=sip.verifye4();
	    	org.junit.Assert.assertEquals(exp,act);
	    	System.out.println("Your email and password don't match. Please try again.");
	    	driver.switchTo().defaultContent();
	    }*/

	    @Then("^User navigates to Account page$")
	    public void user_navigates_to_account_page() throws Throwable {
	    	sp.navigateaccountpg();
	    }

	    @Then("^User navigates to retrieve password page$")
	    public void user_navigates_to_retrieve_password_page() throws Throwable {
	    	String s=sp.navigateretpass();
			System.out.println(s);
			String exp="Retrieve Password";
	    	org.junit.Assert.assertEquals(exp,s);
	    	driver.navigate().back();
			
	    }

	    @Then("^User navigates to booking webpage$")
	    public void user_navigates_to_booking_webpage() throws Throwable {    
			String s=sp.navigatestobook();
			System.out.println(s);
			String exp="Booking.com";
	    	org.junit.Assert.assertEquals(exp,s);
			Thread.sleep(3000); 
	    }

	    @Then("^User navigates to facebook webpage$")
	    public void user_navigates_to_facebook_webpage() throws Throwable {
				String s=sp.navigatestoface();
				System.out.println(s);
				String exp="Log in to Facebook | Facebook";
		    	org.junit.Assert.assertEquals(exp,s);
			Thread.sleep(3000); 
	    }

	    @Then("^User navigates to Google webpage$")
	    public void user_navigates_to_google_webpage() throws Throwable {
			String s=sp.navigatestogoogle();
			System.out.println(s);
			String exp="Sign in – Google accounts";
	    	org.junit.Assert.assertEquals(exp,s);
			Thread.sleep(3000); 
	    }

	    @Then("^User navigates to Sign Up page$")
	    public void user_navigates_to_sign_up_page() throws Throwable {
	    	Thread.sleep(1000);
	    	String s=sp.navigatesignUp();
	    	String exp="Welcome to OpenTable!";
	    	org.junit.Assert.assertEquals(exp,s);
	    	System.out.println(s);
	    }

	    @Then("^User navigates to Terms of Service webpage$")
	    public void user_navigates_to_terms_of_service_webpage() throws Throwable {
	    	String s=sp.navigatetas();
	    	String exp="Terms of Service";
	    	org.junit.Assert.assertEquals(exp,s);
	    	Thread.sleep(1000);
	    }

	  /* @Then("^User navigates to Privacy Policy webpage$")
	    public void user_navigates_to_privacy_policy_webpage() throws Throwable {
	    	Thread.sleep(3000);
	    	String s=driver.findElement(By.xpath("(//span[text()='Terms of Service'])[1]")).getText();
	    	System.out.println(s);
	    	String exp="Privacy Check-Up";
	    	org.junit.Assert.assertEquals(exp,s);
	    	Thread.sleep(3000);
	    }*/

	    @And("^User Click on Password field$")
	    public void user_click_on_password_field() throws Throwable {
	    	sip.clickpass();
	    }

	    @And("^User enter valid (.+)$")
	    public void user_enter_valid(String password) throws Throwable {
	    	sip.entervalidpass(password);
	    }

	    @And("^User click on Sign In1$")
	    public void user_click_on_sign_in1() throws Throwable {
	    	sip.clicksignin1();
	    }

	    @And("^User Enter invalid Email$")
	    public void user_enter_invalid_email() throws Throwable {
	    	sip.enterinvalidemail();
	    }

	    @And("^User Enter valid but not registered Email$")
	    public void user_enter_valid_but_not_registered_email() throws Throwable {
	    	sip.entervalidnotregisteredemail();
	    }

	    @And("^User Enter valid and registered (.+)$")
	    public void user_enter_valid_and_registered(String Email) throws Throwable {
	    	sip.entervalidemail(Email);
	    }

	    @And("^User enters password greater than 40 characters$")
	    public void user_enters_password_greater_than_40_characters() throws Throwable {
	    	sip.enterpassgreater40();
	    	
	    }

	    @And("^User enters invalid password$")
	    public void user_enters_invalid_password() throws Throwable {
	    	sip.enterinvalidpass();
	    }
	    
	    
	    
	    //Register
		
		@Given("^the application browser is launched$")
	    public void the_application_browser_is_launched() throws Throwable {
	        System.out.println("the application browser is launched");
	    }

	    @When("^user clicks Sign up button$")
	    public void user_clicks_sign_up_button() throws Throwable {
	    	System.out.println("user clicks Sign up button");
	    	hr = new Pages.Home_Register(driver);
	    	hr.clickSignUp();
	    	
	    }

	    @Then("^the homepage is reloaded$")
	    public void the_homepage_is_reloaded() throws Throwable {
	    	System.out.println("the homepage is reloaded");
	    }

	    @Then("^error message is displayed$")
	    public void error_message_is_displayed() throws Throwable {
	    	System.out.println("error message is displayed");
	    	String err1 = "Enter a valid email address.";
	    	String err = hr.email_error();
	    	org.junit.Assert.assertEquals(err1,err);
	    	System.out.println(err);
	    }

	    @Then("^error message will be displayed$")
	    public void error_message_will_be_displayed() throws Throwable {
	    	System.out.println("error message will be displayed");
	    }

	    @And("^the Open Table homepage is opened$")
	    public void the_open_table_homepage_is_opened() throws Throwable {
	    	System.out.println("the Open Table homepage is opened ");
	    }

	    @And("^user enters the first name$")
	    public void user_enters_the_first_name() throws Throwable {
	    	System.out.println("user enters the first name");
	    	hr.firstname();
	    }

	    @And("^user enters the last name$")
	    public void user_enters_the_last_name() throws Throwable {
	    	System.out.println("user enters the last name");
	    	//WebElement iframeElement = driver.findElement(By.xpath("//iframe[@title='Sign up']"));
	    	//driver.switchTo().frame(iframeElement);
	    	hr.lastname();
	    	
	    	
	    }

	    @And("^user enters the email$")
	    public void user_enters_the_email() throws Throwable {
	    	System.out.println("user enters the email");
	    	//WebElement iframeElement = driver.findElement(By.xpath("//iframe[@title='Sign up']"));
	    	//driver.switchTo().frame(iframeElement);
	    	hr.email();
	    	    }

	    @And("^user enters valid password$")
	    public void user_enters_valid_password() throws Throwable {
	    	System.out.println("^user enters valid password");
	    	//WebElement iframeElement = driver.findElement(By.xpath("//iframe[@title='Sign up']"));
	    	//driver.switchTo().frame(iframeElement);
	    	hr.password();
	    	
	    }

	    @And("^user Reenters the password$")
	    public void user_reenters_the_password() throws Throwable {
	    	System.out.println("user Reenters the password");
	    	//WebElement iframeElement = driver.findElement(By.xpath("//iframe[@title='Sign up']"));
	    	//driver.switchTo().frame(iframeElement);
	    	hr.reenter_pass();
	    	
	    	
	    }

	    @And("^user selects the primary dining location$")
	    public void user_selects_the_primary_dining_location() throws Throwable {
	    	System.out.println("user selects the primary dining location");
	    	//WebElement iframeElement = driver.findElement(By.xpath("//iframe[@title='Sign up']"));
	    	//driver.switchTo().frame(iframeElement);
	    	hr.dininglocation();
	    	
	    	
	    }

	    @And("^user clicks on create account button$")
	    public void user_clicks_on_create_account_button() throws Throwable {
	    	System.out.println("user clicks on create account button");
	    	hr.clickCreateAccount();
	    	
	    }

	    @And("^user clicks on the profile icon$")
	    public void user_clicks_on_the_profile_icon() throws Throwable {
	    	System.out.println("user clicks on the profile icon");
	    	//driver.findElement(Profile).click();
	    }

	    @And("^user clicks on sign out option$")
	    public void user_clicks_on_sign_out_option() throws Throwable {
	    	System.out.println("user clicks on sign out option");
	    	//driver.findElement(SignOut).click();
	    }

	    @And("^user enters invalid data in any of the required fields$")
	    public void user_enters_invalid_data_in_any_of_the_required_fields() throws Throwable {
	    	System.out.println("user enters invalid data in any of the required fields");
	    	Thread.sleep(5000);
	    	hr.Invaliddata();
	    	Thread.sleep(5000);
	    }

	    
	    
	    
	    
	    
	    //details of Restaurant
	    
	    @Given("^Launch the application browser$")
	    public void launch_the_application_browser() throws Throwable {
	        System.out.println("Launch the application browser");
	    }

		 @When("^clicks on dropdown for location$")
		    public void clicks_on_dropdown_for_location() throws Throwable {
		        System.out.println("clicks on dropdown for location");
		        
		        hd.dropdown();
		 }

	    @Then("^click on Menu$")
	    public void click_on_menu() throws Throwable {
	        System.out.println("click on Menu");
	        hd.clickMenu();
	    }

	    @And("^Open the webpage of Open Table$")
	    public void open_the_webpage_of_open_table() throws Throwable {
	        System.out.println("Open the webpage of Open Table");
	        hpd = new Pages.Home_Page_details(driver);
	        hpd.clickSignIn();
	        //hp.clickEmail();
	        hpd.getDataFromXLSX();
	        hpd.clickpass();
	        hpd.clicksignin1();
	    }

	    @And("^verify title of homepage$")
	    public void verify_title_of_homepage() throws Throwable {
	    	hd = new Pages.Home_details(driver);
	        System.out.println("verify title of homepage");
	        String original2 = hd.titlehome();
	        System.out.println(original2);
	        
	        String expected2 = "Restaurants and Restaurant Reservations | OpenTable";
	        Assert.assertEquals(original2, expected2);
	    }

	    @And("^choose location$")
	    public void choose_location() throws Throwable {
	        System.out.println("choose location");
	        hd.chooseLocation();     
	    }

	    @And("^choose restaurant$")
	    public void choose_restaurant() throws Throwable {
	        System.out.println("choose restaurant");
	        //hd.chooseRestaurant();
	        hd.restro();
	    }

	    @And("^click on view full menu$")
	    public void click_on_view_full_menu() throws Throwable {
	        System.out.println("click on view full menu");
	        hd.fullMenu();
	        
	        String original1 = hd.titlerestaurant();
	        System.out.println(original1);
	        
	        String expected1 = "Bimbadgen Pizza Cafe Restaurant - Pokolbin, AU-NSW | OpenTable";
	        Assert.assertEquals(original1, expected1);
	        
	    }

	    @And("^click on Photos$")
	    public void click_on_photos() throws Throwable {
	        System.out.println("click on Photos");
	        hd.photos();
	    }

	   
	    @And("^click on Reviews$")
	    public void click_on_reviews() throws Throwable {
	        System.out.println("click on Reviews");
	        hd.reviews();
	    }

	    @And("^print the current ratting$")
	    public void print_the_current_ratting() throws Throwable {
	        System.out.println("print the current ratting");
	        String ratings = hd.ratting();
	        System.out.println("Ratings: "+ratings);
	    }

	    @And("^go to FAQ$")
	    public void go_to_faq() throws Throwable {
	        System.out.println("go to FAQ");
	        String faq = hd.faqs();
	        System.out.println("First Faq question: "+faq);      
	    }

	    @And("^check parking details$")
	    public void check_parking_details() throws Throwable {
	        System.out.println("check parking details");
	        hd.parking(); 
	    }

	    @And("^check contact number$")
	    public void check_contact_number() throws Throwable {
	        System.out.println("check contact number");
	        hd.clicviewMore();
	        hd.contact();
	    }

	    @And("^check website of restaurant$")
	    public void check_website_of_restaurant() throws Throwable {
	        System.out.println("check website of restaurant");
	      //a[@href='https://www.bimbadgen.com.au/']
	        //String website = driver.findElement(By.xpath("//a[@href='https://www.bimbadgen.com.au/']")).getText();
	        //System.out.println("Website: "+website);
	    }
	    
	    
	    
	    
	    //Explore
	    
	    @Given("^Open chrome browser and enter url$")
	    public void open_chrome_browser_and_enter_url() throws Throwable {
			 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.get("https://www.opentable.com/"); 
				exp=new Pages.san_explore(driver);
				exps=new Pages.san_success(driver);
	    }
		

	    @When("^Enter location  in search criteria$")
	    public void enter_location_in_search_criteria() throws Throwable {
	        /*By button1=By.xpath("//input[@placeholder='Location, Restaurant, or Cuisine']");
	    	driver.findElement(button1).click();
	    	driver.findElement(button1).sendKeys("delhi");
	    	System.out.println("1");*/
	    	exp.enterloc();
	    }

	    @Then("^Click on search button$")
	    public void click_on_search_button() throws Throwable {
	    	/*By button2=By.xpath("(//button[@type='button'])[11]");
	    	driver.findElement(button2).click();
	    	System.out.println("1");*/
	    	exp.clicksearch();
	    }
	    @Then("^verify hotel for location$")
	    public void Verify_hotel_for_location() throws Throwable {
	    	/*By res1=By.xpath("//h6[text()='Indian Accent']");
	    	String s1=driver.findElement(res1).getText();
	    	System.out.println(s1);*/
	    	String exp="Indian Accent";
	    	String act=exps.verifyloc();
	    	org.junit.Assert.assertEquals(exp,act);
	    	System.out.println(act);
	    	//System.out.println("1");
	    }
	    

	    @When("^Enter restaurant  in search criteria$")
	    public void enter_restaurant_in_search_criteria() throws Throwable {
	    	/* By button1=By.xpath("//input[@placeholder='Location, Restaurant, or Cuisine']");
	     	driver.findElement(button1).click();
	     	driver.findElement(button1).sendKeys("Bimbadgen Pizza Cafe");
	     	System.out.println("2");*/
	    	exp.enterrest();
	    }

	    @Then("^verify restaurant for name$")
	    public void verify_restaurant_for_name() throws Throwable {
	    	/*By res1=By.xpath("//h6[text()='Bimbadgen Pizza Cafe']");
	    	String s1=driver.findElement(res1).getText();
	    	System.out.println("2");*/
	    	String exp="Bimbadgen Pizza Cafe";
	    	String act=exps.verifyrest();
	    	org.junit.Assert.assertEquals(exp,act);
	    	System.out.println(act);
	}
	    @When("^Enter cuisine in search criteria$")
	    public void enter_cuisine_in_search_criteria() throws Throwable {
	    	/* By button1=By.xpath("//input[@placeholder='Location, Restaurant, or Cuisine']");
	      	driver.findElement(button1).click();
	      	driver.findElement(button1).sendKeys("Spice Kitchen");
	      	System.out.println("3");*/
	    	exp.entercui();
	    }


	    @Then("^verify cuisine$")
	    public void verify_cuisine() throws Throwable {
	    	/*By res1=By.xpath("//h6[text()='Spice Kitchen']");
	    	String s1=driver.findElement(res1).getText();
	    	System.out.println("3");*/
	    	String exp="Spice Kitchen";
	    	String act=exps.verifycui();
	    	org.junit.Assert.assertEquals(exp,act);
	    	System.out.println(act);
	    }


	    
	    
	    
	    //table booking
	    
	    @Given("^User has navigated to the OpenTable website$")
	    public void user_has_navigated_to_the_opentable_website() throws Throwable {
		System.out.println("Navigated to website"); 
	    }

	    @When("^User selects the date$")
	    public void user_selects_the_date() throws Throwable {
	    	//ht.Dateselect();
	    	Thread.sleep(5000);
	    	System.out.println("date of booking is selected");    
	    }

	    @Then("^Available tables should be displayed to User$")
	    public void available_tables_should_be_displayed_to_user() throws Throwable {
	    	 System.out.println("Available table in restaurants are listed"); 
	    }

	    @Then("^Table is Booked$")
	    public void table_is_booked() throws Throwable {
	    	ht.TableBookbtn();
	    	 System.out.println("Table is Booked.");  
	    }
        
	    /*@And("^User has signed in with email and password password to the website$")
	    public void user_has_signed_in_with_email_and_password_password_to_the_website() throws Throwable {
	    	//ht.SignIn(email,password);
	    	ht.SignIn();
	    	System.out.println("User Signs In"); 
	    }*/
	    
	    @And("^User has signed in with email and password password to the website$")
	    public void user_has_signed_in_with_email_and_password_password_to_the_website() throws Throwable {
	    	ht = new Pages.Home_Tablebooking(driver);
	    	Thread.sleep(2000);
	    	ht.SignIn2();
	    	System.out.println("User Signs In");
	    }
	    
	    @And("^User selects the time$")
	    public void user_selects_the_time() throws Throwable {
	    	ht.Timeselect();
            Thread.sleep(5000);
           System.out.println("Time is selected"); 
	    }

	    @And("^User selects number of people$")
	    public void user_selects_number_of_people() throws Throwable {
	    	ht.NoPeopleSelect();
	    	Thread.sleep(5000);
	    	System.out.println("Number of people are selected");
	    }
	    
	    @And("^User enters the location,restaurant or cuisine$")
	    public void user_enters_the_locationrestaurant_or_cuisine() throws Throwable {
	    	ht.Location();
	    	 System.out.println("User selects location or restaurant"); 
	    }

	    @And("^User clicks on Find a table button$")
	    public void user_clicks_on_find_a_table_button() throws Throwable {
	    	ht.Findtablebtn();
	    	 System.out.println("Find a table button is clicked"); 
	    }

	    @And("^User selects the time slot from available restaurant$")
	    public void user_selects_the_time_slot_from_available_restaurant() throws Throwable {
	    	ht.Timeslotselect();
	    	System.out.println("User selects the desired slot"); 
	    }

	    @And("^User clicks on Complete the Reservation button$")
	    public void user_clicks_on_complete_the_reservation_button() throws Throwable {
	    	ht.CompleteReservation();
	    	 System.out.println("Complete Reservation button is clicked"); 
	    }
	    
}
