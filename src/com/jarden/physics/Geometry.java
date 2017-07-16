package com.jarden.physics;
import static java.lang.Math.*;
public class Geometry {
	
	public static double areaOfPyramidSide(double lengthOfSide){
		return sqrt(3)/4 * pow(lengthOfSide,2);
	}
	
	public static double volumeOfPyramid(double lengthOfSide){
		return (sqrt(2)/12) * pow(lengthOfSide,3);
	}
	
	public static double volumeOfSphere(double radius){
		return 4/3*Math.PI*Math.pow(radius, 3);
	}

}
