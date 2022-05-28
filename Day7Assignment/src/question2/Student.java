package question2;

public class Student {

	
	private int	studId;
	private String	studName;
	private double	examFee;
	 
	 
	 public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public double getExamFee() {
		return examFee;
	}
	public void setExamFee(double examFee) {
		this.examFee = examFee;
	}
	void  displayDetails(){
		 
		 System.out.println("StuID :"+studId);
		 System.out.println("StudName :"+studName);
	 }
	 double payFee(double otherfee, double paid){
		  
		 double totalfee= otherfee+ examFee;
		 double result=totalfee-paid;
		 if(result<0) {
			
			 return 0;
		 }
		 return result;
	 }
	
}
