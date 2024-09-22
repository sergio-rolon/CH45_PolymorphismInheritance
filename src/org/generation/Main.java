package org.generation;

import java.util.HashMap;

import org.generation.classes.SalesManager;
import org.generation.classes.SalesRep;

public class Main {

	public static void main(String[] args) {

		SalesRep salesRep1 = new SalesRep("Sergio", "Rolón", 1001, 30, 365, 20, 500.55, 20, 100000);
		SalesRep salesRep2 = new SalesRep("Raúl", "Rolón", 1002, 40, 188, 10, 700.55, 10, 100000);
		
		HashMap<Integer, SalesRep> salesTeam = new HashMap<Integer, SalesRep>();
		
		salesTeam.put(1, salesRep1);
		salesTeam.put(2, salesRep2);
		
		SalesManager salesMan1	= new SalesManager("Victoria", "Rolón", 1003, 30, 365, 20, 1500.55, 20, 1000000, salesTeam);
		
		System.out.println(salesMan1.toString());
		
		System.out.println("Sales Manager "+salesMan1.getFirstName()+" time to retirement is : "+salesMan1.timeToRetirement()+" years");
		System.out.println("Sales Manager "+salesMan1.getFirstName()+" vacation time left is : "+salesMan1.vacationTimeLeft()+" days left");
		System.out.println("Sales Manager "+salesMan1.getFirstName()+" bonus is : $"+salesMan1.calculateBonus());
		
		System.out.println("Sales Manager "+salesMan1.getFirstName()+" comission is : $"+salesMan1.calculateComission());
		

		
	}

}
