
public class SumOfTheSquare {
	
	static int squaresum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
			sum+=(i*i);
		return sum;
	}

	public static void main(String args[]) {
		
		int n=5;
		System.out.println(squaresum(n));		
		
	}
}
