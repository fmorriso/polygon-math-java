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

    public double getPerim()
    {
        return 2 * ( getWidth() + getHeight() );
    }

    public double getArea()
    {
        return getWidth() * getHeight();
    }
}
