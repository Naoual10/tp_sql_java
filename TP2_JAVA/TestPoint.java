class TestPoint{
static public void main(String args[]){
       
 // Point p = new Point();
 //test de constructeur       System.out.println("p coordinates: (" + p.getX() + ", " + p.getY() + ")");
 Point p = new Point(3, 7);

        // tester overridden toString() method
        System.out.println("String representation of p: " + p.toString());
}
} ;