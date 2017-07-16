package com.jarden.astro;

import static com.jarden.astro.Constants.GRAVITATIONAL_CONSTANT;
import static com.jarden.astro.Constants.*;

public class PhysicsEngine {
	

	public static double calculatePeakWavelengthOfBlackBody(double temperatureInKelvin){
		return Constants.wiensConstant/temperatureInKelvin;
	}
	
	
	public double calculateKeplersConstantFromMass(double mass){
		return (4*Math.pow(Math.PI,2))/GRAVITATIONAL_CONSTANT*mass;
	}
	
	/**
	 * 
	 * @param massOfCloud in kg
	 * @param massOfTypicalParticle in kg
	 * @param radiusOfCloud in m
	 * @return
	 */
	public static double caclulateTempAtGravitationalCollapse(double massOfCloud, double massOfTypicalParticle, double radiusOfCloud){
		return ((GRAVITATIONAL_CONSTANT * massOfCloud * massOfTypicalParticle)/radiusOfCloud) * (1/BOLTZMANS_CONSTANT);
	}

	public static double calculateMeanDensity(double radius, double mass){
		return mass/calculateVolume(radius);
	}
	
	public static double calculateVolume(double radius){
		return ((4*Math.PI)/3)* Math.pow(radius, 3);
	}

	public static double calculateMassForBody(double mass, double distanceFromCenter) {
		return GRAVITATIONAL_CONSTANT * mass / 2*distanceFromCenter;
	}
	
	
	public static double calculateGravitationalForce(double mass1, double mass2, double distance){
		return calculateMassForBody(mass1*mass2, distance);
	}
	
	public static double convertJoulesToMegatons(double joulesValue){
		return joulesValue/4.2E15;
	}
	
	/**
	 * 
	 * @param temperature in Kelvin
	 * @param massOfParticle in kg
	 * @return scalar speed in m/s
	 */
	public static double calculateThermalVelocity(double temperature, double massOfParticle){
		 return Math.sqrt(3*BOLTZMANS_CONSTANT*(temperature/massOfParticle)); 
	}
	
	/**
	 * 
	 * @param properMotionPerYear in arcseconds
	 * @param distance in parsecs
	 * @return velocity in km/s
	 */
	public static double calculateTangentialVelocityFromProperMotion(double properMotionPerYear,double distance){
		return 4.74*properMotionPerYear * distance;
	}
	
	public static double convertParsecsToKM(double distance) {
		return distance * 3.08567758e13;
	}
	
	/**
	 * 
	 * @param observed wavelength in nm
	 * @param emitted wavelength in nm
	 * @return red/blueshift (negative numbers are blueshifted)
	 */
	public static double calculateDoppler(double observed, double emitted){
		return (emitted-observed)/observed;
	}


	/**
	 * m/s
	 * @param massOfEscapedBody
	 * @param radius
	 * @return
	 */
	public static double calculateEscapeVelocity(double massOfEscapedBody, double radius){
		return Math.sqrt((2*GRAVITATIONAL_CONSTANT*massOfEscapedBody)/radius);
	}
	
	public static double calculateParsecFromArcSeconds(double arcseconds){
		return 1/arcseconds;
	}

	/**
	 * 
	 * @param angle in degrees
	 * @param distance in km
	 * @return radius in km
	 */
	public static double calculateRadiusFromSmallAngle(double angle, double distance){
		return (angle/360)*2*Math.PI*distance;
	}
	
	public static double convertAuToM(double d) {
		return d*149597870700.0;
				 
	}

	public static double calculateKineticEnergy(double mass,double velocity) {
		return (mass*Math.pow(velocity, 2))/2;
	}


	/**
	 * 
	 * @param temp in kelvin
	 * @param luminosity in solar luminosities
	 * @return radius of star in solar radii
	 */
	public static double calculateRadiusFromTempAndLuminosity(double temp, double luminosity) {
		return  Math.sqrt((luminosity*LUMINOSITY_OF_SUN)/LUMINOSITY_OF_SUN) / Math.pow(temp/TEMP_OF_SUN,2);
	}


	public static double calculateRadialVelocityFromShift(double shift) {
		return SPEED_OF_LIGHT/1000 * shift;
	}
}
