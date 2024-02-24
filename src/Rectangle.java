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
        return 2 * ( getWidth() + getHeight() );
    }

    public double getArea()
    {
        return getWidth() * getHeight();
    }
}
