package com.gl.prework1;

public class Factorial {
	
	public int findFactorial(int num)
	{
		int factorial = 1;
		for(int i =1;i<=num;i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

	public static void main(String[] args) {
	     Factorial factor = new Factorial();
	     int result = factor.findFactorial(10);
	     System.out.println("the factorial is "+result);

	}

}
