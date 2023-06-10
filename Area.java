import java.io.*;

public class Area {
    int area(int l, int b) {
        return l * b;
    }

    int area(int side) {
        return side * side;
    }

    double area(double r) {
        return 3.14 * r * r;
    }

    public static void main(String[] args) {
        Area a1 = new Area();
        System.out.println("\nArea of rectangle: " + a1.area(10, 12));
        System.out.println("\nArea of square: " + a1.area(14));
        System.out.println("\nArea of circle: " + a1.area(4.32));
    }
}