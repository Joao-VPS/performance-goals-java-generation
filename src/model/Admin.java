package model;

import util.Strings;

public class Admin extends User {
	public Product registerProduct(String data) {
		String[] newData = data.split(", ");
		String name;
		int id;
		float value;
		String category;
		String description;
		
		try {
			name = newData[0];
			id = Integer.parseInt(newData[1]);
			value = Float.parseFloat(newData[2].replace(',', '.'));
			category = newData[3];
			description = newData[4];
			
			return new Product(name, id, value, category, description);
		} catch (Exception e) {
			System.out.println(Strings.INVALID_OPTION);
			System.out.println(Strings.PRODUCT_PARAMS);
		}
		
		return null;
	}
}
