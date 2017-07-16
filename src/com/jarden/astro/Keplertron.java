package com.jarden.astro;
import static com.jarden.astro.Constants.*;

public class Keplertron {

	private static int K=1;
	/**
	 * P^2=ka^3
	 * 
	 * @param semiMajorAxis
	 * @return
	 */
	public static double calcPeriodInEarthYears(double semiMajorAxis) {
		return Math.sqrt(K * Math.pow(semiMajorAxis, 3));
	}
	
	
	/**
	 * 
	 * P^2 = KPA^3
	 * 
	 * @param radiusOfOrbit in km
	 * @param period in days
	 * @return mass in kg
	 */
	public static double calculateMassOfBodyFromSatelliteOrbit(double radiusOfOrbit, double period){
		return (
				4*Math.pow(Math.PI, 2)*
				Math.pow(radiusOfOrbit, 3))/
				(GRAVITATIONAL_CONSTANT*Math.pow(period, 2));
	}
	
	public static double calculatePeriodFromMassAndSemiMajorAxis(double massOfOrbitedBody, double semiMajorAxis){
		return Math.sqrt(((4*Math.pow(Math.PI,2))/GRAVITATIONAL_CONSTANT)*Math.pow(semiMajorAxis, 3));
	}
	
}
