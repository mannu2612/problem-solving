package main;

import java.util.List;
import java.util.Map;

public class Fizzbuzz {
	void print(Map<String, List<Integer>> map) {
		for (int i = 1; i <= 100; i++) {
			if (checkDivisibility(map.get("fizzbuzz"), i)) {
				System.out.println("fizzbuzz");
			}else{
				if (checkDivisibility(map.get("fizz"), i)) {
					System.out.println("fizz");
				}else if (checkDivisibility(map.get("buzz"), i)){
					System.out.println("buzz");
				}else{
					System.out.println(i);
				}
			}
		}
	}

	boolean checkDivisibility(List<Integer> listOfNumbers, int number) {
		boolean divisible = true;
		for (int i : listOfNumbers) {
			if (number % i != 0) {
				divisible = false;
			} 
		}
		return divisible;
	}
}
