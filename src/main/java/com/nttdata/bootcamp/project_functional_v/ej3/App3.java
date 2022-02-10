package com.nttdata.bootcamp.project_functional_v.ej3;

import java.util.List;

import com.nttdata.bootcamp.project_functional_v.models.Product;

public class App3 {

	public static void main(String[] args) {
		List<Product> shoppingCart = List.of(
				new Product("Xbox", 300.0),
				new Product("Pc", 988.0),
				new Product("Ps5", 100.0),
				new Product("Cart", 9999.0),
				new Product("Coke", 20.0));
				
		//sumar total de la compra
	       System.out.println(
	    		   shoppingCart.stream()
	                .mapToDouble(e -> e.price)
	                .sum()
	        );
	       
	}

	}

