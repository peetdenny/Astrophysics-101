package com.jarden.astro;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Demonstrates P^2 = Ka^3
 * @author denny
 *
 */
public class SolarGUI {
	JFrame frame = new JFrame("Kepler Demo");
	Canvas canvas = new Canvas();
	private SolarSystem solarSystem;
	private JPanel panel;
	

	private int solarX=700;
	private int solarY=400;
	
	public static void main(String[] args) {
		SolarGUI k = new SolarGUI();
		k.launch();
	}

	private void launch() {
		solarSystem = new SolarSystem(this);
		solarSystem.start();
		frame.setBounds(50, 50, 2000, 800);
		panel = new SolarPanel();
		frame.add(panel,BorderLayout.CENTER);
		frame.setVisible(true);
		panel.repaint();
		
		addListeners();
	}
	

	class SolarPanel extends JPanel{

		@Override
		public void paint(Graphics g) {
			g.setColor(Color.black);
			g.clearRect(panel.getX(), panel.getY(), panel.getWidth(), panel.getHeight());
			g.setColor(Color.yellow);
			g.fillOval(solarX, solarY, 30,30); 
			for(Planet p: solarSystem.getPlanets()){
				renderPlanet(g,p);
			}
		}

		private void renderPlanet(Graphics g, Planet p) {
			double semiMajorAxis = convertAUtoPixels(p.getSemiMajorAxis());
			double angle = p.getPositionOnEcliptic();
			System.out.printf("%s is at %s¼ on the ecliptic @ %s ¼/hour \n",p.getName(),angle, p.getDegreesPerHour());
			int x= solarX + (int) (semiMajorAxis * Math.sin(angle)) ;
			int y = solarY + (int) (semiMajorAxis * Math.cos(angle));
			//System.out.printf("%s: %s, %s \n",p.getName(),x,y);
			g.setColor(p.getColor());
			g.fillOval(x, y, 10, 10);
		}

		private double convertAUtoPixels(double semiMajorAxis) {
			return semiMajorAxis * 25;
		}
		
	}

	private void addListeners() {
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	}

	public void repaint() {
		if(panel !=null){
			panel.repaint();
		}
	}



}
