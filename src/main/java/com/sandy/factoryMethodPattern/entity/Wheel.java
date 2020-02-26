package com.sandy.factoryMethodPattern.entity;

public abstract class Wheel {
	public abstract int getDiameter();
	
	
	public String toString( ) {
		return "Diameter is  "+String.valueOf(this.getDiameter());
		
	}
	

}
