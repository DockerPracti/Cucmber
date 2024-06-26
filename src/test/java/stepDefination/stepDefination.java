package stepDefination;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination {
	public WebDriver driver;
	@Given("User1 is on Netbanking login page")
	public void user1_is_on_netbanking_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User1");
	   
	}
	
	@Given("User2 is on Netbanking login page")
	public void user2_is_on_netbanking_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User2");
	   
	}

	@When("User is enter {string} and {string}")
	public void user_is_enter_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(string);
		System.out.println(string2);
	}

	@Then("Home page is populated")
	public void home_page_is_populated() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Hema2");
	}

	@Then("Cards are displayed as {string}")
	public void cards_are_displayed_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(string);
	}
	@When("User is signup with follwing details")
	public void user_is_signup_with_follwing_details(DataTable dataTable) {
        //List<String> obj =dataTable.asList();
		List<List<String>> obj = dataTable.asLists();
        System.out.println(obj.get(0).get(0));
        System.out.println(obj.get(0).get(1));
        System.out.println(obj.get(0).get(2));
        System.out.println(obj.get(0).get(3));
	}
	
	@Given("Business is enter Credentials {string}{string}")
	public void business_is_enter_credentials(String string, String string2) {
	        // Implementation for entering the username and password
	        // You can use the provided username and password in your application
	        System.out.println("Entered Username: " + string);
	        System.out.println("Entered Password: " + string2);
	    }
	 @Given("Chrome browser is lanuched")
	 public void chrome_browser_is_lanuched() {
	     // Write code here that turns the phrase above into concrete actions
	    System.out.println("Chrome browser is lanuched");
	   
	 }

	 @When("Browser is loaded and Verfied Chrome browser")
	 public void browser_is_loaded_and_verfied_chrome_browser() {
	     // Write code here that turns the phrase above into concrete actions
		 System.out.println("Browser is loaded and Verfied Chrome browser");
	 }

	 @Then("Home Page title is dispalyed")
	 public void home_page_title_is_dispalyed() {
	     // Write code here that turns the phrase above into concrete actions
		 System.out.println("Home Page title is dispalyed");
	 }
	 
	 
	 @Given("Set up the driver property")
	 public void set_up_the_driver_property() {
		 System.setProperty("webdriver.edge.driver","C:\\Users\\hemar\\Browser Driver\\msedgedriver.exe");
	      driver = new EdgeDriver();
	      driver.manage().window().maximize();
	      System.out.println("1");
	      
	 }

	 @And("Open the application using URL:{string}")
	 public void open_the_application_using_url(String string) {
	     driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	     System.out.println("url is lanuched");
	 }
//
//	 @And("Login to Application {string} and {string}")
//	 public void login_to_application_and(String string, String string2) {
//	     // Write code here that turns the phrase above into concrete actions
//	     driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys(string);
//	     driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(string2);
//	     System.out.println("Credebtilas");
//	 }
//	 
	 

		@And("Extract url and print in console")
		public void close_all_the_browser() {
		  String url =  driver.getCurrentUrl();
		    System.out.println(url);
		}
		
		 @Given("I am on home page Greenvcard")
	     public void i_am_on_home_page_greenvcard() throws InterruptedException, IOException {
	         // Write code here that turns the phrase above into concrete actions
			 driver.findElement(By.cssSelector("input.search-keyword"));
			
	     }
		
		  @When("User is search for img and get the count and extract name of images")
		  public void user_is_search_for_img_and_get_the_count_and_extract_name_of_images() throws InterruptedException, IOException {
		      // Write code here that turns the phrase above into concrete actions
			  List<WebElement> allimg = driver.findElements(By.tagName("img"));
				System.out.println(allimg.size());
				Thread.sleep(3000);
				for(WebElement namesimg:allimg) {
					String imgsnames =namesimg.getAttribute("alt");
					System.out.println(imgsnames);
				}
				
				TakesScreenshot shot = ((TakesScreenshot)driver);
				File file = shot.getScreenshotAs(OutputType.FILE);
			   File destination = new File("src/test/resources/images/Image.png");
			
			    FileHandler.copy(file, destination);
			    Thread.sleep(3000);
			   // driver.findElement(By.tagName("Top Deals")).click();
		  }
		  
		  @Given("Browser is closed")
		  public void browser_is_closed() {
		      // Write code here that turns the phrase above into concrete actions

               driver.quit();
		  }


		  @And("User is get tomato avaible in table and get name of {string}")
		  public void user_is_get_tomato_avaible_in_table_and_get_name_of(String string) throws InterruptedException {
		      // Write code here that turns the phrase above into concrete actions
			  driver.findElement(By.linkText("Top Deals")).click();
			  Set<String> windows =driver.getWindowHandles();
			 	Iterator<String> il= windows.iterator();
			 	String parent =il.next();
			 	String Child =il.next();
			 	driver.switchTo().window(Child);
			 	Thread.sleep(2000);
			 	WebElement table = driver.findElement(By.tagName("table"));
			 	List<WebElement> rows = table.findElements(By.tagName("tr"));
			 	boolean tomatofound = false;

			 	for (WebElement row : rows) {
			 	    List<WebElement> cells = row.findElements(By.tagName("td"));

			 	    for (WebElement cell : cells) {
			 	        String cellValue = cell.getText().replaceAll("[^a-zA-Z]+", "");

			 	        if (cellValue.equalsIgnoreCase("Tomato")) {
			 	            tomatofound = true;
			 	            System.out.println("Tomato is available at row: " + (rows.indexOf(row)));
			 	            break;
			 	        }
			 	    }

			 	    if (tomatofound) {
			 	        break;
			 	    }
			 	}

			 	if (!tomatofound) {
			 	    System.out.println("Tomato is not available in the table");
			 	}


		
		  }	

}