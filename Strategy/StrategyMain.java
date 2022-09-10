package com.hossein.ImpDesignPatterns.Strategy;

public class StrategyMain {

	public static void main(String[] args) {
		
		Context context = new Context(new OperationAdd());
		System.out.println("30 + 20 = " + context.executeOperation(30, 20));

		context = new Context(new OperationSubtract());
		System.out.println("30 - 20 = " + context.executeOperation(30, 20));
		
		context = new Context(new OperationMultiply());
		System.out.println("30 * 20 = " + context.executeOperation(30, 20));
		
	}

}
