class Program {
	public static void main(String[] args) {
		int i = 0;
		
		while (i <= 10) {
			System.out.println(i);
			i = i + 1;
		}

		System.out.println("-----");

		i = 10;

		while (i >= 0) {
			System.out.println(i);
			i = i - 1;
		}
	}
}