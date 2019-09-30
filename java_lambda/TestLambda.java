interface Interf{
	public void m1();
}

public class TestLambda{
	public static void main(String [] args){
		Interf i = () -> System.out.println("Hello From Lambda...");
		i.m1();	
	}
}
