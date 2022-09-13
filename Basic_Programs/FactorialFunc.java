package Basic_Programs;

public class FactorialFunc {
	static int factorial(int num)
	{

	int factorial=1;

	for(int i=1; i<=num; i++)
	{
	
		factorial = factorial * i;
	}
		return factorial;
	}
	
	public static void main(String args[])
	{

		int result= factorial(3);

	System.out.println("factorial  " + result);
	}
}
