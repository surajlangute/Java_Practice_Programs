package Basic_Programs;

public class Power {

	public static void main(String[] args) {
		int num = 6;
        int p = 3;
        int power = 1;
       
        for(int i=1; i<=p ; i++ )
        {
                power = power * num ;
        }
       
        System.out.println("Power is : "+power);
	}

}
