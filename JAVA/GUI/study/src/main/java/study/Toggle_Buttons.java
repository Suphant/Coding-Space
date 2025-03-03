package study;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Toggle_Buttons extends JFrame implements ActionListener{

    JButton button[] = new JButton[8];
    String imageName[] = {"angry", "blushing", "confused", "disbelief", "excited", "good", "happy", "hi"};
    

    public Toggle_Buttons(){
        intComponents();

        setTitle("Toggle buttons");
        setLocationRelativeTo(null);
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    private ImageIcon getIcon(String filename){
        ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("emotion/" + filename + ".png"));
        return icon;
    }

    private void intComponents() {
        setLayout(new GridLayout(2, 4));

        for(int i = 0; i < button.length; i++) {
            button[i] = new JButton(imageName[i]);
            button[i].addActionListener(this);
            add(button[i]);
        }
    }


    public static void main(String[] args) {
        new Toggle_Buttons();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        for(int i = 0; i < button.length; i++){
            if(source == button[i]){
                if(button[i].getText() != null) {
                    button[i].setIcon(getIcon(imageName[i]));
                    button[i].setText(null);
                } else {
                    button[i].setIcon(null);
                    button[i].setText(imageName[i]);
                }
            }
        }
    }
}
