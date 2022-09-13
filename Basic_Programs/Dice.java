package Basic_Programs;

import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		Random  random = new Random();
        int randomNum = 1 + random.nextInt(6); // 0 or 1



        //Scanner scanner = new Scanner(System.in);
        //randomNum = scanner.nextInt();

        System.out.println("Random number was: "+randomNum);

        if(randomNum == 1 )
                System.out.println("One");
        else if (randomNum == 2)
                System.out.println("Two");
        else if (randomNum == 3)
                System.out.println("Three");
        else if (randomNum == 4)
                System.out.println("Four");
        else if (randomNum == 5)
                System.out.println("Five");

        else
                System.out.println("Six");
// TODO Auto-generated method stub

	}

}
