package dev.michalak.adam.calculator;

enum Operator {
    ADDITION('+'),
    SUBTRACTION('-'),
    MULTIPLICATION('*'),
    DIVISION('/');

    private final char operator;

    Operator(char operator) {
        this.operator = operator;
    }

    char getOperator() {
        return operator;
    }
}
