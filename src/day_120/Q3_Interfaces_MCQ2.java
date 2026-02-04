package day_120;

public class Q3_Interfaces_MCQ2 {

}

//Consider the following about interface data-members
//
//They are final
//They are static

//Which of the following is true?

//Both are correct		(Correct)
//
//Both are incorrect
//
//i is correct, ii is incorrect
//
//i is incorrect, ii is correct

//Reason:
//
//In Java, all data members (variables) declared in an interface are implicitly:
//
//public
//
//static
//
//final
//
//Even if you don’t explicitly write these keywords, the compiler automatically adds them.
//
//Example:
//interface MyInterface {
//    int x = 10;
//}
//
//
//This is treated by Java as:
//
//public static final int x = 10;
//
//Explanation of the statements:
//
//They are final → ✔️ Correct
//Interface variables must be constants, so they cannot be changed.
//
//They are static → ✔️ Correct
//They belong to the interface itself, not to any implementing class.
