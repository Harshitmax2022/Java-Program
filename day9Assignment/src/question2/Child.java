package question2;

import java.util.Scanner;

final public class Child extends Parent {

	 
	 
	 
	Child(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}

	@Override
	void	method1() {
		if(i>0 && i<11) {
			 System.out.println("Number :"+i);
		}
		
		  System.out.println("method1 inside the Child Class");
	  }
	
	void method4() {
		System.out.println("method4 inside the child Class");
	}
	
  public static void main(String[] args) {
	
	  Scanner sc= new Scanner(System.in);
	  
	  
	  System.out.println("Enter Number");
	   int num=sc.nextInt();
	   
	   if(num>0 && num<11) {
		   Parent parent = new Child(num);
		   
		   parent.method1();
		   parent.method2();
		   parent.method3();
		   
		   ((Child)parent).method4();
	   }
	   else {
		   
		   Parent parent = new Child(0);
			  System.out.println("Invalid Number");
		   parent.method1();
		   parent.method2();
		   parent.method3();
		   ((Child)parent).method4();
	   }
	  
		
}
	
}
