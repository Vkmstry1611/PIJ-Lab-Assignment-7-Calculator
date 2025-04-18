import java.util.InputMismatchException;

public class Main{

    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        Calculator calculator = new Calculator();

        while (true) {
            int choice = userInput.getCalculationChoice();
            try {
                switch (choice) {
                    case 1: // Addition
                        int[] addNumbers = userInput.getTwoNumbers();
                        System.out.println("Result: " + calculator.addition(addNumbers));
                        break;

                    case 2: // Subtraction
                        int[] subNumbers = userInput.getTwoNumbers();
                        System.out.println("Result: " + calculator.subtraction(subNumbers));
                        break;

                    case 3: // Multiplication
                        int[] mulNumbers = userInput.getTwoNumbers();
                        System.out.println("Result: " + calculator.multiplication(mulNumbers));
                        break;

                    case 4: // Division
                        int[] divNumbers = userInput.getTwoNumbers();
                        try {
                            System.out.println("Result: " + calculator.division(divNumbers));
                        } catch (ArithmeticException e) {
                            System.out.println(e.getMessage());
                        }
                        break;

                    case 5: // Square
                        int squareNumber = userInput.getSingleNumber();
                        System.out.println("Result: " + calculator.square(squareNumber));
                        break;

                    case 6: // Cube
                        int cubeNumber = userInput.getSingleNumber();
                        System.out.println("Result: " + calculator.cube(cubeNumber));
                        break;

                    case 7: // Square Root
                        int sqrtNumber = userInput.getSingleNumber();
                        try {
                            System.out.println("Result: " + calculator.squareRoot(sqrtNumber));
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                        break;

                    default:
                        System.out.println("Invalid choice. Please select a number between 1 and 7.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }
}