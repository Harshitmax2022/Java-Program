package question1;

import java.util.Scanner;

public class Demo {

  
	public static void main(String[] argus) {

		  Scanner sc= new Scanner(System.in);
		  int i=1;
		  while(2>=i) {
			  Student student=new Student();
			  
			  
			  System.out.println("Enter the Student Roll No");
			    int roll= (sc.nextInt());
			  
			  sc.nextLine();
			  System.out.println("Enter the Student Name");
			    String name=(sc.nextLine());
			  
			  System.out.println("Enter the Student Marks");
			   int marks= (sc.nextInt());
			  
			  student.displayDetails(roll,name,marks);
			  System.out.println(student);
			  
			  System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
			  System.out.println("                                                  ");
			  
			    
			  i++;
		  }
	}
	
}
