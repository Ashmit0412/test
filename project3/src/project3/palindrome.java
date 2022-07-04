package project3;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {////pallindrome or not
	System.out.println("Enter number to check if its Pallindrome");
		Scanner s=new Scanner(System.in);
		int remainder,temp;
		int reversenumber=0;
		int number=s.nextInt();
		temp=number;
		while(number>0) {
			remainder=number%10;
			reversenumber=(reversenumber*10)+remainder;
			number=number/10;
		
		}
		if(temp==reversenumber) 
			System.out.println("Number is Pallindrome");
		
		
		else 
			System.out.println("Number is not pallindrome");
		
		
	}

}
