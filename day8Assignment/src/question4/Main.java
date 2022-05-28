package question4;

public class Main {

	
	
	public static void main(String[] args){
		
		Animal[] animal=new Animal[3];
		
		animal[0]=new Cat();
		animal[1]=new Dog();
		animal[2]=new Tiger();
		
		
		
		//create an array of Animal class with size 3
		//initialize all 3 elements of this Animal class
		//with Dog, Cat and Tiger class object.
		//call the all methods (eat,walk,makeNoise) from all
		//the 3 objects.
		
		
		for(Animal ani :animal) {
			
			ani.eat();
			ani.walk();
			ani.makeNoise();
			
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		}
		}
}
