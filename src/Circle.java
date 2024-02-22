public class Circle extends Polygon
{
    public Circle(double diam)
    {
        this.setValues(diam, 0, 0);
    }

    public double getDiameter()
    {
        return this.getSide1();
    }

    public double getPerimeter()
    {
        return  2 * Math.PI * getDiameter()/2;
    }

    public double getArea()
    {
        return Math.pow(getDiameter()/2, 2) * Math.PI;
    }
}
