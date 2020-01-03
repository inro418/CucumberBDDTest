package stepDefinitions;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;

	public class CucumberBDDTest {
	WebDriver driver;

	@Given("^User check SignInButton$")
	public void user_check_SignInButton(){
		
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 
	  driver.get("https://www.iceland.co.uk/");
	  WebElement SignInLink = driver.findElement(By.xpath("//*[@id='wrapper']/header/div[1]/div/ul/li[4]/a[2]"));
	  SignInLink.click();
	}

	@Given("^User check the Email textbox$")
	public void user_check_the_Email_textbox(){
	WebElement EmailAddress = driver.findElement(By.name("dwfrm_login_username"));
	EmailAddress.sendKeys("intro4ebony@yahoo.com");    

	}

	@Given("^User check the Password textbox$")
	public void user_check_the_Password_textbox(){
	WebElement Password = driver.findElement(By.name("dwfrm_login_password"));
	Password.sendKeys("isuA4188");
	}
	 
	@When("^User click the SignInButton$")
	public void user_click_the_SignInButton(){
	WebElement SignInButton = driver.findElement(By.name("dwfrm_login_login"));
	SignInButton.click();
	}

	@Then("^User navigate to home page$")
	public void user_navigate_to_home_page(){

	}

	@Then("^User confirmed SignInButton is working$")
	public void user_confirmed_SignInButton_is_working(){
	 
	}

	@Then("^User check My Account details$")
	public void user_check_My_Account_details(){
	 
	}

	@Then("^User check Add to Basket$")
	public void user_check_Add_to_Basket(){
	   
	}

	@Then("^User check Order$")
	public void user_check_Order(){
	   driver.quit();
	}
}
