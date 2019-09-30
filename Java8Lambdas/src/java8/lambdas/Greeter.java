package java8.lambdas;

public class Greeter {

	public void greet(Greeting greeting){
		greeting.perform();
	}
	public static void main(String[] args) {

		Greeter greeter = new Greeter();
		Greeting greetingImpl = new GreetingImpl();
		
		greeter.greet(greetingImpl);
		
		Greeting myLambdaFunction = () -> System.out.println("Hello world !");
	}

}
