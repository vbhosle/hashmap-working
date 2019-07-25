package com.example.map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		Map<Car, Integer> carmap = new LoggingMap<>();
		
		List<Car> cars = getCars();
		
		int i = 0;
		for(Car car: cars) {
			carmap.put(car, i++);
		}
		
		System.out.println("Map size=" + carmap.size());
	}
	
	public static List<Car> getCars(){
		Car car1 = new Car("Swifft");
		Car car2 = new Car("Swifft");
		Car car3 = new Car("Swifft");
		Car car4 = new Car("Swifft");
		Car car5 = new Car("Swifft");
		return Arrays.asList(car1, car2, car3, car4, car5);
	}

}
