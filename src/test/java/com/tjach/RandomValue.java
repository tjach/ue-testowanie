package com.tjach;

import org.jbehave.core.annotations.*;
import org.junit.Before;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


public class RandomValue {
    RandomValueGetter randomValue;
    int ret_value;
    int lower, upper;

    @BeforeStories
    public void setUp() {
        randomValue = new RandomValueGetter();
    }

    @Given("a lower bound of $lowerBound")
    public void setLowerBound(int lowerBound) {
        randomValue.setLower_bounds(lowerBound);
        lower = lowerBound;
    }
    @Given("an upper bound of $upperBound")
    public void setUpperBound(int upperBound) {
        randomValue.setUpper_boud(upperBound);
        upper = upperBound;
    }
    @When("a user requests the number")
    public void requestNumber() {
    ret_value = randomValue.getRandomValue();
    }

    @Then("a random number is given")
    public void getNumber() {
        assertThat(ret_value, allOf(greaterThanOrEqualTo(lower), lessThanOrEqualTo(upper)));

    }

    @Then("a number $number is given")
    public void getFixedNumber(int number) {
        assertEquals(number, ret_value);

    }

}
