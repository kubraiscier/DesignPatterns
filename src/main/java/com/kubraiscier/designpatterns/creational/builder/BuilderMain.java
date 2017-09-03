/**
 * Builder Pattern says that "construct a complex object from simple objects using step-by-step approach"
 */
package com.kubraiscier.designpatterns.creational.builder;

/**
 * @author kubraiscier
 *
 */
public class BuilderMain {
	public static void main(String[] args) {
		
		User user1 = new User.UserBuilder("Kubra", "Iscier").phone("1234567").address("Address").build();
		System.out.println(user1);
		
		User user2 = new User.UserBuilder("Kubra", "Iscier").build();
		System.out.println(user2);
	}
}
