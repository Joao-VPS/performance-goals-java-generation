package model;

import repository.StockRepository;
import util.Strings;

public class Product {
	private String name;
	private int id;
	private float value;
	private String category;
	private String description;
	
	public Product(String name, int id, float value, String category, String description) {
		this.name = name;
		this.id = id;
		this.value = value;
		this.category = category;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public void visualizar() {
		System.out.printf(Strings.PRODUCT_DETAILS, name, id, value, category, description);
	}
}
