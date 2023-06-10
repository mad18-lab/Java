import java.io.*;
import java.util.*;

class Rectangle {
    int RecArea(int l, int b) {
        return l * b;
    }
}

class Square extends Rectangle {
    int SqArea(int side) {
        return side * side;
    }
}

class Circle extends Square {
    double CircArea(double r) {
        return 3.14 * r * r;
    }
}

class Triangle extends Circle {
    int TriArea(int b, int h) {
        return (b * h) / 2;
    }
}

class Inheritance extends Triangle {
    public static void main(String[] args) {
        Inheritance obj = new Inheritance();
        System.out.println(obj.RecArea(12, 13));
        System.out.println(obj.SqArea(16));
        System.out.println(obj.CircArea(4.5));
        System.out.println(obj.TriArea(3, 15));
    }
}