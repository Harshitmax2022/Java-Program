package day3Assignment;

public class StaticAndNonSatic {

	//Static - static element is that element which we can access directly inside the main method without creating 
	//creating any object
	
	// non-Static - non-static elements are instance variable i.e those element which we can not directly in main method, we should have to 
	// have to create a object to access that variable 
	
	int rank=23; //non-static element or instance variable
	
  public static void main(String[] argus) {
	
	  int myRank=19; // static variable 
	    System.out.println(myRank);
	    
	    // to access the non- static elements we need to create a object
	    
	StaticAndNonSatic d1= new StaticAndNonSatic();
	   System.out.println(d1.rank);
	    
	  
	   
}
	
}

