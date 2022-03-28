package homework8rashila;

/*
18. Sum Calculator
Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with
names firstNumber and secondNumber both of type double.
 */
public class Program18SimpleCalculator {
    //    instance variables with names firstNumber and secondNumber both of type double.
    private double firstNumber;
    private double secondNumber;

    // getFirstNumber instance method without any parameters,
    public double getFirstNumber() {
        return firstNumber;
    }

    //getSecondNumber instance method without any parameters
    public double getSecondNumber() {
        return secondNumber;
    }

    //setFirstNumber instance method with one parameter of type double
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    //setSecondNumber instance method with one parameter of type double
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    // getAdditionResult instance method without any parameters
    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    // getSubtractionResult instance method without any parameters,
    public double getsubtraction() {
        return firstNumber - secondNumber;
    }

    //getMultiplicationResult instance method without any parameters
    public double getMultiplication() {
        return firstNumber * secondNumber;
    }

    //getDivisionResult instance method without any parameters
    public double getDivisionResult() {
        if (secondNumber == 0) {
            return this.secondNumber = 0;
        } else {
            return this.firstNumber / secondNumber;
        }
    }

    public static void main(String[] args) {
        Program18SimpleCalculator calculator = new Program18SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add = " + calculator.getAdditionResult());
        System.out.println("Substract = " + calculator.getsubtraction());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multipy = " + calculator.getMultiplication());
        System.out.println("Divide  = " + calculator.getMultiplication());
    }
}

