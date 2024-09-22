package org.generation.classes;

public class SalesRep extends Employee {
	// Propiedades
	private double salesMade;

	public SalesRep(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
			double salary, int yearsWorked, double salesMade) {
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked);
		this.salesMade = salesMade;
	}// constructor

	public double getSalesMade() {
		return salesMade;
	}//getSalesMade()

	public void setSalesMade(double salesMade) {
		this.salesMade = salesMade;
	}//setSalesMade()
	
	public double calculateComission(){
	// comission = 0.1 * salesMade
		double comission = 0.1 * salesMade;
		return comission;
	}// calculateComission()

	@Override
	public String toString() {
		return "SalesRep [salesMade=" + salesMade + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + ", getRegistration()=" + getRegistration() + ", getAge()=" + getAge()
				+ ", getDaysWorked()=" + getDaysWorked() + ", getVacationDaysTaken()=" + getVacationDaysTaken()
				+ ", getSalary()=" + getSalary() + ", getYearsWorked()=" + getYearsWorked() + "]";
	}//toString
	
	
	
}// class SalesRep
