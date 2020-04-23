package dev.michalak.adam;

import dev.michalak.adam.calculator.FlowController;

import java.util.Scanner;

/**
 * Main class of Calculator application
 *
 * @author Adam Michalak
 */
public class ApplicationRunner {

    public static void main(String[] args) {
        Scanner numberScanner = new Scanner(System.in);
        FlowController flowController = new FlowController(numberScanner);

        flowController.run();
    }
}
