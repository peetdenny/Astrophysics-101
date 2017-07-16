package com.jarden.astro;

import java.awt.Color;
import java.util.Random;

public class Planet {
	/**
	 * in AUs
	 */
	private double semiMajorAxis;
	private String name;
	private Color color;
	/**
	 * In kms
	 */
	private  long radius;
	private double period;
	private double positionOnEcliptic;
	private double degreesPerHour;
	private double mass;
	
	public double getMass() {
		return mass;
	}


	public void setMass(double mass) {
		this.mass = mass;
	}


	private Random random = new Random(System.currentTimeMillis());
	
	
	
	/**
	 * Returns position on ecliptic in degrees
	 * @return
	 */
	public synchronized double getPositionOnEcliptic(){
		return this.positionOnEcliptic;
	}
	
	
	public Planet(String name, double semiMajorAxis, long radius, Color color) {
		super();
		this.positionOnEcliptic = random.nextInt(360);
		this.name = name;
		this.semiMajorAxis = semiMajorAxis;
		this.radius = radius;
		this.color = color;
		this.period = Keplertron.calcPeriodInEarthYears(semiMajorAxis);
		this.degreesPerHour=360/(period*Constants.EARTH_SIDEREAL_PERIOD*24);
		System.out.printf("Created planet %s with period %s years, orbiting %s degrees per hour\n",name, period,degreesPerHour);
	}
	
	
	public double getPeriod(){
		return period;
	}
	
	public double getSemiMajorAxis() {
		return semiMajorAxis;
	}
	public void setSemiMajorAxis(double semiMajorAxis) {
		this.semiMajorAxis = semiMajorAxis;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public long getRadius() {
		return radius;
	}
	public void setRadius(long radius) {
		this.radius = radius;
	}


	public synchronized void updatePosition(double timeInHours) {
		this.positionOnEcliptic += timeInHours*degreesPerHour;
		if(positionOnEcliptic >= 360){
			positionOnEcliptic -= 360;
		}
	}


	public double getDegreesPerHour() {
		return degreesPerHour;
	}


	public void setDegreesPerHour(double degreesPerHour) {
		this.degreesPerHour = degreesPerHour;
	}

}
