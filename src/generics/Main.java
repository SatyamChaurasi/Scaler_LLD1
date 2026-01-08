package generics;

public class Main {

	public static void main(String[] args) {
		Pair<Integer,String> idNamePair = new Pair<>();
		idNamePair.print(1, "Start up");
		
		Pair<Integer, Boolean> intBoolPair = new Pair<>();
		intBoolPair.print(23, true);
		
		Car car =  new Car("Tata", "Safari");
		Pair<Car, Double> carPricePair = new Pair<>();
		carPricePair.print(car, 100000.2);
		
		
	}

}
