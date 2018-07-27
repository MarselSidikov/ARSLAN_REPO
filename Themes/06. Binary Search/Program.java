class Program {
	public static void main(String[] args) {
		int array[] = {0, 2, 2, 3, 5, 6, 9, 10, 10, 10, 12, 14, 15, 18, 19, 20, 21, 22, 24, 25,
                   26, 27, 29, 31, 32, 37, 40, 42, 42, 44, 46, 47, 48, 48, 48, 49, 51, 51,
                   52, 53, 53, 55, 55, 55, 57, 57, 59, 59, 60, 61, 63, 65, 65, 66, 66, 68,
                   69, 70, 70, 71, 72, 72, 72, 72, 72, 76, 76, 77, 78, 78, 78, 81, 83, 84,
                   85, 85, 88, 89, 89, 89, 91, 92, 92, 93, 93, 96, 96, 97, 97, 100};

        int start = 0;
        int finish = array.length;
        int middle = start + (finish - start) / 2;
        int element = 97;
        int index;
        // бесконечный цикл
        while (true) {
        	if (element > array[middle]) {
        		start = middle;
        	} else if (element < array[middle]) {
        		finish = middle;
        	} else {
        		index = middle;
        		break;
        	}

        	if (finish - start == 1) {
        		index = -1;
        		break;
        	}
        	middle = start + (finish - start) / 2;
        }

        System.out.println(index);
	}
}