package dev.michalak.adam.calculator;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FlowController {

    private final Scanner inputProvider;
    private Calculator calculator;

    public FlowController(Scanner inputProvider) {
        this.inputProvider = inputProvider;
        this.calculator = new Calculator();
    }

    public void run() {
        this.getFirstNumber();
        this.getOperator();
        this.getSecondNumber();
        this.printResult();
    }

    private void getFirstNumber() {
        System.out.print("Type the number: ");
        this.allowOnlyDoubleValues();
        this.calculator.setFirstNumber(inputProvider.nextDouble());
    }

    private void allowOnlyDoubleValues() {
        while (!inputProvider.hasNextDouble()) {
            System.out.print("Wrong value. Type the number: ");
            inputProvider.next();
        }
    }

    private void getOperator() {
        System.out.print("Type the operator " + this.computePrintableSetOfOperators() + ": ");
        try {
            this.calculator.setOperator(inputProvider.next().charAt(0));
        } catch (IllegalStateException exception) {
            System.err.println(exception.getMessage());
            this.getOperator();
        }
    }

    private String computePrintableSetOfOperators() {
        return String.valueOf(
                Arrays.stream(Operator.values())
                        .map(Operator::getOperator)
                        .collect(Collectors.toList())
        );
    }

    private void getSecondNumber() {
        System.out.print("Type the number: ");
        this.allowOnlyDoubleValues();
        try {
            this.calculator.setSecondNumber(inputProvider.nextDouble());
        } catch (IllegalStateException exception) {
            System.err.println(exception.getMessage());
            this.getSecondNumber();
        }
    }

    private void printResult() {
        System.out.println("The result is " + this.calculator.calculate());
    }
}
