package day_118;

public class Q3_Class_Constructors_1A_Basic_OOPs {
//	Create a class Person with following requirements
//
//	Should have a data-member age
//	Should have a data-member name
//	Should support a constructor with both age and name
	public static void main(String args[]) {
		Person person = new Person(10,"Deepak");
		System.out.println("Person "+person.toString());
	}
	
	
}
class Person{
	int age;
	String name;
	
	public Person() {
		
	}
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public int getAge(){
        return this.age;
    }
	
    public String getName(){
        return this.name;
    }

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
    
    
}
