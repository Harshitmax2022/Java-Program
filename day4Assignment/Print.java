package day4Assignment;

public class Print {
   
	public void check(int value) {
		if(value%2==1) {
			System.out.println("value"+"="+value);
		}
		else if(value%2==0 && value>0) {
			int reminder=value%10;
			int subtract=10-reminder;
			int result=value+subtract;
			System.out.println("value"+"="+result);
		}
		else if(value<0) {
			System.out.println("error");
		}
	}
	
	public static void main(String[] argus) {
		
		Print d1=new Print();
		
		d1.check(5);
		d1.check(22);
		d1.check(-4);
	}
}
