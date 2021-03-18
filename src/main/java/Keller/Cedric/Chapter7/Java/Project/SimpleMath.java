package Keller.Cedric.Chapter7.Java.Project;

public class SimpleMath {
	public double divide(double numerator, double denominator) {
		if(denominator == 0){
			throw new ArithmeticException("Cannot divide by zero.");
		}
		else {
			double quotient = numerator / denominator;
			return quotient;
		}
	}

}
