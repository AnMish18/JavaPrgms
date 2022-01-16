//qn 3
//Anwesha Mishra-11
import java.util.*;
 class Rectangle {
      double length;
      double breadth;

    public Rectangle(double length, double breadth) {   //constructor to initialize length and breadth
        this.length = length;
        this.breadth = breadth;
    }

    public void area() {
        System.out.println(length * breadth);
    }

    public void perimeter() {
        System.out.println(2 * (length + breadth));
    }
}
 class Square extends Rectangle {
    public Square(double s) {
        super(s, s);
    }
}
public class AreaShape {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double length,breadth,side;
        System.out.println("Enter length and breadth of rectangle");
        length=sc.nextDouble();
        breadth=sc.nextDouble();
        Rectangle r = new Rectangle(length, breadth);
        System.out.println("enter side of square");
        side=sc.nextDouble();
        Rectangle sqr= new Square(side);
      r.area();
        r.perimeter();
        System.out.println();
       sqr.area();
        sqr.perimeter();
    }
}
