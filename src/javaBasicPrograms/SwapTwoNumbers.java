package javaBasicPrograms;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int a1 = 11;
		int a2 = 21;
		
		System.out.println("Before swap ....");
		System.out.println("a1 =" + a1);
		System.out.println("a2 =" + a2);
		
		a1 = a1 + a2; //11 + 21 = 32
		a2 = a1 - a2; //32 - 21 = 11
		a1 = a1 - a2; //32 - 11 = 21
		
		System.out.println("After swap ....");
		System.out.println("a1 =" + a1);
		System.out.println("a2 =" + a2);
		

	}

}
