import java.util.Scanner;

public class Fibonacci {

	int n;
	int count;
	static int count0;
	static int count1;
	private static Scanner scanner;

	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
		scanner = new Scanner(System.in);

		System.out.print("피보나치 수를 입력하세요 : ");
		fibonacci.n = scanner.nextInt();
		System.out.println(fibonacci.fibonacci(fibonacci.n));
		System.out.println("0 출력 횟수 : " + count0 + "번");
		System.out.println("1 출력 횟수 : " + count1 + "번");
	}

	public int fibonacci(int n) {
		if (n == 0) {
			count0++;
			return count++;
		} else if (n == 1) {
			count1++;
			return count++;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
}
