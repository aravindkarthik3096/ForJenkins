package com.StepDefenition;

import com.Base.BaseClass;
import com.Pages.FbPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefenition extends BaseClass {


	@Given("User is facebook login page")
	public void user_is_facebook_login_page() {
	}

	@When("User enters the username and password")
	public void user_enters_the_username_and_password() {
		FbPojo fb = new FbPojo();
		fill(fb.getTxtUser(), "java@gmail.com");
		fill(fb.getTxtPass(), "selenium123");
	}

	@When("User click the login button once")
	public void user_click_the_login_button_once() {
		FbPojo fb = new FbPojo();
		click(fb.getTxtLoginBtn());
	}

	@Then("User validates the outcome of the test  once")
	public void user_validates_the_outcome_of_the_test_once() {
	}

	@When("User enters the invalid username and invalid password")
	public void user_enters_the_invalid_username_and_invalid_password() {
		FbPojo fb = new FbPojo();
		fill(fb.getTxtUser(), "oracle@gmail.com");
		fill(fb.getTxtPass(), "phython123");
	}

	@When("User click the login button twice")
	public void user_click_the_login_button_twice() {
		FbPojo fb = new FbPojo();
		click(fb.getTxtLoginBtn());
	}

	@Then("User validates the outcome of the test twice")
	public void user_validates_the_outcome_of_the_test_twice() {
	}

	@When("User enters the valid username and invalid password")
	public void user_enters_the_valid_username_and_invalid_password() {
		FbPojo fb = new FbPojo();
		fill(fb.getTxtUser(), "plsql@gmail.com");
		fill(fb.getTxtPass(), "selenium123");
	}

	@When("User click the login button third time")
	public void user_click_the_login_button_third_time() {
		FbPojo fb = new FbPojo();
		click(fb.getTxtLoginBtn());
	}

	@Then("User validates the outcome of the test third time")
	public void user_validates_the_outcome_of_the_test_third_time() {
	}

	@When("User enters the invalid username and valid password")
	public void user_enters_the_invalid_username_and_valid_password() {
		FbPojo fb = new FbPojo();
		fill(fb.getTxtUser(), "selenium@gmail.com");
		fill(fb.getTxtPass(), "phython123");
	}

	@When("User click the login button fouth time")
	public void user_click_the_login_button_fouth_time() {
		FbPojo fb = new FbPojo();
		click(fb.getTxtLoginBtn());
	}

	@Then("User validates the outcome of the test  fourth time")
	public void user_validates_the_outcome_of_the_test_fourth_time() {
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
}
