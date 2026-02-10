package day_121_Concurrenecy_Process_threads;

public class Q2_Threads_vs_Process_MCQ1 {

}
//Consider the following two statements
//
//Threads of same process can access each other’s stack data		(Incorrect)
//Threads of same process can access each other’s global data		(Correct)
//Which of the following is correct?

//Both a and b are true
//
//Only a is true
//
//Only b is true	(Correct)
//
//Both a and b are false

//Reason
//Statement (a):
//
//“Threads of the same process can access each other’s stack data.”
//
//❌ False
//
//Reason:
//
//Each thread has its own private stack.
//
//The stack stores local variables, method calls, and execution context of that thread.
//
//Other threads cannot directly access another thread’s stack.
//
//✔ This isolation helps prevent accidental data corruption between threads.
//
//Statement (b):
//
//“Threads of the same process can access each other’s global data.”
//
//✅ True
//
//Reason:
//
//Threads of the same process share the same address space.
//
//This includes heap memory, global variables, and static variables.
//
//Any thread can read or modify shared data (which is why synchronization is often needed).