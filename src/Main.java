/**
 * This program demonstrates polymorphic behavior.
 */

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.format("Welcome to Polygon Math using Java %s%n", getJavaVersion());

        do
        {
            ask_what_shape_to_test();
        } while(continue_testing());

        System.out.println("End Polygon Math");
    }

    private static void ask_what_shape_to_test()
    {
        Scanner input1 = new Scanner(System.in);

        System.out.print("What shape? (T)riangle, (S)quare, (R)ectangle, (C)ircle, (H)exagon >");
        String selectedShape = input1.nextLine();

        // prevent run-time exception when nothing is entered
        if (selectedShape == null || selectedShape.isEmpty()) selectedShape = "unknown";

        // only care about the first character because it will uniquely identify which shape to test
        selectedShape = selectedShape.toLowerCase().substring(0, 1);
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

    private static boolean continue_testing()
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Do you want to test another shape?>");
        String resp = kb.nextLine();
        // treat empty string/Enter key same as yes
        if (resp == null || resp.length() == 0 || resp.toLowerCase().substring(0, 1).equals("y")) return true;
        return false;

    }

    private static void TestHexagon()
    {
        System.out.println("Hexagon");

        Polygon polygon = null;
        Scanner input1 = new Scanner(System.in);

        System.out.print("Input the length of the side in cm: >");
        double lth = Double.parseDouble(input1.nextLine());

        Hexagon hex = new Hexagon(lth);
        polygon = hex;

        System.out.format("The Perimeter of a hexagon of length %.1f cm is %.2f cm %n", hex.getSideLength(), polygon.getPerimeter());
        System.out.format("The Area of a hexagon of length %.1f cm is %.2f cm %n", hex.getSideLength(), polygon.getArea());

    }

    private static void TestCircle()
    {
        System.out.println("Circle");

        Polygon polygon = null;
        Scanner input1 = new Scanner(System.in);

        System.out.print("Input the diameter of the circle in cm: >");
        double diameter = Double.parseDouble(input1.nextLine());

        Circle circ = new Circle(diameter);
        polygon = circ;

        System.out.format("The Perimeter of a circle of diameter %.1f cm is %.2f cm %n", circ.getDiameter(), polygon.getPerimeter());
        System.out.format("The Area of a circle of diameter %.1f cm is %.2f cm %n", circ.getDiameter(), polygon.getArea());

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
        System.out.println("Perimeter of square: " + polygon.getPerimeter() + " cm");

        //Display the area of square
        System.out.println("Area of square: " + polygon.getArea() + " cm");

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
        double side1TriLength = Double.parseDouble(input1.nextLine());
        System.out.print("Input the length of the triangle's second side in cm: >");
        double side2TriLength = Double.parseDouble(input1.nextLine());
        System.out.print("Input the length of the triangle's third side in cm: >");
        double side3TriLength = Double.parseDouble(input1.nextLine());

        // Set data in Triangle's object
        polygon.setValues(side1TriLength, side2TriLength, side3TriLength);

        //Display the perimeter of triangle
        System.out.format("Perimeter of triangle: %.2f cm%n", polygon.getPerimeter());

        //Display the area of triangle
        System.out.format("Area of triangle : %.2f%n", polygon.getArea());
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

        System.out.format("The Perimeter of a rectangle (%.1f cm W x %.1f cm H) is %.2f cm %n", rect.getWidth(), rect.getHeight(), polygon.getPerimeter());
        System.out.format("The Area of a rectangle (%.1f cm W x %.1f cm H) is %.2f cm %n", rect.getWidth(), rect.getHeight(), polygon.getArea());
    }

    private static String getJavaVersion()
    {
        Runtime.Version runTimeVersion = Runtime.version();
        return String.format("%s.%s.%s.%s", runTimeVersion.feature(), runTimeVersion.interim(), runTimeVersion.update(), runTimeVersion.patch());
    }
}