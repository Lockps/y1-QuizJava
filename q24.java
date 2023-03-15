public class q24 {
    public static void main(String[] args) {
      double h = 5;
      double r = 6;
      double R = 7;
      System.out.printf("Enter radius : %.3f\n",r);
      
      System.out.printf("Enter outer radius : %.3f\n",R);
      
      System.out.printf("Enter height : %.3f\n",h);
      
      System.out.print("__________________________\n");
      
      double cy = calarea(r,h,Math.PI);
      
      double cirring = calarea(R,r);
      
      double cir = calarea(r);
      
      System.out.printf("Area of cylinder is %.3f\n",cy);
      System.out.printf("Area of circular ring is %.3f\n",cirring);
      System.out.printf("Area of circle is %.3f\n",cir);
    }
    
    public static double calarea(double r , double h,double a){
      return (2*a*Math.pow(r,2))+(2*a*r*h);
    }

    public static double calarea(double R , double r){
      return Math.PI*(Math.pow(R,2)-Math.pow(r,2));
    }


    public static double calarea(double r){
      return Math.PI*(Math.pow(r,2));
    }
}