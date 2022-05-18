package day2Assignment;

public class Sum {
	static void myMethod(int number) {
		int result= (number*(number+1))/2;
		System.out.println(result);
	}
	public static void main(String[] argu) {
		myMethod(5);
	}
}
