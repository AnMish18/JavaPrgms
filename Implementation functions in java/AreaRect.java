/*Write a program to print the area of a rectangle by creating a class named 'Area' having two methods.
 First method named as 'setDim ()' takes length and breadth of rectangle as parameters and the second method named as 'getArea ()'
 returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.
 Anwesha Mishra-11
 qn-6*/

import java.util.Scanner;
 class Area{
int length,breadth;
    Area(int length, int breadth){  //parameterized constructor
           this.length=length;
           this.breadth=breadth;
    }
    public int setDim(){
    int results = length * breadth;
    return results;
    }
     public void getArea(){
    System.out.println("Area = " +  setDim());
    }
}
class AreaRect{
    public static void main(String []args){
        int length,breadth;
        System.out.println("Enter length and breadth");
        Scanner mn=new Scanner(System.in);
        length=mn.nextInt();
        breadth=mn.nextInt();
        Area x =new Area(length,breadth);
        x.getArea();
        
    }
    }


    
    
    
