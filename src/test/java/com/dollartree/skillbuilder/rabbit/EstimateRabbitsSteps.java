package com.dollartree.skillbuilder.rabbit;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class EstimateRabbitsSteps extends RabbitMonthCalulator{

	@Given("the number of <months>")
	@Pending
	public void givenTheNumberOfmonths(@Named("months") int months) {
	  // PENDING
	}

	@When("the number of rabbits are estimated")
	@Pending
	public void whenTheNumberOfRabbitsAreEstimated() {
	  // PENDING
	}

	@Then("the number of rabbits for each month will be <expected>")
	@Pending
	public void thenTheNumberOfRabbitsForEachMonthWillBeexpected(@Named("expected") int expected) {
	  // PENDING
	}
   
}
