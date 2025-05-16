package dev.blac.jposx.shared.model;

public class Item extends OrderItem {
	private String name;
	private String size;
	private double price;

	public Item(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public Item(String name, double price, String size) {
		this(name, price);
		this.size = size;
	}

	public double getPrice() {
		return this.price;
	}

	public String getName() {
		return this.name;
	}
}
