import  com.horstmann.corejava.*; 
//the employee class is defined in that package
import static java.lang.System.*;

public class PackageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee harry = new Employee("Harry Hacker", 50000, 1989, 8, 13);
		harry.raiseSalary(5);
		
		// because of the static import statement, we don't have to use System.out here
		out.println("name = "+ harry.getName() +", Salary = "+ harry.getSalary());
	}

}
