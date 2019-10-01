import java.util.function.*;

class FunctionInbuildInterface{
	public static void main(String [] args){
		Function<Integer, Integer> f = i -> i*i;

		System.out.println("Square of 4 is "+f.apply(4));

		Function<String,Integer> f1 = s -> s.length();

		System.out.println("Length of string is "+f1.apply("Pravin"));
	}
}
