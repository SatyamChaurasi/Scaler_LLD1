package day_120;

public class Q4_Inheritance_via_Interfaces implements I{

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		System.out.println("fun() implementation (from both I1 and I2)");
	}

	@Override
	public void fun1() {
		// TODO Auto-generated method stub
		System.out.println("fun1() implementation");
	}

	@Override
	public void fun2() {
		// TODO Auto-generated method stub
		System.out.println("fun2() implementation");
	}

}
//Raw Problem
//
//Create the set of classes and interfaces to meet the following requirements
//An interface I1 with following methods
//fun1():void
//fun(): void
//An interface I2 with following methods
//fun2():void
//fun():void
//An interface I extending both I1 and I2 with no methods
//A class C implementing interface I

interface I1 {
	void fun();
	void fun1();	
}

interface I2 {
	void fun();
	void fun2();
}

interface I extends I1,I2{
	
}