package dev.michalak.adam.calculator;

import java.util.Arrays;
import java.util.stream.Collectors;

enum Operator implements Calculable {
    ADDITION('+') {
        @Override
        public double calculate(double firstNumber, double secondNumber) {
            return firstNumber + secondNumber;
        }
    },
    SUBTRACTION('-'){
        @Override
        public double calculate(double firstNumber, double secondNumber) {
            return firstNumber - secondNumber;
        }
    },
    MULTIPLICATION('*'){
        @Override
        public double calculate(double firstNumber, double secondNumber) {
            return firstNumber * secondNumber;
        }
    },
    DIVISION('/'){
        @Override
        public double calculate(double firstNumber, double secondNumber) {
            return firstNumber / secondNumber;
        }
    };

    private final char operator;

    Operator(char operator) {
        this.operator = operator;
    }

    char getOperator() {
        return operator;
    }

    static String getOperatorsString() {
        return String.valueOf(
                Arrays.stream(values())
                        .map(Operator::getOperator)
                        .collect(Collectors.toList())
        );
    }
}
