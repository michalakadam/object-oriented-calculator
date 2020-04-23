package dev.michalak.adam.calculator;

import java.util.Scanner;

public class FlowController {

    private final Scanner inputProvider;
    private Calculator calculator;

    public FlowController(Scanner inputProvider) {
        this.inputProvider = inputProvider;
        this.calculator = new Calculator();
    }

    public void run() {
        this.getFirstNumber();
    }

    private void getFirstNumber() {
        System.out.println("Type the number: ");
        while (!inputProvider.hasNextDouble()) {
            System.out.println("Wrong value. Type the number: ");
            inputProvider.next();
        }
        this.calculator.setFirstNumber(inputProvider.nextDouble());
    }
}
