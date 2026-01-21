package day_118;

public class Q5_Create_a_student_Class_OOPs_in_Java_Constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
//	Create a class Student with following requirements
//
//	Two data members
//	age : int
//	name : String
//	Four constructors
//	Default constructor : Should set age to 0 and name to null
//	Constructor with int parameter : Should set age to the passed parameter and name to null
//	Constructor with String parameter : Should set name to the passed parameter and age to 0
//	Constructor with two parameters - int and String : Should set the age to int parameter and name to String parameter
//	The assignment code should only be in the 4th constructor. 
//	The top 3 constructors should use telescoping to invoke the 4th constructor.
}
class Student{
	int age;
	String name;
//	Default constructor 
	public Student() {
//		this.age = 0;
//		this.name = null;
		this(0,null);
	}
//	Constructor with int parameter
	public Student(int age) {
//		this.age = age;
//		this.name = null;
		this(age,null);
	}
//	Constructor with String parameter
	public Student(String name) {
//		this.age = 0;
//		this.name = name;
		this(0,name);
	}
//	Constructor with two parameters
//	The top 3 constructors should use telescoping to invoke the 4th constructor.
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
}
