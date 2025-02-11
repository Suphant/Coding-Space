import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI_Login extends JFrame implements ActionListener {

    JTextField usernameField;
    JPasswordField passwordField;
    JButton cancelButton;
    JButton loginButton;

    private String[][] userData = {
        {"user1", "pass1"},
        {"user2", "pass2"},
        {"user3", "pass3"},
        {"user4", "pass4"},
        {"user5", "pass5"},
    };

    public GUI_Login(){
        intComponents();

        setTitle("Login System");
        setSize(400, 200);
        setLayout(new GridLayout(3, 2));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void intComponents(){
        JLabel userrLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");

        usernameField = new JTextField();
        passwordField = new JPasswordField();
        cancelButton = new JButton("Cancel");
        loginButton = new JButton("Login");

        cancelButton.addActionListener(this);
        loginButton.addActionListener(this);

        

        add(userrLabel);
        add(usernameField);
        add(passLabel);
        add(passwordField);
        add(cancelButton);
        add(loginButton);
    }

    static boolean check(String user, String pass, String userData[][]){
        boolean isFoundUser = false;
        for(int i = 0; i < userData.length; i++){
            if(user.equals(userData[i][0]) && pass.equals(userData[i][1])){
                isFoundUser = true;
                break;
            }

        }
        return isFoundUser;
    }

    private void clearInput(){
        usernameField.setText(null);
        passwordField.setText(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        if(source == loginButton){
            boolean isFoundUser = check(username, password, userData);
            if(isFoundUser){
                JOptionPane.showMessageDialog(this, "Login Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(this, "Login Failed! Pleas try again", "Failed", JOptionPane.ERROR_MESSAGE);
            }
        }else if(source == cancelButton){
            clearInput();
        }

        

    }

    public static void main(String[] args) {
        new GUI_Login();
    }

}
