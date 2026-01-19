package day_117;

public class Q3_Ref_vs_Instance_1_OOPs_Basics {
//	Consider the following code
	

//
//	class Client {
//	  
//	}

	 public static void main(String[] args) {
	       Student1 s1 = new Student1();
	       s1.age = 10;
	       s1.name = "A";
	       s1.display();

	       Student1 s2 = s1;
	       s2.age = 20;
	       s2.name = "B";

	       s2.display();

	       s1.display();
	   }
	 
//	 What is the output of the final call to display function i.e. s1.display()?
//	 My name is A. I am 10 years old.
//
//	 My name is B. I am 10 years old.
//
//	 My name is A. I am 20 years old.
//
//	 My name is B. I am 20 years old.	(Correct)
}
class Student1 {
    int age;
    String name;
    
    public Student1() {}

    void display(){
            System.out.println("My name is " + this.name + ". I am "  + this.age + " years old");
    }

    void sayHello(String name){
            System.out.println(this.name + " says hello to " + name);
    }
}
