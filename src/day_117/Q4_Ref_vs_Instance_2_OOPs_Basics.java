package day_117;

public class Q4_Ref_vs_Instance_2_OOPs_Basics {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s1 = new Student2();
	       s1.age = 10;
	       s1.name = "A";

	       Student2 s2 = new Student2();

	       Student2 temp = s1;
	       s1 = s2;
	       s2 = temp;

	       s2.display();

	}

}
//Consider the following Code.
//My name is A. I am 10 years old.		(Correct)
//
//My name is null. I am 0 years old.
//
//My name is null. I am 10 years old.
//
//My name is A. I am 0 years old.
 class Student2 {
	   int age;
	   String name;

	   void display(){
	       System.out.println("My name is " + this.name + ". I am "  + this.age + " years old");
	   }

	   void sayHello(String name){
	       System.out.println(this.name + " says hello to " + name);
	   }
	}

//	public class Client2 {
//	   public static void main(String[] args) {
//	       
//	   }
//	}