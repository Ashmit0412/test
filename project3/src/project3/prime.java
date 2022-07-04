package project3;

import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
		System.out.println("Enter Value");
	Scanner s=new Scanner(System.in);
int a = s.nextInt();
if (a<2) {System.out.println("Number is not Prime");}

else 
 {
	for(int i=2;i<=(a-1);i++) {
		{
if((a%i)==0) { System.out.println("Number is not prime"); break;}
else	System.out.println("Number is Prime");break;}
		}}
	}}
