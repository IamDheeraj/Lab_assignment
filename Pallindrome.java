
public class Pallindrome extends Members {
	public void pallin() {
		number=size;            //storing original value
		while(size>0) {
			
			remainder=size%10;  // getting remainder
			temp=(temp*10)+remainder;
			size=size/10;       // deviding number by 10 
			
		}
		if(temp==number)        // comparing original value to final value
		System.out.println(temp+" is pallindrome number");
		else {
		System.out.println(temp+" is not pallindrome number");
		}
	}

}
