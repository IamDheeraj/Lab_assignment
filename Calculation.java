public class Calculation extends Members{
	
	public void operation()
	{	
		int[] num=new int[size];
		System.out.println("Enter "+size+" number");
		for(i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}
		
		number=num[0];                 // operation for greater number 
		for(i=0;i<num.length;i++) {
			if(number<num[i]) {
				number=num[i];
			}
		}
		System.out.println("Greater number are : "+number);
		
		number=num[0];                 // 	operation for smaller number
		for(i=0;i<num.length;i++) {
			if(number>num[i]) {
				number=num[i];
			}
		}
		System.out.println("Smaller number are : "+number);
		
		
		for(i=0;i<size;i++)  // for ascending order 
		{
			for(j=i+1;j<size;j++)
			{
				if(num[i]>num[j])
				{
					temp=num[i];   // swapping value with third variable
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.print("Ascending order is : ");
		for(i=0;i<size;i++) {
			System.out.print(num[i]+" ");
		}
	
		for(i=0;i<size;i++)       // for descending order
		{
			for(j=i+1;j<size;j++)
			{
				if(num[i]<num[j])
				{
					temp=num[i];   // swapping value with third variable
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.print("\nDescending order is : ");
		for(i=0;i<size;i++) {
			System.out.print(num[i]+" ");
		}
	}
}	
