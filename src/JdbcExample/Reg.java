package JdbcExample;

import java.sql.*;
public class Reg {
    static final String DB_URL = "jdbc:mysql://localhost/BankManagementSystem";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) {
        // Open a connection
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        ) {

            // Execute a query
            PreparedStatement stmt = null;
            System.out.println("Inserting records into the table...");
            String sql = "INSERT INTO Registration VALUES (104, 'Zara', 'Ali', 18)";
            stmt = conn.prepareStatement(sql);
            stmt.executeUpdate(sql);
            sql = "INSERT INTO Registration VALUES (105, 'Mahnaz', 'Fatma', 25)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO Registration VALUES (106, 'Zaid', 'Khan', 30)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO Registration VALUES(107, 'Sumit', 'Mittal', 28)";
            stmt.executeUpdate(sql);
            System.out.println("Inserted records into the table...");
            sql = "update Registration set age=40 where id=102;";
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}