
public class Swapping extends Members {
      public void swap_without_third_var() {           // swapping without third variable 
    	  num1=num1+num2;   
    	  num2=num1-num2;  
    	  num1=num1-num2;
    	  
    	  System.out.println("\nAfter swapping without third variable ");
    	  System.out.println("\nnumber 1 : "+num1);
    	  System.out.println("number 2 : "+num2);
      }
      
      public void swap_with_third_var() {
    	  temp=num1;
    	  num1=num2;
    	  num2=temp;
    	  
    	  System.out.println("\nAfter swapping with third variable ");
    	  System.out.println("\nnumber 1 : "+num1);
    	  System.out.println("number 2 : "+num2);
    	  
      }
}
