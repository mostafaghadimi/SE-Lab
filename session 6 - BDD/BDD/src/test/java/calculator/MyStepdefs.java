package calculator;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
public class MyStepdefs {
    private Calculator calculator;
    private int value1;
    private int value2;
    private String value3;
    private int result;


    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("^three input values, (-\\d+|\\d+) and (-\\d+|\\d+) and (\\+|\\*|/|-)$")
    public void threeInputValuesAnd(int arg0, int arg1, String arg2 ) {
        value1 = arg0;
        value2 = arg1;
        value3 = arg2;
    }

    @When("^I operate the three values$")
    public void iOperateTheThreeValues() {
        result = calculator.calculate(value1, value2, value3);
        System.out.print(result);
    }

    @Then("^I expect the result (-\\d+|\\d+)$")
    public void iExpectTheResult(int arg0) {
        Assert.assertEquals(arg0, result);
    }
}
