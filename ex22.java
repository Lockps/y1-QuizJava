import java.util.*;
import javax.swing.*;

public class ex22 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter r1's center x-,y-coordinates,width and height : ");
      int r1x = Integer.parseInt(sc.next());
      int r1y = Integer.parseInt(sc.next());
      int r1w = Integer.parseInt(sc.next());
      int r1h = Integer.parseInt(sc.next());
      System.out.print("Enter r2's center x-,y-coordinates,width and height : ");
      int r2x = Integer.parseInt(sc.next());
      int r2y = Integer.parseInt(sc.next());
      int r2w = Integer.parseInt(sc.next());
      int r2h = Integer.parseInt(sc.next());
     
//r1cal
      int r1ww = r1w/2;
      int r1hh = r1h/2;
       int r1l=r1x-r1ww;
       int r1r=r1x+r1ww;
       int r1t=r1y+r1hh;
       int r1b=r1y-r1hh;
//r2cal                       
      int r2ww = r2w/2;
      int r2hh = r2h/2;
       int r2l=r2x-r2ww;
       int r2r=r2x+r2ww;
       int r2t=r2y+r2hh;
       int r2b=r2y-r2hh;       
       
       if(r1l < r2l && r1r > r2r && r1t > r2t && r1b < r2b) {
            System.out.println("r2 inside r1");
            
       }  
        
       if(r1l < r2l || r1r > r2r || r1t > r2t || r1b < r2b) {
          System.out.println("r2 overlaps r1");

        } 
        
        while (r1l > r2l && r1r < r2r && r1t < r2t && r1b > r2b) {
            System.out.println("r2 does not overlap r1");
        }
}
}