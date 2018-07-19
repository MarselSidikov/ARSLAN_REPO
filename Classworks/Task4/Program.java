// считать последовательность неизвестной длины положительных и отрицательных чисел, кроме нуля.
// известно что последнее число в последовательности - 0
// известно что первое число точно не ноль
// Задача -> найти минимальное число
import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int currentNumber = scanner.nextInt();
		int min = currentNumber;
		// 6
		// 7
		while (currentNumber != 0) {
			if (currentNumber < min) {
				min = currentNumber;
			}
			currentNumber = scanner.nextInt();
		}
		System.out.println(min);
	}
}