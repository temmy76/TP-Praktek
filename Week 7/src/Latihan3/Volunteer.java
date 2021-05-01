package Latihan3;

/*
 * Volunteer.java
 * @author Lewis/Loftus
 * represents a staff member that works as a volunteer
 */

public class Volunteer extends StaffMember {
	/*
	 * sets up a volunteer using the specified information
	 */
	public Volunteer(String name, String address, String phone){
		super(name, address, phone);
	}
	
	/*
	 * returns a zero pay value for this volunteer.
	 */
	public double pay(){
		return 0.0;
	}
}
