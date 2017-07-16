package com.jarden.astro.wk2;

import static com.jarden.astro.Constants.*;

import  static com.jarden.astro.PhysicsEngine.*;

public class AsteroidBomb {
	
	public static void main(String[] args) {
		AsteroidBomb bomb = new AsteroidBomb();
		bomb.launch();
	}

	private void launch() {
		double volume = calculateVolume(2000);
		double mass = volume * 2500;
		double force = calculateGravitationalForce(MASS_OF_EARTH,mass, RADIUS_OF_EARTH);
		System.out.printf("Force from impact of asteroid of volume %s m3 and mass %skg = %s N\n",volume,mass, force);
		System.out.println("Force in megatons="+convertJoulesToMegatons(force));
		double escapeVelocity = calculateEscapeVelocity(MASS_OF_EARTH, RADIUS_OF_EARTH);
		System.out.println("escape of earth"+escapeVelocity);
		System.out.println("Escape velocity of Earth at 1000km "+calculateEscapeVelocity(MASS_OF_EARTH, RADIUS_OF_EARTH+1000000));
		double energyInMT=convertJoulesToMegatons(calculateKineticEnergy(mass, escapeVelocity));
		System.out.println("Using escape velocity: "+energyInMT);
		//Escape velocity from sun @3AU
		double escapeVelocityOfSunAt3AU = calculateEscapeVelocity(MASS_OF_SUN, (RADIUS_OF_SUN*1000)+convertAuToM(3));
		System.out.println("effect of sun="+convertJoulesToMegatons(calculateKineticEnergy(mass,escapeVelocityOfSunAt3AU)));
		
	}

}
