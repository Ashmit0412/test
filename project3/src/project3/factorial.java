package project3;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		System.out.println("enter value to find factorial");
		Scanner s=new Scanner(System.in);
		int i,F=1;
		int a=s.nextInt();
		for(i=1;i<=a;i++) {
		F=F*i;
		}
		
		System.out.println("value of factorial is "+F);
	
	}////issue in factorial 32
}
