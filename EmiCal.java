

import java.util.Scanner;

public class EmiCal
{


	static Scanner scan = new Scanner(System.in);
	    static String userInput = null;

	    public static void main(String args[])
	    {
	    	
	    	float loanAmount;
			float Principal,
	    	Principal=loanAmount;
			int tenure = scan.nextInt();
			
	    	float in=CalcloanAmount();
	          double r = 8.5;
	    	 CallateEMI(in);
	    	
	        while (true)
	        {
	            System.out.print("DO You Want to Continue (Y/N) ?");
	            userInput = scan.next();
	            if (userInput.equalsIgnoreCase("Y"))
	            	   CalcloanAmount();
	            else if (userInput.equalsIgnoreCase("N"))
	            {
	                System.out.print("Thank you !!");
	                break;
	            }
	            else
	            {
	               System.out.print("Try Again With (Y/N) only !");   
	            }

	        }

	    }


		public static float CalcloanAmount()
	    {
	        float salary;  
	      
	        Scanner sc = new Scanner(System.in);
	       
	        System.out.println(" @@@ WELCOME TO UNITED HOME LOANS @@@");
	        System.out.print("ENTER YOUR MONTHLY INCOME/SALARY: ");
	        salary = sc.nextFloat();
	      
	        
	        if(salary < 10000  )
	        {
	        	System.out.println(" Sorry Customer ... !!!  You ARE Not eligible for loan MIN LIMIT is : 10,000 and MAX LIMIT is: 10000000");
	        }
	        
	        else {
	        	 float loanAmount = (float) (60*(0.6*salary));
            System.out.println("LOAN AMOUNT ELLIGIBLE IS :--->  "+loanAmount);
	        }
	        
	        
	        return loanAmount;
	    
	      
	   
	
	   
			
        

	    public static void CallateEMI(float loanAmount ,float Interestrate r,Int tenure)	    
	    {
	    	
	    	float emi;
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("ikdwedw"); 
	    	System.out.println("value is" );
			float number=sc.nextFloat();
		 
			r=r/(12*100);// one month interest rate;
			tenure=tenure*12;
			emi=(loanAmount*r*(float)Math.pow(1+r, tenure))/(float)(Math.pow(1+r, tenure)-1);
			return emi;
			
			
			float num2=loanAmount;
			
			System.out.println("loanAmount1"+number);
			
			System.out.println("asdasdiasi--------->"+num2);
			
		
			
		}
		
