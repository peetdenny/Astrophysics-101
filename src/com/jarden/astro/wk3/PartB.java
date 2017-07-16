package com.jarden.astro.wk3;

import com.jarden.astro.Constants;
import com.jarden.astro.Keplertron;
import com.jarden.astro.PhysicsEngine;
import com.jarden.physics.Geometry;

import static java.lang.Math.*;

public class PartB {

	
		public static void main(String[] args) {
			System.out.println("Check:"+Constants.MASS_OF_SUN);
			
			double a_kepler=0.25;
			double p_kepler=46.7/Constants.EARTH_SIDEREAL_PERIOD;
			
			double mass = Keplertron.calculateMassOfBodyFromSatelliteOrbit(a_kepler,p_kepler);
			double ratio = pow(a_kepler,3)/pow(p_kepler,2);
			System.out.println("Ratio: "+ratio);
			
			double massOfKepler=Constants.MASS_OF_SUN*ratio;
			System.out.println("Mass of Kepler in kg: "+massOfKepler);
			
			double kepler11ePeriod=Keplertron.calculatePeriodFromMassAndSemiMajorAxis(massOfKepler, PhysicsEngine.convertAuToM(0.194))/Constants.EARTH_SIDEREAL_PERIOD_IN_SECONDS;
			double ab11f=PhysicsEngine.convertAuToM(0.25);
			System.out.println("Angle in arcseconds="+(
					ab11f/
						(2*Math.PI*PhysicsEngine.convertAuToM(1.264e8))
					)*3600);
		}
}
