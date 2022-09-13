package Basic_Programs;

public class PrimeFunc {
	static boolean isPrime(int n)
	{
			
	              for ( int i=2; i<=n/2; i++)
				
				if( n % i== 0)
	 				return false;
				return true;                  
	}

			public static void main(String args[])
			{
				if ( isPrime(12))
		System.out.println("true");
			else
		System.out.println("false");

    }
}