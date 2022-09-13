package Basic_Programs;

import java.util.Random;

public class WeekNum {

	public static void main(String[] args) {
		//int WeekNum=4;

		/* Scanner scanner = new Scanner (System.in);
		System.out.println("Enter Week Number");
		
			int WeekNum = scanner.nextInt();  */

	Random random = new Random();
	int WeekNum =1 + random.nextInt(7);

switch (WeekNum)
{
	case 1: System.out.println("Monday");
				break;

	case 2: System.out.println("Tueday");
				break;

	case 3: System.out.println("Wednesday");
				break;

	case 4: System.out.println("Thursday");
				break;

	case 5: System.out.println("Friday");
				break;

	case 6: System.out.println("Saturday");
				break;

	case 7: System.out.println("Sunday");
				break;

	default : System.out.println("Invalid Week NUm");
				
	}	// TODO Auto-generated method stub

	}

}
