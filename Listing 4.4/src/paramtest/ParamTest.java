package paramtest;

public class ParamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Test 1 : method can't modify numeric parameters
		System.out.println("testing triple value : ");
		double percent = 10;
		System.out.println("before : percent=" + percent);
		tripleValue(percent);
		System.out.println("after : percent=" + percent);
		
		// Test 2 : method can change the state of object parameter
		System.out.println("\nTesting TripleSalary");
		Employee harry = new Employee("Harry", 50000);
		System.out.println("Before: salary=" + harry.getSalary());
		tripleSalary(harry);
		System.out.println("After: salary=" + harry.getSalary());
		
		// Test 3 : method can't attach new object to object parameter
		System.out.println("\nTesting swap:");
		Employee a = new Employee("Alice", 70000);
		Employee b = new Employee("Bob", 60000);
		System.out.println("Before: a=" + a.getName());
		System.out.println("Before: b=" + b.getName());
		swap(a, b);
		System.out.println("After: a=" + a.getName());
		System.out.println("After: b=" + b.getName());
	}

	private static void swap(Employee x, Employee y) {
		// TODO Auto-generated method stub
		Employee temp = x;
		x = y;
		y = temp;
		System.out.println("End of method: x=" + x.getName());
		System.out.println("End of method: y=" + y.getName());

	}

	private static void tripleSalary(Employee x) {
		// TODO Auto-generated method stub
		x.raiseSalary(200);
		System.out.println("End of Method : salary=" + x.getSalary());
	}

	private static void tripleValue(double x) {
		// TODO Auto-generated method stub
		x = 3 * x;
		System.out.println("End of method: x=" + x);
	}

}

class Employee {
	private String name;
	private double salary;
	
	public Employee(String n, double s) {
		name = n;
		salary = s;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
}