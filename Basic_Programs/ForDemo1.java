package Basic_Programs;

public class ForDemo1 {
	 // 100,99,98...........3,2,1 num -- ==> num = num - 1
	   
	 public static void main(String args[])
	    {
	                int count = 0 ;
	                for( int num = 100 ; num >=1    ; num--  )
	                {
	                    if(num % 2 == 0)
	                    {
	                        System.out.println(num);
	                       
	                    }
	                         count++;
	                }
	               
	               System.out.println("Count is : "+count);
	   
	    }
	   
}
