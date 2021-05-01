package Latihan3;

/*
 * Employee.java
 * @author Lewis/Loftus
 * represents a general paid employee
 */

public class Employee extends StaffMember {
	protected String socialSecurityNumber;
	protected double payRate;
	
	/*
	 * sets up an employee with the specified information.
	 */
	public Employee(String name, String address, String phone, String secNumber, double rate){
		super(name, address, phone);
		socialSecurityNumber = secNumber;
		payRate = rate;
	}
	
	/*
	 * returns information about an employee as a string.
	 */
	public String toString(){
		String result = super.toString();
		
		result += "\nSocial Security Number: " + socialSecurityNumber;
		
		return result;
	}
	
	/*
	 * returns the pay rate for this employee.
	 */
	public double pay(){
		return payRate;
	}
}
