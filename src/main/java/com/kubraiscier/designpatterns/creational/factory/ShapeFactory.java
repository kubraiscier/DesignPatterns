package com.kubraiscier.designpatterns.creational.factory;

/**
 * @author kubraiscier
 *
 */
public class ShapeFactory {
	
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		} else if (ShapeType.CIRCLE.equalsIgnoreCase(shapeType)) {
			return new Circle();
		} else if (ShapeType.RECTANGLE.equalsIgnoreCase(shapeType)) {
			return new Rectangle();
		} else if (ShapeType.SQUARE.equalsIgnoreCase(shapeType)) {
			return new Square();
		}
		return null;
	}
}
