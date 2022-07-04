package project3;

import java.util.Scanner;

public class Armstrong {
public static void main(String[] args) {///Armstrong number
	System.out.println("Enter value to Check");
	int number, remainder,temp;
	int newnumber=0;
	Scanner s=new Scanner(System.in);
	number=s.nextInt();
	temp=number;
	while(number>0) {
		remainder=number%10;
		newnumber=newnumber+(remainder*remainder*remainder);
		number=number/10;
	}
	
	if(temp==newnumber)
	System.out.println("Number is Armstrong");
	
	else 
		System.out.println("Number is not Armstrong");
	
}
}
