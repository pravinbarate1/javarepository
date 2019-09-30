import java.util.*;

class Employee{
	
	int id;
	String name;

	public Employee(int id, String name){
		this.id = id;
		this.name = name;
	}

	public String toString(){
		return id+" : "+name;
	}
}

class CustomObjectLambda{
	public static void main(String [] args){
		ArrayList<Employee> al = new ArrayList<Employee>();

		al.add(new Employee(1,"Pravin"));
		al.add(new Employee(5,"Komal"));
		al.add(new Employee(4,"Aarush"));
		al.add(new Employee(2,"Vaibhav"));
		al.add(new Employee(3,"Avaneesh"));


		System.out.println(al);

		Collections.sort(al,(e1,e2) -> (e1.id<e2.id)?-1:(e1.id>e2.id)?1:0);

		System.out.println(al); 

		Collections.sort(al, (e1,e2) -> e1.name.compareTo(e2.name));

		System.out.println(al);
	}
}
	
