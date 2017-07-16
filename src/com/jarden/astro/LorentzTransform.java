package com.jarden.astro;

public class LorentzTransform {
	
	private static final double c = Constants.SPEED_OF_LIGHT;

	/**
	 * 
	 * @param x position relative to event
	 * @param v velocity relative to event
	 * @param t time at event
	 * @return
	 */
	public static double findXPrime(double x, double v, double t){
		return (x-(v*t))/Math.sqrt(1-(v*v)/(c*c));
	}
	
	public static double findTPrime(double x, double v, double t){
		return (t-(v*x)/(c*c))/Math.sqrt(1-((v*v)/(c*c)));
	}
	

}
