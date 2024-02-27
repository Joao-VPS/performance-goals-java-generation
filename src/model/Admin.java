package model;

import util.Strings;

public class Admin extends User {
	public Product registerProduct(String data) {
		String[] newData = data.split(", ");

		String name;
		int quantity;
		int id;
		float value;
		String category;
		String description;
		
		try {
			name = newData[0];
			quantity = Integer.parseInt(newData[1]);
			id = Integer.parseInt(newData[2]);
			value = Float.parseFloat(newData[3].replace(',', '.'));
			category = newData[4];
			description = newData[5];
			
			return new Product(name, quantity, id, value, category, description);
		} catch (Exception e) {
			System.out.println(Strings.INVALID_OPTION);
			System.out.println(Strings.PRODUCT_PARAMS);
		}
		
		return null;
	}
}
