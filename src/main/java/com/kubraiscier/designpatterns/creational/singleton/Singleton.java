package com.kubraiscier.designpatterns.creational.singleton;

/**
 * @author kubraiscier
 *
 */
public class Singleton {

	/*
	 * It gets memory only once because of static, it contains the instance of
	 * the Singleton class.
	 */
	private static Singleton instance = null;

	/*
	 * Private constructor: It will prevent to instantiate the Singleton class
	 * from outside the class.
	 */
	private Singleton() {
		System.out.println("Constructor");
	}

	/*
	 * This provides the global point of access to the Singleton object and
	 * returns the instance to the caller.
	 */
	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton(); // instance will be created at
												// request time
				}
			}
		}
		return instance;
	}

	public void doSometing() {
		System.out.println(this);
	}
}
