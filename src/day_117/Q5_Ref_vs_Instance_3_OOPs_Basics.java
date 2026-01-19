package day_117;

public class Q5_Ref_vs_Instance_3_OOPs_Basics {
	//Consider the following code
	public static void main(String[] args) {
	       Student3 s1 = new Student3();
	       s1.age = 10;
	       s1.name = "A";

	       Student3 s2 = new Student3();

	       int tempAge = s1.age;
	       s1.age = s2.age;
	       s2.age = tempAge;

	       s2.display();

	   }
}
//What is the output of the final call to display function?
//My name is A. I am 10 years old.
//
//My name is null. I am 0 years old.
//
//My name is null. I am 10 years old.	(Correct)
//
//My name is A. I am 0 years old.
//

 class Student3 {
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
 