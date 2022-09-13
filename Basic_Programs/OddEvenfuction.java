package Basic_Programs;

public class OddEvenfuction {
	static boolean isEven(int x)
    {
        return x % 2 == 0;
    }
   
    public static void main(String args[])
    {
       		 int n=21;
	boolean result =isEven(n);
        if (result ==true )
            System.out.println("Entered number" +" " +n+ " is even");
	else
	System.out.println("Entered number" +" " +n+ " is odd");
    }
}