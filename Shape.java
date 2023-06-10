public class Shape {
    private int length;
    private int breadth;

    Shape() {
        length = 10;
        breadth = 12;
    }

    Shape(int l, int b) {
        length = l;
        breadth = b;
    }

    int area() {
        return length * breadth;
    }

    int volume() {
        return length * length * length;
    }

    public static void main(String[] args) {
        Shape s = new Shape();
        Shape s1 = new Shape(15, 12);

        System.out.println(s.area());
        System.out.println(s.volume());
        System.out.println(s1.area());
        System.out.println(s1.volume());
    }
}

