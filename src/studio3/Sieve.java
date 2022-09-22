package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("we choose n : ");
		int n = in.nextInt();
		int[]sieve= new int[n];
		for (int i=0; i<n; i++) {
			sieve[i]=i;
		}
		for( int j=2; j<n;j++) {
			for(int k=j; k*j<n; k++) {
				if(k*j>=0) {
				sieve[k*j]=0;
			}
			}
			
		}
		for (int i=2;i<n;i++ ) {
			if(sieve[i] !=0) {
				System.out.print(sieve[i]+" ");
			}
		}
		
		

	}

}
