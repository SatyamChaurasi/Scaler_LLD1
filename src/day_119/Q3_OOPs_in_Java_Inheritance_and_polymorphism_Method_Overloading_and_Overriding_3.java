package day_119;

public class Q3_OOPs_in_Java_Inheritance_and_polymorphism_Method_Overloading_and_Overriding_3 {

}
//What is true about static methods?
//
//i. They can be overloaded
//
//ii. They can be overridden
//
//Which of the following is correct?

//Both are correct
//
//Both are incorrect
//
//i is correct, ii is incorrect	(Correct Answer)

//i is incorrect, ii is correct

//Reason:
//
//i. They can be overloaded ✔️
//Static methods can be overloaded in Java. You can define multiple static methods with the same name as long as their parameter lists are different. Overloading is resolved at compile time.
//
//ii. They can be overridden ❌
//Static methods cannot be overridden because overriding depends on runtime polymorphism, and static methods belong to the class, not to objects.
//If a subclass defines a static method with the same signature, it is called method hiding, not overriding.