package day3Assignment;

public class CheckWeather {

	boolean isSnowing=false;
	boolean isRaining=false;
	
	void checkingCondition(String data1, double tempo) {
		
		
	       if(data1=="its raining") {
	    	   isRaining=true;
	    	   System.out.println("Let's stay home");
	       }
	       else if(data1=="its snowing") {
	    	   isSnowing=true;
	    	   System.out.println("Let's stay home");
	       }
	       else if(tempo <50) {
	    	   System.out.println("Let's stay home");
	       }else {
	    	   System.out.println("Let's go out!");
	       }
		}
	
	
	public static void main(String[] argu) {
		String data1="its raining";
		double tempo=60.0;
		
		CheckWeather d1=new CheckWeather();
		
		d1.checkingCondition(data1,tempo);
		
	}
}

