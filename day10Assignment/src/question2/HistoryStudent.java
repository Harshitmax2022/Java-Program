package question2;

public class HistoryStudent  extends Student{

	/*historyMarks,
civicsMarks*/
	
	
	
	
	int historyMarks;
	int civicsMarks;
	public HistoryStudent(String name, String address, int historyMarks, int civicsMarks) {
		super(name, address);
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}

	
	
	@Override
	public double getPercentage() {
		
	double total=this.civicsMarks+this.historyMarks;
	
		double percentage = ((total/200)*100);
		System.out.println("Student Name :"+name);
		System.out.println("Student Stram :"+"History Student");
		
		return percentage;
	}
	
}
