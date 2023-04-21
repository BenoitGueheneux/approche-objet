package fr.diginamic.sets;

import java.util.HashSet;

public class TestSetDouble {

	public static void main(String[] args) {
		HashSet<Double> setDeDouble = new HashSet<Double>();
		setDeDouble.add(1.5);
		setDeDouble.add(8.25);
		setDeDouble.add(-7.32);
		setDeDouble.add(13.3);
		setDeDouble.add(-12.45);
		setDeDouble.add(48.5);
		setDeDouble.add(0.01);
		System.out.println(setDeDouble);
		double max = Double.MIN_VALUE;
		for (Double double1 : setDeDouble) {
			if (max < double1) {
				max = double1;
			}
		}
		System.out.println("Le plus grand élément du set est : " + max);
		double min = Double.MAX_VALUE;
		for (Double double1 : setDeDouble) {
			if (min > double1) {
				min = double1;
			}
		}
		System.out.println("Le plus petit élément du set est : " + min);
		setDeDouble.remove(min);
		System.out.println(setDeDouble);
	}
}
