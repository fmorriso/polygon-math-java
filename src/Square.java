/**
 * This class Square calculates
 * the area of square
 */

public class Square extends Polygon
{

    public Square(double sideLength)
    {
        setSide(1, sideLength);
    }

    public double getSideLength()
    {
        return getSide(1);
    }

    //Calculate and return perimeter of Square
    public double getPerimeter()
    {
        double perimeter = 4 * getSideLength();
        return roundDouble(perimeter, 2);
    }

    //Calculate and return area of Square
    public double getArea()
    {
        double area = Math.pow(getSideLength(), 2);
        return roundDouble(area, 2);
    }
}