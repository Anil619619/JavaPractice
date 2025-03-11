package javaBasicPrograms;

public class RecursiveNumber {
	
	int sum = 0 ;
	
	public int recursiveNumber(int number) {
		if(number == 0) {
			return sum;
		}else {
			sum = (sum + number %10);
			recursiveNumber(number/10);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		RecursiveNumber rn = new RecursiveNumber();
		System.out.println(rn.recursiveNumber(534));
	}
	
	
}
