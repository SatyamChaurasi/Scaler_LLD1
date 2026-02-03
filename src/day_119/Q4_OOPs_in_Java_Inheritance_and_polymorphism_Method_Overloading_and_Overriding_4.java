package day_119;

public class Q4_OOPs_in_Java_Inheritance_and_polymorphism_Method_Overloading_and_Overriding_4 {

}

//Consider the following statements
//i. Calling of overloaded methods is decided at compile time
//
//ii. Calling of overridden methods is decided at runtime.
//
//Which of the following is correct?
//
//Both are correct		(Correct Answer)
//
//Both are incorrect
//
//i is correct, ii is incorrect
//
//i is incorrect, ii is correct

//Reason:
//
//i. Calling of overloaded methods is decided at compile time ✔️
//Method overloading is resolved at compile time based on the reference type and method parameters. This is why overloading is called compile-time polymorphism.
//
//ii. Calling of overridden methods is decided at runtime ✔️
//Method overriding is resolved at runtime based on the actual object type, not the reference type. This is known as runtime polymorphism or dynamic method dispatch.