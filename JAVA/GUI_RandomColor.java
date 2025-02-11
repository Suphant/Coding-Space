import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI_RandomColor extends JFrame implements ActionListener{

    
    JLabel textJLabel;
    JButton randomButton;
    JButton defaulButton;
   

    public GUI_RandomColor(){
        intComponents();

        setTitle("RandomColor");
        setBounds(10, 20, 500, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void intComponents(){
        textJLabel = new JLabel("Click a botton!");
        textJLabel.setOpaque(true);
        textJLabel.setBounds(200, 10, 80, 20);
        

        randomButton = new JButton("Random Color");
        randomButton.setBounds(100, 40, 140, 20);
        randomButton.addActionListener(this);

        defaulButton = new JButton("Defualt Color");
        defaulButton.setBounds(260, 40, 150, 20);
        defaulButton.addActionListener(this);


        add(randomButton);
        add(defaulButton);
        add(textJLabel);

        

    }
    

    public static void main(String[] args) {
        new GUI_RandomColor();
    }

    static Color ranColor(){
        Random rand = new Random();
        int randRed = rand.nextInt(0, 255);
        int randGreen = rand.nextInt(0, 255);
        int randBlue = rand.nextInt(0, 255);
        Color c = new Color(randRed, randGreen, randBlue);
        return c;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        

        if(source == randomButton){
            textJLabel.setBackground(ranColor());
        }

        if(source == defaulButton){
            textJLabel.setBackground(null);
        }
    }
}
