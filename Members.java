// creating class 

import java.util.Scanner;

public class Members {
      	static Scanner sc=new Scanner(System.in);       // importing scanner class
        static int size,i,j,choice,number,num1,num2,remainder,temp=0;    // declaration of variables 
        static Swapping swap=new Swapping();
    	public static void main(String[] args) {
    		
		System.out.println("Choose number from below\n");
		System.out.println("1 : operation");
		System.out.println("2 : pallindrome");
		System.out.println("3 : Swapping");
		choice=sc.nextInt();
		
		
		switch(choice){
		case 1:
			System.out.println("Enter your number");
			size=sc.nextInt();                              // Taking input as array size
		    Calculation operation=new Calculation();        // object of Calculation class 
	    	operation.operation();
		
		break;
		
		case 2:
			System.out.println("Enter your number");
			size=sc.nextInt();
		    Pallindrome pallin=new Pallindrome();
	     	pallin.pallin();
	     	
	   break;
	   
		case 3:
			System.out.println("Choose option from below\n");
			System.out.println(" 1 : Swapping without third variable");
			System.out.println(" 2 : Swapping with third variable");
			number=sc.nextInt();
			System.out.println("Enter two number");
			System.out.print("Number 1 : ");
			num1=sc.nextInt();
			System.out.print("Number 2 : ");
			num2=sc.nextInt();
			switch(number) {
			
			case 1 :
//			Swapping swap=new Swapping();
			swap.swap_without_third_var();
			
			case 2 :
//				Swapping swap=new Swapping();
			    swap.swap_with_third_var();
			}
		}
	}
}
