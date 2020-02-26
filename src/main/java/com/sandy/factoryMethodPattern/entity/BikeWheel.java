package com.sandy.factoryMethodPattern.entity;

public class BikeWheel extends Wheel{
	private int diameter;
	
	public BikeWheel( int diameter ) {
		this.diameter=diameter;
	}
	
	public int getDiameter() {
		return diameter;
	}

}
