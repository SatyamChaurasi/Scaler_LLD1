package day_117;

public class Q2_Create_related_classes_1_Point_and_Rectangle {
//	Create a class Point. It should have 2 data-members
//
//	x : int
//	y : int
//	Create a class Rectangle. It should have 3 data-members
//
//	topLeft:Point
//	height:int
//	width:int
//	It should have 3 methods
//
//	getArea: It should return area of rectangle as an integer
//	getPerimeter: It should return perimeter of rectangle as an integer
//	getBottomRight: It should return a Point to represent the bottom right of the Rectangle.

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Point point = new Point(1,1);
		Rectangle rec = new Rectangle(point,3,4);
		System.out.println("Area "+rec.getArea());
		System.out.println("Perimeter "+rec.getPerimeter());
		System.out.println("Bottom Right "+rec.getBottomRight().toString());

	}

}

class Point {
	public int x;
	public int y;
	
	public Point() {}
	
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}

class Rectangle{
	public Point topLeft;
	public int height;
	public int width;
	
	public Rectangle() {}
	
	public Rectangle(Point topLeft,int height,int width) {
		this.topLeft = topLeft;
		this.height = height;
		this.width = width;
	}
	
	public Integer getArea() {
		return height*width;
	}
	
	public Integer getPerimeter() {
		return 2*(height+width);
	}
	
	public Point getBottomRight() {
		int bottomRightX = this.topLeft.x + width;
		int bottomRightY = this.topLeft.y - height;
		return new Point(bottomRightX,bottomRightY);
	}
}