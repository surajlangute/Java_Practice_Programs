package Basic_Programs;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your percentage: ");
        int percentage = scanner.nextInt();

        if(percentage < 0 || percentage > 100)
                System.out.println("Invalid Percentage");
        else if(percentage >= 75)
            System.out.println("FCD");
        else if(percentage >= 60 && percentage < 75)
            System.out.println("First Class");
        else if(percentage >= 50 && percentage < 60)
            System.out.println("Second Class");
        else if(percentage >= 35 && percentage < 50)
            System.out.println("Congrats! your just passed...");
        else
           System.out.println("Sorry! You are failed...");

	}

}
