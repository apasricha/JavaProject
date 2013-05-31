public class Weird {

	public static int add(int a, int b) {
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("The sum of " + a + " and " + b + " is: " + add(a, b));
	}

}