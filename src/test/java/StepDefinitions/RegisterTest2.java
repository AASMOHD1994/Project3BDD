package StepDefinitions;

import Pages.DI;
import Pages.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterTest2 {
	
	private DI di;
	
	public RegisterTest2(DI di)
	{
		this.di=di;
	}
	

@Given("II want to write a step with precondition")
public void ii_want_to_write_a_step_with_precondition() {
	
	System.out.println(di.getData("Test"));
}

@Given("somee other precondition")
public void somee_other_precondition() {

}




}
