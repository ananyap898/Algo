package com.src.designpattern.facade;

public class FacadeTest {

	public static void main(String[] args) {
		ShapeFacade facade = new ShapeFacade();
		facade.drawRectangle();
		facade.drawSquare();

	}

}
