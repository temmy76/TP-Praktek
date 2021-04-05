package randomarray;

/**
 * Tringular array
 * version 1.1
 * @author Kazuno
 */

public class RandomArray {
	public static void main(String[]args){
		
		final int NMAX = 10;
		
		//allocate tringular array
		int[][] odds= new int[NMAX +1][];
		for (int n = 0; n <= NMAX; n++)
			odds[n] = new int[n +1];
			
		//fill tringular array
		for (int i = 0; i < odds.length; i++) {
			for (int j = 0; j < odds[i].length; j++) {
				
				/*
				 * compute binomial coefficient n*(n-1)*(n-2)*(n-3)...*j) 
				 */
				
				int lotteryOdds = 1;
				for (int k = 1; k < odds.length; k++) {
					lotteryOdds = lotteryOdds * (i - k + 1)/k;
					
				odds[i][j] = lotteryOdds;
				}
				
			}
			
		}
		//print tringular array
		for(int[] row : odds){
			for(int odd : row)
				System.out.printf("%4d", odd);
			
			System.out.println();
		}
	}
}
