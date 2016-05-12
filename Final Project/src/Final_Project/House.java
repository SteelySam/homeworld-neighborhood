package Final_Project;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.TextArea;
import java.util.Random;
import javax.swing.JFrame;

public class House {
    
    private int garage;
    private double bathroom;
    private int bedroom;
    private boolean upstairs;
    private boolean basement;
    private boolean pool;
    private boolean haunted;
    
    private int size;  //in square feet
    private Random random = new Random();
    
    private JFrame frame;
    private Dimension dmsn = new Dimension(300, 220);

    
    public House(){
        size = (random.nextInt(2001)+1000); //1000 - 3000 square feet
        garage = random.nextInt(size/500)+1;
        bathroom = random.nextInt(size/1000)+1.5;
        bedroom = random.nextInt(size/500)+2;
        if(size > 2000) upstairs = random.nextBoolean();
        basement = random.nextBoolean();
        pool = random.nextBoolean();
        if(random.nextInt(15) == 0) haunted = true; //this value is hidden from the user
    }
    
    public void printHouse(int x, int y){
        window();
        frame.setTitle("House #"+x+y);
        String houseText = "";
        if(upstairs)houseText = houseText + "A 2 story house with balcony.\n";
        if(basement)houseText = houseText + "This house has a basement.\n";
        if(pool)houseText = houseText + "This house has a pool.\n";
        houseText = houseText + garage +" Car Garage\n"+ bathroom +" Bathroom\n"+ bedroom +" Bedroom\n\n";
        houseText = houseText + size + " square ft.";
        TextArea textarea = new TextArea(houseText);
        textarea.setFont(new Font("Arial", Font.ITALIC, 16));
        textarea.setBackground(Color.YELLOW);
        frame.add(textarea);
    }
    
    private void window(){
        frame = new JFrame();
        frame.setResizable(false);
        frame.setPreferredSize(dmsn);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
