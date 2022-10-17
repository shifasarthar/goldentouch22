import java.util.Scanner;
public class InputValidation {

	public static boolean display(int num)
	{
		if(num>10) {
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String args[]) {
		System.out.println(display(15));
	}
	}

