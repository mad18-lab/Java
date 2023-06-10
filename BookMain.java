class Book {
    int bookNo;
    String bookName;
    double bookPrice;

    Book(int a, String b, double c)  {
        this.bookNo = a;
        this.bookName = b;
        this.bookPrice = c;
    }

    void display() {
        System.out.println(bookNo);
        System.out.println(bookName);
        System.out.println(bookPrice);
    }
}

class SpecialEditionBook extends Book {
    double discount;

    SpecialEditionBook(int a, String b, double c) {
        super(a, b, c);
        this.discount = 10;
    }

    SpecialEditionBook(int a, String b, double c, double d) {
        super(a, b, c);
        this.discount = d;
    }

    void display() {
        super.display();
        System.out.println(discount);
    }

    public void purchase(int bookNo, String bookName, int quantity) {
        System.out.println("\nBook You Purchased: " + bookNo + " - " + bookName);
        System.out.println("\nNumber of copies purchased: " + quantity);
        System.out.println("\nTotal cost: " + (quantity * (bookPrice - discount)));
    }
}

public class BookMain { 
    public static void main(String[] args) {
        Book b = new Book(101, "Harry Potter", 350.0);
        b.display();
        SpecialEditionBook b1 = new SpecialEditionBook(202, "Lord of the Rings", 650.0, 350.0);
        b1.display();
        b1.purchase(202, "Lord of the Rings", 3);
    }
}