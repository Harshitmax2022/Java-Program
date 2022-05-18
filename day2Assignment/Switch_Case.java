package day2Assignment;

public class Switch_Case {

	static void myMethod(String city) {
		 switch(city) {
		 case "Harshit" : System.out.println("Financial city");
		          break;
		 case "Kolkata" : System.out.println("City of Joy");
		          break;
		 case "Delhi" :System.out.println("Capital of the country");
		          break;
		 case "Bangalore" :System.out.println("Cyber City");
		          break;
		 default :System.out.println("May be Other Indian City");
		          break;
		 }
		
	 }
	 
	 public static void main(String[] args) {
		myMethod("Delhi");
	}
}
