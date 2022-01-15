/*qn 2
Anwesha Mishra-11*/
class Rectangle{
    float length,breadth;
     Rectangle(int length, int breadth){   
      this.length = length;
      this.breadth = breadth;
    }
     float Area(){
     return length*breadth;
  }
}
  
  class Q2{
    public static void main(String[] args){
      Rectangle m = new Rectangle(4,5);
      Rectangle n = new Rectangle(5,8);
      System.out.println("Area :" +m.Area());
      System.out.println("Area : "+n.Area());
    }
  }		
