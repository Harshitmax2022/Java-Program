package question2;

import java.util.Scanner;

public class UserRegistration {
        
	    public void registerUser( String username,String userCountry) throws InvalidCountryException {

		if(userCountry.equals("India")) {
		
			System.out.println(username+":"+"User registration done successfully");
		}
		else {
			
			throw  new  InvalidCountryException("User Outside India cannot be registered");
		}
	    }
	
	public static void main(String[] args) {
		  
		UserRegistration registration= new UserRegistration();
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter Your Name");
		String name= scanner.nextLine();
		
		
		System.out.println("Enter Your Country Name");
		String country= scanner.nextLine();
		
		try {
			registration.registerUser(name, country);
			
		} catch (InvalidCountryException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
