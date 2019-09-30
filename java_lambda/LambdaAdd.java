interface Add{
	public void add(int a, int b);
}

public class LambdaAdd{
	public static void main(String [] args){
		Add add = (a,b) -> System.out.println("The sum : "+ (a+b));

   		add.add(10,20);
	}
}

