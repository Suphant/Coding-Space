package study;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI_ArrayList extends JFrame {

    private JButton button[] = new JButton[8];
    private JButton randomButton;

    ArrayList<String> emotionList;

    public GUI_ArrayList() {
        setTitle("Random Emotions");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        intComponents();
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new GUI_ArrayList();
    }

    private void intComponents() {
        setLayout(new BorderLayout());

        // สร้างปุ่ม Random ก่อน
        randomButton = new JButton("Shuffle Emotions");
        randomButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generateRandomEmotion();
                updateButtons();
            }
        });

        generateRandomEmotion();

        JPanel panel = new JPanel(new GridLayout(2, 4));
        for(int i = 0; i < button.length; i++) {
            button[i] = new JButton(emotionList.get(i));
            panel.add(button[i]);
        }

        add(randomButton, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
    }

    private void updateButtons() {
        for(int i = 0; i < button.length; i++) {
            button[i].setText(emotionList.get(i));
        }
    }

    private void generateRandomEmotion() {
        String[] allWords = {
            "angry", "blushing", "confused", "disbelief", "excited",
            "good", "happy", "hi", "love", "no",
            "ok", "optimist", "peace", "shocked", "shy", "yawn", "yes"
        };

        ArrayList<String> list = new ArrayList<>(Arrays.asList(allWords));
        Collections.shuffle(list);
        emotionList = new ArrayList<>(list.subList(0, button.length));

        System.out.println("emotion: " + emotionList);
    }
}