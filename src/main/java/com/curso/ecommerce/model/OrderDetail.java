package com.curso.ecommerce.model;

public class OrderDetail {
	private Integer id;
	private String name;
	private double quanity;
	private double price;
	private double total;
	
	public OrderDetail() {
	}

	public OrderDetail(Integer id, String name, double quanity, double price, double total) {
		super();
		this.id = id;
		this.name = name;
		this.quanity = quanity;
		this.price = price;
		this.total = total;
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

	public double getQuanity() {
		return quanity;
	}

	public void setQuanity(double quanity) {
		this.quanity = quanity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", name=" + name + ", quanity=" + quanity + ", price=" + price + ", total="
				+ total + "]";
	}
	
	
}
