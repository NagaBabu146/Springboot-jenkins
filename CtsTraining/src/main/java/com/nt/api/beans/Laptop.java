package com.nt.api.beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Laptop implements Serializable {
   @Id
	private Integer id;
	private String brand;
	private Integer ram;
	private double cost;
	public Laptop(Integer id, String brand, Integer ram, double cost) {
		super();
		this.id = id;
		this.brand = brand;
		this.ram = ram;
		this.cost = cost;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Integer getRam() {
		return ram;
	}
	public void setRam(Integer ram) {
		this.ram = ram;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
	
	
}
