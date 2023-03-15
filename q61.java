import java.util.*;
public class q61{
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the number of row and column : ");
  int size = sc.nextInt();
  int[][] op  = new int[size][size];
  for(int i = 0 ; i < size ; i++){
    for(int j = 0 ; j < size ; j++){
      op[i][j] = (int)(Math.random()*100);
      System.out.printf("%d\t",op[i][j]);
    }
    System.out.println();
  }
  show57star(op);
  System.out.println("\n");
}

public static void show57star(int[][] matrix){
  System.out.println("=======================================");
  for(int i = 0 ; i < matrix.length ; i++){
    for(int j = 0 ; j < matrix.length ; j++){
      if(i%2==0){
      if(matrix[i][j]%10==5 || matrix[i][j]%10==7) System.out.print("*\t");
      else{
        System.out.printf("%d\t",matrix[i][j]);
      }
}
      else{System.out.printf("%d\t",matrix[i][j]);}
    }
    System.out.println();
}
}
}