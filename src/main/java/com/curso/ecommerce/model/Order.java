package com.curso.ecommerce.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String number;
	private Date creationDate;
	private Date receivedDate;
	private double total;
	
	@ManyToOne
	private User user;
	
	@OneToOne(mappedBy = "order")
	private OrderDetail detail;
	
	public Order() {
	}

	public Order(Integer id, String number, Date creationDate, Date receivedDate, double total) {
		super();
		this.id = id;
		this.number = number;
		this.creationDate = creationDate;
		this.receivedDate = receivedDate;
		this.total = total;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getReceivedDate() {
		return receivedDate;
	}

	public void setReceivedDate(Date receivedDate) {
		this.receivedDate = receivedDate;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public OrderDetail getDetail() {
		return detail;
	}

	public void setDetail(OrderDetail detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", number=" + number + ", creationDate=" + creationDate + ", receivedDate="
				+ receivedDate + ", total=" + total + "]";
	}
	
	
}
