


# Java Calculator Application

Name : `Vidish Ketankumar Mistry`
PRN : `23070126146`
Batch : `B-3`


This project is a simple Java-based calculator that supports several mathematical operations. The application is divided into three Java files, each focusing on specific functionalities. Below is a detailed description of each class, its methods, and their purposes.

## Files Breakdown

### 1. **UserInput.java**
This class handles all user interactions, including taking input for numbers and selecting operations. It ensures the validity of the user inputs.

#### Methods in `UserInput.java`:

- **`getTwoNumbers()`**
  - **Purpose**: Prompts the user to input two integers. This method is used for operations like addition, subtraction, multiplication, and division.
  - **Input**: Takes two integer values from the user.
  - **Returns**: An array of two integers (`int[]`), where `numbers[0]` is the first number and `numbers[1]` is the second number.
  - **Exception Handling**: Catches invalid input using a `try-catch` block to handle `InputMismatchException`.

- **`getSingleNumber()`**
  - **Purpose**: Prompts the user to input a single integer. This method is used for operations like square, cube, and square root.
  - **Input**: Takes one integer value from the user.
  - **Returns**: An integer value representing the number entered by the user.
  - **Exception Handling**: Catches invalid input using a `try-catch` block to handle `InputMismatchException`.

- **`getCalculationChoice()`**
  - **Purpose**: Displays a menu of available operations and asks the user to select one.
  - **Input**: Takes the user’s selection (an integer between 1 and 7) corresponding to the operation.
  - **Returns**: An integer representing the user's choice (1 for Addition, 2 for Subtraction, etc.).
  - **Exception Handling**: Catches invalid choices and prompts the user to select again in case of incorrect input.

---

### 2. **Calculator.java**
This class contains methods that perform the actual calculations for each operation. It uses basic mathematical formulas and exception handling to ensure proper execution.

#### Methods in `Calculator.java`:

- **`addition(int[] numbers)`**
  - **Purpose**: Adds two numbers.
  - **Input**: An array of two integers, `numbers[0]` and `numbers[1]`.
  - **Returns**: The sum of the two integers as an `int`.

- **`subtraction(int[] numbers)`**
  - **Purpose**: Subtracts the second number from the first.
  - **Input**: An array of two integers, `numbers[0]` and `numbers[1]`.
  - **Returns**: The result of `numbers[0] - numbers[1]` as an `int`.

- **`multiplication(int[] numbers)`**
  - **Purpose**: Multiplies two numbers.
  - **Input**: An array of two integers, `numbers[0]` and `numbers[1]`.
  - **Returns**: The product of the two integers as an `int`.

- **`division(int[] numbers)`**
  - **Purpose**: Divides the first number by the second.
  - **Input**: An array of two integers, `numbers[0]` (numerator) and `numbers[1]` (denominator).
  - **Returns**: The result of the division as a `double`.
  - **Exception Handling**: Throws an `ArithmeticException` if the denominator is zero.

- **`square(int number)`**
  - **Purpose**: Calculates the square of a number.
  - **Input**: A single integer `number`.
  - **Returns**: The square of the number as an `int` (`number * number`).

- **`cube(int number)`**
  - **Purpose**: Calculates the cube of a number.
  - **Input**: A single integer `number`.
  - **Returns**: The cube of the number as an `int` (`number * number * number`).

- **`squareRoot(int number)`**
  - **Purpose**: Calculates the square root of a number.
  - **Input**: A single integer `number`.
  - **Returns**: The square root of the number as a `double`.
  - **Exception Handling**: Throws an `IllegalArgumentException` if the number is negative, as the square root of a negative number is undefined in the real number system.

---

### 3. **Main.java**
This is the main class that runs the calculator application. It interacts with the user, invokes the appropriate methods from the `UserInput` and `Calculator` classes, and displays the result.

#### Main Logic:

- **`main(String[] args)`**
  - **Purpose**: The entry point for the program. It controls the flow of the program and handles user interactions.
  - **Steps**:
    - A `while (true)` loop is used to continually prompt the user until they choose to exit the program (if implemented).
    - Displays the operation menu by calling `getCalculationChoice()` from `UserInput`.
    - Based on the user’s choice, it calls the corresponding method in the `Calculator` class to perform the calculation.
    - It handles various exceptions (e.g., division by zero, invalid input) by using `try-catch` blocks.

---
