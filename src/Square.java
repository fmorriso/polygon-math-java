/**
 * This class Square calculates
 * the area of square
 */

public class Square extends Polygon
{
    //Calculate and return perimeter of Square
    public double getPerimeter()
    {
        double perimeter = 4 * getSide1();
        return roundDouble(perimeter, 2);
    }

    //Calculate and return area of Square
    public double getArea()
    {
        double area = Math.pow(getSide1(), 2);
        return roundDouble(area, 2);
    }
}