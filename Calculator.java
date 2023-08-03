import java.util.Scanner;

public class Calculator {
	
	private static boolean continueCalculation = true;

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("**** WellCome To My Calculator ****");
		System.out.println("===================================");
		System.out.println();
		while (continueCalculation) {
		
		System.out.println("Please enter first number : ");
		double num1 = sc.nextDouble();
		System.out.println("Please enter second number : ");
		double num2 = sc.nextDouble();
		System.out.println();
		
		System.out.println("Choose an operation");
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Division");
		System.out.println("4. Multiplication");
		System.out.println("5. power of a number");
		
		int operation = sc.nextInt();
		double result;
		switch (operation) {
		case 1:
			result = num1+num2;
			break;
		case 2:
			result = num1-num2;
			break;
		case 3:
			result = num1/num2;
			break;
		case 4:
			result = num1*num2;
			break;
		case 5:
			result = Math.pow(num1, num2);
			break;
		default:
			System.out.println("Invalid operation!");
			return;
		}
		System.out.println("The Result is : "+result);
		System.out.println("Do you want to continue calculation? (yes/no)");
		String answer = sc.next();
		
		if(answer.equals("no")) {
			continueCalculation = false;
			}
		}
	
	}

}
