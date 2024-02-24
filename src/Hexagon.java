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
        return 6 * getSideLength();
    }

    public double getArea()
    {
        return (3 * Math.sqrt(3) * Math.pow(getSideLength(), 2))
                / 2.0;
    }
}
