public class Hexagon extends Polygon
{
    public Hexagon(double sideLength)
    {
        setValues(sideLength, 0, 0);
    }

    public double getSideLength()
    {
        return this.getSide1();
    }

    public double getPerimeter()
    {
        double perimeter = 6 * getSideLength();
        return roundDouble(perimeter, DECIMAL_PLACES_OF_ACCURACY);
    }

    public double getArea()
    {
        double area = (3 * Math.sqrt(3) * Math.pow(getSideLength(), 2))
                / 2.0;
        return roundDouble(area, DECIMAL_PLACES_OF_ACCURACY);
    }
}
