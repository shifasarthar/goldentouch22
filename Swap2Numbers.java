import java.util.Scanner;
public class Swap2Numbers {

	public static void main(String args[])
	{
		int x,y,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of X and Y");
		x=sc.nextInt();
		y=sc.nextInt();
	   
		System.out.println("Before Swapping Numbers: "+x+" "+y);
		
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("After Swapping: "+x+" "+y);
		System.out.println();
	
	}
}
