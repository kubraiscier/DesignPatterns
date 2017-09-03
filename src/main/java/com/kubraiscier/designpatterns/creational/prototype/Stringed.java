package com.kubraiscier.designpatterns.creational.prototype;

/**
 * @author kubraiscier
 *
 */
public class Stringed implements Prototype {

	private String name = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Stringed clone() throws CloneNotSupportedException {
		System.out.println("Cloning Stringed object..");
		return (Stringed) super.clone();
	}

	@Override
	public String toString() {
		return "Stringed";
	}

}
