public class Circle extends Polygon
{
    public Circle(double diam)
    {
        this.setValues(diam, 0, 0);
    }

    public double getPerimeter()
    {
        return  2 * Math.PI * getSide1()/2;
    }

    public double getArea()
    {
        return Math.pow(getSide1()/2, 2) * Math.PI;
    }
}
