package day_119;

public class Q5_OOPs_in_Java_Inheritance_and_polymorphism_Method_Overloading_and_Overriding_5 {
	public static void main(String[] args) {
      P obj = new P();
      System.out.println(obj.d1);
      System.out.println(obj.d);
      obj.fun1();
      obj.fun();
      obj.sfun();
  }
}

//Consider the following Code which consists of P Class and C Class
//
class P {
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
class C extends P{
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

class Client {
    
}
//
//What is the output?
//
//10 100 P's fun1 P's fun P's sfun		(Correct Answer)
//
//10 100 P's fun1 P's fun P's sfunsss
//
//100 100 P's fun1 P's fun P's sfun
//
//100 100 P's fun P's fun P's sfun


