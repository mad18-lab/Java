import java.sql.*;

public class Hospital {
    static final String DB_URL = "jdbc:mysql://localhost:3306/VRD";
    static final String USER = "root";
    static final String PASS = "Madhav@2003";

    public static void main(String args[]) {
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = conn.createStatement();)
        {
            String sql = "SELECT * FROM hospital";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                System.out.println(rs.getInt(columnIndex:1) + " " + rs.getString(columnIndex:2) + " " + rs.getInt(columnIndex:3));
            }
            conn.close();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
