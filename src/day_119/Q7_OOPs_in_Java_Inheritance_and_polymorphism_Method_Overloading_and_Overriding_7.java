package day_119;

public class Q7_OOPs_in_Java_Inheritance_and_polymorphism_Method_Overloading_and_Overriding_7 {
	public static void main(String[] args) {
//        C2 obj = new P2();	(Down casting) Original
        P2 obj = new C2();	//(Up Casting)
        System.out.println(obj.d1);
        System.out.println(obj.d);
        obj.fun1();
        obj.fun();
        obj.sfun();
    }
}
class P2 {
	   protected int d1 = 10;
	   protected int d = 100;

	   protected void fun1(){
	       System.out.println("P's fun1");
	   }

	   protected void fun(){
	       System.out.println("P's fun");
	   }

	   static protected void sfun(){
	       System.out.println("P's sfun");
	   }
	}

	class C2 extends P2{
	   protected int d2 = 20;
	   protected int d = 200;

	   protected void fun2(){
	       System.out.println("C's fun2");
	   }

	   protected void fun(){
	       System.out.println("C's fun");
	   }

	   static protected void sfun(){
	       System.out.println("C's sfun");
	   }
	}
	
//	Java does NOT allow assigning a parent class object to a child class reference.
	
//	What is the output?
//
//			Compile Time Error		(Correct)
//
//			10 100 P's fun1 C's fun P's sfun
//
//			100 100 P's fun1 C's fun P's sfun
//
//			10 10 P's fun1 C's fun P's sfun