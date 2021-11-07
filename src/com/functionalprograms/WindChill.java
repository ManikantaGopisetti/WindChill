package com.functionalprograms;

import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter temperature(in Fahrenheit) : ");
		double t = scan.nextDouble();
		System.out.print("Enter wind speed(in miles per hour) : ");
		double v = scan.nextDouble();

		if (t <= 50 && v >= 3 && v <= 120) {
			double windChill = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
			System.out.println(windChill);
		} else {
			System.out.println("not valid");
		}
	}

}
