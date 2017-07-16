package com.jarden.astro.wk2;

import com.jarden.astro.PhysicsEngine;
import com.jarden.astro.planets.Saturn;
import static com.jarden.astro.Constants.*;
public class SaturnQuestions {

	public static void main(String[] args) {
		Saturn s = new Saturn();
		
		double earthMass = 4.51E+25;
		double saturnMass = 4.18E+27;
		System.out.printf("Saturn is %s times more massive than Earth\n", saturnMass / earthMass);
		System.out.printf("Mean density of Saturn is %s kg/m^3\n",PhysicsEngine.calculateMeanDensity(s.getRadiusInKM()*1000, s.getMassInKg()));
		System.out.printf("Mean density of Earth is %s kg/m^3\n",PhysicsEngine.calculateMeanDensity(6.371E6, 5.97E24));
		System.out.printf("Mean density of Waterb is %s kg/m^3\n",PhysicsEngine.calculateMeanDensity(0.62035, 1000));
		
		// F=G*Mearth * massDenny/Rearth^2
		double earthGravity = PhysicsEngine.calculateMassForBody(MASS_OF_EARTH, RADIUS_OF_EARTH);
		System.out.printf("Earth Gravity is %s N\n",earthGravity);
		
		System.out.printf("Bex Bazumba Gravity is %s N (each)\n",PhysicsEngine.calculateMassForBody(1, 0.1));
		//Gmm_m/(r_m)^2
		System.out.println(GRAVITATIONAL_CONSTANT);
		
	}
}
