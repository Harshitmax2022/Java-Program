package question2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the model of mobile");
       
       String mob= sc.nextLine();
       
		Mobile mobile= new Mobile();
		
		mobile.searchOutdatedModel(mob);
		
	}
	
}
