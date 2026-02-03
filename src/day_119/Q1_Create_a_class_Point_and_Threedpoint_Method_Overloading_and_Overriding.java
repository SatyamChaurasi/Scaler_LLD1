package day_119;

public class Q1_Create_a_class_Point_and_Threedpoint_Method_Overloading_and_Overriding {
//	Create a set of class with following requirements:
//
//
//		a. Create a class Point
//
//		It should have two data members
//		x : int
//		y : int
//		It should have a display method that prints in following format - “[<<x>>, <<y>>]”
//		x and y should be protected and display should be public
//
//		b. Create another class ThreedPoint which extends the Point class
//
//		It should have the following data members: z : int
//		It should have a display method to override the parent’s display method which prints in following format - “[<<x>>, <<y>>, <<z>>]”
//		z should be private and display should be public.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point threadPoint = new ThreadPoint(10,20,15);
		threadPoint.display();
	}
}

class ThreadPoint extends Point {
	private int z;
	
	public int getX() {
		return super.getX();
	}

	public int getY() {
		return super.getY();
	}
	
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	public ThreadPoint() {}
	public ThreadPoint(int x,int y,int z) {
		super(x,y);
		this.z = z;
	}

	public void display() {
		System.out.println("["+getX()+", "+getY()+", "+z+"]");
	}
} 


class Point{
	protected int x;
	protected int y;
	
	public void display() {
		System.out.println("["+x+", "+y+"]");
	}

	public Point() {}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
