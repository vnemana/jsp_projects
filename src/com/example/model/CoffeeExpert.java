package com.example.model;

import java.util.*;

public class CoffeeExpert {
	public List<String> getBrands (String color) {
		List<String> brands = new ArrayList();
		if (color.equals("medium")) {
			brands.add("Maxwell Medium");
			brands.add("Fosters Medium");
		}
		else {
			brands.add("Columbian Coffee");
			brands.add("Nescafe");
		}
		return brands;
	}
}