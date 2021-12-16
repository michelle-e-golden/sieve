
/**
 *
 * Michelle Golden
 * Java I
 * 1/31/18
 */

import java.util.Scanner;
import java.util.Arrays;

public class Sieve {
    
        public static void main(String[] args) { 

	int limit;
        
	Scanner keyboard=new Scanner(System.in);
	
		// have user set the array size
		System.out.print("Enter the highest number to check (must be higher than 2): ");
	
			limit =keyboard.nextInt();
			
		// create boolean array and set all vars in array as true	
	boolean [] primes = new boolean [limit + 1];			
		
		for (int a=2; a<=limit; a++) {
	
			primes[a] = true; 
		}
	
	// for loop to determine of vars are primes
	for (int i=2; i*i<=limit; i++) {
		
		if (primes[i])	
			
			for (int j=i*2; j<=limit; j+=i) {

				primes[j]=false;		
			}
		}
		
		// create new array and use boolean array to fill with integers
		int[] primeArray = new int [limit + 1];
	
		for (int m=2; m<=limit; m++) {	
						
			if(primes[m]==true)
				
				primeArray[m]= m; }
	
	System.out.println ("The prime numbers between 2 and " + limit + " are: ");
	
	
		// for loop to print all primes from array without zeroes
		for (int h=2; h<=limit; h++) {
			
			if (primeArray[h]==0) 
			continue;
			
			else
				System.out.print(primeArray[h] + " ");  }
	
    }
}
		
	
