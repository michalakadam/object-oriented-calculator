package dev.michalak.adam.calculator;

import java.util.Scanner;

public class FlowController {

    private final InputProvider inputProvider;
    private Calculator calculator;
    private boolean startNextRun;

    public FlowController(InputProvider inputProvider) {
        this.inputProvider = inputProvider;
        this.calculator = new Calculator();
        this.startNextRun = true;
    }

    public void run() {
        while (startNextRun) {
            this.collectFirstNumberFromUser();
            this.collectOperatorFromUser();
            this.collectSecondNumberFromUser();
            this.printResult();
            this.askForNextRun();
        }
    }

    private void collectFirstNumberFromUser() {
        System.out.print("Type the number: ");
        try {
            this.calculator.setFirstNumber(inputProvider.nextDouble());
        } catch (IllegalArgumentException exception) {
            System.out.print(exception.getMessage());
            this.collectFirstNumberFromUser();
        }
    }


    private void collectOperatorFromUser() {
        System.out.print("Type the operator " + Operator.getOperatorsString() + ": ");
        try {
            this.calculator.setOperator(inputProvider.next().charAt(0));
        } catch (IllegalStateException exception) {
            System.out.println(exception.getMessage());
            this.collectOperatorFromUser();
        }
    }

    private void collectSecondNumberFromUser() {
        System.out.print("Type the number: ");
        try {
            this.calculator.setSecondNumber(inputProvider.nextDouble());
        } catch (IllegalStateException | IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
            this.collectSecondNumberFromUser();
        }
    }

    private void printResult() {
        System.out.println("The result is " + this.calculator.calculate());
    }

    private void askForNextRun() {
        this.startNextRun = false;
        System.out.print("Do you want to calculate sth else? [y/n] ");
        String input = inputProvider.next();
        if (input.toLowerCase().equals("y")) {
            this.startNextRun = true;
        } else if (!input.toLowerCase().equals("n")) {
            System.out.print("Please answer with \'y\' or \'n\'. ");
            this.askForNextRun();
        }
    }
}
