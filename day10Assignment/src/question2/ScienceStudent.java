package question2;

public class ScienceStudent  extends Student{

	/*phisicsMarks,
chemistryMarks,
mathsMarks*/
	
	
	int phiscsMarks;
	
	int chemistryMarks;
	int mathsMarks;
	
	
	
	public ScienceStudent(String name, String address, int phiscsMarks, int chemistryMarks, int mathsMarks) {
		super(name, address);
		this.phiscsMarks = phiscsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}



	@Override
	public double getPercentage() {
		
		double total=this.phiscsMarks+this.chemistryMarks+this.mathsMarks;
	
		double percentage = ((total/300)*100);
		
		System.out.println("Student Name :"+name);
		System.out.println("Student Stram :"+"Science Student");
		return percentage;
	}
	
}
