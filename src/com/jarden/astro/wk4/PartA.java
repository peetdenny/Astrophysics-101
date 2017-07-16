package com.jarden.astro.wk4;

import static com.jarden.astro.Constants.*;

import com.jarden.astro.Constants;
import com.jarden.astro.PhysicsEngine;

public class PartA {
	public static void main(String[] args) {
		double periodOfDecay = 4.5e9;
		double massOfCoreAsPropotionOfTotal=0.4;
		double initialProportionOfHeliumInCore=0.27;
		
		double intialAmountOfHelium=massOfCoreAsPropotionOfTotal*initialProportionOfHeliumInCore*MASS_OF_SUN;
		System.out.printf("Initial amount of He=%s kg\n",intialAmountOfHelium);
		
		double joulesProducedOverDecayPeriod=periodOfDecay*EARTH_SIDEREAL_PERIOD_IN_SECONDS*LUMINOSITY_OF_SUN;
		System.out.printf("Joules produced over decay period: %s\n", joulesProducedOverDecayPeriod);
		double noOfHeliumAtomsCreatedDuringDecayPeriod=joulesProducedOverDecayPeriod/PP_CHAIN_ENERGY_YIELD;
		System.out.printf("no of atoms created in 4.5By: %s \n",noOfHeliumAtomsCreatedDuringDecayPeriod);
		
		double massOfAtomsCreated=ATOMIC_MASS_CONSTANT*ATOMIC_MASS_HELIUM*noOfHeliumAtomsCreatedDuringDecayPeriod;
		System.out.printf("Mass of atoms created: %s\n",massOfAtomsCreated);
		double massOfSolarCore=0.4*MASS_OF_SUN;
		
		double massOfAdditionalHe=massOfAtomsCreated/massOfSolarCore;
		System.out.printf("Mass of Additionl HE %s\n",massOfAdditionalHe+0.27);
		
		double escapeVelocityOfSunAt2SolarRadii = PhysicsEngine.calculateEscapeVelocity(MASS_OF_SUN, 2*RADIUS_OF_SUN);
		System.out.printf("Escape velocity of Sun from corona %s m/s\n",escapeVelocityOfSunAt2SolarRadii);
		System.out.println("Thermal velocity of Hydrogen: "+PhysicsEngine.calculateThermalVelocity(2e6, MASS_OF_PROTON));
		
		double radiusOfSirius = PhysicsEngine.calculateRadiusFromTempAndLuminosity(93e2, 20);
		System.out.printf("Sirius is %s times the radius of the Sun \n",radiusOfSirius);
		
		
		System.out.printf("Distance of Kapteyns star is %s parsecs \n",PhysicsEngine.calculateParsecFromArcSeconds(0.255));
		
		System.out.printf("Velocity of Kapteyns star %s km/s\n",PhysicsEngine.calculateTangentialVelocityFromProperMotion(8.67, 3.9));
		
		double shift = PhysicsEngine.calculateDoppler(492.48, 492);
		System.out.printf("Shift of Kapteyns star: %s\n",shift);
		double radialVelocityK = (SPEED_OF_LIGHT/1000) * ((592.48/592)-1);//PhysicsEngine.calculateRadialVelocityFromShift(shift);
		System.out.printf("Radial Velocity of Kapteyns star: %s km/s\n",radialVelocityK);
		
		double brightnessOfSirius=((20*Constants.LUMINOSITY_OF_SUN)/LUMINOSITY_OF_SUN)*Math.pow(1/(0.379/PARSECS_IN_AU),2);
		System.out.println("Brightness of Sirius="+brightnessOfSirius);
	}

}
