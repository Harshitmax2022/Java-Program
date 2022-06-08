package question3;

public class ConceptFinally {

	// finally keyword is a type of block where inside that 
	// we can write some statement which is compulsary to exceute 
	// either the exception occor or not 
	
	
	public static void main(String[] args) {
		
		int value =20;
		int value2=0;
		
		try {
		  double result = value/value2;
		  System.out.println(result);
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("this is the finally block which is going to be exceute "
					+ "whatevert the situation was occor it will going to be exceute definatly");
		}
	}
	
	
}
