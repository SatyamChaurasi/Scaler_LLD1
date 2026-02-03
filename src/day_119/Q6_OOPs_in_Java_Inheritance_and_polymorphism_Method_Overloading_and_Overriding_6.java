package day_119;

public class Q6_OOPs_in_Java_Inheritance_and_polymorphism_Method_Overloading_and_Overriding_6 {
    public static void main(String[] args) {
        P1 obj = new C1();
        System.out.println(obj.d1);
        System.out.println(obj.d);
        obj.fun1();
        obj.fun();
        obj.sfun();
    }
}	

//Consider the following Code

class P1 {
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

class C1 extends P1{
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

//class Client {
//
//}

//What is the output?
//
//10 100 P's fun1 C's fun P's sfun		(Correct)
//
//100 100 P's fun 1C's fun P's sfun
//
//10 10 P's fun 1C's fun P's sfun
//
//10 100 P's fun 1C's fun P's sfun1