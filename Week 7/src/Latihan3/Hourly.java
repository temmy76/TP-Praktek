package Latihan3;

/*
 * Hourly.java
 * @author Lewis/Loftus
 * represents an employee that gets paid by the hour.
 */

public class Hourly extends Employee{
	private int hoursWorked;
	
	/*
	 * sets up this hourly employee using the specified information.
	 */
	public Hourly(String name, String address, String phone, String secNumber, double rate){
		super(name, address, phone, secNumber, rate);
		hoursWorked = 0;
	}
	
	/*
	 * adds the specified number of hours to this employee's accumulated hours.
	 */
	public void addHours(int moreHours){
		hoursWorked += moreHours;
	}
	
	/*
	 * computes and returns the pay for this hourly employee.
	 */
	public double pay(){
		double payment = payRate * hoursWorked;
		hoursWorked = 0;
		return payment;
	}
	
	/*
	 * returns information about this hourly employee as a string.
	 */
	public String toString(){
		String result = super.toString();
		
		result += "\nCurrent hours: " + hoursWorked;
		
		return result;
	}

}