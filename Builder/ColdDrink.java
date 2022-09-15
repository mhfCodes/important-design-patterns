package com.hossein.ImpDesignPatterns.Builder;

public abstract class ColdDrink implements Item {

	@Override
	public Packing pack() {
		return new Bottle();
	}

	@Override
	public abstract float price();

}
