package question4;

public class Area extends Shape {

	@Override
	public int rectangleArea(int length, int breadth) {
		int areaOfRect= length*breadth;
		
		return areaOfRect;
	}

	@Override
	public int squareArea(int side) {
		int areaOfSq= side*4;
		return areaOfSq;
	}

	@Override
	public int circleArea(int radius) {
		 int areaOfCircle= (int)3.14*radius*radius;
		return areaOfCircle;
	}

}
