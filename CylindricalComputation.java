import java.util.Scanner;
public class CylindricalComputation {

	public static void main(String args[])
	{
		double radius,height,volume,surfaceArea;
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter Base Radius of Cylinder");
		radius =scanner.nextDouble();
		
		System.out.println("Enter Height of Cylinder");
		height=scanner.nextDouble();
		
		surfaceArea=2*Math.PI*radius*(radius+height);
		
		volume=Math.PI*radius*height;
		
		System.out.format("Surface Area of Cylinder=%.3f\n",surfaceArea);
		System.out.format("Volume of Cylinder=%.3\n",volume);
		
		
	}
}
