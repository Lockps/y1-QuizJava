import java.util.*;
public class q62{
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter your number : ");
  int sec = sc.nextInt();
  double[] inp = new double[10];
  System.out.print("Enter 10 number : ");
  for(int i = 0 ; i< inp.length ; i++){
    inp[i] = sc.nextDouble();
  }
  Arrays.sort(inp);
  
  for(int i = 0 ; i < inp.length ; i++){
    System.out.printf("%.2f\t",inp[i]);
  }
  System.out.printf("\nYour number is %.2f",inp[sec-1]);
}
}