package study;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayList_GUI extends JFrame implements ActionListener{
    JButton button[] = new JButton[8];
    JButton randomButton;
    JPanel panelRandomButton;
    JPanel panel;

    ArrayList<String> emotionList;

    public ArrayList_GUI(){
        intComponents();

        setTitle("Demo: Arraylist and Panel");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void intComponents(){
        setLayout(new BorderLayout());

        
        panelRandomButton = new JPanel();
        panelRandomButton.setLayout(new BorderLayout());

        randomButton = new JButton("Random Emotions");
        randomButton.addActionListener(this);
        panelRandomButton.add(randomButton);


        panel = new JPanel(new GridLayout(2, 4));

        generateRandomEmotion();


        
        for(int i = 0; i < button.length; i++){
            button[i] = new JButton(emotionList.get(i));
            button[i].setIcon(getIcon(emotionList.get(i)));
            button[i].setVerticalTextPosition(SwingConstants.BOTTOM);
            button[i].setHorizontalTextPosition(SwingConstants.CENTER);
            button[i].setFocusable(false);
            panel.add(button[i]);
        }

        add(panelRandomButton, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
    }

    private ImageIcon getIcon(String filename){
        ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("emotion/" + filename + ".png"));
        return icon;
    }

    private void generateRandomEmotion(){
        String[] allWords = {
            "angry", "blushing", "confused", "disbelief", "excited",
            "good", "happy", "hi", "love", "no",
            "ok", "optimist", "peace", "shocked", "shy", "yawn", "yes"
        };

        ArrayList<String> list = new ArrayList<>(Arrays.asList(allWords));
        Collections.shuffle(list);
        emotionList = new ArrayList<>(list.subList(0, button.length));
    }
    public static void main(String[] args) {
        new ArrayList_GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == randomButton){
            generateRandomEmotion();
            for (int i = 0; i < button.length; i++) {
                button[i].setText(emotionList.get(i));
                button[i].setIcon(getIcon(emotionList.get(i)));
                button[i].setFocusable(false);
                button[i].setVerticalTextPosition(SwingConstants.BOTTOM);
                button[i].setHorizontalTextPosition(SwingConstants.CENTER);
            }
        }
    }
}
