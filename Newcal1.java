package com.projhibernate.HibernateAnnotation;

import java.util.Scanner;


public class Newcal {
	


		 static Scanner scan = new Scanner(System.in);
		    static String userInput = null;

		    public static void main(String args[])
		    {
		    	
		    	Double in=CalcloanAmount();
	
		
		    	         CallateEMI(in, in, 0);
		    	
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




			public static double CalcloanAmount()
		    {
		        double salary;  
		     double loanAmount = 0; 
		        Scanner sc = new Scanner(System.in);
		       
		        System.out.println(" @@@ WELCOME TO UNITED HOME LOANS @@@");
		        System.out.print("ENTER YOUR MONTHLY INCOME/SALARY: ");
		        salary = sc.nextDouble();
		        	 
		        
		        if(salary < 10000 )
		        {
		        	System.out.println(" Sorry Customer ... !!!  You ARE Not eligible for loan MIN LIMIT is : 10,000  ");
		        }
		        
		        else if(salary>10000000)
		        {
		        	System.out.println("Sorry Customer.......!!!You ARE Not eligible for loan MAX LIMIT is : 10000000");
		        }
		        else
		        {
		               loanAmount = (double) (60*(0.6*salary));
		              System.out.println("LOAN AMOUNT ELLIGIBLE IS :--->  "+loanAmount);
		          
   }
		        return loanAmount;
		         
				
	        }
		    public static Double CallateEMI(Double in,double interr,int Tenure)	    
		    {
		    	
	    	double emi;

             Scanner sc=new Scanner(System.in);
             System.out.println("Enter time in years");
	         Tenure=sc.nextInt();
    
    	      emi=(in*interr*(double)Math.pow(1+interr, Tenure))/(double)(Math.pow(1+interr, Tenure))/(double)(Math.pow(1+interr, Tenure)-1);		    	
    	      
    	      System.out.println("Your Estimated EMI is " +emi);
	    	 return emi;
			
			
				
			}
			

}
