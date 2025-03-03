package study;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

public class GUI_Icons extends JFrame implements ActionListener{

    JButton button[] = new JButton[8];


    public GUI_Icons(){
        intComponents();

        setSize(800, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    private Color getRandomColor(){
        Random rand = new Random();
        return new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
    }
    
    private ImageIcon getRandomIcon(){
        Random rand = new Random();
        
        String imageName[] = {"angry", "blushing", "confused", "disbelief", "excited", "good", "happy", "hi"};
        int randIndex = rand.nextInt(imageName.length);
        ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("emotion/" + imageName[randIndex] + ".png"));
        return icon;
    }

    private void intComponents() {
        setLayout(new GridLayout(2, 4));
        
        for(int i = 0; i < button.length; i++){
            
            button[i] = new JButton(getRandomIcon());
            button[i].setBackground(getRandomColor());
            button[i].setFocusable(false);
            button[i].addActionListener(this);
            
            add(button[i]);
            
            
        }
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
//        for(JButton b : button) {
//            b.setIcon(getRandomIcon());
//            b.setBackground(getRandomColor());
//        }
        for(int i = 0; i < button.length; i++){
            if(source == button[i] && source != button[0]){
                for(int j = 0; j < button.length; j++){
                    button[j].setBackground(getRandomColor());
                    button[j].setIcon(getRandomIcon());
                }
            }
            if(source == button[0]){
                for(int j = 1; j < button.length; j++){
                    button[j].setBackground(button[0].getBackground());
                }
            }
        }
    }

    public static void main(String[] args) {
        new GUI_Icons();
    }

    
}