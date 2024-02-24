public class Circle extends Polygon
{
    public Circle(double diam)
    {
        setSide(1, diam);
    }

    /**
     * @return the diameter of the circle.
     * @implNote Since the ancestor has only <em><b>sides</b></em> as instance variables
     *           we use this facade pattern to mask the fact that we store
     *           the circle's diameter in the ancestor object's <em>side1</em> instance variable.
     */
    public double getDiameter()
    {
        return getSide(1);
    }

    public double getRadius()
    {
        return getDiameter() / 2.0;
    }

    public double getPerimeter()
    {
        return  2 * Math.PI * getRadius();
    }

    public double getArea()
    {
        return Math.pow(getRadius(), 2) * Math.PI;
    }
}
