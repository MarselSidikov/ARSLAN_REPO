import java.util.Scanner; 
import java.util.Arrays; 
class Program { 
	public static void main(String[] args) { 
	  	int array[] = {71, 25, 11432, 155};  

		for (int i = 0; i < array.length; i++) { 
			int copy = array[i];

			int currentSum = 0;
			while(copy != 0) {
				int lastDigit = copy % 10;
				copy = copy / 10;
				currentSum = currentSum + lastDigit;
			}	

			int isPrime = 1;

			if (currentSum == 2 || currentSum == 3) {
				isPrime = 1;
			} else {
				for (int j = 2; j < currentSum; j++) {
					if (currentSum % j == 0) {
						isPrime = 0;
					}
				}

				if (isPrime == 1) {
					array[i] = -array[i];
				}
			}

		} 

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
	} 
} 