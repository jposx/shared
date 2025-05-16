package dev.blac.jposx.shared.model;

import java.util.List;

public class ItemDefinition {
	private String id;
	private String name;
	private double price;
	private List<ModifierDefinition> allowedModifiers; // e.g. this item can come with no pickles, allows for only the
																											// right modifications for the right item
	private List<String> tags; // e.g. Drink, burger, condiment

	public ItemDefinition(){}
	
}-
