package question1;

public interface X {

	void funA();
	
	default void start() {
	System.out.println("in the interface of X and default method Start");
	}
	
	public static void start2() {
		
	System.out.println("in the interface of X and static method Start2");
	}
	
}
