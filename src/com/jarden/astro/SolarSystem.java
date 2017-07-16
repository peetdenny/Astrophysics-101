package com.jarden.astro;

import java.awt.Color;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SolarSystem implements Runnable {

	private static final long temporalGranularity = 100; //pause between updates in milliseconds
	private double temporalMultiplier=0.05;

	private Map<String, Planet> planets = new HashMap<String, Planet>();
	
	/**
	 * 
	 */
	private double timeInHours=0;
	private double hoursInYear=24*365;

	private boolean showtime=true;


	private SolarGUI gui;
	
	public SolarSystem(SolarGUI solarGUI) {
		this.gui = solarGUI;
	}

	public void start(){
		configurePlanets();
		startSolarTimer();
	}
	
	private void startSolarTimer() {
		Thread solarThread = new Thread(this);
		solarThread.start();
	}

	private void configurePlanets() {
		planets.put("Earth", new Planet("Earth",1.09,6378,Color.BLUE));
		planets.put("Mars", new Planet("Mars",1.389,3397,Color.magenta));
		planets.put("Jupiter", new Planet("	Jupiter",5.0607,71492,Color.RED));
		planets.put("Saturn", new Planet("		Saturn",9.7899,60268,Color.YELLOW));
		planets.put("Uranus", new Planet("			Uranus",20.058,25559,Color.CYAN));
	}

	@Override
	public void run() {
		while(showtime){
			timeInHours += temporalMultiplier;
			if(timeInHours >=hoursInYear){
				timeInHours=0;
			}
			for(Planet p: planets.values()){
				p.updatePosition(timeInHours);
			}
			gui.repaint();
			System.out.println("time: "+timeInHours);
			try {
				Thread.sleep(temporalGranularity);
			} catch (InterruptedException e) {
				System.out.println("#####");
			}
		}
	}

	public Collection<Planet> getPlanets() {
		return planets.values();
	}
	
	
}
