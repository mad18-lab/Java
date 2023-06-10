import java.sql.*;

class Library {
    void bookavailable() { 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //Class.forName("com.mysql.cj.jdbc.Driver"); 
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","madhav@2003");
            //here sonoo is database name, root is username and password 
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from books where status=0"); 
            System.out.println("The Books Available in Library are :"); 
            while(rs.next())
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)); 
                conn.close();
            System.out.println();
        }
        catch(Exception e) { 
            System.out.println(e);
        }
    }

    void issuedlog() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","madhav@2003");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from issued where stdname is not null"); 
            System.out.println("The Issued Books from Library are :");
            while(rs.next())
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)); 
                conn.close();
            System.out.println();
        }
        catch(Exception e) { 
            System.out.println(e);
        }
    }
 
    void issuebook(String bookname,String issuedto) { 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","madhav@2003");
            //here sonoo is database name, root is username and password 
            Statement stmt = conn.createStatement();
            String query="insert into issued values (0,'"+issuedto+"','"+bookname+"');"; 
            stmt.executeUpdate(query);
            System.out.println();
            query="update books set status=1 where bookname ='"+bookname+"';"; 
            stmt.executeUpdate(query);
            conn.close();
        }
        catch(Exception e) { 
            System.out.println(e);
        }
    }

    void returnbk(String bookname,String issuedto) { 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","madhav@2003");
            //here sonoo is database name, root is username and password 
            Statement stmt = conn.createStatement();
            String query="update issued set stdname=null,bookname=null where bookname='"+bookname+"'and stdname='"+issuedto+"';";
            stmt.executeUpdate(query); 
            System.out.println();
            query="update books set status=0 where bookname ='"+bookname+"';"; 
            stmt.executeUpdate(query);
            conn.close();
        }
        catch(Exception e) { 
            System.out.println(e);
        }
    }
}

public class LibraryBook {
    public static void main(String[] args) {
        //TODO Auto-generated method stub 
        Library L = new Library();
        L.bookavailable(); 
        L.issuebook("Harry Potter","Madhav");
        L.issuebook("The Lord of the Rings","Madhav"); 
        L.issuedlog();
        L.bookavailable(); 
        L.returnbk("Harry Potter","Madhav"); 
        L.bookavailable();
        L.issuedlog();
    }
}
