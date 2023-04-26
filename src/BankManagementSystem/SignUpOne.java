package BankManagementSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpOne extends JFrame{
    private JPanel SignOnePanel;
    private JLabel heading1;
    private JLabel heading2;
    private JLabel name;
    private JTextField nametxt;
    private JTextField fnametxt;
    private JTextField dobtxt;
    private JTextField emailtxt;
    private JTextField maritaltxt;
    private JTextField addresstxt;
    private JTextField citytxt;
    private JTextField statetxt;
    private JLabel Fname;
    private JTextField pincodetxt;
    private JLabel dob;
    private JLabel gender;
    private JLabel email;
    private JLabel marital;
    private JLabel address;
    private JLabel city;
    private JLabel state;
    private JLabel pincode;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JButton nextbtn;
public SignUpOne() {

    setContentPane(SignOnePanel);
    setTitle("SignUp Form");
    setSize(800, 600);
    setVisible(true);
    setLocation(320, 100);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    nextbtn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name=nametxt.getText();
            String f_name=fnametxt.getText();
            String dob=dobtxt.getText();
            String gender = "";
            if (maleRadioButton.isSelected()) {
                gender = "Male";
            } else if (femaleRadioButton.isSelected()) {
                gender = "Female";
            }
            String email=emailtxt.getText();
            String married=maritaltxt.getText();
            String address=addresstxt.getText();
            String city=citytxt.getText();
            String state=statetxt.getText();
            String pincode=pincodetxt.getText();
            if (name.isEmpty() || f_name.isEmpty() || dob.isEmpty() ||
                    gender.isEmpty() || email.isEmpty() || married.isEmpty() ||
                    address.isEmpty() || city.isEmpty() || state.isEmpty() ||
                    pincode.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Plz fill the entire form");
            } else {
            String query="insert into signup values('"+name+"','"+f_name+"'," +
                    "'"+dob+"','"+gender+"','"+email+"','"+married+"'," +
                    "'"+address+"','"+city+"','"+state+"','"+pincode+"');";
            Conn c=new Conn();
            try {
                c.s.executeUpdate(query);
            } catch (Exception ex) {
                System.out.println(ex);
            }
            JOptionPane.showMessageDialog(null,"SignUp successful");
            }
        }
    });
}

    public static void main(String[] args) {
        new SignUpOne();
    }
}
