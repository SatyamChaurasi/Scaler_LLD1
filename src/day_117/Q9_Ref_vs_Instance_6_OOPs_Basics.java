package day_117;

public class Q9_Ref_vs_Instance_6_OOPs_Basics {
	public static void main(String[] args) {
	       Student6 s1 = new Student6();
	       s1.age = 10;
	       s1.name = "A";

	       Student6 s2 = new Student6();
	       s2.age = 20;
	       s2.name = "B";

	       swap(s1, s2);
	       s1.display();
	   }

	   private static void swap(Student6 s1, Student6 s2) {
	        Student6 temp = s1;
	        s1 = s2;
	        s2 = temp;
	   }
}
//Consider the following code
//What is the output of the final call to display function?
//My name is A. I am 10 years old.	(correct)
//
//My name is B. I am 20 years old.
//
//My name is A. I am 20 years old.
//
//My name is B. I am 10 years old.

//Explaination -> Java is pass-by-value. When objects are passed to methods, copies of their references are passed. 
//Swapping those references only affects local copies inside the method, not the original references in the caller. 
//Therefore, the swap does not persist after the method returns.

//The swap fails because Java passes object references by value, not by reference.

class Student6 {
	   int age;
	   String name;

	   void display(){
	       System.out.println("My name is " + this.name + ". I am "  + this.age + " years old");
	   }

	   void sayHello(String name){
	       System.out.println(this.name + " says hello to " + name);
	   }
	}
//	public class Client {
//	   
//	}