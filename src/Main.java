/**
 * This program demonstrates polymorphic behavior.
 */

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Polygon Math");
        Scanner input1 = new Scanner(System.in);

        System.out.print("What selectedShape? (T)riangle, (S)quare, (R)ectangle, (C)ircle, (H)exagon >");
        String selectedShape = input1.nextLine().toLowerCase().substring(0, 1);
        switch (selectedShape)
        {
            case "c":
                TestCircle();
                break;

            case "h":
                TestHexagon();
                break;

            case "t":
                TestTriangle();
                break;

            case "r":
                TestRectangle();
                break;

            case "s":
                TestSquare();
                break;

            default:
                System.out.format("Unrecognized selectedShape: %s%n", selectedShape);
        }

    }

    private static void TestHexagon()
    {
        System.out.println("Hexagon");

        Polygon polygon = null;
        Scanner input1 = new Scanner(System.in);

        System.out.print("Input the length of the side in cm: >");
        double lth = input1.nextDouble();

        Hexagon hex = new Hexagon(lth);
        polygon = hex;

        System.out.format("The Perimeter of a hexagon of length %.1f cm is %.1f cm %n", hex.getSideLength(), hex.getPerimeter());
        System.out.format("The Area of a hexagon of length %.1f cm is %.1f cm %n", hex.getSideLength(), hex.getArea());

    }

    private static void TestCircle()
    {
        System.out.println("Circle");

        Polygon polygon = null;
        Scanner input1 = new Scanner(System.in);

        System.out.print("Input the diameter of the circle in cm: >");
        double diameter = input1.nextDouble();

        Circle circ = new Circle(diameter);
        polygon = circ;

        System.out.format("The Perimeter of a circle of diameter %.1f cm is %.1f cm %n", circ.getDiameter(), circ.getPerimeter());
        System.out.format("The Area of a circle of diameter %.1f cm is %.1f cm %n", circ.getDiameter(), circ.getArea());

    }

    private static void TestSquare()
    {
        System.out.println("Square");

        Polygon polygon = null;
        Scanner input1 = new Scanner(System.in);

        // assign subclass reference to subclass variable
        Square sqr = new Square();

        // polygon points to the object sqr
        polygon = sqr;

        System.out.print("Input the length of the square's sides in cm: >");
        double sideSqrLength = input1.nextDouble();

        // Set data in Square's object
        polygon.setValues(sideSqrLength, sideSqrLength, sideSqrLength);

        //Display the perimeter of square
        System.out.println("Perimeter of square: " + sqr.getPerim() + " cm");

        //Display the area of square
        System.out.println("Area of square: " + sqr.getArea() + " cm");
    }

    private static void TestTriangle()
    {
        // assign subclass reference to subclass variable
        System.out.println("Triangle");

        Polygon polygon = null;
        Scanner input1 = new Scanner(System.in);

        Triangle tri = new Triangle();

        // polygon points to the object tri
        polygon = tri;

        System.out.print("Input the length of the triangle's first side in cm: >");
        double side1TriLength = input1.nextDouble();
        System.out.print("Input the length of the triangle's second side in cm: >");
        double side2TriLength = input1.nextDouble();
        System.out.print("Input the length of the triangle's third side in cm: >");
        double side3TriLength = input1.nextDouble();

        // Set data in Triangle's object
        polygon.setValues(side1TriLength, side2TriLength, side3TriLength);

        //Display the perimeter of triangle
        System.out.format("Perimeter of triangle: %.1f cm%n", tri.getPerimeter());

        //Display the area of triangle
        System.out.format("Area of triangle : %.1f%n", tri.getArea());
    }

    private static void TestRectangle()
    {

        System.out.println("Rectangle");

        Polygon polygon = null;
        Scanner input1 = new Scanner(System.in);

        System.out.print("What is the width (cm) of the rectangle?>");
        double width = Double.parseDouble(input1.nextLine());
        System.out.print("What is the height (cm) of the rectangle?>");
        double height = Double.parseDouble(input1.nextLine());

        Rectangle rect = new Rectangle(width, height);
        polygon = rect;

        System.out.format("The Perimeter of a rectangle (%.1f cm W x %.1f cm H) is %.1f cm %n", rect.getWidth(), rect.getHeight(), rect.getPerimeter());
        System.out.format("The Area of a rectangle (%.1f cm W x %.1f cm H) is %.1f cm %n", rect.getWidth(), rect.getHeight(), rect.getArea());
    }
}