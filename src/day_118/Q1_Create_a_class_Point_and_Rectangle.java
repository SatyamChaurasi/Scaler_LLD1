package day_118;

public class Q1_Create_a_class_Point_and_Rectangle {

//	Create a set of classes to meet the following requirements:
//
//		a. Class Point
//		It should have 2 data-members: x and y.
//		Add a constructor with two parameters: x and y.
//		Add a copy constructor.
//		b. Class Rectangle
//		It should have 2 data-members:
//
//		topLeft (Point)
//		bottomRight (Point)
//		Add a constructor with 4 parameters of type int: topLeftX, topLeftY, bottomRightX, bottomRightY.
//
//		Add a constructor with 2 parameters of type Point: topLeft, bottomRight.
//
//		Add a constructor with 1 parameter of type Rectangle.
//
//		Make sure that Rectangle constructors make deep copies.
	public static void main(String[] args) {
		
		
	}
}
class Rectangle {
	private Point topLeft;
	private Point bottomRight;
	
//	constructor with 1 parameter of type Rectangle
	public Rectangle(Rectangle rec) {
		this.topLeft = new Point(rec.topLeft);
		this.bottomRight = new Point (rec.bottomRight);
	}
//	constructor with 2 parameters of type Point: topLeft, bottomRight
	public Rectangle(Point topLeft, Point bottomRight) {
		this.topLeft = new Point(topLeft);
		this.bottomRight = new Point(bottomRight);
	}
//	constructor with 4 parameters of type int: topLeftX, topLeftY, bottomRightX, bottomRightY
	public Rectangle(int topLeftX,int topLeftY, int bottomRightX, int bottomRightY) {
		this.topLeft = new Point(topLeftX,topLeftY);
		this.bottomRight = new Point(bottomRightX,bottomRightY);
	}
	
} 

class Point {
	private int x;
	private int y;
	
	public Point() {
		
	}
	//Parameter Constructor 
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
	//Copy Constructor
	public Point(Point p) {
		this.x = p.x;
		this.y = p.y;
	}
	
	public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
