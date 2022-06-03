package question2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {

	public boolean validate(String name, String mobileNum, String aadharCard) {
		
		boolean na=Pattern.matches("[a-zA-Z]{3,8}",name);
		boolean mob=Pattern.matches("[0-9]{12}", mobileNum);
		boolean aadh=Pattern.matches("[6,7,8,9]{1}[0-9]{9}", aadharCard);
		if(na==false) {
			System.out.println("Enter valid Name");
			return false;
		}
		else if(mob==false) {
			System.out.println("Enter valid mobile Number");
			return false;
		}
		else if(aadh==false) {
			System.out.println("Enter valid addhar Number");
			return false;
			
		}
		else {
			
			
			return true;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Name");
		String name=sc.nextLine();
		
		System.out.println("Enter the Mobile Number");
		String mobile=sc.nextLine();
		
		System.out.println("Enter the Adhar Number");
		String adhar=sc.nextLine();
		
		Demo demo = new Demo();
		
		boolean res=demo.validate(name,mobile,adhar);
		
		if(res) {
			Citizen citizen = new  Citizen(name,mobile,adhar);
			
			System.out.println("-----------------------------------------");
			System.out.println("Name :"+citizen.getName());
			System.out.println("Mobile :"+citizen.getMobileNumber());
			System.out.println("Adhar :"+citizen.getAdharNumber());;
		}
		
		
	}
}
