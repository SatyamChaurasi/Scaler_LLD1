package day_120;

public class Q5_Create_a_sortable_list_of_Cars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car(100,20000);
		Car car2 = new Car(110,30000);
		System.out.println(car1.compareTo(car2));
	}

}

class Car implements Comparable<Car>{
	int Price;
	int Speed;
	@Override
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
		return this.Price - o.Price;
	}
	public Car(int price, int speed) {	
		this.Price = price;
		this.Speed = speed;
	}
	public Car() {}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public int getSpeed() {
		return Speed;
	}
	public void setSpeed(int speed) {
		Speed = speed;
	}
	
	
}
//Raw Problem
//
//Write a class Car with following requirements
//It should have 2 data-members
//Price: int
//Speed: int
//We should be able to sort a Collection or Array of Cars on price.
//Implement required interface for that
