package com.maven.SpringCore.LifeCycle;

public class Samosa {
	private double price;

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

	public Samosa() {
		super();
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting price");
		this.price = price;
	}
	public void hey() {
		System.out.println("Samosa : init");
	}
	public void bye() {
		System.out.println("Samosa : destroy");
	}
}
