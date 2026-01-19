package day_118;

public class Q2_OOPs_in_Java_Constructors_and_Static_3 {

}
//What keyword is used to make class level data members

//const
//
//final
//
//auto
//
//static		(Correct)


//static is used to create class-level data members.
//A static variable is shared by all objects of the class.
//Only one copy exists in memory, regardless of how many objects are created.

//const is used to make a variable read-only (its value cannot be changed).
//It does not make a variable class-level.
//Mostly used in C/C++, not Java class member sharing.

//final makes a variable’s value unchangeable after initialization.
//A final variable can still be an instance member.
//It does not imply class-level sharing unless combined with static.

//auto is used for type inference (mainly in C++ and some other languages).
//It has nothing to do with class-level data members.