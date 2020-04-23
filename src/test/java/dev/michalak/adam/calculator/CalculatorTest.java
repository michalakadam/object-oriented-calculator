package dev.michalak.adam.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        this.calculator = new Calculator();
    }

    @Test(expected = IllegalStateException.class)
    public void setOperator_incorrectOperator_ThrowException() {
        //given
        char providedOperator = '$';
        //when
        this.calculator.setOperator(providedOperator);
        //then
        //throws exception
    }

    @Test(expected = IllegalStateException.class)
    public void setSecondNumber_divisionWithZero_ThrowException() {
        //given
        this.calculator.setOperator('/');
        double providedNumber = 0;
        //when
        this.calculator.setSecondNumber(providedNumber);
        //then
        //throws exception
    }
}