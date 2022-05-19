package day4Assignment;

public class Demo {

	
  public Demo(){
		System.out.println("it is a part of Demo()");
	}
  public Demo(String s) {
	  System.out.println("it is a part of Demo(String s)");
	  
  }
  public Demo(int i) {
	  System.out.println("it is a part of Demo(int i)");
  }
  public Demo(float f) {
	  System.out.println("it is a part of Demo(float f)");
  }
  
  public static void main(String[] argus) {
	 Demo d1=new Demo();
	 Demo d2=new Demo("Hari");
	 Demo d3=new Demo(10);
	 Demo d4=new Demo(20f);
	 
	 
	 
}
}
