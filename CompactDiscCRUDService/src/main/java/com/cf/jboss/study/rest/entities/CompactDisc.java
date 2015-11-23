package com.cf.jboss.study.rest.entities;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CompactDisc implements Serializable {

	private static final long serialVersionUID = -5971257887315842344L;

	private int id;
	private String name;
	private String author;
	private double price;

	public CompactDisc() {
		super();
	}

	public CompactDisc(int id, String name, String author, double price) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
