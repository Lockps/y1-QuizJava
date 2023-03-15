public class q14 {
    public static void main(String[] args) {

      double output = tringlePrismVolumediff(5,4,7,11);
      
      System.out.printf("%.2f",output);
    }
    public static double tringlePrismVolumediff(double h,double b ,double in ,double out){
      return (out-in)*(b*h)/2;
    }
}