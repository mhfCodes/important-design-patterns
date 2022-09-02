package com.hossein.ImpDesignPatterns.Factory;

public class FactoryMain {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		IShape rectangle = shapeFactory.getShape(Shapes.RECTANGLE);
		rectangle.draw();
		
		IShape square = shapeFactory.getShape(Shapes.SQUARE);
		square.draw();
		
		IShape circle = shapeFactory.getShape(Shapes.CIRCLE);
		circle.draw();
	}

}
