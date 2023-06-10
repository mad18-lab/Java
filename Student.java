public class Student {
    String name, college, num;
    int id, passout;

    Student(String num, String college, int passout) {
        this.num = num;
        this.college = college;
        this.passout = passout;
    }

    Student(String name, int id) {
        this("9953126471", "VIT Bhopal", 2024);
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args) {
        Student s = new Student("Madhav Gupta", 10020);
        System.out.println("\nStudent Information: ");
        System.out.println("\nName: " + s.name + "\nContact Number: " + s.num + "\nCollege Name: " + s.college +
        "\nPassout Year: " + s.passout + "\nStudent ID: " + s.id);
    }
}