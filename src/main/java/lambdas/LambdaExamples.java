package lambdas;

interface MyExample {
	int add(int a, int b);
} 


public class LambdaExamples {
	public static void main(String[] args) {
		MyExample myExample = (a, b) -> a + b;
		System.out.println(myExample.add(3, 5));
	}
}