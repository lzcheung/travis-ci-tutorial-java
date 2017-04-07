package io.github.joaomlneto.travis_ci_tutorial_java;

public class Driver {
	public static void main(String[] args) {
		SimpleCalculator calc = new SimpleCalculator();
		int n = 2;
		n = calc.mul(n, 3);
		n = calc.mul(n, 7);
		n = calc.mul(n, 13);
		n = calc.mul(n, 37);
		System.out.println(n);
	}

}
