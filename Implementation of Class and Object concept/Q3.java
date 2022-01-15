/*qn 3
Anwesha Mishra-11*/
 class Box {
    double width,height,depth;

     Box(double width,double height,double depth)
    {
       this.height=height;
       this.width=width;
       this.depth=depth;
    }
    double volume(){
         double vol;
         vol=height*width*depth;
         return vol;
    }
   }
    class Q3{
    public static void main(String[] args) {
    Box m = new Box(2.4,1.5,7.3);
    System.out.println(m.volume());
   }

}


