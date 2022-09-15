package com.hossein.ImpDesignPatterns.Builder;

public abstract class Burger implements Item {

	@Override
	public Packing pack() {
		return new Wrapper();
	}

	@Override
	public abstract float price();
}
