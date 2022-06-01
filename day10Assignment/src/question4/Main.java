package question4;

public class Main {

	
	
	public static void main(String[] args) {
		
		Area area= new Area();
		
		int areaOfRect=area.rectangleArea(5, 12);
		int areaOfSqu= area.squareArea(5);
		int areOfCir=area.circleArea(12);
		
		System.out.println("Area of Rectangle :"+" "+areaOfRect);
		System.out.println("Area of Square :"+" "+areaOfSqu);
		System.out.println("Area of Circle :"+" "+areOfCir);
	}
}
