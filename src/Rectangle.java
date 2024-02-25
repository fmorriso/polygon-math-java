public class Rectangle extends Polygon
{
    public Rectangle(double width, double height)
    {
        this.setValues(width, height, 0);
    }

    public double getWidth()
    {
        return getSide1();
    }

    public double getHeight()
    {
        return getSide2();
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
