package BankManagementSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame{
    private JLabel cardno;
    private JTextField cardtxt;
    private JLabel pin;
    private JTextField pintxt;
    private JLabel heading;
    private JButton signin;
    private JButton signup;
    private JButton clear;
    private JPanel MainPanel;

    public Login() {

        setContentPane(MainPanel);
        setTitle("Login Form");
        setSize(800, 600);
        setVisible(true);
        setLocation(320, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    clear.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            cardtxt.setText("");
            pintxt.setText("");
        }
    });
        signup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new SignUpOne().setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        new Login();
    }
}
