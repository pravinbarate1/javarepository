import java.util.*;

/*class MyComparator implements Comparator<Integer>{
	public int compare(Integer i1, Integer i2){
		if(i1 < i2)
			return -1;
		else if(i1 > i2)
			return +1;
		else
			return 0;
	}
}*/

class CollectionLambda{
	public static void main(String [] args){
		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(10);
		al.add(5);
		al.add(2);
		al.add(4);
		al.add(1);

		System.out.println(al);
		
		Comparator<Integer> c = (i1,i2) -> (i1<i2)?-1:(i1>i2)?+1:0;
		Collections.sort(al, c);
		System.out.println(al);
	}
}
