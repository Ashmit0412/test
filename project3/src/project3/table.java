package project3;

import java.util.Scanner;

public class table {//////printing of table for any given number!!!
	
	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		for(int i=1;i<=10;i++) {
		int c=a*i;
		System.out.println(+c);
		}
	}

}
