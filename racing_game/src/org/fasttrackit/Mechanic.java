package org.fasttrackit;

public class Mechanic {
	
	public void repair(Autovehicle autovehicle) {
		
		autovehicle.engine = new Engine();
		autovehicle.damaged = false;
	}

}
