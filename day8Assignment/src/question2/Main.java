package question2;

public class Main {

	
	/*ClassCast Exception in Java is one of the unchecked exceptions that occur
	 *  when we try to convert one class type object into another class type.
      ClassCast Exception is thrown when we try to cast an object of the parent class to the child class object.
      However, it can also be thrown when we try to convert the objects of two individual classes that don't have any relationship between them.*/
	
	
	
	public static void main(String[] args) {  
		// TODO Auto-generated method stub  
		Dog dog = new Dog("black");  
		Animal animal = new Animal("White");  
		animal = dog;  
		animal.show("My dog");  
		  
		Animal animal1 = new Animal("White");  
		Dog d = ((Dog)animal1);  
		}  


}
