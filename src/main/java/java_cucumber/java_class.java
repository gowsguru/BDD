package java_cucumber;

import javax.print.attribute.standard.MediaSize.NA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class java_class {
	WebDriver driver;
	@Given("^launch the url$")
	public void launch()
	{
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\jar\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.automationtesting.in//");
	
}
@When("^click on skip signin button$")
public void skipsingin()
{
	driver.findElement(By.id("btn2")).click();
}
@Then("^enter first name as \"(.*)\" and last name as \"(.*)\"$")

public void registerpage()
{
	driver.findElement(By.xpath("////input[@placeholder='First Name']']")).sendKeys("gowthami");
	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("guru");
}
}
