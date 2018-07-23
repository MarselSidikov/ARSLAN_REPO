import java.util.Scanner;
import java.util.Arrays;
class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// вводим размер массива
		int arraySize = scanner.nextInt();
		// объявили массив элементов
		int array[] = new int[arraySize];

		// какие элементы хранятся в массиве сейчас?
		// array[0] = 0
		// array[1] = 0
		// array[2] = 0 и т.д.
		// то есть изначально массив 0

		// считать несколько элементов в массив
		/**
		int i = 0;
		while (i < 5) {
			array[i] = scanner.nextInt();
			i++;
		}
		**/

		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}

		// обнулить все четные элементы
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				System.out.print(array[i] + " ");
			}
		}
		// вывод массива на экран
		// System.out.println(Arrays.toString(array));
	}
}