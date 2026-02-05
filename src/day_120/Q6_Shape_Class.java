package day_120;

public class Q6_Shape_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//Problem Statement
//You are required to implement a Shape class hierarchy for a graphic design toolbox in an application similar to Photoshop. 
//There are three types of shapes: Rectangle, Circle, and Triangle. Each shape has common properties such as positionX, positionY, 
//fillColor, and borderColor, all of which should be declared private, along with methods to calculate area and perimeter for each shape.
//
//The Shape class should be the superclass containing common properties and methods shared by all shapes, with all data members declared private.
//
//The Rectangle class should inherit from Shape and should include additional properties such as width and height, which should also be declared private.
//
//The Circle class should inherit from Shape and should include an additional property radius, which should be declared private.
//
//The Triangle class should inherit from Shape and should include additional properties such as side1, side2, and side3, all of which should be declared private.
//
//Ensure that the constructors initialize all properties correctly, including setting private data members. 
//Use ‘super’ to call the constructor of the shape class and initialize properties - positionX, positionY, fillColor, and borderColor from the child classes.
//
//Implement the getter methods for each attribute in each class including the shape class. The method name should follow as convention 
//like for the width property in rectangle, the method name should be “getWidth()”.
//
//Implement the calculateArea() and calculatePerimeter() methods in each subclass to compute the area and perimeter of the respective shapes. 
//The methods should be declared as abstract inside the shape class.
//
//The shape class should be declared abstract as well.
//
//Instructions
//Implement the classes Shape, Rectangle, Circle, and Triangle as described in the problem statement.
//Ensure proper initialization of properties using the constructor and super keyword, including private data members.
//Implement getter methods following the naming convention.
//Declare the calculateArea() and calculatePerimeter() methods as abstract in the Shape class.
//Hint
//The code for triangle class is already written for your reference.
abstract class Shape  {

    // write code here
    private final int positionX;
    private final int positionY;
    private final String fillColor;
    private final String borderColor;

    public Shape(int positionX, int positionY, String fillColor, String borderColor) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public String getFillColor() {
        return fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}

class Rectangle extends Shape{

    // write code here
    private final int width;
    private final int height;

    public Rectangle(int positionX, int positionY, String fillColor, String borderColor,
                     int width, int height) {
        super(positionX, positionY, fillColor, borderColor);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

}

class Circle extends Shape {

    // write code here
    private final int radius;

    public Circle(int positionX, int positionY, String fillColor, String borderColor, int radius) {
        super(positionX, positionY, fillColor, borderColor);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape {
 private final int side1;
 private final int side2;
 private final int side3;

 public Triangle(int positionX, int positionY, String fillColor, String borderColor, int side1, int side2, int side3) {
     super(positionX, positionY, fillColor, borderColor);
     this.side1 = side1;
     this.side2 = side2;
     this.side3 = side3;
 }

 public int getSide1() {
     return side1;
 }

 public int getSide2() {
     return side2;
 }

 public int getSide3() {
     return side3;
 }

 @Override
 public double calculateArea() {
     // Heron's formula for area of a triangle
     double s = (side1 + side2 + side3) / 2.0;
     return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
 }

 @Override
 public double calculatePerimeter() {
     return side1 + side2 + side3;
 }
}

