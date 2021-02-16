package com.stepsDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LogInSteps {
public WebDriver dr;
@Given("^Open Browser$")
public void open_Browser() throws Throwable {
   WebDriverManager.chromedriver().setup();
   dr= new ChromeDriver();
   dr.manage().window().maximize();
    
}

@Given("^Enter Url \"([^\"]*)\"$")
public void enter_Url(String Url) throws Throwable {
   dr.get(Url);
}

	@When("^I Enter valid UserName \"([^\"]*)\"$")
	public void i_Enter_valid_UserName(String userName) throws Throwable {
	   dr.findElement(By.xpath("//input[@name='username']")).sendKeys(userName);
	}

	@And("^I Enter valid PassWoard \"([^\"]*)\"$")
	public void i_Enter_valid_PassWoard(String passwoard) throws Throwable {
		dr.findElement(By.xpath("//input[@name='password']")).sendKeys(passwoard);
	}

	@And("^I Click LogInButton$")
	public void i_Click_LogInButton() throws Throwable {
		dr.findElement(By.xpath("//input[@class='btn btn-small']")).click();
	}

	@Then("^I am able to LogIn$")
	public void i_am_able_to_LogIn() throws Throwable {
		String ActualTitle ="CRMPRO";
		String ExpTitle = dr.getTitle();
		Assert.assertEquals(ActualTitle, ExpTitle);
		dr.close();
	}


	@When("^I Enter invalid UserName \"([^\"]*)\"$")
	public void i_Enter_invalid_UserName(String userName) throws Throwable {
		 dr.findElement(By.xpath("//input[@name='username']")).sendKeys(userName);
	}

	@Then("^I am not able to LogIn$")
	public void i_am_not_able_to_LogIn() throws Throwable {
		String ActualTitle ="Selenium Jobs";
		String ExpTitle = dr.findElement(By.xpath("//font[text()='Selenium Jobs']")).getText();
		Assert.assertEquals(ActualTitle, ExpTitle);
		dr.close();
	}



}
