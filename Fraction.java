import java.lang.Math;
public class Fraction {
	
	private int num;
	private int denom;
	
	public Fraction(Fraction other) {
		num = other.num;
		denom = other.denom;
	}
	public Fraction(int n, int d) {
		num = n;
		denom = d; 
	}
	public Fraction(int i) {
	}
	public Fraction multiply (Fraction other) {
		Fraction result = new Fraction (num * other.num , denom * other.denom);
		
		return result;
	}
	public String toString() {
		return "" + num + "/" +  denom;
	}
	Fraction divide (Fraction other) {
		new Fraction(num * other.denom, denom * other.num);
		Fraction result2 = new Fraction(num * other.denom, denom * other.num );
		return result2;
	}
	public String toString1() {
		return "" + num + "/" + denom;
	
	}
	
}

	
			
		

