
public class Fibonacci {

	public static void main(String args[])
	{
		int i=1,n=10,firstTerm=0,secondTerm=1;
		System.out.println("Fibanocci Series Till  "+ n +" terms");
		while(i<=n) {
			System.out.print(firstTerm+", ");
			int nextTerm=firstTerm+secondTerm;
			firstTerm=secondTerm;
			secondTerm=nextTerm;
			i++;
			
		}
	}
}
