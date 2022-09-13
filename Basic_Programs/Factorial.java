package Basic_Programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// int num=6;                     // 6 x 5 X 4 X 3 X 2 X 1
        int factorial=1;

	Scanner scanner =new Scanner(System.in);
	System.out.println( "Enter the Number :");
	int num = scanner.nextInt();
            
         
         /*
                  num =6
                 factorial = 1,  i = 1
                 factorial = 1,  i = 2
                 factorial = 2,  i = 3
                 factorial =  6,  i = 4
                 factorial = 24 ,  i = 5
                 factorial = 120 ,  i = 6
		        factorial = 720 ,  i = 7
                
         */
        
         for(int i=1; i<=num ; i++ )
         {
             factorial = factorial * i;
         }
         System.out.println(factorial);// TODO Auto-generated method stub

	}

}
