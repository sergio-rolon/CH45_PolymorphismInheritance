
package org.generation.classes;
import java.util.HashMap;

public class SalesManager extends SalesRep {
	// Propiedades
	private HashMap<Integer, SalesRep> salesTeam = new HashMap<>();

	public SalesManager(String firstName, String lastName, int registration, int age, int daysWorked,
			int vacationDaysTaken, double salary, int yearsWorked, double salesMade,
			HashMap<Integer, SalesRep> salesTeam) {
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked, salesMade);
		this.salesTeam = salesTeam;
	}// Constructor

	public HashMap<Integer, SalesRep> getSalesTeam() {
		return salesTeam;
	}//getSalesTeam()

	public void setSalesTeam(HashMap<Integer, SalesRep> salesTeam) {
		this.salesTeam = salesTeam;
	}//salesTeam
	
	@Override
	 public double calculateComission(){
	// 0.03 * all sales made by team
		 double comission = 0;
		 
		 for(SalesRep salesRep:salesTeam.values()) {
			 comission += salesRep.getSalesMade()*0.03;
		 }// foreach
		 
		 return comission;
		 
	}//calculateComission()

	@Override
	public String toString() {
		return "SalesManager [salesTeam=" + salesTeam + ", getSalesMade()=" + getSalesMade() + ", getFirstName()="
				+ getFirstName() + ", getLastName()=" + getLastName() + ", getRegistration()=" + getRegistration()
				+ ", getAge()=" + getAge() + ", getDaysWorked()=" + getDaysWorked() + ", getVacationDaysTaken()="
				+ getVacationDaysTaken() + ", getSalary()=" + getSalary() + ", getYearsWorked()=" + getYearsWorked()
				+ "]";
	}
	
}//class SalesManager

