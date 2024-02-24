import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

/**
 * A class Polygon that holds side lengths
 * of any shape
 */

public abstract class Polygon
{
    private ArrayList<Double> sides = new ArrayList<Double>();

    public double getSide(int i)
    {
        return sides.get(i - 1);
    }

    /**
     * @param m the side number
     * @param val the value of the side
     * @implNote  Since sides are numbered 1, 2, 3, we adjust the index value to correspond to the 0, 1, 2
     *            numbering of ArrayList
     */
    public void setSide(int n, double val)
    {
        if (sides.size() < n)
            sides.add(val);
        else
            sides.set(n - 1, val);
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
     * Returns a double rounded to the specified number of decimal places without losing accuracy
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