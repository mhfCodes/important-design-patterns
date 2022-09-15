package com.hossein.ImpDesignPatterns.Builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	
	private List<Item> items = new ArrayList<Item>();
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public float getTotalCost() {
		float totalCost = 0.0f;
		for (Item item : items) {
			totalCost += item.price();
		}
		return totalCost;
	}
	
	public void showItem() {
		for (Item item : items) {
			System.out.println("Item: " + item.name());
			System.out.println(", Packing: " + item.pack().pack());
			System.out.println(", Price: " + item.price());
		}
	}

}