import java.util.function.*;

class PredefinedConsumerInterface{
	public static void main(String [] args){
		Consumer<String> c = s -> System.out.println(s);

		c.accept("Pravin");
	}
}
