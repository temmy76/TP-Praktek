package Latihan3;

public class Staff {
	StaffMember[] stafflist;
	
	public Staff(){
		stafflist = new StaffMember[8];
		
		stafflist[0] = new Executive ("Sam", "123 Main Line", "555 - 0469", "123-45-6789", 2423.07);
		stafflist[1] = new Employee ("Carla", "456 Off Line", "555-0101", "987-65-4321", 1246.15);
		stafflist[2] = new Employee ("Woody", "789 Off Rocker", "555-0000", "010-20-3040", 1169.23);
		stafflist[3] = new Hourly ("Diane", "678 Fifth Ave", "555-0690", "958-47-3625", 10.55);
		stafflist[4] = new Volunteer ("Norm", "987 Suds Blvd", "555-8374");
		stafflist[5] = new Volunteer ("Cliff", "321 Duds Lane", "555-7282");
		stafflist[6] = new Commission ("Temmy", "69420 Wow Land", "555-6969", "231-52-3215", 6.25, 0.2);
		stafflist[7] = new Commission ("Mahesa", "420 Waduhek", "555-4201", "643-54-6453", 9.75, 0.15);
		
		((Executive)stafflist[0]).awardBonus(500.00);
		((Hourly)stafflist[3]).addHours(40);
		
		((Hourly)stafflist[6]).addHours(35);
		((Commission)stafflist[6]).addSales(400);
		
		((Hourly)stafflist[7]).addHours(40);
		((Commission)stafflist[7]).addSales(950);
	}
	
	public void payday() {
		double amount;
		for(int count = 0; count < stafflist.length;count++) {
			System.out.println(stafflist[count]);
			amount = stafflist[count].pay();
			
			if(amount == 0.0)
				System.out.println("Thanks!");
			else
				System.out.println("Paid :" + amount);
			
			System.out.println("-----------------------------------------");
		}
	}
}
