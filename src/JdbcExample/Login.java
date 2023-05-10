package JdbcExample;

import java.sql.*;
import java.util.Scanner;

public class Login {
        static final String DB_URL = "jdbc:mysql://localhost/BankManagementSystem";
        static final String USER = "root";
        static final String PASS = "root";



    public Login(String username,String password){
        Connection con = null;
        PreparedStatement p = null;
        Statement s = null;
        ResultSet rs = null;
        boolean flag = false;
        try {
            con = DriverManager.getConnection(DB_URL, USER, PASS);
            String query = "select * from login;";
            p = con.prepareStatement(query);
            rs = p.executeQuery();
            while (rs.next()) {
                String user_name = rs.getString("username");
                String pass_word = rs.getString("password");
                if(username.equals(user_name) && password.equals(pass_word)){
                    flag=true;
                    break;
                }
            }
            if (flag) {
                System.out.println("login success");
            }else{
                System.out.println("login unsuccessful");
            }


        } catch (SQLException e) {
            System.out.println(e);
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter username: ");
        String username=sc.next();
        System.out.print("enter password: ");
        String password=sc.next();
        new Login(username,password);

    }
}
