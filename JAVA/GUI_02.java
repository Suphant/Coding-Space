import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class GUI_02 extends JFrame implements ActionListener{

    JTextField inputTextField;
    JButton okButton;
    JTextArea outPuTextArea;
    static String sumInput = "";

    public GUI_02(){
        intComponents();

        setLayout(null);
        setSize(600, 500);
        setLocation(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void intComponents(){
        inputTextField = new JTextField();
        okButton = new JButton("OK");
        outPuTextArea = new JTextArea();
        

        

        add(inputTextField);
        add(okButton);
        add(outPuTextArea);

        inputTextField.setSize(400, 50);
        inputTextField.setLocation(40, 40);
        inputTextField.setForeground(Color.RED);
        inputTextField.setFont(new Font("", Font.BOLD, 30));
        inputTextField.setBorder(new BevelBorder(BevelBorder.RAISED));
        inputTextField.addActionListener(this);

        okButton.setSize(90, 50);
        okButton.setLocation(480, 40);
        okButton.addActionListener(this);

        outPuTextArea.setSize(540, 350);
        outPuTextArea.setLocation(20, 120);
        outPuTextArea.setFont(new Font("", Font.ITALIC, 30));


    }

    public static void main(String[] args) {
        new GUI_02();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        

        if(source == inputTextField || source == okButton){
            String message = inputTextField.getText() + "\n" + outPuTextArea.getText();
            outPuTextArea.setText(message);
            inputTextField.setText("");
        }
    }
}
