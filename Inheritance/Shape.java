+//qn 4
//Anwesha Mishra-11
class Shapez{
    public void displayShape(){
      System.out.println("This is This is shape");
    }
  }

  class Rectangle extends Shapez{
    public void displayRect(){
      System.out.println("This is rectangular shape");
    }
  }

  class Circle extends Shapez{
    public void displayCircle(){
      System.out.println("This is circular shape");
    }
  }

  class Square extends Rectangle{
    public void displaySquare(){
      System.out.println("Square is a rectangle");
    }
  }

  class Shape{
    public static void main(String[] args){
      Square square = new Square();  //square class obj
      square.displayShape();    // shape method by square obj
      square.displayRect();    // rectangle method by square obj
      Circle cr=new Circle();
      cr.displayCircle();
    }
  }
