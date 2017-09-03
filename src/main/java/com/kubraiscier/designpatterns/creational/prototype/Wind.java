package com.kubraiscier.designpatterns.creational.prototype;

/**
 * @author kubraiscier
 *
 */
public class Wind implements Prototype {

	private String name = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Wind clone() throws CloneNotSupportedException {
		System.out.println("Cloning Wind object..");
		return (Wind) super.clone();
	}

	@Override
	public String toString() {
		return "Wind";
	}

}
