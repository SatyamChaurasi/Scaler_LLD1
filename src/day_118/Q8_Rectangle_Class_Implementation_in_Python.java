package day_118;

public class Q8_Rectangle_Class_Implementation_in_Python {

}
//Problem Statement
//You are tasked with implementing a Python class for representing rectangles. 
//The class should allow initializing rectangles either by providing coordinates or by passing existing rectangle objects for copying.
//
//Your task is to implement a Rectangle class with the following specifications:
//
//Requirements
//The Rectangle class should have the following data members:
//topLeft: A Point object representing the top-left corner of the rectangle.
//bottomRight: A Point object representing the bottom-right corner of the rectangle.
//The Rectangle class should have one constructor:
//__init__: This constructor should accept a variable number of arguments (*args). 
//It should initialize the rectangle either by providing two Point objects representing the top-left and bottom-right corners, 
//four integer coordinates representing the top-left and bottom-right corners, or a single Rectangle object for copying.
//Instructions
//Implement the Rectangle class according to the specified requirements.
//Ensure that the class contains the specified data members and constructor.
//Implement the constructor to initialize the rectangle based on the provided arguments.
//Ensure that the constructor handles different argument combinations correctly.

//Solution

//import copy

//from config.point import Point
//
//
//class Rectangle:
//    def __init__(self, *args):
//        """
//        Initialize a Rectangle object.
//
//        Args:
//            *args: Variable number of arguments. The constructor can be called in three ways:
//                - With two Point objects representing the top-left and bottom-right corners.
//                - With four integers representing the x and y coordinates of the top-left and bottom-right corners.
//                - With a single Rectangle object for copying.
//
//        Raises:
//            ValueError: If invalid arguments are provided.
//        """
//        # Case 1: Copy constructor
//        if len(args) == 1 and isinstance(args[0],Rectangle):
//            other = args[0]
//            self.topLeft = copy.deepcopy(other.topLeft)
//            self.bottomRight = copy.deepcopy(other.bottomRight)
//
//        # Case 2: Two Point objects
//        elif len(args) == 2 and all(isinstance(arg, Point) for arg in args):
//            self.topLeft = copy.copy(args[0])
//            self.bottomRight = copy.copy(args[1])
//        
//        # Case 3: Four integer coordinates
//        elif len(args) == 4 and all(isinstance(arg, int) for arg in args):
//            x1,y1,x2,y2 = args
//            self.topLeft = Point(x1,y1)
//            self.bottomRight = Point(x2,y2)
//
//        else:
//            raise ValueError("Invalid Arguments")


//import copy
//
//
//class Point:
//    def __init__(self, x, y):
//        self.x = x
//        self.y = y
//
//    def __eq__(self, other):
//        return isinstance(other, Point) and self.x == other.x and self.y == other.y
//
//    def __str__(self):
//        return f"({self.x}, {self.y})"
//
//    def __copy__(self):
//        # Create a new instance of Point with the same coordinates
//        return Point(self.x, self.y)
//
//    def __deepcopy__(self, memo):
//        # Create a new instance of Point with deep copies of coordinates
//        return Point(copy.deepcopy(self.x, memo), copy.deepcopy(self.y, memo))

