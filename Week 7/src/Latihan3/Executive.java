package Latihan3;

/*
 * Executive.java
 * @author Lewis/Loftus
 * represents an executive staff member, who can earn a bonus.
 */

public class Executive extends Employee{
	private double bonus;
	
	/*
	 * sets up an executive with the specified information. 
	 */
	public Executive(String name, String address, String phone, String secNumber, double rate){
		super(name, address, phone, secNumber, rate);
		bonus = 0;
	}
	
	/*
	 * awards the specified bonus to this executive
	 */
	public void awardBonus(double execBonus){
		bonus = execBonus;
	}
	
	/*
	 * computes and returns the pay for and executive, which is the regular employee payment plus a one-time bonus.
	 */
	public double pay(){
		double payment = super.pay() + bonus;
		bonus = 0; 
		return payment;
	}
}
