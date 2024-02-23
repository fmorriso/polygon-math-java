import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * A class Polygon that holds side lengths
 * of any shape
 */

public class Polygon
{
    private double side1;
    private double side2;
    private double side3;

    // Set height and width
    public void setValues(double side1, double side2, double side3)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    //Get side1
    public double getSide1()
    {
        return side1;
    }

    //Get side2
    public double getSide2()
    {
        return side2;
    }

    //Get side3
    public double getSide3()
    {
        return side3;

    }

    public double getArea()
    {
        System.err.println("Error: you did not override getArea in your subclass");
        return Double.NaN;
    }

    public double getPerimeter()
    {
        System.err.println("Error: you did not override getPerimeter in your subclass");
        return Double.NaN;
    }

    /**
     * Returns a double rounded to the specified number of decimal places
     *
     * @param x             - the value to round
     * @param decimalPlaces - the number of decimal places desired
     * @return the original value rounded to the specified number of decimal places.
     */
    public double roundDouble(double x, int decimalPlaces)
    {
        BigDecimal bd = BigDecimal.valueOf(x).setScale(decimalPlaces, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}  