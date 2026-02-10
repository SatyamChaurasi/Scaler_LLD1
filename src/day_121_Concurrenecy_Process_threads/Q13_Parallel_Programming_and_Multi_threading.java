package day_121_Concurrenecy_Process_threads;

public class Q13_Parallel_Programming_and_Multi_threading {

}

//Consider the following statements
//
//Parallel programming requires multiple program counters.
//Multithreading requires multiple cores.
//
//Which of the following is correct?
//		
//Both a and b are true
//
//Only a is true		(Correct)
//
//Only b is true
//
//Both a and b are false

//Reason
//Statement 1:
//
//“Parallel programming requires multiple program counters.”
//
//✅ True
//
//Reason:
//In parallel programming, multiple tasks execute simultaneously.
//Each executing task (process or thread) needs its own program counter to keep track of its execution flow.
//Therefore, parallel execution inherently involves multiple program counters.
//
//Statement 2:
//
//“Multithreading requires multiple cores.”
//
//❌ False
//
//Reason:
//Multithreading can run on a single-core processor using time-sharing (context switching).
//Multiple threads appear to run concurrently even on one core.
//Multiple cores improve performance but are not required for multithreading.