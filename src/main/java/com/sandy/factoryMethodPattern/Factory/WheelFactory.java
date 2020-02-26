package com.sandy.factoryMethodPattern.Factory;

import com.sandy.factoryMethodPattern.entity.BikeWheel;
import com.sandy.factoryMethodPattern.entity.CarWheel;
import com.sandy.factoryMethodPattern.entity.Wheel;

public class WheelFactory {
	public static Wheel getWheel(String type,int diameter) {
		
		if("carwheel".equals(type)) {
			return new CarWheel(diameter);
		}
		else if("bikewheel".equals(type)) {
			return new BikeWheel(diameter);
		}
		return null;
	}

}
