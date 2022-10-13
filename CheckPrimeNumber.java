
public class CheckPrimeNumber {

	public static void main(String args[]) {
		
		int i,m=0,flag=0;
		int n=3;
		m=n/2;
		if(n==0||n==1) {
			System.out.println(n +"is not prime number");
			}
		else
		{
			for(i=2;i<=m;i++)
			{
				if(n%i==0)
				{
					System.out.println(n +"is not prime number");
					flag=1;
					break;
				}	
			
			}
			if(flag==0)
			{
				System.out.println(n +"is prime number");
			}
		}
		switch(n) {
		case 1:
			System.out.println("prime number"+ n);
			break;
			
		case 2:
			System.out.println("not prime number"+ n);
			break;
			
			default:
				System.out.println("Prime number"+ n);
		}
     }
}
