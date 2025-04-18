public class Calculator {

        // Addition of two numbers
    public int addition(int[] numbers) {
        return numbers[0] + numbers[1];
    }

        // Subtraction of two numbers
    public int subtraction(int[] numbers) {
        return numbers[0] - numbers[1];
    }
    // Multiplication of two numbers
    public int multiplication(int[] numbers) {
        return numbers[0] * numbers[1];
    }

    // Division of two numbers with exception handling for division by zero
    public double division(int[] numbers) throws ArithmeticException {
        if (numbers[1] == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return (double) numbers[0] / numbers[1];
    }

    // Square of a number
    public int square(int number) {
        return number * number;
    }

    // Cube of a number
    public int cube(int number) {
        return number * number * number;
    }

    // Square root of a number with exception handling for negative numbers
    public double squareRoot(int number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot compute the square root of a negative number.");
        }
        return Math.sqrt(number);
    }
}