/**
 * A Factory Pattern or Factory Method Pattern says that just define an interface or abstract class 
 * for creating an object but let the subclasses decide which class to instantiate. 
 * In other words, subclasses are responsible to create the instance of the class.
 */
package com.kubraiscier.designpatterns.creational.factory;

/**
 * @author kubraiscier
 *
 */
public class FactoryMain {
	public static void main(String[] args) {

		ShapeFactory shapeFactory = new ShapeFactory();

		Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);
		circle.draw();

		Shape rectangle = shapeFactory.getShape(ShapeType.RECTANGLE);
		rectangle.draw();

		Shape square = shapeFactory.getShape(ShapeType.SQUARE);
		square.draw();
	}
}
