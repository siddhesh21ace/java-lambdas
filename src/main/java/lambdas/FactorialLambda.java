package lambdas;

interface NumFactorial {
	int factorial(int n);
}

public class FactorialLambda {
	public static void main(String[] args) {
		NumFactorial numFactorial = (n) -> {
			int result = 1;

			for (int i = 2 ; i <= n ; i++) {
				result *= i;
			}

			return result;
		};


		System.out.println("Factorial of 5: " + numFactorial.factorial(5));
		func(numFactorial, 7);
	}

	static void func(NumFactorial numFactorial, int num) {
		System.out.println("Factorial of 5: " + numFactorial.factorial(num));
	}

}