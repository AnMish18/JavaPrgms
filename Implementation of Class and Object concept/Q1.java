/* qn 1
Anwesha Mishra-11*/     
class Triangle
{
    int s1,s2,s3,s;
    public Triangle(int a,int b,int c)
     {
        s1=a;
        s2=b;
        s3=c;
     }
     int Area(){
       int per;
       per=(s1+s2+s3);
       int s=per/2;
       return (int) Math.sqrt(((((s*(s-s1))*(s-s2))*(s-s3))) );
     }
    }
   class Q1{
     public static void main(String[] args)
       {
             Triangle t=new Triangle(3,4,5);
             System.out.println("Area   "+t.Area());
            //  int per=(t.s1+t.s2+t.s3);   //t method is used to call the instance variables sides
            //  System.out.println("Perimeter"+per);
            //  int s=(per/2);   //half of the perimeter,semi permiteer
            //  int area1=((((s*(s-t.s1))*(s-t.s2))*(s-t.s3)));       
            //  int area=(int)Math.sqrt(area1);   
            //  System.out.println("Area :"+area);
        }
}

