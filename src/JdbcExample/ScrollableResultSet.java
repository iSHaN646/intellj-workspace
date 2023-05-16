package JdbcExample;

import java.sql.*;
public class ScrollableResultSet {

    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/BankManagementSystem", "root",
                "root");
        Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = st.executeQuery("select * from Registration");
        System.out.println("RECORDS IN THE TABLE...");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " -> " + rs.getString(2));
        }
        rs.first();
        System.out.println("FIRST RECORD...");
        System.out.println(rs.getInt(1) + " -> " + rs.getString(2));
        rs.absolute(3);
        System.out.println("THIRD RECORD...");
        System.out.println(rs.getInt(1) + " -> " + rs.getString(2));
        rs.last();
        System.out.println("LAST RECORD...");
        System.out.println(rs.getInt(1) + " -> " + rs.getString(2));
        rs.previous();
        rs.relative(-1);
        System.out.println("LAST TO FIRST RECORD...");
        System.out.println(rs.getInt(1) + " -> " + rs.getString(2));
        con.close();
    }
}
