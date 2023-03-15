  public  class cylinder{
    public final double PI = 3.14;
    private double radius;
    private double height;
    
    public cylinder(){
      radius = 5.0;
      height = 5.0;
    }
    
    public cylinder(double r){
      this.radius = r;
      this.height = 5.0;
    }
    
    public cylinder(double r , double h){
      this.radius = r;
      this.height = h;
    }
    
    public double getCircleArea(){
      return PI*Math.pow(radius,2);
    }
    
    public double getCylinderVolume(){
      return PI*Math.pow(radius,2)*height;
    }
    
    public double getSurface(){
      return 2*PI*Math.pow(radius,2)+(2*PI*radius*height);
    }
    
//    public double getheight(){
//      
//    }
    
    public void printCylinder(){
      System.out.printf("All parameter of this Cylinder\nRadius = %.1f cm , height = %.1f cm \nCircle Area = %.2f cm2\nSurface Area = %.1f cm2",radius,height,getCircleArea(),getSurface());
      System.out.println("\nVolume of cylinde = "+getCylinderVolume());
      System.out.println("\n==========================\n");
    }
    
  }
  