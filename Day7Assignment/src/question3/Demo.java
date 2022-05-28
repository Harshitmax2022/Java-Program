package question3;

public class Demo {
   
	
	private int total;

	
 public	Demo(){
		
	}
	
	
	public int getTotal() {
		return total;
	}

	
	//What is the use of ‘this’ keyword
	

	public void setTotal(int total) {
	
		// if is this method i don't give this.total then the total is pointing to the local variable 
		// i.e parameter and then it just going to equal his one value 
		// to catch the  class variable i need to right this.total means its pointing to class object
		
		this.total = total;
	}
	
	
	
}
