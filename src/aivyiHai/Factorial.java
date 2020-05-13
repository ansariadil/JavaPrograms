package aivyiHai;

public class Factorial {

	public static void main(String[] args) {
		
		long startTime = System.nanoTime();
		System.out.println(itrativeFactorial(20));
		long endTime   = System.nanoTime();
		System.out.println(endTime - startTime);
		
		startTime = System.nanoTime();
		System.out.println(recurssiveFactorial(20));
		endTime   = System.nanoTime();
		System.out.println(endTime - startTime);

	}

	static long itrativeFactorial(long n) {
		long fact = 1;

		for (long i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

	static long recurssiveFactorial(long n) {
		if (n <= 1)
			return 1;

		return n * recurssiveFactorial(n - 1);

	}

}
