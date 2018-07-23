import java.util.Scanner;
class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int isPrime = 1;
		if (number == 2 || number == 3) {
			isPrime = 1;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = 0;
				break;
			}
		}

		if (isPrime == 0) {
			System.out.println("not prime");
		} else {
			System.out.println("is prime");
		}
	}
}