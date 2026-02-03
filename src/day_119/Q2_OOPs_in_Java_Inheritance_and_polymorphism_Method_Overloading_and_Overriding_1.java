package day_119;

public class Q2_OOPs_in_Java_Inheritance_and_polymorphism_Method_Overloading_and_Overriding_1 {

}
//Q Which of the following does Java not support

//Method overriding
//
//Method overloading
//
//Operator overloading		(Correct Answer)
//
//Method hiding


//Reason (Java 8):
//
//Java does not support operator overloading (except for + with String) to keep the language simple, readable, and less error-prone. Allowing custom operator behavior could make code confusing and harder to maintain.
//
//Why the others are supported:
//
//Method overriding ✔️
//Java supports overriding to achieve runtime polymorphism, where a subclass provides a specific implementation of a method already defined in its parent class.
//
//Method overloading ✔️
//Java supports overloading, allowing multiple methods with the same name but different parameter lists (compile-time polymorphism).
//
//Method hiding ✔️
//Java supports method hiding when static methods in a subclass have the same signature as static methods in the superclass. This is resolved at compile time, not runtime.
//
//Summary Table:
//Feature			Supported in Java 8?	Reason
//Method overriding		✅ Yes			Runtime polymorphism
//Method overloading	✅ Yes			Compile-time polymorphism
//Operator overloading	❌ No			Avoids complexity & ambiguity
//Method hiding			✅ Yes			Applies to static methods