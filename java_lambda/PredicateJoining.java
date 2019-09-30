import java.util.function.*;

class PredicateJoining{
	public static void main(String [] args){
		int [] x = {0,5,10,15,20,30,35};

		Predicate<Integer> p1 = i -> i%2 == 0;

		Predicate<Integer> p2 = i -> i>10;

		System.out.println("The numbers which are even and > 10");

		for(int x1 : x){
			
			if(p1.and(p2).test(x1)){ // Predicate Joining and() 
				System.out.println(x1);
			}
		}

                System.out.println("The numbers which are even or > 10");

		for(int x1 : x){
			
			if(p1.or(p2).test(x1)){ // Predicate Joining and() 
				System.out.println(x1);
			}
		}


		System.out.println("The numbers which are odd");

		for(int x1 : x){
			
			if(p1.negate().test(x1)){ // Predicate Joining and() 
				System.out.println(x1);
			}
		}
	}
}
