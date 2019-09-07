package com.dollartree.skillbuilder.rabbit;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class EstimateRabbitsSteps{

	@Given("the number of <months>")
	public void givenTheNumberOfmonths(@Named("months") int months) {}
	
	@Given("the number of months is zero")
	public void givenTheNumberOfMonthsIsZero() {}

	@When("the number of rabbits are estimated")
	public void whenTheNumberOfRabbitsAreEstimated() {}

	@When("the list is sorted in descending order")
	public void whenTheListIsSortedInDescendingOrder() {
	}

	@Then("the number of rabbits for each month will be <expected>")
	public void thenTheNumberOfRabbitsForEachMonthWillBeexpected(@Named("expected") int expected) {}
   
	@Then("the ExpectedPositiveMonthsException with will be thrown")
	public void thenTheExpectedPositiveMonthsExceptionWithWillBeThrown() {}
}
