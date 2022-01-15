/*qn 6
Anwesha Mishra-11*/
import java.util.Scanner;
class Point{
	int x,y;
	Point(int xco,int yco){
		x=xco;
		y=yco;
	}
	double distBtPoint(Point a){
          double xd=a.x-x;
		  double yd=a.y-y;
		  return Math.sqrt((xd*xd)+(yd*yd));
	}
}
class Q6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st coordinates");
		int xco=sc.nextInt();
		int yco=sc.nextInt();
		Point p=new Point(xco,yco);
		System.out.print("enter 2nd coordinates");
		xco=sc.nextInt();
		yco=sc.nextInt();
		Point q=new Point(xco,yco);
		System.out.println(p.distBtPoint(q));
	} 
}