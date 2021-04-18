package constructortest;

import java.util.*;

public class ConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// fill the staff array with three people Employee object
		Employee [] staff = new Employee[3];
		
		staff[0] = new Employee("Harry", 40000);
		staff[1] = new Employee(60000);
		staff[2] = new Employee();
		
		for(Employee e : staff) {
			System.out.println("Name = " + e.getName() + ", ID = " + e.getId() + ", Salary = " + e.getSalary());
		}
	}

}

class Employee{
	private static int nextId;
	
	private int id;
	private String name = "";
	private double salary;
	
	//static initialization block
	static {
		Random generator = new Random();
		// set nextId to a random number between 0 and 9999
		nextId = generator.nextInt(10000);
	}
	
	// object initialization block
	{
		id = nextId;
		nextId++;
	}
	
	//three  overloaded constructor
	public Employee(String n, double s) {
		name = n;
		salary =s;
	}
	
	public Employee (double s) {
		this("Employee #" + nextId, s);
	}
	//Default constructor
	public Employee() {
		
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	
}
