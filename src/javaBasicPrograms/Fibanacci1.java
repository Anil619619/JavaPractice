package javaBasicPrograms;

import java.util.Scanner;

public class Fibanacci1 {
	
	public static void main(String[] args) {
		
		int n1=0;
		int n2=1;
		int n3;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		int nu = s.nextInt();
		
		for(int i=0;i<nu;i++)
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
		
		
		
	}

}
