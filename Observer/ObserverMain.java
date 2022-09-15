package com.hossein.ImpDesignPatterns.Observer;

public class ObserverMain {

	public static void main(String[] args) {
		Subject subject = new Subject();
		
		new BinaryObserver(subject);
		new OctalObserver(subject);
		new HexaObserver(subject);
		
		System.out.println("First State Change: 7");
		subject.setState(7);
		System.out.println("Second State Change: 25");
		subject.setState(25);
	}

}
