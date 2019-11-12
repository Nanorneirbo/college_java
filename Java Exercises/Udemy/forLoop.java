

public static void main (string args[]){
//change input here

        //how a for loop works - for (init; termination; increment){}
		// check out the string format thing too. 
        for (int i = 2; i<9 ; i++){
            System.out.println("10K @ " + i + "% interest " + String.format("%.2f",calculateInterest(10000, i)));
        }
 
		// start at 8% and work back
		for (int i = 8; i>=2 ; i--){
            System.out.println("10K @ " + i + "% interest " + String.format("%.2f",calculateInterest(10000, i)));
        }
    }
		
	

 }
 // prime number stuff again
 // this is a method to see if a number is prime
 
	public static boolean isPrime (int n) {
		
		if (n == 1)(
		return false;
	}
	for (int i = 2; i < n/2; i++){
		if(n % i) == 0){
			return false;
		}
	}
	return true; 

    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate / 100);
    }
}
 
    
