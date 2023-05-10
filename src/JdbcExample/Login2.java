package JdbcExample;

import java.sql.*;
import java.util.Scanner;

public class Login2 {
        static final String DB_URL = "jdbc:mysql://localhost/BankManagementSystem";
        static final String USER = "root";
        static final String PASS = "root";

    public Login2(){
        Connection con = null;
        PreparedStatement p = null;
        Statement s = null;
        ResultSet rs = null;
        try {
            con = DriverManager.getConnection(DB_URL, USER, PASS);
            String query = "select * from FirstRegistration;";
            p = con.prepareStatement(query);
            s=con.createStatement();
            rs = p.executeQuery();
            while (rs.next()) {
                String user_name = rs.getString("username");
                String pass_word = rs.getString("pass");
                if(isValid(user_name)){
                    String query2 = "insert into FinalReg values('" + user_name + "','" + pass_word + "');";
                    s.executeUpdate(query2);
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        System.out.println("successful");
    }

    private boolean isValid(String userName) {
        for (int i = 0; i < userName.length(); i++) {
            char ch = userName.charAt(i);
            if (Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        new Login2();

    }
}
