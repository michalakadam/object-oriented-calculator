package dev.michalak.adam.calculator;

class Calculator {

    private double firstNumber;
    private Operator operator;

    void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    void setOperator(char operatorCharRepresentation) {
        this.operator = this.convertCharToOperator(operatorCharRepresentation);
    }

    private Operator convertCharToOperator(char operatorCharRepresentation) {
        for (Operator operator : Operator.values()) {
            if (operator.getOperator() == operatorCharRepresentation) {
                return operator;
            }
        }
        throw new IllegalStateException("Operator you provided cannot be proceeded.");
    }
}
