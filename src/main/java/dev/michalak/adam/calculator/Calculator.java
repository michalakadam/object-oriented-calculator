package dev.michalak.adam.calculator;

class Calculator {

    private double firstNumber;
    private Operator operator;
    private double secondNumber;

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

    void setSecondNumber(double secondNumber) {
        if (this.operator == Operator.DIVISION && secondNumber == 0) {
            throw new IllegalStateException("Divider cannot be equal to 0!");
        }
        this.secondNumber = secondNumber;
    }

    double calculate() {
        return this.operator.calculate(this.firstNumber, this.secondNumber);
    }
}
