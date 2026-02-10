package day_121_Concurrenecy_Process_threads;

public class Q1_Introduction_to_Threads_MCQ {

}
//Which of the following is the correct way of getting the executing thread’s name?

//Thread.currentThread.name

//Thread.executingThread().getName()

//Thread.currentThread().getName()		(Correct)

//Thread.executingThread.getName()

//Reason
//There is no method called executingThread() in the Thread class.
//Java provides currentThread() to refer to the currently running thread, not executingThread().
//currentThread() is a method, so it must be called with parentheses.
//name is not a public field in the Thread class.
//The thread’s name is accessed using the getter method getName().