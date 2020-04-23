package dev.michalak.adam;

import java.util.Scanner;

/**
 * Main class of Calculator application
 *
 * @author Adam Michalak
 */
public class ApplicationRunner {

    public static void main(String[] args) {
        Scanner numberScanner = new Scanner(System.in);
        Calculator calculator = new Calculator(numberScanner);

        calculator.calculate();
    }
}
