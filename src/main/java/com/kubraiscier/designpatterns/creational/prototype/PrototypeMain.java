package com.kubraiscier.designpatterns.creational.prototype;

import com.kubraiscier.designpatterns.creational.prototype.PrototypeFactory.InstrumentType;

/**
 * @author kubraiscier
 *
 */
public class PrototypeMain {
	public static void main(String[] args) throws CloneNotSupportedException {
		String windPrototype = PrototypeFactory.getInstance(InstrumentType.WIND).toString();
		System.out.println(windPrototype);

		String stringedPrototype = PrototypeFactory.getInstance(InstrumentType.STRINGED).toString();
		System.out.println(stringedPrototype);

		String percussionPrototype = PrototypeFactory.getInstance(InstrumentType.PERCUSSION).toString();
		System.out.println(percussionPrototype);

	}
}
