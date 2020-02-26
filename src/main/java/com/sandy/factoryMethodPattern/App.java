package com.sandy.factoryMethodPattern;

import com.sandy.factoryMethodPattern.Factory.WheelFactory;
import com.sandy.factoryMethodPattern.entity.Wheel;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Wheel b1=WheelFactory.getWheel("bikewheel", 2);   //this will be bikewheel
        Wheel b2=WheelFactory.getWheel("carwheel", 3);    // this will be carwheel
        
        //getWheel will create the object based on the requirement the parameter which we are sending to it 
        
        
        System.out.println(b1);         //here the two string method of the Wheel Class will be used 
        System.out.println(b2);         //here also
    }
}
