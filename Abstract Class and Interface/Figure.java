//qn 1
//Anwesha Mishra-11
abstract class GeometricFigure
{
    double dim1, dim2;
    GeometricFigure(double a, double b) { 
        dim1 = a; 
        dim2 = b;
     }

abstract double getArea();    //abstract method
}
class Rectangle extends GeometricFigure
{
   Rectangle(double a, double b) { 
       super(a, b); 
    }

double getArea()     //abstract method gets overriden
   {
  System.out.println("Area of rectangle: ");
  return dim1 * dim2;
   }
}
class Triangle extends GeometricFigure
{
Triangle(double a, double b) { 
    super(a, b); 
}

double getArea()
 {
  System.out.println("Area of Triangle: "); 
  return dim1 * dim2 / 2;
 }
}
class Figure
{
public static void main(String args[])
{

Rectangle r = new Rectangle(10, 20);
Triangle t = new Triangle(15, 5);
GeometricFigure fig; // reference variable created using the abstract class
fig = r;
System.out.println("  " + fig.getArea());
fig = t;
System.out.println("  " + fig.getArea());
}
}

