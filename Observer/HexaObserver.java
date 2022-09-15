package com.hossein.ImpDesignPatterns.Observer;

public class HexaObserver extends Observer {

	public HexaObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("Hex String: " + Integer.toHexString(this.subject.getState()));
	}

}
