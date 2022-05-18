package day2Assignment;

public class CricketScore {
	static void myMethod(int one ,int two , int three , int four , int six ) {
		  int total=1*one+2*two+3*three+4*four+6*six;
		  System.out.println(total);
	  }
	  
	  public static void main(String[]argu) {
		myMethod(3,5,6,20,4);
	  }
}
