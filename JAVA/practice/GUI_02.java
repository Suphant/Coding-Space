import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI_02 extends JFrame{
    JTextField inpuTextField;
    JButton loginButton;
    
    public GUI_02(){
        intComponent();

        setTitle("Login");
        setLayout(null);
        setSize(500, 300);
        setLocation(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void intComponent(){
        JPanel mainPanel = new JPanel(null); // ใช้ null layout
        mainPanel.setSize(500, 300);
    
        JLabel userJLabel = new JLabel("User");
        userJLabel.setBounds(10, 20, 80, 25); // จะทำงานตอนนี้
        mainPanel.add(userJLabel);
    
        add(mainPanel);
    }

    public static void main(String[] args) {
        new GUI_02();
    }
}
