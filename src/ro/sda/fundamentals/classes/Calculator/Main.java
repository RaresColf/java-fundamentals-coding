package ro.sda.fundamentals.classes.Calculator;

public class Main {
    public static void main(String[] args) {

        //aici am folosit setterele ca sa dam valori
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5);
        calculator.setSecondNumber(10);
        double result = calculator.getDivisionResult();
        System.out.println(" Division result is " + result);
        int result1 = (int) calculator.getAdditionResult();
        System.out.println(" Addition result is " + result1);
        double result2 = calculator.getSubtractionResult();
        System.out.println(" Subtraction result is " + result2);

        // aici nu am mai folosit setterle, am dat valori direct constructorului

        SimpleCalculator anotherCalculator = new SimpleCalculator(8.7, 1.2);
        double anotherResult = anotherCalculator.getDivisionResult();
        System.out.println(" Division result is: " + anotherResult);
        double anotherResult2 = anotherCalculator.getAdditionResult();
        System.out.println(" Addition result is: " + anotherResult2);
        double anotherResult3 = anotherCalculator.getSubtractionResult();
        System.out.println(" Substraction result is: " + anotherResult3);


    }
}
