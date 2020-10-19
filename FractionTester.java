import java.util.Scanner;
import java.lang.Math;
public class FractionTester {

	public static void main(String[] args) {
		Fraction a = new Fraction(1, 2);
		Fraction b = new Fraction(2, 3);
		
		Fraction c = a.multiply(b);
		Fraction d = a.divide(b);
		System.out.println(a + " * " + b + " = " + c);
		System.out.println(a + " / " + b + " = " + c);
	}
}


