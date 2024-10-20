package com.curso.ecommerce.model;

public class Product {
	private Integer id;
	private String name;
	private String discription;
	private String image;
	private double price;
	private int quantity;
	
	public Product() {
	}

	public Product(Integer id, String name, String discription, String image, double price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.discription = discription;
		this.image = image;
		this.price = price;
		this.quantity = quantity;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", discription=" + discription + ", image=" + image + ", price="
				+ price + ", quantity=" + quantity + "]";
	}
	
	
}
