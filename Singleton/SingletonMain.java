package com.hossein.ImpDesignPatterns.Singleton;

public class SingletonMain {

	public static void main(String[] args) {
		
		SingleObject object = SingleObject.getInstance();
		
		object.showMessage();
	}

}
