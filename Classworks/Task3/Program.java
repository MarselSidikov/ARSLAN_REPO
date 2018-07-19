// развернуть число 
// 675 -> 576
import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// считываем число пользователя
		int number = scanner.nextInt();
		// заводим переменную, которая будет хранить перевенутое число
		int reversedNumber = 0;
		// заводим переменную, которая будет хранить количество цифр в исходном числе
		int digitsCount = 0;
		// делаем копию числа, которое ввел пользователь
		int copyNumber = number;
		// заводим переменную для последней цифры
		int lastDigit;

		// посчитаем количество цифр в числе, для этого работаем с исходным number
		// и в цикле он обнулится, поэтому мы сделали его копию
		while (number != 0) {
			// забрали последнюю цифру
			lastDigit = number % 10;
			// отбросили последнюю цифру от исходного числа
			number = number / 10;
			// считаем цифры
			digitsCount++;
		}

		/**
			A = A0 * 10 ^(n -1) + A1 * 10 ^ (n-2) + ... AN-1 * 10^0
		**/

		// вычисляем 10 в степени, равной количеству цифр - 1
		int mult = 1;
		for (int i = 0; i < digitsCount - 1; i++) {
			mult = mult * 10;
		}

		// пока число не обнулилось
		while (copyNumber != 0) {
			// берем последнюю цифру
			lastDigit = copyNumber % 10;
			// отбрасываем эту цифру
			copyNumber = copyNumber / 10;
			// закидываем ее в новое число, но уже со степенью 
			reversedNumber = reversedNumber + lastDigit * mult;
			// понижаем степень для следующего числа
			mult = mult / 10; 
		}

		System.out.println(reversedNumber);
	}
}