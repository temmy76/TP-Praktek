package Latihan3;

public class Commission extends Hourly{
	private double totalSales;
	private double ComRate;
	
	public Commission(String name, String address, String phone, String secNumber, double rate, double commis) {
		super(name, address, phone, secNumber, rate);
		// TODO Auto-generated constructor stub
		commis = ComRate;
	}
	
	public void addSales(double totalSales) {
		this.totalSales += totalSales;
	}
	
	public double pay() {
		double bayar = super.pay() + totalSales*ComRate;
		
		totalSales = 0;
		
		return bayar;
	}
	
	public String toString() {
		String result = super.toString();
		result += "\nCurrent Sales : " + totalSales;
		return result;
	}
}
