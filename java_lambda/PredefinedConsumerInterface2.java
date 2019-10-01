import java.util.function.*;

class Student{
	int marks;
	String name;
	
	public Student(int marks,String name){
			this.marks = marks;
			this.name = name;
	}
}

class PredefinedConsumerInterface2{
	public static void main(String [] args){
		Function<Student, String> f = s -> {
		
			int marks = s.marks;

			String grade = "";
			
			if(marks >= 80) grade = "A[Distinction]";
			else if(marks >= 60) grade = "B[First Class]";
			else if(marks >= 50) grade = "C[Second Class]";
			else if(marks >= 35) grade = "D[Third Class]";
			else grade = "B[First Class]";

			return grade;
		};

		Predicate<Student> p = s -> s.marks>=60;

		Consumer<Student> c = s1 -> {
			System.out.println("Student Name: "+s1.name);
			System.out.println("Student Marks: "+s1.marks);
			System.out.println("Student Grade: "+f.apply(s1));
			System.out.println();
		};

		Student [] s = {
			new Student(80,"Pravin"),
			new Student(60,"Sarika"),
			new Student(50,"Aniket"),
			new Student(35, "Piyush"),
			new Student(30, "Vaibhav")
		};

		for(Student s1 : s){

			c.accept(s1);
		}
	}
}
