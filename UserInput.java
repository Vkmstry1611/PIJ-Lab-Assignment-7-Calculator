import java.util.*;

class UserInput{


    // Method to get two numbers from the user for operations like addition, subtraction, etc.
    public int[] getTwoNumbers() {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[2];

        try {
            System.out.println("Enter First Number: ");
            numbers[0] = scan.nextInt();

            System.out.println("Enter Second Number: ");
            numbers[1] = scan.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid integers.");
            scan.nextLine();  // Clear the buffer
        }

        return numbers;
    }

    // Method to get a single number (for square, cube, square root operations)
    public int getSingleNumber() {
        Scanner scan = new Scanner(System.in);
        int number = 0;

        try {
            System.out.println("Enter a number: ");
            number = scan.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }

        return number;
    }
    
     // Method to display the menu and get the user's choice for calculation
    public int getCalculationChoice() {
        Scanner scan = new Scanner(System.in);
        int choice = 0;

        try {
            System.out.println("Select an operation: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square");
            System.out.println("6. Cube");
            System.out.println("7. Square Root");

            choice = scan.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid choice. Please enter a valid number between 1 and 7.");
        }

        return choice;
    }
  
}
    
