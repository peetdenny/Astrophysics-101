package com.jarden.astro.wk2;

import com.jarden.astro.Constants;
import com.jarden.astro.PhysicsEngine;

public class PartB {

	
	public static void main(String[] args) {
		System.out.println("Peak wavelength of Sun = "+PhysicsEngine.calculatePeakWavelengthOfBlackBody(5778));
		System.out.println("Peak wavelenght of Aldebaran = "+PhysicsEngine.calculatePeakWavelengthOfBlackBody(3850));
		System.out.println("Peak wavelength of black hole @ 10^6K="+PhysicsEngine.calculatePeakWavelengthOfBlackBody(10E6));
		
		
		System.out.println("Escape Velocity of Earth@1000km="+PhysicsEngine.calculateEscapeVelocity(Constants.MASS_OF_EARTH,Constants.RADIUS_OF_EARTH+1000000));
	}
}
