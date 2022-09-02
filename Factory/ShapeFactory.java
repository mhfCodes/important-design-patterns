package com.hossein.ImpDesignPatterns.Factory;


public class ShapeFactory {

	public IShape getShape(Shapes shapeType) {
		
		switch(shapeType) {
			
			case RECTANGLE:
				return new Rectangle();
			case SQUARE:
				return new Square();
			case CIRCLE:
				return new Circle();
			default:
				return null;
			
		}
		
	}
	
}
