import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// текущее число, которое ввел пользователь
		int currentNumber = scanner.nextInt();
		// сумма цифр текущего числа, изначально 0
		int currentNumberDigitsSum = 0;
		int copyCurrentNumber = currentNumber;
		// копия текущего числа, ее мы будем обнулять
		int minDigitsSumNumber = currentNumber;
		// выичсляем сумму цифр в для текущечего числа
		while(copyCurrentNumber != 0) {
			// берем последнюю цифру
			int lastDigit = copyCurrentNumber % 10;
			// отбрасываем последнюю цифру
			copyCurrentNumber = copyCurrentNumber / 10;
			// кидаем последнюю цифру в сумму
			currentNumberDigitsSum += lastDigit;
		}
		// предполагаем, что сумма цифр первого числа - минимальна
		int min = currentNumberDigitsSum;
		// пока пользователь не ввел ноль
		while (currentNumber != 0) {
			// делаем копию числа
			copyCurrentNumber = currentNumber;
			// для нового числа вычисляем сумму цифр
			while(copyCurrentNumber != 0) {
					// запоминаем последнюю цифру
					int lastDigit = copyCurrentNumber % 10;
					// отбрасываем последнюю цифру
					copyCurrentNumber = copyCurrentNumber / 10;
					// кидаем в сумму
					currentNumberDigitsSum += lastDigit;
			}
			// если текущая сумма минимальна - запоминаем ее
			if (currentNumberDigitsSum < min) {
				min = currentNumberDigitsSum;
				// запоминаем число, сумма цифр которых минимальна
				minDigitsSumNumber = currentNumber;
			}
			// обнуляем сумму цифр для текущего числа, чтобы можно
			// было положить новое
			currentNumberDigitsSum = 0;
			// считываем новое число
			currentNumber = scanner.nextInt();
		}
		int copyMinDigitsSumNumber = minDigitsSumNumber;
		
		int digitsCount = 0;
		// посчитаем количество цифр в числе, для этого работаем с копией
		while (copyMinDigitsSumNumber != 0) {
			// забрали последнюю цифру
			int lastDigit = copyMinDigitsSumNumber % 10;
			// отбросили последнюю цифру от исходного числа
			copyMinDigitsSumNumber = copyMinDigitsSumNumber / 10;
			// считаем цифры
			digitsCount++;
		}
		// вычисляем 10 в степени, равной количеству цифр - 1
		int mult = 1;
		for (int i = 0; i < digitsCount - 1; i++) {
			mult = mult * 10;
		}
		int reversedNumber = 0;
		// пока число не обнулилось
		while (minDigitsSumNumber != 0) {
			// берем последнюю цифру
			int lastDigit = minDigitsSumNumber % 10;
			// отбрасываем эту цифру
			minDigitsSumNumber = minDigitsSumNumber / 10;
			// закидываем ее в новое число, но уже со степенью 
			reversedNumber = reversedNumber + lastDigit * mult;
			// понижаем степень для следующего числа
			mult = mult / 10; 
		}
		System.out.println(reversedNumber);
	}
}