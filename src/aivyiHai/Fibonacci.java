package aivyiHai;

import java.math.BigInteger;

public class Fibonacci {

	public static void main(String... ar) {
		// int << long <<<< bigInteger
		BigInteger a = BigInteger.valueOf(0), b = BigInteger.valueOf(1);
		int length = 100;
		System.out.println(a);
		System.out.println(b);

		if (length > 2) {
//			fibonacciNormally(length, a, b);

			for (int i = 0; i < length; i++) {
				fibonacciRecurssively(BigInteger.valueOf(i));
			}

		}
	}

	static BigInteger fibonacciRecurssively(BigInteger n) {
		if (n.intValue() == 0)
			return BigInteger.valueOf(0);

		if (n.intValue() == 1 || n.intValue() == 2)
			return BigInteger.valueOf(1);

		return fibonacciRecurssively(n.subtract(BigInteger.valueOf(2)))
				.add(fibonacciRecurssively(n.subtract(BigInteger.valueOf(1))));
	}

	static void fibonacciNormally(int length, BigInteger a, BigInteger b) {
		for (int i = 2; i < length; i++) {
			BigInteger c = a.add(b);
			System.out.println(c);
			a = b;
			b = c;

		}
	}

}
