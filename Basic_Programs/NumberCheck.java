package Basic_Programs;

import java.util.Scanner;

public class NumberCheck {
	public static void main(String args[])
    {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number: ");

                 int num = scan.nextInt();

                 if(num > 0)
                    System.out.println(num + " is Positive ");

                 else if(num < 0)
                    System.out.println(num + " is Negative ");

                 else
                    System.out.println(num + " is Zero ");


}
}
