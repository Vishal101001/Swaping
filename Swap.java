package com.pattern;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a:");
		int a=sc.nextInt();
		System.out.println("enter b:");
		int b=sc.nextInt();
		
		a=a-b;
		b=a+b;
		a=b-a;
		
//		a=a^b;
//		b=a^b;
//		a=a^b;
		System.out.println("swapped no. is : a="+a+" "+"b="+b);

	}

}
