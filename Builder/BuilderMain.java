package com.hossein.ImpDesignPatterns.Builder;

public class BuilderMain {

	public static void main(String[] args) {
		
		MealBuilder builder = new MealBuilder();
		
		Meal vegMeal = builder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItem();
		System.out.println("Total VegMeal Cost: " + vegMeal.getTotalCost());
		
		Meal nonVegMeal = builder.prepareNonVegMeal();
		System.out.println("\n\nNon-VegMeal");
		nonVegMeal.showItem();
		System.out.println("Total Non-Veg Meal Cost: " + nonVegMeal.getTotalCost());

	}

}
