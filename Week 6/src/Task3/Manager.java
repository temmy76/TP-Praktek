package Task3;

import java.util.*;

class Manager extends Employee implements Sortable{
	private String secretaryName;
	public Manager (String n, double s, int d, int m, int y){ 
		super(n, s, d, m, y);
		secretaryName = "";
	}
	public String getSecretaryName(){ 
		return secretaryName;
	}
	public void raiseSalary(double byPercent){ 
		//add 1/2% bonus for every year of service
		GregorianCalendar todaysDate = new GregorianCalendar();
		int currentYear = todaysDate.get(Calendar.YEAR);
		double bonus = 0.5 * (currentYear - getHireyear());
		super.raiseSalary(byPercent + bonus);
	}
}