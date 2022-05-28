package question2;

 public class Parent {
  
	 final int i;
	 
	 Parent(int i){
		 this.i=i;
		
	 }
	    
	
	
  void	method1() {
	  System.out.println("Number :"+i);
	  System.out.println("method1 inside the Parent Class");
  }
	final  void method2() {
		System.out.println("method2 inside the Parent Class");
	}
	
	void method3() {
		System.out.println("method3 inside the Parent Class");
	}
}
