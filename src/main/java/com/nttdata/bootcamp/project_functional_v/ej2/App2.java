package com.nttdata.bootcamp.project_functional_v.ej2;

import java.util.List;

public class App2 {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(18, 4, 5, 5, 50, 44, 8);
		
		Long count = numbers.stream().filter(num -> num > 10).count();
		
		System.out.println(count);
		

	}

}
