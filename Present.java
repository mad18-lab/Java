import java.io.*;
import java.util.*;

class Student {
    void attendance() {
        System.out.println("\nStudent attendance: ");
    }
}

class Present extends Student {
    void attendance() {
        System.out.println("\nMark present.");
    }

    public static void main(String[] args) {
        Present p = new Present();
        p.attendance();
    }
}