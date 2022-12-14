package jdksevendpack;


public class StringFormatDemo {
	
	public static void main(String args[]) {
		System.out.printf("Integer:%d\n",15);
		System.out.printf("Floating point number with 3 decimal digits:%.3f\n,1.21312939123");
		System.out.printf("Floating point number with 8 decimal digits:%.8f\n,1.21312939123");
		
		System.out.printf("String:%s,integer:%06d,float:%.6f","Hello World",89,9.231435);
		String s=String.format("String:%s,integer:%d,float:%.6f","Hello World",89,9.231435);
		System.out.println("\n"+s);
		
		System.out.printf("%-12s%-12s%s\n","Column 1","Column 2","Column 3");
		System.out.printf("%-12.5s%s","Hello World","World");
		
	}
}
