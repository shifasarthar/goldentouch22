import java.util.Scanner;
public class CircleComputation {

	public static void main(String args[]) {
		
		final double PI=3.141592653;
		Scanner in=new Scanner(System.in);
		int r=in.nextInt();
		
		int d=2*r;
		double circumference=2*PI*r;
		double area=PI*r*r;
		
		System.out.println("Diameter of circle is: "+d);
		System.out.println("Circumference of circle is: "+circumference);
		System.out.println("Area of circle is: "+area);
	}
}
