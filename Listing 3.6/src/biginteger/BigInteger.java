package biginteger;

import java.util.*;
import java.math.*;

public class BigInteger {

	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("How many numbers do you need to draw? ");
		int k = in.nextInt();
		
		System.out.println("What is the highest number you can draw? ");
		int n = in.nextInt();
		
		/*
		 * Compute binomial coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
		 */
		
		BigInteger lottery = BigInteger.valueOf(1);
		
		for (int i = 1; i <= k; i++) {
			lottery =lottery.multiply(BigInteger.valueOf(n-i+1).divide(BigInteger.valueOf(i)));
			
			System.out.println("Your odds are 1 in" + lottery + ". Good luck!");
		}
	}

}
