package day_121_Concurrenecy_Process_threads;

public class Q14_Runnable_interfcae {

}
//Consider the following two statements
//
//Runnable interface is implemented by class which will be invoked via a separate Thread
//The name of the function to start a new Thread is run
//
//Which of the following is correct?

//Statement 1:
//“Runnable interface is implemented by class which will be invoked via a separate Thread.”
//
//✅ True
//
//Reason:
//A class that implements the Runnable interface defines the task to be executed.
//This task is executed by passing the Runnable object to a Thread object.
//When the thread starts, it runs the code defined in the run() method of the Runnable.
//
//✔ Example:
//
//class MyTask implements Runnable {
//    public void run() {
//        // task code
//    }
//}
//
//Statement 2:
//“The name of the function to start a new Thread is run.”
//
//❌ False
//
//Reason:
//The method that starts a new thread is start(), not run().
//run() only contains the code to be executed by the thread.
//Calling run() directly executes the code in the same thread, not a new one.
//
//✔ Correct way:
//
//Thread t = new Thread(new MyTask());
//t.start();   // creates a new thread