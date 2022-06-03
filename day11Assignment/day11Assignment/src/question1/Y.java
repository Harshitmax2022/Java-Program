package question1;

public interface Y {

void funA2();
	
	default void start3() {
	System.out.println("in the interface of Y and default method Start3");
	}
	
	public static void start4() {
		
	System.out.println("in the interface of Y and static method Start4");
	}
	
}
