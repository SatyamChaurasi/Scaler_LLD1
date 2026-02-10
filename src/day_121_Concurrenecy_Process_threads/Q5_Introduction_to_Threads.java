package day_121_Concurrenecy_Process_threads;

import java.util.HashMap;

public class Q5_Introduction_to_Threads {

	public static void main(String[] args) {
		System.out.println("I am the main class");

        Runnable adderTask = new Adder();
        ScalerThread adderThread = new ScalerThread(adderTask);
        adderThread.start();

        Runnable subtractorTask = new Subtractor();
        ScalerThread subsThread = new ScalerThread(subtractorTask);
        subsThread.start();
	}

}
class Adder implements Runnable{
	@Override
	public void run() {
		System.out.println("I am the Adder class");
		
	}
}

class Subtractor implements Runnable{

	@Override
	public void run() {
		System.out.println("I am the Substractor class");
	}
	
}
class ScalerThread extends Thread {
    public static HashMap<String, String> map = new HashMap<>();
    private String target;

    ScalerThread(Runnable r){
        super(r);
        target = r.getClass().getName();
    }

    @Override
    public void start() {
        super.start();
        map.put(target, this.getName());
    }
}

//Raw Problem
//
//**Raw Problem**
//Write code to achieve the following
//A class Client with main method that prints: I am the main class
//Client class should create a new thread and invoke code in a class called Adder.
//The Adder class should print: I am the Adder class
//Client class should create a new thread and invoke code in a class called Subtractor.
//The Subtractor class should print: I am the Subtractor class
//
//Important Note - Use the ScalerThread class to create new threads. This is necessary for testing your code.