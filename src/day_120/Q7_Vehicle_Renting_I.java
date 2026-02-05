package day_120;

public class Q7_Vehicle_Renting_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rentable car = new Car1("Toyota Camry");
        Rentable bicycle = new Bicycle("Mountain Bike");

        car.rent();
        bicycle.rent();
        car.returnItem();
        bicycle.returnItem();
	}

}
//Vehicle Renting (Assignment)
//Problem Statement
//You are tasked with implementing a vehicle rental system that allows customers to rent cars and bicycles. 
//You need to create classes for cars and bicycles, ensuring they implement a common interface for rental operations.
//
//Class Structure:
//Rentable Interface: This interface represents objects that can be rented. It should declare the following methods:
//
//rent(): To rent the item.
//returnItem(): To return the item.
//Car Class: This class represents a car available for rental. 
//It should implement the Rentable interface and include the following properties and methods:
//
//Properties (public access modifiers):
//carModel: representing the model of the car.
//public isRented: a boolean indicating whether the car is currently rented.
//Methods:
//public rent(): Overrides the method to rent the car. It should set the isRented to true if the car is not already rented and print “car is now rented”.
//public returnItem(): Overrides the method to return the car. It should set the isRented to false if the car is already rented and print “car is now returned”.
//Bicycle Class: This class represents a bicycle available for rental. It should also implement the Rentable interface and include the following properties and methods:
//
//Properties (public access modifiers):
//bicycleModel: representing the model of the bicycle.
//public isRented: a boolean indicating whether the bicycle is currently rented.
//Methods:
//public rent(): Overrides the method to rent the bicycle. It should set the isRented to true if the car is not already rented and print “cycle is now rented”.
//public returnItem(): Overrides the method to return the bicycle. It should set the isRented to false if the cycle is already rented and print “cycle is now returned”.
//Your Task:
//Write Java code to implement the above problem statement, ensuring that the Car and Bicycle classes implement the Rentable interface and utilize public access modifiers for all class variables.
interface Rentable {
    void rent();
    void returnItem();
}

class Car1 implements Rentable {
    public String carModel;
    public Boolean isRented;

    public Car1(String carModel){
        this.carModel = carModel;
        this.isRented = false;
    }
    @Override
    public void rent() {
        //throw new UnsupportedOperationException("Unimplemented method 'rent'");
        if(!this.isRented){
        this.isRented = true;
        System.out.println("car is now rented");
        }
    }

    @Override
    public void returnItem() {
        //throw new UnsupportedOperationException("Unimplemented method 'returnItem'");
        if(isRented){
            this.isRented = false;
            System.out.println("car is now returned");
        }
    }
}

class Bicycle implements Rentable {
    public String bicycleModel;
    public Boolean isRented;

    public Bicycle(String bicycleModel){
        this.bicycleModel = bicycleModel;
        this.isRented = false;
    }

    @Override
    public void rent() {
        //throw new UnsupportedOperationException("Unimplemented method 'rent'");
        if(!this.isRented){
            this.isRented = true;
            System.out.println("cycle is now rented");
        }
    }

    @Override
    public void returnItem() {
       if(isRented){
            this.isRented = false;
            System.out.println("cycle is now returned");
        }
    }
}

