package com.curso.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "details")
public class OrderDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private double quanity;
	private double price;
	private double total;
	
	@OneToOne
	private Order order;
	
	@ManyToOne
	private Product product;
	
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

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", name=" + name + ", quanity=" + quanity + ", price=" + price + ", total="
				+ total + "]";
	}
	
	
}
