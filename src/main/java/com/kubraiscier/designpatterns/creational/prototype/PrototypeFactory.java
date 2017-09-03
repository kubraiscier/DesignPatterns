package com.kubraiscier.designpatterns.creational.prototype;

/**
 * @author kubraiscier
 *
 */
public class PrototypeFactory {
	
	public static class InstrumentType {
		public static final String WIND = "wind";
		public static final String STRINGED = "stringed";
		public static final String PERCUSSION = "percussion";
	}

	private static java.util.Map<String, Prototype> prototypes = new java.util.HashMap<String, Prototype>();

	static {
		prototypes.put(InstrumentType.WIND, new Wind());
		prototypes.put(InstrumentType.STRINGED, new Stringed());
		prototypes.put(InstrumentType.PERCUSSION, new Percussion());
	}

	public static Prototype getInstance(final String type) throws CloneNotSupportedException {
		return ((Prototype) prototypes.get(type)).clone();
	}
}
