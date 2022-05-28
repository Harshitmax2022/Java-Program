package question1;


public class Student {

	
	private int roll;
	private String name;
	private int marks;
	private char grade;
	
     
	
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	
	 public void displayDetails(int roll , String name, int marks) {
		 
		   this.roll= roll;
		   this.name=name;
		   this.marks=marks;
          	this.grade=calculateGrade();	 
	   }
	private char calculateGrade() {
		
		  int totalmarks=this.marks;
		  
		  if(totalmarks >= 500) {
			  return 65;
		  }
		  else if(totalmarks  < 500  && totalmarks >=400) {
			  return 66;
		  }
		  else {
			  return 67;
		  }
	}
	
	
	@Override
	public String toString() {
		return "Student [RollNumber=" + getRoll() + ", Name=" + getName()  + ", Marks=" + getMarks() + ", Grade=" + getGrade() + "]";
	}
	
	
}
