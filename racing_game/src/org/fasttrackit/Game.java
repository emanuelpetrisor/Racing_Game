package org.fasttrackit;

import java.util.Scanner;

import utils.ScannerUtils;

public class Game {
	
	ScannerUtils scannerUtils = new ScannerUtils();
	
	public void start () {
		System.out.println("Welcome to the Racing Game!");
		int playerCount = getPlayerCoutFromUser();
		System.out.println("Player count: " + playerCount);
		
		String vehicleName = getNameVehicleFromUser();
		System.out.println("Vehicle name: " + vehicleName);
	}
	
	private int getPlayerCoutFromUser() {
		System.out.println("Please enter number of players:");
		return scannerUtils.nextIntAndMoveToNextLine();
	}
		
	private String getNameVehicleFromUser() {
		System.out.println("Please enter the name of vehicle:");
		return scannerUtils.nextLine();
		
		
	}
	
	
	
	
	
}













