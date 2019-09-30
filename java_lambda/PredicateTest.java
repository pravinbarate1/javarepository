import java.util.function.*;

class PredicateTest{
	public static void main(String [] args){
		Predicate<Integer> p = i -> i%2==0;

		System.out.println(p.test(10));

		Employee e = new Employee(1100, true);

		Predicate<Employee> p1 = emp -> emp.salary>10000 && emp.isHavingGf == true;

		System.out.println(p1.test(e));
	}
}

class Employee{

	int salary;
	boolean isHavingGf;

	public Employee(int salary, boolean isHavingGf){
		this.salary = salary;
		this.isHavingGf = isHavingGf;

	}
}
