import java.util.Arrays;
class Program {
	public static void main(String[] args) {
		int array[] = {3, 8, 9, 11, -5, 66, -2, 6, 101, -3};
		int index = 0;
		// найти и вывести минимальный элемент - сам элемент и его индекс
		int min = array[0];

		for (int i = 0; i < array.length; i++) {
			min = array[i];
			index = i;
			for (int j = i; j < array.length; j++) {
				if (min > array[j]) {
					min = array[j];
					index = j;
				}
			}

			int temp = array[i];
			array[i] = array[index];
			array[index] = temp;
		}

		System.out.println(Arrays.toString(array));
	}
}