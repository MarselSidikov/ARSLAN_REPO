class Program {
	public static void main(String[] args) {
		int sum = 13768;

		int a5000 = sum / 5000;
		sum = sum % 5000;
		int a2000 = sum / 2000;
		sum = sum % 2000;
		System.out.println("5000 - " + a5000);
		System.out.println("2000 - " + a2000);
	}
}