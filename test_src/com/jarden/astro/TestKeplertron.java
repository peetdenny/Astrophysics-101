package com.jarden.astro;

import static org.junit.Assert.assertSame;

import org.junit.Test;

import com.jarden.astro.Constants;
import com.jarden.astro.Keplertron;
import com.jarden.astro.PhysicsEngine;

public class TestKeplertron {

	@Test
	public void canCalculateMassOfBodyFromSatelliteOrbit() {
		double mass = Keplertron.calculateMassOfBodyFromSatelliteOrbit(PhysicsEngine.convertAuToM(1.00000011), Constants.EARTH_SIDEREAL_PERIOD_IN_SECONDS);
		assertSame(Constants.MASS_OF_SUN,mass);
			
	}

}
