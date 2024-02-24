/**
 * This class Triangle calculates
 * the area of triangle
 */

import java.lang.Math;

public class Triangle extends Polygon
{
    public Triangle(double side1, double side2, double side3)
    {
        setSide(1, side1);
        setSide(2, side2);
        setSide(3, side3);
    }

    //Calculate and return perimeter of triangle
    public double getPerimeter()
    {
        return getSide(1) + getSide(2) + getSide(3);
    }

    //Calculate and return area of triangle using Heron's Formula
    public double getArea()
    {
        double semiPeri = (getSide(1) + getSide(2) + getSide(3)) / 2;
        return Math.pow(semiPeri * (semiPeri - getSide(1)) * (semiPeri - getSide(2)) * (semiPeri - getSide(3)), 0.5);

    }
}      