package day_118;

public class Q6_Create_a_Math_class_OOPs_in_Java_Constructors_and_Static {
	public static void main(String args[]) {
		Integer radius = 3;
		System.out.println("Area Of Circle of Radius "+radius+" is "+Math.getCircleArea(radius));
	}

}
//Problem Description
//
//Create a class Math with following requirements
//- A class level data member called PI set to 3.14.
//- A class level public method called getCircleArea, 
//which takes as input an integer parameter called radius. This function should return area of the circle as a double
class Math{
	static double PI = 3.14;
	public static double getCircleArea(Integer radius){
		return PI*radius*radius;
	}
}