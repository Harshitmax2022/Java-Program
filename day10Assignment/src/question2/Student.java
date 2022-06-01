package question2;

 abstract class Student {
/*
 * name: String,
address: String*/
	 
	 String name;
	 String address;
	 
	 
	Student(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}


public	abstract double getPercentage();
}
