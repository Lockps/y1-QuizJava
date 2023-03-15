import javax.swing.JOptionPane;
import java.util.*;

public class quiz2{
  public static void main(String[] args){
    JOptionPane box = new JOptionPane(System.in);
    float inp = Float.parseFloat(box.showInputDialog("Enter the slide : "));
    float out = 1.5f*1.732f*inp*inp;
    box.showMessageDialog(box,"The area of the hexagon is "+out);
  }
swap
}