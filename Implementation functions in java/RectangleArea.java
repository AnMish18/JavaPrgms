/*Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by creating a class named 'Rectangle'
 with a method named 'Area ()' which returns the area. 
 Anwesha Mishra-11
 qn 3*/
class Rectangle{
    float length,breadth;
     Rectangle(int a, int b){   //parameterized constructor 
      length = a;
      breadth = b;
    }
     float Area(){
     return length*breadth;
  }
}
  
  class RectangleArea{
    public static void main(String[] args){
      Rectangle m = new Rectangle(4,5);
      Rectangle n = new Rectangle(5,8);
      System.out.println("Area :" +m.Area());
      System.out.println("Area : "+n.Area());
    }
  }		 
