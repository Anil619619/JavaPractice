package javaBasicPrograms;

public class RecursiveNumber {
	
	int sum = 0;
	
	public int getRecursiveNumber(int number) {
		
		if (number == 0) 
		{
			return sum;
		}
		else {
			sum = sum + (number % 10);
			getRecursiveNumber(number/10);
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		RecursiveNumber rn = new RecursiveNumber();
		System.out.println(rn.getRecursiveNumber(223));
	}

}
