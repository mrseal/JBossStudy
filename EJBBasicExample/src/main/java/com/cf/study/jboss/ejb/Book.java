package com.cf.study.jboss.ejb;

import java.io.Serializable;

public class Book implements Serializable {

	private static final long serialVersionUID = -4567458502551242964L;

	// Instance variables
	private int id;
	private String author, title;
	private double price;

	// Methods
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public double getPrice() {
		return price;
	}

	public String getAuthor() {
		return author;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	// Constructors
	public Book() {
	}

	public Book(String t, double p, String a, int i) {
		title = t;
		price = p;
		author = a;
		id = i;
	}
}
