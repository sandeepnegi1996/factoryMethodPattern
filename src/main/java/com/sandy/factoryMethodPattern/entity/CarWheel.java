package com.sandy.factoryMethodPattern.entity;

public class CarWheel extends Wheel {
	public int diameter;
	
	public CarWheel(int diameter) {
		this.diameter=diameter;
	}
	
	public int getDiameter() {
		return diameter;
	}

}
