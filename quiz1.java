import java.util.Scanner;

public class quiz1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of hours");
    int inp = sc.nextInt();
    int day = (inp/24)%365;
    int year = (inp/24)/365;
    int hour = (inp%24);
    System.out.print(inp + " hours is approximately ");
    System.out.print(year +" years "+ day +" days "+ hour +" hour");
  }
}