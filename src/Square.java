/**
 *  This class Square calculates 
 *  the area of square 
 */

import java.lang.Math;

public class Square extends Polygon{
  //Calculate and return perimeter of rectangle
  public double getPerim(){
        return 4 * getSide1();
    }
  
  //Calculate and return area of rectangle
  public double getArea(){
        return Math.pow(getSide1(),2);
    }
}