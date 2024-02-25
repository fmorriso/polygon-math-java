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
        double perimeter = 2 * Math.PI * getDiameter()/2;
        return roundDouble(perimeter, DECIMAL_PLACES_OF_ACCURACY);
    }

    public double getArea()
    {
        double area = Math.pow(getDiameter()/2, 2) * Math.PI;
        return roundDouble(area, DECIMAL_PLACES_OF_ACCURACY);
    }
}
