package dev.blac.jposx.shared.model;

import java.time.Instant;
import java.util.List;

// Order.java
// The order class is the entire order object which will be sent between instances of JposX, contains all the information for any given order. The order will contain a list of OrderItem.java instances
// which contain the actual individual items or meals the customers are ordering
//
public class Order {
	private String orderId;
	private String source;
	private Instant createdAt;
	private List<OrderItem> items;

	public double getPrice() {
		int total = 0;
		for (OrderItem i : items) {
			total += i.getPrice();
		}
		return total;
	}

}
