package project3;

import java.util.Scanner;

public class fibonacci {////printing nth number from fibonacci series

	public static void main(String[] args) {
		int a=0,b=1; int c;int i=1;
		Scanner s=new Scanner(System.in);
		System.out.println(" n = ");
		int n=s.nextInt();
		while(i<=n) {
			
			{System.out.println(+n+"th Number of Fibonacci is "+a);}
			
			c=a+b;
			a=b;
			b=c;
			i++;	
			
		}
	}
}
