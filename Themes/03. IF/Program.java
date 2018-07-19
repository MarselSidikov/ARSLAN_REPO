import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// readln(a)
		int userNumber = scanner.nextInt();
		if (userNumber % 10 == 2) {
			System.out.println("End of 2");
		} else {
			System.out.println("Not end of 2");
		}
	}
}