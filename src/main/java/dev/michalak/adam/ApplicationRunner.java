package dev.michalak.adam;

import dev.michalak.adam.calculator.FlowController;
import dev.michalak.adam.calculator.InputProvider;

import java.util.Scanner;

/**
 * Launcher of the Calculator application
 *
 * @author Adam Michalak
 */
public class ApplicationRunner {

    public static void main(String[] args) {
        InputProvider inputProvider = new InputProvider(System.in);
        FlowController flowController = new FlowController(inputProvider);

        flowController.run();
    }
}
