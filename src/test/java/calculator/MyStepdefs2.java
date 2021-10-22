package calculator;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs2 {
    private Calculator calculator;
    private int value1;
    private double result;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("^One input value, (-?[1-9]\\d*|0)$")
    public void oneInputValue(int arg0) {
        value1 = arg0;
    }


    @When("^I op ([a-z]+) the value$")
    public void iOpTheValue(String arg0) {
        if (arg0.equals("rvs")){
            result = calculator.rvs(value1);
        }else {
            if(arg0.equals("sqr")){
                result = calculator.sqr(value1);

            }
        }
        System.out.print(result);
    }

    @Then("^I wish for the result ([-?[1-9]\\d*|0].*\\d*)$")
    public void iExpectTheResult(double arg0) {
        Assert.assertEquals(arg0, result, 0.0001);
    }
}