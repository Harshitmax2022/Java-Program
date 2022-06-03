package question1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	
	
	try {
		System.out.println("start of main..");
		Scanner sc= new Scanner(System.in);
		System.out.println("Entry the number1");
		int num1= sc.nextInt();
		System.out.println("Entry the number2");
		int num2=sc.nextInt();
		
		String message = null;
		int num3 = num1 / num2;
		if(num3 > 10){
		message = "Welcome to Exception Handling ";
		}
		System.out.println("Message is :"+message.toUpperCase());
				
	} catch (InputMismatchException e) {
		System.out.println("Please enter valid number");
	}catch(ArithmeticException e) {
		System.out.println("num2 should not be 0 ");
	}catch(NullPointerException e) {
		System.out.println("String value is null");
	}
	catch (Exception e) {
   System.out.println("Message is :WELCOME TO EXCEPTION HANDLING");
	}
	System.out.println("end of main");
	
	}
}
