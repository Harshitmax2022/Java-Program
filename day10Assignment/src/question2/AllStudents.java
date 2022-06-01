package question2;

import java.util.Scanner;

public class AllStudents {

	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*name: String,
address: String
phisicsMarks,
chemistryMarks,
mathsMarks*/
		System.out.println("Enter Student oF Science Name");
		String name= sc.nextLine();
		
		
		System.out.println("Enter The Student Address");
		String address=sc.nextLine();
		
		System.out.println("Enter the Physics Marks");
		int phyNo= sc.nextInt();
		
		System.out.println("Enter the Chemistry Marks");
		int chemisNo=sc.nextInt();
		
		System.out.println("Enter the Maths Marks");
		int mathNo=sc.nextInt();
		
	
		
		 System.out.println("-------------------------------");
		 sc.nextLine();
		 System.out.println("Enter the History Student Name");
			String name1= sc.nextLine();
			
			System.out.println("Enter The Student Address");
			String address1=sc.nextLine();
			
			System.out.println("Enter the History Marks");
			int history= sc.nextInt();
			
			System.out.println("Enter the Civics Marks");
			int civics=sc.nextInt();
			
			
			
			
			
			ScienceStudent scienceStudent= new ScienceStudent(name, address, phyNo, chemisNo, mathNo);
	         double perc= scienceStudent.getPercentage();
	         System.out.println("*******************************OUTPUT OF SCIENCE************************************");
	  		 System.out.println("Percentage :"+perc+"%");
	        		 
	        		 
	  		HistoryStudent historyStudent= new HistoryStudent(name1, address1, history, civics);
		        		   double percen= historyStudent.getPercentage();
		        		   System.out.println("*******************************OUTPUT HISTORY************************************");
		        		 System.out.println("Percentage :"+percen+"%");
		        		   
		           
		/*name: String,
address: String
historyMarks,
civicsMarks
*/
		
	}
}
