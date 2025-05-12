package exemplos;

public class JavaMethodOverloading02 {

	static int plusMethod(int x, int y) {

		return x - y;
	}

	static double plusMethod(double x, double y) {

		return x - y;
	}

	public static void main(String[] args) {

		int myNumber01 = plusMethod(8, 5);
		double myNumber02 = plusMethod(4.3, 6.26);
		System.out.println("int: " + myNumber01);
		System.out.println("double: " + myNumber02);

	}

}
