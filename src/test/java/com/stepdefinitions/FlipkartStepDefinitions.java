package com.stepdefinitions;

import com.baseclass.BaseClass;
import com.pagefactory.HomepageFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlipkartStepDefinitions extends HomepageFactory {
	
	@Given("Open the Browser")
	public void open_the_browser() {
	   browserOpen();
	   
	}

	@Given("Launch the Flipkart URL")
	public void launch_the_flipkart_url() throws InterruptedException {
	    launchUrl("https://www.flipkart.com/");
	    maximizeScreen();
	    sleepTime(4000);
	       
	    
	}	

	@When("User Search for {string} Product")
	public void user_search_for_product(String string) {
	  BaseClass.dataSend(new HomepageFactory().getSearchBox(), string);
	  BaseClass.sub
	}

	@And("User Click on the First Product")
	public void user_click_on_the_first_product() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("Click on Go to Cart")
	public void click_on_go_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Get the Product Price")
	public void get_the_product_price() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
}