package july2022;
import java.util.Scanner;
public class WhileLoop {

	public static void main(String[]args) {
		int number,sum=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("n Please Enter any integre value below 10: ");
		number=sc.nextInt();
		
	while(number<=10) {
		sum=sum+number;
		number++;
	}
		System.out.format("Sum of the numbres from the while loop is: %d",sum);
	}
}
