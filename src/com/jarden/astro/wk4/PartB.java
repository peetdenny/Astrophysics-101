package com.jarden.astro.wk4;

import static com.jarden.astro.PhysicsEngine.*;

import com.jarden.astro.Constants;
import com.jarden.astro.Keplertron;

public class PartB {

	
	public static void main(String[] args) {
		
		double distanceToAlphaCentauri=convertParsecsToKM(calculateParsecFromArcSeconds(0.747));
		double semiMajorAxis=calculateRadiusFromSmallAngle(17.57/3600, distanceToAlphaCentauri);
		double period = 79.9*Constants.EARTH_SIDEREAL_PERIOD;
		double massOfSystem=Keplertron.calculateMassOfBodyFromSatelliteOrbit(semiMajorAxis, period)/Constants.MASS_OF_SUN;
		massOfSystem=Math.pow((23.5/1), 3)*Math.pow(79.9/1,-2);
		System.out.printf("Alpha Centauri, distance: %s km, semiMajorAxis %s km, mass %s solar masses:\n",distanceToAlphaCentauri,semiMajorAxis,massOfSystem);
		
	}
}
