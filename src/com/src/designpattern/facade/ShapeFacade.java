package com.src.designpattern.facade;

public class ShapeFacade {
	
	private Rectangle rectangle;
	private Triangle triangle;
	private Square square;
	
	public ShapeFacade(){
		rectangle = new Rectangle();
		triangle = new Triangle();
		square = new Square();
	}

	public void drawSquare(){
		square.draw();
	}
	public void drawTriangle(){
		triangle.draw();
	}
	public void drawRectangle(){
		rectangle.draw();
	}
	
}
