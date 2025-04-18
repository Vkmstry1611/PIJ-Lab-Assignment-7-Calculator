import java.util.*;

class UserInput{


	//return int datatype array

	int[] userInput(){

		Scanner scan = new Scanner(System.in);
		
		int[] numbers = new int[2];

		System.out.println("Enter First Number : ");
		numbers[0] = scan.nextInt();
		
		System.out.println("Enter Second Number : ");
		numbers[1] = scan.nextInt();


		return numbers;
		
		
	}
    
    
x}