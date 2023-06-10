import java.util.Stack;

interface stack_op {
    public void push(int a);
    public void pop();
    public void peek();
    public void display();
}

class stack implements stack_op {
    Stack<Integer> s = new Stack<Integer>();

    public void push(int n) {
        s.push(n);
    }

    public void pop() {
        System.out.println("\nPopped Element: " + s.pop());
    }

    public void peek() {
        System.out.println("\nTop Element: " + s.peek());
    }

    public void display() {
        System.out.println("\nElements of Stack: " + s);
    }
}

public class StackTest {
    public static void main(String[] args) {
        stack s1 = new stack();
        s1.push(5);
        s1.push(4);
        s1.push(3);
        s1.push(2);
        s1.push(1);
        s1.display();
        s1.peek();
        s1.pop();
    }
}