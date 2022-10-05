package CoreJavaExcercise;
import java.util.Scanner;
public class Student2D {

	public static void main(String args[]) {
		double[][] marksTable;
		double mark;
		int studentNo;
		int moduleNo;
		
		marksTable=new double[8][8];
		Scanner sc=new Scanner(System.in);
		
		for(studentNo=1;studentNo<=8;studentNo++) {
			System.out.println("Enter marks for student no"+studentNo);
			
			for(moduleNo=1;moduleNo<=8;moduleNo++) {
				System.out.print("Mark for student"+studentNo+"for module no"+moduleNo+";");
				mark=sc.nextDouble();
				marksTable[studentNo][moduleNo]=mark;
			}
		}
	}
}
