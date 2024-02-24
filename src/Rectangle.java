public class Rectangle extends Polygon
{
    public Rectangle(double width, double height)
    {
        setSide(1, width);
        setSide(2, height);
    }

    public double getWidth()
    {
        return getSide(1);
    }

    public double getHeight()
    {
        return getSide(2);
    }

    public double getPerimeter()
    {
        double perimeter = 2 * ( getWidth() + getHeight() );
        return roundDouble(perimeter, DECIMAL_PLACES_OF_ACCURACY);
    }

    public double getArea()
    {
        double area = getWidth() * getHeight();
        return roundDouble(area, DECIMAL_PLACES_OF_ACCURACY);
    }
}
