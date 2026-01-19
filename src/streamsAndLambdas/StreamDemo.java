package streamsAndLambdas;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		
		List<Integer> l1 = Arrays.asList(1,2,3,4,5,6,7,8,9);

        //Given a list of numbers, take the even and  square them || FILTERING AND MAPPING
        List<Integer> evenSquares = l1.stream() //creates the stream
                .filter((n) ->  n % 2 == 0)   // filters odd and even numbers || intermediate
                .map((n) -> n*n) // squares the numbers || intermediate
                .collect(Collectors.toList());	// collecting stream to a list || terminal
        System.out.println(evenSquares);

	}

}
