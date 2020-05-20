package dev.michalak.adam.calculator;

import java.io.InputStream;
import java.util.Scanner;

class InputProvider {

    private Scanner inputStream;

    InputProvider(InputStream inputStream) {
        this.inputStream = new Scanner(inputStream);
    }

    double nextDouble() throws IllegalArgumentException {
        if (!this.inputStream.hasNextDouble()) {
            this.clearBuffer();
            throw new IllegalArgumentException("Please provide number! ");
        }
        return this.inputStream.nextDouble();
    }

    private void clearBuffer() {
        this.inputStream.nextLine();
    }

    String next() {
        return this.inputStream.next();
    }
}
