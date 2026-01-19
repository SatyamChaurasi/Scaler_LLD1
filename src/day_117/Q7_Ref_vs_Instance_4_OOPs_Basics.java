package day_117;

public class Q7_Ref_vs_Instance_4_OOPs_Basics {
	public static void main(String[] args) {
	       Student4 s1 = new Student4();
	       s1.age = 10;

	       Student4 s2 = s1;

	       s2.display();
	   }
}

//Consider the following code
//What is the output of the final call to display function?
//My name is A. I am 10 years old.
//
//My name is null. I am 0 years old.
//
//My name is null. I am 10 years old.	(correct)
//
//My name is A. I am 0 years old.
 class Student4 {
	   int age;
	   String name;

	   void display(){
	       System.out.println("My name is " + this.name + ". I am "  + this.age + " years old");
	   }
	}

//	public class Client {
//	   
//	}