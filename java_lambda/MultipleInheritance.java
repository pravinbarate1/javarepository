
interface Parent1{
	public void m1();
}

interface Parent2{
	public void m1();
}

class MultipleInheritance implements Parent1, Parent2{

	public void m1(){
		System.out.println("Implementation of method m1.");
	}	
	public static void main(String [] args){
		
		MultipleInheritance mi = new MultipleInheritance();
		mi.m1();
	}
}
