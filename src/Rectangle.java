public class Rectangle extends Polygon
{
    public Rectangle(double width, double height)
    {
        this.setValues(width, height, 0);
    }

    public double getPerim()
    {
        return 2 * ( getSide1() + getSide2() );
    }

    public double getArea()
    {
        return getSide1() * getSide2();
    }
}
