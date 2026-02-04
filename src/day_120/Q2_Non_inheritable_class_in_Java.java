package day_120;

public class Q2_Non_inheritable_class_in_Java {

}

//Which keyword is used to make a non-inheritable class in Java?

//static
//
//abstract
//
//final		(Correct)
//
//finally

//Reason
//In Java, when a class is declared using the final keyword, it cannot be inherited by any other class.
//If you try to extend this class The compiler will throw an error because final classes prevent inheritance.


//Why the others are incorrect:
//
//static → Cannot be used to declare a top-level class as non-inheritable.
//
//abstract → Used to allow inheritance; abstract classes are meant to be extended.

//finally → Used in exception handling, not in class declaration.