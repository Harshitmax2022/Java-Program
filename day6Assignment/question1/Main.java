package question1;
  import java.util.Scanner;
public class Main {

	public static String reversString(String input){
		//write the logic
		
	  	String s="";
	  	for(int i=input.length()-1; i>=0; i--) {
	  		s +=input.charAt(i);
	  	}
		
		
		
		return s;
	
		}
		public static void main(String[] args){
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a String to reverse");
			String orignalString = sc.next();
			String result =Main.reversString(orignalString);
			System.out.println("Original String is :"+ orignalString);
			System.out.println("Reversed String is :"+ result);
		}
		}
	
	
	
}
