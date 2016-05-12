package Final_Project;

import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
    private JFrame frame;
    private Mouse mouse;
    private ImageIcon house = new ImageIcon(getClass().getResource("/House.png"));
    private ImageIcon road = new ImageIcon(getClass().getResource("/Road.png"));
    private ImageIcon grass = new ImageIcon(getClass().getResource("/Grass.png"));
    
    public JLabel[] label = new JLabel[14*14];
    
    public Main(){
        
        frame = new JFrame();
        mouse = new Mouse();
        labelMaker();
        frame.getContentPane().setLayout(new GridLayout(14, 14));
    }
    
    public void labelMaker(){
        
        for(int i = 0; i < label.length; i++){
            label[i] = new JLabel();
            label[i].addMouseListener(mouse);
            label[i].addMouseMotionListener(mouse);
            label[i].setIcon(grass);
            label[i].setName("Grass");
        }
        
        for(int y = 0; y < 14; y++){
            for(int x = 0; x < 14; x++){
                if(y == 3 || y == 8 || y == 5 || y == 10){
                    label[x + y * 14].setIcon(house);
                    label[x + y * 14].setName("House");
                }
                if(x == 3 || x == 8 || x == 5 || x == 10){
                    label[x + y * 14].setIcon(house);
                    label[x + y * 14].setName("House");
                }
                if(y == 4 || y == 9 || x == 4 || x == 9){
                    label[x + y * 14].setIcon(road);
                    label[x + y * 14].setName("Road");
                }
                frame.add(label[x + y * 14]);
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        
        main.frame.setResizable(false);
        main.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.frame.pack();
        main.frame.setSize(464, 487);
        main.frame.setTitle("Welcome to the neighborhood!");
        main.frame.setLocationRelativeTo(null);
        main.frame.setVisible(true);
    }
}
