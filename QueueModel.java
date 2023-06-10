import java.util.LinkedList;
import java.util.Queue;

interface basequeue {
    public void add(int a);
    public void remove();
    public void peek();
    public void iter();
    public void isEmpty();
    public void size();
}

class queue implements basequeue {
    Queue<Integer> q;
    public queue() {
        q = new LinkedList<>();
    }

    public void add(int n) {
        q.add(n);
    }

    public void remove() {
        int removed = q.remove();
        System.out.println("\nRemoved Element: " + removed);
    }

    public void isEmpty() {
        if (q.size() == 0) {
            System.out.println("\nQueue is empty.");
        }

        else {
            System.out.println("\nQueue is not empty.");
        }
    }

    public void size() {
        System.out.println("\nSize of queue: " + q.size());
    }

    public void iter() {
        System.out.println("\nElements of queue: " + q);
    }

    public void peek() {
        System.out.println("\nTop element: " + q.peek());
    }
}

public class QueueModel {
    public static void main(String[] args) {
        queue s = new queue();
        s.isEmpty();
        s.add(4);
        s.add(5);
        s.add(6);
        s.add(7);
        s.isEmpty();
        s.size();
        s.peek();
        s.iter();
        s.remove();
        s.iter();
    }
}