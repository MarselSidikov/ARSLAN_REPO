import java.util.Scanner;

/**
Подается последовательность неизвестной длины.
Последнее число - 0.
Найти количество локальных максимумов.

3 7 8 1 23 9 5 12 4 8 33 2 0

Локальные максимумы: 8, потому что 7 < 8 > 1;
12, 23, 33, ответом -> 4 
гарантировано, что будет минимум 3 числа
**/
class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int previous = scanner.nextInt();
		int current = scanner.nextInt();
		int next = scanner.nextInt();
		int localMaxsCount = 0;
		while(next != 0) {
			if (previous < current && current > next) {
				localMaxsCount++;
			}
			previous = current;
			current = next;
			next = scanner.nextInt();
		}
		System.out.println(localMaxsCount);

	}
}