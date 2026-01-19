package day_117;

public class Q1_Create_a_basic_class_Student {
//	Create a Student class satisfying following requirements
//
//	It should have two data members:
//	age: int
//	name: String
//	It should have a display method
//	Signature : void:display()
//	It should print : “My name is <name>. I am <age> years old”
//	It should have a sayHello method
//	Signature : void:sayHello(String)
//	It should print : “<name data member> says hello to <name parameter>”

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std = new Student(18,"Lavish");
		std.display();
		std.sayHello("Abishek");

	}

}
class Student{
	public int age;
	public String name;
	
	public void display() {
		System.out.println("My name is "+name+". I am "+age+" years old");
	}
	
	public void sayHello(String nameP) {
		System.out.println(this.name+" says hello to "+nameP);
	};
	
	//default constructor
	public Student() {
	}
	
	//Parameterized constructor
	public Student(int age,String name) {
		this.age = age;
		this.name = name;
	}
}
;