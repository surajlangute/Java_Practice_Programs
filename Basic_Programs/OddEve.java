package Basic_Programs;

public class OddEve {
	 static    boolean isEven(int x)
     {
         return x % 2 == 0;
     }

     public static void main(String args[])
     {
         for(int i = 1; i<=100 ; i++)
         {
         if(isEven(i))
             System.out.println(i);
    
         }
     }
}
