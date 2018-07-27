import java.util.Scanner; 
import java.util.Arrays; 
class Program { 
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in); 
		
		int arraySize = scanner.nextInt(); 
		int array[] = new int[arraySize]; 
		
		int count=0; 
		int currentNumberDigitsSum = 0; 
		
		for (int i = 0; i < array.length; i++) { 
			array[i] = scanner.nextInt(); 
		}

		for (int i = 1; i < array.length - 1 ; i++) { 
			if (array[i-1] < array[i] && array[i] > array[i+1]) { 
				while(array[i] != 0) { 
					int lastDigit = array[i] % 10; 
					array[i] = array[i] / 10; 
					currentNumberDigitsSum += lastDigit; 
			}
			
			System.out.print(currentNumberDigitsSum + " "); 
			currentNumberDigitsSum=0; 
			} 
		} 
	} 
}