/**
 *  This class Triangle calculates 
 *  the area of triangle 
 */

import java.lang.Math;

public class Triangle extends Polygon{ 
    //Calculate and return perimeter of triangle
    public double getPerimeter()
    {
        double perimeter = getSide1() + getSide2() + getSide3();
        return roundDouble(perimeter, DECIMAL_PLACES_OF_ACCURACY);
    }
 
  //Calculate and return area of triangle using Heron's Formula
    public double getArea() {
        double semiPeri = (getSide1()+getSide2()+getSide3())/2;
        double area =  Math.pow(semiPeri * (semiPeri-getSide1()) * (semiPeri-getSide2()) * (semiPeri-getSide3()),0.5);
        return roundDouble(area, DECIMAL_PLACES_OF_ACCURACY);
    }
}      