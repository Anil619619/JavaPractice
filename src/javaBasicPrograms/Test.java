package javaBasicPrograms;

public class Test {

	public static void main(String[] args) {

		int n = 15;
		{
			for (int i = 1; i <= n; i++) {
				if (i % 2 == 0) {
					System.out.println("Hi");
				} else if (i % 3 == 0) {
					System.out.println("Hello");
				} else if (i % 2 == 0 && i % 3 == 0) {
					System.out.println("Hi" + "Hello");
				}
			}

		}
	}
}
