package Basic_Programs;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		   // 5 X 1 = 5   (num * k)

    	  Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number: ");

              int num = scanner.nextInt();
             
              for(int k=1 ; k <=10 ; k++)
              {
                  System.out.println(num+" X "+k+" = "+num*k);
              }	// TODO Auto-generated method stub

	}

}
