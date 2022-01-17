//qn 3
//Anwesha Mishra-11
import java.util.Scanner;

class Shape{
    int l,b;
    Shape(){}  //default constructor
    Shape(int l,int b){  
        this.l=l;
        this.b=b;
    }
    void getArea(){
        System.out.println("Area of Rectangle: "+(l*b));
    }
    int getArea(int s){
        return s*s;
    }
    float getArea(float c){   //getArea method undegoes method overloading
        return (float)Math.PI*c;
    }
}

 class TestArea {
    public static void main(String[] args) {
        Scanner mp = new Scanner(System.in);

        System.out.println("Enter the length of rectangle: ");
        int l = mp.nextInt();
        System.out.println("Enter the breadth of rectangle: ");
        int b = mp.nextInt();
        Shape shape1= new Shape(l,b);
        Shape shape2 = new Shape();
        Shape shape3 = new Shape();

        System.out.println("The side of square i: ");
        int s = mp.nextInt();
        System.out.println(" Radius of Circle: ");
        float rad = mp.nextFloat();

        shape1.getArea();
        System.out.println("Area of Square: "+shape2.getArea(s));
        System.out.println("Area of Circle: "+shape3.getArea(rad));


    }
}
