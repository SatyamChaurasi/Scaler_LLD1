package day_121_Concurrenecy_Process_threads;

public class Q7_Adder_Python_LLD {

}
//Multi-threaded Addition Program
//Overview
//This Python program demonstrates multi-threaded addition functionality using the Client and Adder classes. The program takes two numbers as input from the user, creates a new thread, and invokes the Adder class to calculate and print the sum of the two numbers.
//
//Implementation Details
//Class Adder
//Inherits from the threading.Thread class.
//Represents a thread that performs addition of two numbers.
//Initializes with two numbers (num1 and num2) provided as input.
//Overrides the run() method to calculate and print the sum of num1 and num2.
//Class Client
//Contains a static method main() that serves as the entry point of the program.
//Prompts the user to enter two numbers.
//Creates an instance of the Adder class with the provided numbers.
//Starts the thread and waits for its completion.
//Instructions
//To run the program:
//
//Execute the Client class's main() method.
//Enter two numbers when prompted.
//The program will create a new thread to calculate and print the sum of the provided numbers.
//Ensure that the program runs in a Python environment with threading support.

//Solution

//import threading
//
//class Adder(threading.Thread):
//    # TODO: implement the constructor
//    def __init__(self, num1, num2):
//        threading.Thread.__init__(self)
//        self.num1 = num1
//        self.num2 = num2
//
//
//    # TODO: Implement the run method
//    def run(self):
//        result = self.num1 + self.num2
//        print(result)
//
//
//class Client:
//    @staticmethod
//    def main():
//        num1 = int(input("Enter the first number: "))
//        num2 = int(input("Enter the second number: "))
//
//        # TODO: create a thread of Adder class and add num1 and num2
//        adder_thread = Adder(num1,num2)
//        adder_thread.start()
//


//Reason - Explanation 
//Step-by-Step Explanation with Logic
//1️. Import threading module
//import threading
//
//The threading module allows us to create and manage threads in Python.
//
//Threads help run tasks concurrently.
//
//2️. Create Adder class (Thread class)
//class Adder(threading.Thread):
//
//Adder inherits from threading.Thread, making it a thread.
//
//Each object of this class represents a separate thread.
//
//3️. Constructor (__init__ method)
//def __init__(self, num1, num2):
//    threading.Thread.__init__(self)
//    self.num1 = num1
//    self.num2 = num2
//
//Logic:
//
//Initializes the thread using threading.Thread.__init__(self)
//
//Stores the two input numbers as instance variables
//
//These values will be used inside the thread
//
//4️. run() method (Thread logic)
//def run(self):
//    result = self.num1 + self.num2
//    print("Sum:", result)
//
//Logic:
//
//run() is automatically executed when the thread starts
//
//Adds the two numbers
//
//Prints the result
//
//This is the actual task performed by the thread
//
//5️. Create Client class
//class Client:
//
//Acts as the main driver class
//
//Controls input and thread execution
//
//6️. main() method
//num1 = int(input("Enter the first number: "))
//num2 = int(input("Enter the second number: "))
//
//Logic:
//
//Takes two numbers from the user
//
//Converts input to integers
//
//7️. Create and start the thread
//adder_thread = Adder(num1, num2)
//adder_thread.start()
//
//Logic:
//
//Creates an object of Adder thread
//
//start() calls the run() method internally
//
//Addition happens in a separate thread
