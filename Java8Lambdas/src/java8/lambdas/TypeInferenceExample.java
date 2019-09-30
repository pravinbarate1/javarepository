package java8.lambdas;

public class TypeInferenceExample {

	public static void main(String[] args) {
		/*StringLengthLambdas myLambda = (s) -> s.length();
		System.out.println(myLambda.getLength("Hello World !"));*/
		
		printLambda(s -> s.length());
	}

	public static void printLambda(StringLengthLambdas l){
		System.out.println(l.getLength("Hello Lambda"));
	}
	interface StringLengthLambdas{
		int getLength(String s);
	}
}
