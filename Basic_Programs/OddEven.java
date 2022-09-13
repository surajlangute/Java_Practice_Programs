package Basic_Programs;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");

                int num = scan.nextInt();

                if(num % 2 == 0)
                        System.out.println(num+ " is Even");
                else
                        System.out.println(num+ " is Odd ");
	// TODO Auto-generated method stub

	}

}
