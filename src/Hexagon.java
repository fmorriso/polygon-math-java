public class Hexagon extends Polygon
{
    public Hexagon(double sideLength)
    {
        setSide(1, sideLength);
    }

    public double getSideLength()
    {
        return this.getSide(1);
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
