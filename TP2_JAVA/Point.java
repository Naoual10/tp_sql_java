import java.net.*;
 public class Point {
    private double x;
    private double y;
 public Point(int a, int b) {
        this.x = a;
        this.y = b;
    }
// option 1
 public Point() {
       this(0, 0);
    }
//option 2 
// public Point() {
  //      this(0); 
  //  }
// public Point(int a) {
     //   this.x = a;
     //   this.y = 0;
   // }
  public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

  public void setX(double x){
    this.x=x;

}
  public void setY(double y){
     this.y=y;


}
  public double getX(){
    return this.x;


}
public double getY(){
    return this.y;


}
public void deplacer (double depX, double depY) {
        this.x += depX;
        this.y += depY;
    }
public void reset() {
        this.x = 0;
        this.y = 0;
    }
public double distance (Point b){
       double distance;
       double nx=this.x-b.getX();
       double ny=this.y-b.getY();
        distance= Math.sqrt(nx*nx +ny*ny);
    return distance ;

}
public static double distance (Point a,Point b){
double distance ;
 double nx=a.getX()-b.getX();
       double ny=a.getY()-b.getY();
        distance= Math.sqrt(nx*nx +ny*ny);
return distance;
}
public boolean equals(Point a) {
        return (this.x == a.x && this.y == a.y);
    }
 @Override
    public boolean equals(Object a) {
        if (this == a) return true;
        if (a == null || getClass() != a.getClass()) return false;
        Point point = (Point) a;
        return x == point.x && y == point.y;
    }
 @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }


}

