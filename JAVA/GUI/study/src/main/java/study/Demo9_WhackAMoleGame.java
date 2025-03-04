package study;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;

public class Demo9_WhackAMoleGame extends JFrame implements ActionListener {

    private static final String MOLE = "mole/mole2.png";
    private static final String WHACK = "mole/crush.png";
    private static final String HAMMER = "mole/mole2.png";

    private int score = 0;
    private int delay = 1000;
    
    private JButton titles[] = new JButton[9];
    private JButton startButton;
    private Random random = new Random();
    private int moleIndex;
    private int gameTime = 5000;

    Timer timer;



    JPanel panelButton;
    JPanel panelStartbutton;



    public Demo9_WhackAMoleGame(){
        intComponents();

        setTitle("Wack-a-Mole");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void intComponents(){
        setLayout(new BorderLayout());

        panelStartbutton = new JPanel();
        panelButton = new JPanel(new GridLayout(3, 3));

        panelStartbutton.setLayout(new BorderLayout());

        for(int i = 0; i < titles.length; i++){
            titles[i] = new JButton();
            titles[i].addActionListener(this);
            panelButton.add(titles[i]);
        }

        
        

        startButton = new JButton("Start");
        startButton.addActionListener(this);
        panelStartbutton.add(startButton);

        add(panelButton, BorderLayout.CENTER);
        add(panelStartbutton, BorderLayout.NORTH);


    }
    
    private void showMole(){
        System.out.println("previous index " + moleIndex);
        titles[moleIndex].setIcon(null);
        moleIndex = random.nextInt(titles.length);
        System.out.println(moleIndex);
        titles[moleIndex].setIcon(getIcon(MOLE));
    }

    private void startGame(){
        score = 0;
        timer = new Timer(delay, e -> showMole());
        startButton.setEnabled(false);
        Timer controlGame = new Timer(gameTime, e -> endGame());
        controlGame.start();    
        controlGame.setRepeats(false);
        timer.start();


        
    }

    void endGame(){
        timer.stop();
        titles[moleIndex].setIcon(null);
        
        startButton.setEnabled(true);


        JOptionPane.showMessageDialog(this, "Your Score: " + score, "Game Over", JOptionPane.INFORMATION_MESSAGE, getIcon(MOLE));
    }

    private ImageIcon getIcon(String filename){
        ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource(filename));
        return icon;
    }

    public static void main(String[] args) {
        new Demo9_WhackAMoleGame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
            if(source == titles[moleIndex]){
                titles[moleIndex].setIcon(null);
                titles[moleIndex].setIcon(getIcon(WHACK));
                score++;
                setTitle("Score: " + score);
            }
            if(source == startButton){
                startGame();
            }
    }
}
