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
	
	public double multiply(double number1, double number2) {
		double product = number1 * number2;
		return product;
	}

}
