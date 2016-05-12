package Final_Project;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JLabel;

public class Mouse implements MouseListener, MouseMotionListener{
    
    House[] house = new House[14 * 14];
    
    public Mouse(){
        for(int i = 0; i < house.length; i++){
            house[i] = new House();
        }
    }
    
    public void printHouse(int x, int y){
        house[x + y * 14].printHouse(x, y);
    }
    
    public void mouseClicked(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
        JLabel label = (JLabel)e.getSource();
        if(label.getName().equals("House")){
            printHouse(((label.getX()-4)/32), ((label.getY()-4)/32));
        }
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseDragged(MouseEvent e) {
    }

    public void mouseMoved(MouseEvent e) {
    }

}
