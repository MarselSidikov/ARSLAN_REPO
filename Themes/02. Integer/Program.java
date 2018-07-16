class Program {
	public static void main(String[] args) {
		System.out.println(7 / 2);
		System.out.println(11 % 3);

		int a = 8;
		int b = 10;
		
		int c = a;
		a = b;
		b = c;

		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}