package day_117;

public class Q8_Ref_vs_Instance_5_OOPs_Basics {
	public static void main(String[] args) {
	       Student5 s1 = new Student5();
	       s1.age = 10;
	       s1.name = "A";

	       Student5 s2 = new Student5();
	       s2.age = 20;
	       s2.name = "B";

	       swap(s1, s2);

	       s1.display();
	   }

	   private static void swap(Student5 s1, Student5 s2) {
	       int tage = s1.age;
	       s1.age = s2.age;
	       s2.age = tage;

	       String tname = s1.name;
	       s1.name = s2.name;
	       s2.name = tname;
	   }

}
//Consider the following class Student
//What is the output of the final call to display function?
//My name is A. I am 10 years old.
//
//My name is B. I am 20 years old.		(Correct)
//
//My name is A. I am 20 years old.
//
//My name is B. I am 10 years old.
class Student5 {
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
//	}