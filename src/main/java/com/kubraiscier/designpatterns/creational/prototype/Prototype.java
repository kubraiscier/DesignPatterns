/**
 * Prototype Pattern says that cloning of an existing object instead of creating new one 
 * and can also be customized as per the requirement.
 */
package com.kubraiscier.designpatterns.creational.prototype;

/**
 * @author kubraiscier
 *
 */
public interface Prototype extends Cloneable{

	public Prototype clone() throws CloneNotSupportedException;
	
}
