package dev.blac.jposx.shared.model;

import java.util.List;

public class Meal extends OrderItem {
	private String name;
	private String size;
	private List<Item> items;
	private double priceMultiplier; // e.g. 0.75, meal costs 0.75 of the total cost of the items

	public double getPrice() {
		int total = 0;
		for (Item i : items) {
			total += i.getPrice();
		}
		return total * priceMultiplier;
	}

	public void addItem(Item o) {
		items.add(o);
	}

	public String getName() {
		return this.name;
	}

	public String getSze() {
		return this.size;
	}
}
