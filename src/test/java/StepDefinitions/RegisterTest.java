package StepDefinitions;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import Pages.DI;
import Pages.RegisterPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterTest {
	
	private DI di;
	
	
	public RegisterTest(DI di)
	{
		this.di=di;
		
	}
	

@Given("I want to write a step with precondition")
public void i_want_to_write_a_step_with_precondition(DataTable data) {
	
	di.setData("Test", 5);
	
	List<List<String>> l=data.asLists(String.class);
	for(List<String> h:l)
	{
		
		System.out.println(h);
	}
 
//	rp.t1();
}

@Given("some other precondition")
public void some_other_precondition() {
	System.out.println("Hey there");
}

@When("I complete action")
public void i_complete_action() {
	System.out.println("Hey there");
}

@When("some other action")
public void some_other_action() {
	System.out.println("Hey there");
}

@When("yet another action")
public void yet_another_action() {
	System.out.println("Hey there");
}

@Then("I validate the outcomes")
public void i_validate_the_outcomes() {
	System.out.println("Hey there");
}

@Then("check more outcomes")
public void check_more_outcomes() {
	System.out.println("Hey there");
}






}
