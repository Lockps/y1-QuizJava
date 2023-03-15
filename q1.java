//quiz_1
import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N :");
        int n = sc.nextInt();
        double o = 0;
        int x = 0;

        for (int i = 1; i <= n; i++) {
          if(i%2==0 || i%7==0){
            o += (float) i / (i + 2);
            o+=(2*i+2);
            
            }
          
          if (i % 40==0) {
                System.out.printf("%.3f\n", o);
            }       
        }
        System.out.printf("Last value is %.3f" , o);
    }
}
