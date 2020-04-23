package dev.michalak.adam.calculator;

enum Operator implements OperatorInterface {
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
}
