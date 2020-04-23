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

    @Test
    public void calculate_addition_returnCorrectResult() {
        //given
        this.calculator.setFirstNumber(2);
        this.calculator.setOperator('+');
        this.calculator.setSecondNumber(2);
        //when
        double result = this.calculator.calculate();
        //then
        assertEquals(4, result, 0.1);
    }

    @Test
    public void calculate_subtraction_returnCorrectResult() {
        //given
        this.calculator.setFirstNumber(2);
        this.calculator.setOperator('-');
        this.calculator.setSecondNumber(2);
        //when
        double result = this.calculator.calculate();
        //then
        assertEquals(0, result, 0.1);
    }

    @Test
    public void calculate_multiplication_returnCorrectResult() {
        //given
        this.calculator.setFirstNumber(2);
        this.calculator.setOperator('*');
        this.calculator.setSecondNumber(2);
        //when
        double result = this.calculator.calculate();
        //then
        assertEquals(4, result, 0.1);
    }

    @Test
    public void calculate_division_returnCorrectResult() {
        //given
        this.calculator.setFirstNumber(2);
        this.calculator.setOperator('/');
        this.calculator.setSecondNumber(2);
        //when
        double result = this.calculator.calculate();
        //then
        assertEquals(1, result, 0.1);
    }
}