class NumberTest {
	public static void main(String[] args) {
		System.out.println("25 + 3 = " + (25+3));
		System.out.println("25 - 3 = " + (25-3));
		System.out.println("25 * 3 = " + (25*3));
		System.out.println("25 / 3 = " + (25/3));
		System.out.println("25 / 3 = " + (25/3.));
		System.out.printf ("%d / %d = %4.2f\n", 25, 3, (25./3));
		System.out.printf ("25 / 3 = %.2f\n", (25./3));
		System.out.println("25 / 3 = " + String.format("%.2f", 25./3));
	}
}