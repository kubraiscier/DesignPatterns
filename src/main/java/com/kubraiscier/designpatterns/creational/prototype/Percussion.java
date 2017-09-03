package com.kubraiscier.designpatterns.creational.prototype;

/**
 * @author kubraiscier
 *
 */
public class Percussion implements Prototype {

	private String name = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Percussion clone() throws CloneNotSupportedException {
		System.out.println("Cloning Percussion object..");
		return (Percussion) super.clone();
	}

	@Override
	public String toString() {
		return "Percussion";
	}

}
