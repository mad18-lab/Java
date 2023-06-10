package test;

class Student implements java.io.Serializable {
    public Student() {}
    String name, num, branch;
    double cgpa;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getNum() {
        return num;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getBranch() {
        return branch;
    }

    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }

    public double getCGPA() {
        return cgpa;
    }
}

public class Model {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Madhav Gupta");
        s1.setNum("9953126471");
        s1.setBranch("CSE Core");
        s1.setCGPA(8.30);
        System.out.println("\nStudent Info: ");
        System.out.println("\nName: " + s1.getName() + "\nContact Number: " + s1.getNum() + "\nBranch: " + s1.getBranch() + "\nCGPA: " + s1.getCGPA());
    }
}