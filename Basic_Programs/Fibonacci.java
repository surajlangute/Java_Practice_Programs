package Basic_Programs;

public class Fibonacci {
	 static void getFibonacci(int range)
     {
         int f1=1;
         int f2=1;
         System.out.print(f1 +"  "+f2+" " );
        
         for(int i=1;i<=10;i++)
         {    
             int f3 = f1 + f2;
             System.out.print(f3+" ");
             f1 = f2;
             f2 = f3;
            
         }
        
     }
    
	
	       
	        public static void main(String args[])
	        {
	       
	                getFibonacci(10);
	                getFibonacci(100);
	                getFibonacci(50);
	                getFibonacci(20);
	                getFibonacci(70);
	        }



	
	}


