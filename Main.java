import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(i);
		System.out.println("\nEnter name: ");
		String n = b.readLine();
		System.out.println("\nName: " + n);
	}
}