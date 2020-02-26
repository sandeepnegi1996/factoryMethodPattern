
# Factory method Design Pattern

1. this design pattern is basically used for object creation
2. Let me explain what we are doing
3. I have one WheelFactory class which will create object of CarWheel or BikeWheel based on the paramter send by user
4. Wheel is abstract and two classes CarWheel and BikeWheel extends it returning the getDiamter which we will use for printing the object.


Wheel(abstract) --> CarWheel 
              |
              |----> BikeWheel


WheelFactory --> getWheel(method) ---> object of carwheel 
                                  |
                                  |--->object of bikewheel






























































