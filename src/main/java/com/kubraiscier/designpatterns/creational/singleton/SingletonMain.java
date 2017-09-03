/**
 * Singleton Pattern says that just "define a class that has only one instance 
 * and provides a global point of access to it"
 */
package com.kubraiscier.designpatterns.creational.singleton;

/**
 * @author kubraiscier
 *
 */
public class SingletonMain {
	public static void main(String[] args) {
		Singleton.getInstance().doSometing();
	}
}
