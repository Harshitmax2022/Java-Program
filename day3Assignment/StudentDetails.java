package day3Assignment;

public class StudentDetails {
  
	int rollNo;
	String name;
	int marks;
	
	void displayStudentDetails(int rollNo , String name , int marks) {
		System.out.println("Name"+"="+name);
		System.out.println("RollNo"+"="+rollNo);
		System.out.println("Marks"+"="+marks);
	}
	
	public static void main(String[] argus) {
		
		StudentDetails d1=new StudentDetails();
		  
		d1.rollNo=19;
		d1.name="Harshit";
		d1.marks=394;
		
		d1.displayStudentDetails(d1.rollNo,d1.name,d1.marks);
		
	}
}
