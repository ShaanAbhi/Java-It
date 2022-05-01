public class PrimeFactor{
	
	
	  public static void findPrimeNumber(int num)
	  {
		   
		   if(num>=2&&num<=100)
		   {
			   
			   for(int i=1;i<=num;i++)
			   {
				   if(num%i==0)
				   {
					   System.out.println(i);
				   }
			   }
			     
			   
		   }
		   else
		   {
			   System.out.println("Invalid Number");
		   }
		  
	  }
	  
	  public static void main(String[] args) {
		  
		int num = 30;
		  
		   findPrimeNumber(num);
	}

}