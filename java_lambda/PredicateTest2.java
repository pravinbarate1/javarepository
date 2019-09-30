import java.util.function.*;

class PredicateTest2{
	public static void main(String [] args){
		
		String [] s = {"Pravin", "Sarika", "Aarush", "Vaibhav", "Avaneesh"};

		Predicate<String> p = s1 -> s1.length() > 6;

		for(String s1: s){
			if(p.test(s1)){
				System.out.println(s1);
			}
		}
	}
}
