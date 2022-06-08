package question3;

public class ConceptFinal {

	// Final is a keyword which is used to fix the member permanently
	/*1. if we use final keyword in field then its value never going to be change
	 * 2. if We can declare a method as final, once you declare a method final it cannot be overridden.
	 *  So, you cannot modify a final method from a sub class.
 	 *3. if we make a class as a final then we can't extend it also 
 	 */
	
	final int value =20;
	
	public final void func() {
		System.out.println("it never going to be override");
	}
	
}

 final class seco{
  
	 // this can not be extend in its subclass.
}
