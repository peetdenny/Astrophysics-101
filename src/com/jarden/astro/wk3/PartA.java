package com.jarden.astro.wk3;

import static com.jarden.astro.Constants.*;
import static java.lang.Math.*;

import com.jarden.astro.Constants;
import com.jarden.astro.PhysicsEngine;

public class PartA {

	public static void main(String[] args) {
		double massOfHydrogenMolecule= 3.34e-27; 
		double massOfCloud= 1.5 * MASS_OF_SUN;
		double radiusOfCloud =  PhysicsEngine.convertAuToM(1.0e4);
		double temperatureOfCloudInKelvin = PhysicsEngine.caclulateTempAtGravitationalCollapse(massOfCloud, massOfHydrogenMolecule, radiusOfCloud);
		System.out.println("Temp of cloud at collapse="+ temperatureOfCloudInKelvin);
		
		double amountOfEnergyReleasedAtCollapse = (GRAVITATIONAL_CONSTANT*pow(MASS_OF_SUN,2))*((1/(RADIUS_OF_SUN)-(1/PhysicsEngine.convertAuToM(1e4))));
		System.out.println("Amount of energy released: "+amountOfEnergyReleasedAtCollapse);
		double timeTakenToLoseEquivEnergyByRadiation=(amountOfEnergyReleasedAtCollapse/LUMINOSITY_OF_SUN)/EARTH_SIDEREAL_PERIOD_IN_SECONDS;
		System.out.printf("It would take %s years to lose this same amount of energy through luminosity \n",timeTakenToLoseEquivEnergyByRadiation);
		
		double densityOfMountain = 3e3;//kg/m^3
		double tensileForce = 1e7;
		double g = Constants.GRAVITY_OF_EARTH;
		
		double sizeOfMountainRequiredForGravityToBeStrongerThanChemicalAdhesion = tensileForce*(sqrt(3)/4)*(12/sqrt(2))*1/(densityOfMountain*g);
		System.out.printf("A pyramidal mountain would need to have a side %s meters long to ahdere to the earth with equal force from gravity and tensile force (chemical)",sizeOfMountainRequiredForGravityToBeStrongerThanChemicalAdhesion);
		
	}
	
}
