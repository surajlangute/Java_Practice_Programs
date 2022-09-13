package Basic_Programs;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number :");

			int num = scanner.nextInt();

			
                 for(int i=2; i<=num/2; i++)
			{

                  if(num % i == 0 )
			

        		System.out.println("it is not a prime number");


                  else 

			System.out.println("it is prime number");
       		 }

	}

}
