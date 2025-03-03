package study;

import java.awt.*;
// import java.awt.GridLayout;
import java.util.Random;

import javax.swing.*;
// import javax.swing.*;

public class Demo05 {
    private JButton button[] = new JButton[8];
    JFrame frame = new JFrame();
    public Demo05(){
        frame.setTitle("Button array with different icons and colors.");
        initComponent();
        frame.setSize(800, 500);
        frame.setLayout(new GridLayout(2, 4));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    private Color getRandomColor(){
        Random rd = new Random();
        return new Color(rd.nextInt(256), rd.nextInt(256), rd.nextInt(256));
    }
    private void initComponent(){
        String imageName[] =  {"angry", "blushing", "confused", "disbelief", "excited", "good", "happy", "hi"};
        for (int i = 0; i < imageName.length; i++) {
            button[i] = new JButton();
            button[i].setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("emotion/" + imageName[i] + ".png")));
            button[i].setBackground(getRandomColor());
            frame.add(button[i]);
        }
    }
    public static void main(String[] args) {
        new Demo05();
    }
}